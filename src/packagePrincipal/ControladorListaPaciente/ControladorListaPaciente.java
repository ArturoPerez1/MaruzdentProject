package packagePrincipal.ControladorListaPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.modelo.FechaActual;
import packagePrincipal.modelo.VerificarDatosHistorial;
import packagePrincipal.modelo.VerificarDatosPaciente;
import packagePrincipal.vistaListaPaciente.FrameListaPaciente;
import packagePrincipal.vistaListaPaciente.FrameModificarDatosPaciente;
import packagePrincipal.vistaListaPaciente.PanelListaPaciente;
import packagePrincipal.vistaListaPaciente.PanelPacienteDetallado;
import packagePrincipal.vistaMenu.FrameContenedorMenu;
import packagePrincipal.vistaListaPaciente.PanelHistorialPaciente;

public class ControladorListaPaciente {

    private int _posicion;
    private boolean _cedulaV;
    private int _edadPaciente;
    private int _yearActual;
    private int _yearNacimiento;
    private boolean _codigoTelefonicoVerificado;
    private boolean _codigoTelefonicoRVerificado;
    private boolean _menorDeEdad;
    private boolean _nombrePVacio;
    private boolean _nombreRVacio;
    private boolean _faltanDigitosTelefono;
    private boolean _sobranDigitosTelefono;
    private boolean _faltanDigitosTelefonoR;
    private boolean _sobranDigitosTelefonoR;
    private boolean _apellidoPVacio;
    private boolean _apellidoRVacio;
    private boolean _cedulaP1Vacia;
    private boolean _codigoPErroneo;
    private boolean _digitosMenor9;
    private boolean _cedulaP2Vacia;
    private boolean _codigoVErroneo;
    private boolean _correoVerificado;
    private boolean _correoVacio;
    private boolean _telefonoPVacio;
    private boolean _telefonoRVacio;
    private boolean _ocupacionPVacio;
    private boolean _direccionPVacio;
    private boolean _diaVerificado;
    private boolean _mesVerificado;
    private boolean _anoVerificado;
    private boolean _generoVerificado;
    private boolean _estadoCVerifiado;
    private FechaActual _obtenerFechaActual;
    private String _cedulaCompleta;
    private VerificarDatosPaciente _verificarModificaciones;
    private VerificarDatosHistorial _verificarDatosHistorial;
    private ControladorArraysList _controladorArrayList;
    private PanelListaPaciente _panelListaPaciente;
    private PanelPacienteDetallado _panelPacienteDetallado;
    private PanelHistorialPaciente _panelHistorialPaciente;
    private FrameContenedorMenu _frameContenedor;
    private FrameListaPaciente _frameListaPaciente;
    private FrameModificarDatosPaciente _frameModificar;

    public ControladorListaPaciente(FrameContenedorMenu frameContenedor, ControladorArraysList controladorArrayList) {
        this._controladorArrayList = controladorArrayList;
        if (controladorArrayList.getRegistroPaciente1().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "AGREGUE UN PACIENTE ANTES", "AGREGAR PACIENTE", JOptionPane.WARNING_MESSAGE);
            frameContenedor.setVisible(true);
        } else {
            this._obtenerFechaActual = new FechaActual();
            this._menorDeEdad = false;
            _obtenerFechaActual.GenerarAnoActual();
            this._yearActual = _obtenerFechaActual.getObtenerAno();
            this._frameContenedor = frameContenedor;
            _frameContenedor.setVisible(false);
            this._frameListaPaciente = new FrameListaPaciente();
            this._verificarDatosHistorial = new VerificarDatosHistorial();
            this._verificarModificaciones = new VerificarDatosPaciente();
            _frameListaPaciente.setVisible(true);
            _frameListaPaciente.AgregarVentaListaPaciente();
            _panelListaPaciente = _frameListaPaciente.getPanelListaPaciente();
            _panelListaPaciente.LlenarCedula(_controladorArrayList.getRegistroPaciente1());
            _panelListaPaciente.LlenarTablaPacientes(_controladorArrayList.getRegistroPaciente1());
            _panelListaPaciente.AddActionListener(new AgregarListenerVentanaListaPacientes());
        }
    }

    public class AgregarListenerVentanaListaPacientes implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelListaPaciente.getBotonVerInformacion()) {
                    _verificarDatosHistorial.VerificarCedula(_panelListaPaciente.getTextoCedula());
                    _cedulaV = _verificarDatosHistorial.IsCedulaVerificada();
                    if (_cedulaV == false) {
                        _posicion = _controladorArrayList.ObtenerIndiceCedulaPaciente(_panelListaPaciente.getTextoCedula());
                        _frameListaPaciente.AgregarVentaPacienteDetallado();
                        _frameListaPaciente.LlenarDatosPacienteDetallado(_controladorArrayList.getRegistroPaciente1(), _posicion);
                        _panelPacienteDetallado = _frameListaPaciente.getPanelPacienteDetallado();
                        _panelPacienteDetallado.AddActionListener(new AgregarListenerVentanaPacienteDetallado());
                    } else {
                        _panelListaPaciente.ErrorCedula(true);
                    }
                } else if (evento.getSource() == _panelListaPaciente.getBotonVolver()) {
                    _frameListaPaciente.dispose();
                    _frameContenedor.setVisible(true);
                }

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AgregarListenerVentanaPacienteDetallado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelPacienteDetallado.getBotonVerHistorial()) {
                    if (_controladorArrayList.isPrimerHistorial() == false) {
                        _posicion = _controladorArrayList.ObtenerIndiceCedulaHistorial(_panelListaPaciente.getTextoCedula());
                        /*si el historial está vacío se muestra un mensaje y no se permite el acceso
                    a la ventana del historial*/
                        if (_posicion != -1) {
                            _panelPacienteDetallado.SetAvisoAgregarHistorial();
                            _frameListaPaciente.AgregarVentaHistorialPaciente();
                            _frameListaPaciente.LlenarHistorialPaciente(_controladorArrayList.getRegistroHistorial(), _posicion);
                            _panelHistorialPaciente = _frameListaPaciente.getPanelHistorialPaciente();
                            _panelHistorialPaciente.AddActionListener(new AgregarListenerVentanaHistorialPaciente());
                        } else {
                            _panelPacienteDetallado.AvisoAgregarHistorial(_panelListaPaciente.getTextoCedula());
                        }
                    } else {
                        _panelPacienteDetallado.AvisoAgregarHistorial(_panelListaPaciente.getTextoCedula());
                    }
                } else if (evento.getSource() == _panelPacienteDetallado.getBotonModificar()) {
                    _frameListaPaciente.setVisible(false);
                    _panelPacienteDetallado.VentanaModificarDatos(_controladorArrayList.getRegistroPaciente1(), _posicion);
                    _frameModificar = _panelPacienteDetallado.getFrameModificar();
                    _controladorArrayList.ModificarRutaImagenPaciente(_posicion, _panelPacienteDetallado.getLbImagen());
                    _frameModificar.AddActionListener(new AgregarActionListenerVentanaModificador());
                } else if (evento.getSource() == _panelPacienteDetallado.getBotonVolver()) {
                    _frameListaPaciente.AgregarVentaListaPaciente();
                    _panelListaPaciente = _frameListaPaciente.getPanelListaPaciente();
                    _controladorArrayList.ModificarRutaImagenPaciente(_posicion, _panelPacienteDetallado.getLbImagen());
                    _panelListaPaciente.LlenarCedula(_controladorArrayList.getRegistroPaciente1());
                    _panelListaPaciente.LlenarTablaPacientes(_controladorArrayList.getRegistroPaciente1());
                    _panelListaPaciente.AddActionListener(new AgregarListenerVentanaListaPacientes());
                }

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AgregarListenerVentanaHistorialPaciente implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelHistorialPaciente.getBotonVolver()) {
                    _posicion = _controladorArrayList.ObtenerIndiceCedulaPaciente(_panelListaPaciente.getTextoCedula());
                    _frameListaPaciente.AgregarVentaPacienteDetallado();
                    _frameListaPaciente.LlenarDatosPacienteDetallado(_controladorArrayList.getRegistroPaciente1(), _posicion);
                    _panelPacienteDetallado = _frameListaPaciente.getPanelPacienteDetallado();
                    _panelPacienteDetallado.AddActionListener(new AgregarListenerVentanaPacienteDetallado());
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AgregarActionListenerVentanaModificador implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _frameModificar.getBtnMNombre()) {
                    _verificarModificaciones.VerificarNombre(_frameModificar.getTfNAC());
                    _nombrePVacio = _verificarModificaciones.IsNombrePVacio();
                    if (_nombrePVacio == false) {
                        _controladorArrayList.ModificarNombrePaciente(_posicion, _frameModificar.getTfNAC());
                        _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                        JOptionPane.showMessageDialog(null, "NOMBRE MODIFICADO EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                        _frameModificar.setTfNAC();
                    } else {
                        _frameModificar.ErrorNombreApellidoCorreo(true);
                        JOptionPane.showMessageDialog(null, "CAMPO NOMBRE VACÍO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    }

                } else if (evento.getSource() == _frameModificar.getBtnMApellido()) {
                    _verificarModificaciones.VerificarApellido(_frameModificar.getTfNAC());
                    _apellidoPVacio = _verificarModificaciones.IsApellidoVacio();
                    if (_apellidoPVacio == false) {
                        _controladorArrayList.ModificarApellidoPaciente(_posicion, _frameModificar.getTfNAC());
                        _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                        JOptionPane.showMessageDialog(null, "APELLIDO MODIFICADO EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                        _frameModificar.setTfNAC();
                    } else {
                        _frameModificar.ErrorNombreApellidoCorreo(true);
                        JOptionPane.showMessageDialog(null, "CAMPO APELLIDO VACÍO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (evento.getSource() == _frameModificar.getBtnMCorreo()) {
                    _verificarModificaciones.VerificarCorreo(_frameModificar.getTfNAC());
                    _correoVacio = _verificarModificaciones.IsCorreoVacio();
                    _correoVerificado = _verificarModificaciones.IsCorreoVerificado();

                    if (_correoVacio == true) {
                        _frameModificar.ErrorNombreApellidoCorreo(true);
                        JOptionPane.showMessageDialog(null, "CAMPO CORREO VACÍO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (_correoVerificado == false) {
                            _controladorArrayList.ModificarCorreoPaciente(_posicion, _frameModificar.getTfNAC());
                            _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                            JOptionPane.showMessageDialog(null, "CORREO MODIFICADO EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                            _frameModificar.setTfNAC();
                        } else {
                            _frameModificar.ErrorNombreApellidoCorreo(true);
                            JOptionPane.showMessageDialog(null, "CORREO INTRODUCIDO NO CUMPLE EL ESTÁNDAR DE CORREO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } else if (evento.getSource() == _frameModificar.getBtnMCedula()) {
                    _verificarModificaciones.VerificarCedula(_frameModificar.getTfCedulaP1(), _frameModificar.getTfCedulaP2());
                    _cedulaP1Vacia = _verificarModificaciones.IsCedulaP1Vacia();
                    _cedulaP2Vacia = _verificarModificaciones.IsCedulaP2Vacia();
                    _codigoPErroneo = _verificarModificaciones.IsCedulaP1CodigoPVerificado();
                    _codigoVErroneo = _verificarModificaciones.IsCedulaP2CodigoVerificacionV();
                    _digitosMenor9 = _verificarModificaciones.IsCedulaP1PocoDigitos();

                    if (_cedulaP1Vacia == true && _cedulaP2Vacia == true) {
                        _frameModificar.ErrorCedulaP1(true);
                        _frameModificar.ErrorCedulaP2(true);
                        JOptionPane.showMessageDialog(null, "CAMPO CÉDULA Y CAMPO CÓDIGO VERIFICADOR VACÍOS", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (_cedulaP1Vacia == true) {
                            _frameModificar.ErrorCedulaP1(true);
                            JOptionPane.showMessageDialog(null, "CAMPO CÉDULA VACÍO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                        } else if (_cedulaP2Vacia == true) {
                            _frameModificar.ErrorCedulaP2(true);
                            JOptionPane.showMessageDialog(null, "CAMPO CÓDIGO VERIFICADOR VACÍO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                        } else if (_cedulaP1Vacia == false && _cedulaP2Vacia == false) {
                            if (_codigoPErroneo == true) {
                                _frameModificar.ErrorCedulaP1(true);
                                JOptionPane.showMessageDialog(null, "CÓDIGO DE PROVINCIA ERRÓNEO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                            } else {
                                if (_digitosMenor9 == true) {
                                    _frameModificar.ErrorCedulaP1(true);
                                    JOptionPane.showMessageDialog(null, "LA CÉDULA NO CUMPLE CON LA CANTIDAD DE DÍGITOS", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                                } else {
                                    if (_codigoVErroneo == true) {
                                        _frameModificar.ErrorCedulaP2(true);
                                        JOptionPane.showMessageDialog(null, "CÓDIGO VERIFICADOR ERRÓNEO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                                    } else {
                                        _cedulaCompleta = _frameModificar.getTfCedulaP1() + "-" + _frameModificar.getTfCedulaP2();
                                        _controladorArrayList.ModificarCedulaPaciente(_posicion, _cedulaCompleta);
                                        _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                                        JOptionPane.showMessageDialog(null, "CÉDULA MODIFICADA EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                                        _frameModificar.setTfCedulaP1();
                                        _frameModificar.setTfCedulaP2();
                                    }
                                }
                            }

                        }
                    }
                } else if (evento.getSource() == _frameModificar.getBtnMTelefono()) {
                    _verificarModificaciones.VerificarTelefono(_frameModificar.getTfTelefono());
                    _telefonoPVacio = _verificarModificaciones.IsTelefonoVacio();
                    _codigoTelefonicoVerificado = _verificarModificaciones.IsCodigoTelefonicoVerificado();
                    _faltanDigitosTelefono = _verificarModificaciones.isFaltanDigitosTelefono();
                    _sobranDigitosTelefono = _verificarModificaciones.isSobranDigitosTelefono();

                    if (_telefonoPVacio == true) {
                        _frameModificar.ErrorTelefonoP(true);
                        JOptionPane.showMessageDialog(null, "CAMPO NÚMERO TELEFÓNICO VACÍO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (_faltanDigitosTelefono == false && _sobranDigitosTelefono == false) {
                            if (_codigoTelefonicoVerificado == false) {
                                _frameModificar.ErrorTelefonoP(true);
                                JOptionPane.showMessageDialog(null, "CÓDIGO TELEFÓNICO ERRÓNEO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                            } else {
                                _controladorArrayList.ModificarTelefonoPaciente(_posicion, _frameModificar.getTfTelefono());
                                _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                                JOptionPane.showMessageDialog(null, "NÚMERO TELEFÓNICO MODIFICADO EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                                _frameModificar.setTfTelefono();
                            }
                        } else {
                            if (_faltanDigitosTelefono == true) {
                                _frameModificar.ErrorTelefonoP(true);
                                JOptionPane.showMessageDialog(null, "FALTAN DÍGITOS EN EL NÚMERO TELEFÓNICO INTRODUCIDO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                            } else if (_sobranDigitosTelefono == true) {
                                _frameModificar.ErrorTelefonoP(true);
                                JOptionPane.showMessageDialog(null, "SOBRAN DÍGITOS EN EL NÚMERO TELEFÓNICO INTRODUCIDO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }

                } else if (evento.getSource() == _frameModificar.getBtnMFecha()) {
                    _verificarModificaciones.VerificarFechaNacimiento(_frameModificar.getTextoCMes(), _frameModificar.getTextoCDia(), _frameModificar.getTextoCAno());
                    _mesVerificado = _verificarModificaciones.IsMesVerificado();
                    _diaVerificado = _verificarModificaciones.IsDiaVerificado();
                    _anoVerificado = _verificarModificaciones.IsAnoVerificado();

                    if (_mesVerificado == false && _diaVerificado == false && _anoVerificado == false) {
                        String fechaNacimientoAux = _frameModificar.getTextoCMes() + "/" + _frameModificar.getTextoCDia() + "/" + _frameModificar.getTextoCAno();
                        _edadPaciente = _yearActual - Integer.valueOf(_frameModificar.getTextoCAno());
                        if (_edadPaciente < 18) {
                            _menorDeEdad = true;
                        }
                        _controladorArrayList.ModificarFechaNacimientoPaciente(_posicion, fechaNacimientoAux);
                        _controladorArrayList.ModificarEdadPaciente(_posicion, String.valueOf(_edadPaciente));
                        _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                        JOptionPane.showMessageDialog(null, "FECHA DE NACIMIENTO MODIFICADA EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                    }
                } else if (evento.getSource() == _frameModificar.getBtnMEstado()) {
                    _verificarModificaciones.VerificarEstadoCivil(_frameModificar.getTextoEstadoCivil());
                    _estadoCVerifiado = _verificarModificaciones.IsEstadoCivilVerificado();

                    if (_estadoCVerifiado == false) {
                        _controladorArrayList.ModificarEstadoCivilPaciente(_posicion, _frameModificar.getTextoEstadoCivil());
                        _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                        JOptionPane.showMessageDialog(null, "ESTADO CIVIL MODIFICADO EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                    } else {
                        _frameModificar.ErrorEstadoCivil(true);
                        JOptionPane.showMessageDialog(null, "SELECCIONE UN ESTADO CIVIL", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (evento.getSource() == _frameModificar.getBtnMGenero()) {
                    _verificarModificaciones.VerificarGenero(_frameModificar.getTextoGenero());
                    _generoVerificado = _verificarModificaciones.IsGeneroVerificado();

                    if (_generoVerificado == false) {
                        _controladorArrayList.ModificarGeneroPaciente(_posicion, _frameModificar.getTextoGenero());
                        _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                        JOptionPane.showMessageDialog(null, "GÉNERO MODIFICADO EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                    } else {
                        _frameModificar.ErrorGenero(true);
                        JOptionPane.showMessageDialog(null, "SELECCIONE UN GÉNERO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (evento.getSource() == _frameModificar.getBtnMDireccion()) {
                    _verificarModificaciones.VerificarDireccion(_frameModificar.getAreaMDireccion());
                    _direccionPVacio = _verificarModificaciones.IsDireccionVacia();

                    if (_direccionPVacio == false) {
                        _controladorArrayList.ModificarDireccionPaciente(_posicion, _frameModificar.getAreaMDireccion());
                        _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                        JOptionPane.showMessageDialog(null, "DIRECCIÓN MODIFICADA EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                        _frameModificar.setAreaMDireccion();
                    } else {
                        _frameModificar.ErrorDireccionP(true);
                        JOptionPane.showMessageDialog(null, "CAMPO DIRECCIÓN VACÍO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (evento.getSource() == _frameModificar.getBtnMOcupacion()) {
                    _verificarModificaciones.VerificarOcupacion(_frameModificar.getTfOcupacion());
                    _ocupacionPVacio = _verificarModificaciones.IsOcupacionVacia();

                    if (_ocupacionPVacio == false) {
                        _controladorArrayList.ModificarOcupacionPaciente(_posicion, _frameModificar.getTfOcupacion());
                        _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                        JOptionPane.showMessageDialog(null, "OCUPACIÓN MODIFICADA EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                        _frameModificar.setTfOcupacion();
                    } else {
                        _frameModificar.ErrorOcupacionP(true);
                        JOptionPane.showMessageDialog(null, "CAMPO OCUPACIÓN VACÍO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (evento.getSource() == _frameModificar.getBtnMNombreR() && _menorDeEdad == true) {
                    _verificarModificaciones.VerificarNombre(_frameModificar.getTfNAR());
                    _nombreRVacio = _verificarModificaciones.IsNombrePVacio();
                    if (_nombreRVacio == false) {
                        _controladorArrayList.ModificarNombreResponsable(_posicion, _frameModificar.getTfNAR());
                        _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                        JOptionPane.showMessageDialog(null, "NOMBRE MODIFICADO EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                        _frameModificar.setTfNAR();
                    } else {
                        _frameModificar.ErrorNombreApellidoCorreo(true);
                        JOptionPane.showMessageDialog(null, "AGREGUE UN NOMBRE PARA PODER MODIFICAR EL CAMPO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (evento.getSource() == _frameModificar.getBtnMNombreR() && _menorDeEdad == false) {
                    JOptionPane.showMessageDialog(null, "PACIENTE MAYOR DE EDAD NO SE PUEDE MODIFICAR ESTE CAMPO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    _frameModificar.setTfNAR();
                } else if (evento.getSource() == _frameModificar.getBtnMApellidoR() && _menorDeEdad == true) {
                    _verificarModificaciones.VerificarApellido(_frameModificar.getTfNAR());
                    _apellidoRVacio = _verificarModificaciones.IsApellidoVacio();
                    if (_apellidoRVacio == false) {
                        _controladorArrayList.ModificarNombreResponsable(_posicion, _frameModificar.getTfNAR());
                        _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                        JOptionPane.showMessageDialog(null, "NOMBRE MODIFICADO EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                        _frameModificar.setTfNAR();
                    } else {
                        _frameModificar.ErrorNombreApellidoCorreo(true);
                        JOptionPane.showMessageDialog(null, "AGREGUE UN NOMBRE PARA PODER MODIFICAR EL CAMPO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (evento.getSource() == _frameModificar.getBtnMApellidoR() && _menorDeEdad == false) {
                    JOptionPane.showMessageDialog(null, "PACIENTE MAYOR DE EDAD NO SE PUEDE MODIFICAR ESTE CAMPO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    _frameModificar.setTfNAR();
                } else if (evento.getSource() == _frameModificar.getBtnMTelefonoR() && _menorDeEdad == true) {
                    _verificarModificaciones.VerificarTelefono(_frameModificar.getTfTelefono());
                    _telefonoRVacio = _verificarModificaciones.IsTelefonoVacio();
                    _codigoTelefonicoVerificado = _verificarModificaciones.IsCodigoTelefonicoVerificado();
                    _faltanDigitosTelefonoR = _verificarModificaciones.isFaltanDigitosTelefono();
                    _sobranDigitosTelefonoR = _verificarModificaciones.isSobranDigitosTelefono();

                    if (_telefonoRVacio == true) {
                        _frameModificar.ErrorTelefonoP(true);
                        JOptionPane.showMessageDialog(null, "CAMPO NÚMERO TELEFÓNICO VACÍO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (_faltanDigitosTelefonoR == false && _sobranDigitosTelefonoR == false) {
                            if (_codigoTelefonicoVerificado == false) {
                                _frameModificar.ErrorTelefonoP(true);
                                JOptionPane.showMessageDialog(null, "CÓDIGO TELEFÓNICO ERRÓNEO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                            } else {
                                _controladorArrayList.ModificarTelefonoPaciente(_posicion, _frameModificar.getTfTelefono());
                                _frameModificar.LlenarDatosPaciente(_controladorArrayList.getRegistroPaciente1(), _posicion);
                                JOptionPane.showMessageDialog(null, "NÚMERO TELEFÓNICO MODIFICADO EXITOSAMENTE", "ÉXITO MODIFICACIÓN", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                                _frameModificar.setTfTelefonoR();
                            }
                        } else {
                            if (_faltanDigitosTelefonoR == true) {
                                _frameModificar.ErrorTelefonoP(true);
                                JOptionPane.showMessageDialog(null, "FALTAN DÍGITOS EN EL NÚMERO TELEFÓNICO INTRODUCIDO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                            } else if (_sobranDigitosTelefonoR == true) {
                                _frameModificar.ErrorTelefonoP(true);
                                JOptionPane.showMessageDialog(null, "SOBRAN DÍGITOS EN EL NÚMERO TELEFÓNICO INTRODUCIDO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                            }
                        }
                    }
                } else if (evento.getSource() == _frameModificar.getBtnMTelefonoR() && _menorDeEdad == false) {
                    JOptionPane.showMessageDialog(null, "PACIENTE MAYOR DE EDAD NO SE PUEDE MODIFICAR ESTE CAMPO", "ERROR MODIFICACIÓN", JOptionPane.WARNING_MESSAGE);
                    _frameModificar.setTfTelefonoR();
                } else if (evento.getSource() == _frameModificar.getBotonVolver()) {
                    _frameModificar.dispose();
                    _frameListaPaciente.setVisible(true);
                    _posicion = _controladorArrayList.ObtenerIndiceCedulaPaciente(_panelListaPaciente.getTextoCedula());
                    _frameListaPaciente.AgregarVentaPacienteDetallado();
                    _frameListaPaciente.LlenarDatosPacienteDetallado(_controladorArrayList.getRegistroPaciente1(), _posicion);
                    _panelPacienteDetallado = _frameListaPaciente.getPanelPacienteDetallado();
                    _panelPacienteDetallado.AddActionListener(new AgregarListenerVentanaPacienteDetallado());
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
