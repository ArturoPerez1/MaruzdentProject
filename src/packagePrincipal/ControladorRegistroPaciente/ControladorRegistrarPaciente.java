package packagePrincipal.ControladorRegistroPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import packagePrincipal.modelo.FechaActual;
import packagePrincipal.modelo.VerificarDatosPaciente;
import packagePrincipal.vistaAPaciente.FrameAPaciente;
import packagePrincipal.vistaAPaciente.PanelRegistrarPaciente;
import packagePrincipal.vistaPaciente.FrameContenedor;

public class ControladorRegistrarPaciente {

    /*Las variables booleanas la uso para poder verificar que todos los datos
    cumples y poder proceder a registrar al paciente*/
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
    private boolean _diaVacio;
    private boolean _mesVacio;
    private boolean _anoVacio;
    private boolean _generoVerificado;
    private boolean _estadoCVerifiado;
    private String _cedulaCompleta;
    private FechaActual _obtenerFechaActual;
    private VerificarDatosPaciente _verificarDatos;
    private ControladorArraysList _controladorArrayList;
    private PanelRegistrarPaciente _panelRegistrarPaciente;
    private FrameContenedor _frameContenedorPaciente;
    private FrameAPaciente _frameAPaciente;

    public ControladorRegistrarPaciente(FrameContenedor frameContenedorPaciente, ControladorArraysList controladorArrayList) {
        this._obtenerFechaActual = new FechaActual();
        this._menorDeEdad = false;
        _obtenerFechaActual.GenerarAnoActual();
        this._yearActual = _obtenerFechaActual.getObtenerAno();
        this._frameContenedorPaciente = frameContenedorPaciente;
        this._frameAPaciente = new FrameAPaciente();
        this._controladorArrayList = controladorArrayList;
        this._verificarDatos = new VerificarDatosPaciente();
        this._nombreRVacio = false;
        this._apellidoRVacio = false;
        this._telefonoRVacio = false;
        this._codigoTelefonicoRVerificado = false;
        this._faltanDigitosTelefonoR = false;
        this._sobranDigitosTelefonoR = false;
        _frameAPaciente.setVisible(true);
        _frameAPaciente.AgregarVentanaRegistrarPaciente();
        _panelRegistrarPaciente = _frameAPaciente.getPanelRegistrarPaciente();
        _panelRegistrarPaciente.AddActionListener(new AddActionListenerVentanaRegistrarPaciente());
    }

    public class AddActionListenerVentanaRegistrarPaciente implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelRegistrarPaciente.getBotonRegistrar()) {
                    _verificarDatos.VerificarNombre(_panelRegistrarPaciente.getTextNombreP());
                    _verificarDatos.VerificarApellido(_panelRegistrarPaciente.getTextApellidoP());
                    _verificarDatos.VerificarCedula(_panelRegistrarPaciente.getCedulaP1(), _panelRegistrarPaciente.getCedulaP2());
                    _verificarDatos.VerificarTelefono(_panelRegistrarPaciente.getTextTelefonoP());
                    _verificarDatos.VerificarCorreo(_panelRegistrarPaciente.getTextCorreoP());
                    _verificarDatos.VerificarDireccion(_panelRegistrarPaciente.getAreaDireccionP());
                    _verificarDatos.VerificarOcupacion(_panelRegistrarPaciente.getTextOcupacionP());
                    _verificarDatos.VerificarFechaNacimiento(_panelRegistrarPaciente.getTextoCMes(), _panelRegistrarPaciente.getTextoCDia(), _panelRegistrarPaciente.getTextoCAno());
                    _verificarDatos.VerificarGenero(_panelRegistrarPaciente.getTextoGenero());
                    _verificarDatos.VerificarEstadoCivil(_panelRegistrarPaciente.getTextoEstadoCivil());

                    _nombrePVacio = _verificarDatos.IsNombrePVacio();
                    _apellidoPVacio = _verificarDatos.IsApellidoVacio();
                    _cedulaP1Vacia = _verificarDatos.IsCedulaP1Vacia();
                    _cedulaP2Vacia = _verificarDatos.IsCedulaP2Vacia();
                    _codigoPErroneo = _verificarDatos.IsCedulaP1CodigoPVerificado();
                    _codigoVErroneo = _verificarDatos.IsCedulaP2CodigoVerificacionV();
                    _digitosMenor9 = _verificarDatos.IsCedulaP1PocoDigitos();
                    _telefonoPVacio = _verificarDatos.IsTelefonoVacio();
                    _correoVerificado = _verificarDatos.IsCorreoVerificado();
                    _correoVacio = _verificarDatos.IsCorreoVacio();
                    _direccionPVacio = _verificarDatos.IsDireccionVacia();
                    _ocupacionPVacio = _verificarDatos.IsOcupacionVacia();
                    _diaVerificado = _verificarDatos.IsDiaVerificado();
                    _mesVerificado = _verificarDatos.IsMesVerificado();
                    _anoVerificado = _verificarDatos.IsAnoVerificado();
                    _mesVacio = _verificarDatos.IsMesVacio();
                    _diaVacio = _verificarDatos.IsDiaVacio();
                    _anoVacio = _verificarDatos.IsAnoVacio();
                    _generoVerificado = _verificarDatos.IsGeneroVerificado();
                    _estadoCVerifiado = _verificarDatos.IsEstadoCivilVerificado();
                    _codigoTelefonicoVerificado = _verificarDatos.IsCodigoTelefonicoVerificado();
                    _faltanDigitosTelefono = _verificarDatos.isFaltanDigitosTelefono();
                    _sobranDigitosTelefono = _verificarDatos.isSobranDigitosTelefono();

                    //-cosas raras pasan aqu[i
                    if ((_diaVacio == false && _mesVacio == false && _anoVacio == false)
                            && (_diaVerificado == false && _mesVerificado == false && _anoVerificado == false)) {
                        _yearNacimiento = Integer.valueOf(_panelRegistrarPaciente.getTextoCAno());
                        _edadPaciente = _yearActual - _yearNacimiento;
                        if (_edadPaciente < 18) {
                            _menorDeEdad = true;
                            _verificarDatos.VerificarNombre(_panelRegistrarPaciente.getTextNombreR());
                            _verificarDatos.VerificarApellido(_panelRegistrarPaciente.getTextApellidoR());
                            _verificarDatos.VerificarTelefono(_panelRegistrarPaciente.getTextTelefonoR());
                            _nombreRVacio = _verificarDatos.IsNombrePVacio();
                            _apellidoRVacio = _verificarDatos.IsApellidoVacio();
                            _telefonoRVacio = _verificarDatos.IsTelefonoVacio();
                            if (_telefonoRVacio == false) {
                                _codigoTelefonicoRVerificado = _verificarDatos.IsCodigoTelefonicoVerificado();
                                _faltanDigitosTelefonoR = _verificarDatos.isFaltanDigitosTelefono();
                                _sobranDigitosTelefonoR = _verificarDatos.isSobranDigitosTelefono();
                            }
                        } else if (_edadPaciente > 18) {
                            _nombreRVacio = false;
                            _apellidoRVacio = false;
                            _telefonoRVacio = false;
                            _codigoTelefonicoRVerificado = false;
                            _panelRegistrarPaciente.setLbVaciarAvisoNombre();
                            _panelRegistrarPaciente.setLbApellidoRVacio1();
                            _panelRegistrarPaciente.setLbVaciarAvisoNumeroR();
                            _panelRegistrarPaciente.setColorDatosResponsable();
                            _codigoTelefonicoRVerificado = false;
                        }
                    }
                    //-----------------

                    if (_nombrePVacio == false && _nombreRVacio == false && _apellidoPVacio == false && _apellidoRVacio == false
                            && _telefonoPVacio == false && _telefonoRVacio == false && _correoVerificado == false && _ocupacionPVacio == false
                            && _direccionPVacio == false && _generoVerificado == false && _cedulaP1Vacia == false
                            && _cedulaP2Vacia == false && _codigoPErroneo == false
                            && _codigoVErroneo == false && _digitosMenor9 == false
                            && _estadoCVerifiado == false && _diaVerificado == false && _mesVerificado == false && _anoVerificado == false
                            && _codigoTelefonicoVerificado == true && (_codigoTelefonicoRVerificado == true || _codigoTelefonicoRVerificado == false)
                            && _sobranDigitosTelefonoR == false && _sobranDigitosTelefonoR == false && _faltanDigitosTelefono == false
                            && _sobranDigitosTelefono == false) {

                        _cedulaCompleta = _panelRegistrarPaciente.getCedulaP1() + "-" + _panelRegistrarPaciente.getCedulaP2();
                        String fechaNacimientoAux = _panelRegistrarPaciente.getTextoCMes() + "/" + _panelRegistrarPaciente.getTextoCDia() + "/" + _panelRegistrarPaciente.getTextoCAno();
                        _controladorArrayList.AgregarPaciente(_panelRegistrarPaciente.getTextNombreP(), _panelRegistrarPaciente.getTextApellidoP(), _cedulaCompleta,
                                fechaNacimientoAux, String.valueOf(_edadPaciente), _panelRegistrarPaciente.getTextoGenero(),
                                _panelRegistrarPaciente.getTextTelefonoP(), _panelRegistrarPaciente.getTextoEstadoCivil(), _panelRegistrarPaciente.getTextOcupacionP(),
                                _panelRegistrarPaciente.getAreaDireccionP(), _panelRegistrarPaciente.getTextCorreoP(),
                                _panelRegistrarPaciente.getTextNombreR(), _panelRegistrarPaciente.getTextTelefonoR(), _panelRegistrarPaciente.getTextApellidoR(), _panelRegistrarPaciente.getLbIFNImagen());
                        if (_controladorArrayList.isCedulaRepetida() == true) {
                            _panelRegistrarPaciente.ErrorCedulaP1(true);
                            _panelRegistrarPaciente.setLabelCedulaRepetida();
                        } else {
                            JOptionPane.showMessageDialog(null, "PACIENTE REGISTRADO EXITOSAMENTE", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                            _panelRegistrarPaciente.Resetearimagen();
                            _panelRegistrarPaciente.setTextNombreP();
                            _panelRegistrarPaciente.setTextApellidoP();
                            _panelRegistrarPaciente.setTextCedulaP2();
                            _panelRegistrarPaciente.setTextCedulaP1();
                            _panelRegistrarPaciente.setTextTelefonoP();
                            _panelRegistrarPaciente.setTextCorreoP();
                            _panelRegistrarPaciente.setTextOcupacionP();
                            _panelRegistrarPaciente.setAreaDireccionP();
                            _panelRegistrarPaciente.setTextNombreRBorrar();
                            _panelRegistrarPaciente.setTextApellidoRBorrar();
                            _panelRegistrarPaciente.setTextTelefonoRBorrar();
                            _panelRegistrarPaciente.setTextApellidoR();
                            _panelRegistrarPaciente.setTextTelefonoR();
                            _panelRegistrarPaciente.setTextNombreR();
                            _panelRegistrarPaciente.setComboAno();
                            _panelRegistrarPaciente.setComboMes();
                            _panelRegistrarPaciente.setComboDia();
                            _panelRegistrarPaciente.setComboGenero();
                            _panelRegistrarPaciente.setComboEstadoCivil();
                            _panelRegistrarPaciente.setLabelCedulaRepetida1();

                        }
                    } else {
                        if (_nombrePVacio == true) {
                            _panelRegistrarPaciente.ErrorNombreP(true);
                            _panelRegistrarPaciente.setLbNombreVacio();
                        }

                        if (_apellidoPVacio == true) {
                            _panelRegistrarPaciente.ErrorApellidoP(true);
                            _panelRegistrarPaciente.setLbApellidoVacio();
                        }

                        if (_telefonoPVacio == true) {
                            _panelRegistrarPaciente.ErrorTelefonoP(true);
                            _panelRegistrarPaciente.setLbNumeroVacio();
                        } else {
                            if (_codigoTelefonicoVerificado == false) {
                                _panelRegistrarPaciente.ErrorTelefonoP(true);
                                _panelRegistrarPaciente.setLbNumeroError();
                            } else {

                                if (_faltanDigitosTelefono == true) {
                                    _panelRegistrarPaciente.ErrorTelefonoP(true);
                                    _panelRegistrarPaciente.setLbNumeroFaltanDigitos();
                                } else if (_sobranDigitosTelefono == true) {
                                    _panelRegistrarPaciente.ErrorTelefonoP(true);
                                    _panelRegistrarPaciente.setLbNumeroSobranDigitos();
                                }
                            }
                        }

                        if (_correoVerificado == true) {
                            _panelRegistrarPaciente.ErrorCorreoP(true);
                            _panelRegistrarPaciente.setLbCorreoError();
                        } else {
                            if (_correoVacio == true) {
                                _panelRegistrarPaciente.ErrorCorreoP(true);
                                _panelRegistrarPaciente.setLbCorreoVacio();
                            }
                        }

                        if (_mesVerificado == true && _diaVerificado == true && _anoVerificado == true) {
                            _panelRegistrarPaciente.ErrorMes(true);
                            _panelRegistrarPaciente.ErrorDia(true);
                            _panelRegistrarPaciente.ErrorAno(true);
                            _panelRegistrarPaciente.setLbFechaNoCumple();
                        } else {
                            if (_mesVacio == true && _diaVacio == true && _anoVacio == true) {
                                _panelRegistrarPaciente.ErrorMes(true);
                                _panelRegistrarPaciente.ErrorDia(true);
                                _panelRegistrarPaciente.ErrorAno(true);
                                _panelRegistrarPaciente.setLbSeleccioneFecha();
                            } else {
                                if (_mesVacio == true) {
                                    _panelRegistrarPaciente.ErrorMes(true);
                                    _panelRegistrarPaciente.setLbSeleccioneMes();
                                }

                                if (_diaVacio == true) {
                                    _panelRegistrarPaciente.ErrorDia(true);
                                    _panelRegistrarPaciente.setLbSeleccioneDia();
                                }

                                if (_anoVacio == true) {
                                    _panelRegistrarPaciente.ErrorAno(true);
                                    _panelRegistrarPaciente.setLbSeleccioneAno();
                                }
                            }
                        }

                        if (_direccionPVacio == true) {
                            _panelRegistrarPaciente.ErrorDireccionP(true);
                            _panelRegistrarPaciente.setLbDireccionVacia();
                        }

                        if (_ocupacionPVacio == true) {
                            _panelRegistrarPaciente.ErrorOcupacionP(true);
                            _panelRegistrarPaciente.setLbOcupacion();
                        }

                        if (_estadoCVerifiado == true) {
                            _panelRegistrarPaciente.ErrorEstadoCivil(true);
                            _panelRegistrarPaciente.setLbSeleccionEstado();
                        }

                        if (_generoVerificado == true) {
                            _panelRegistrarPaciente.ErrorGenero(true);
                            _panelRegistrarPaciente.setLbSeleccioneGenero();
                        }

                        if (_cedulaP1Vacia == true && _cedulaP2Vacia == true) {
                            _panelRegistrarPaciente.ErrorCedulaP1(_cedulaP1Vacia);
                            _panelRegistrarPaciente.ErrorCedulaP2(_cedulaP2Vacia);
                            _panelRegistrarPaciente.setLbCedulaYVerificadorVacio();
                        } else if (_cedulaP1Vacia == true) {
                            _panelRegistrarPaciente.setLbVaciarAvisosCedula();
                            _panelRegistrarPaciente.ErrorCedulaP1(_cedulaP1Vacia);
                            _panelRegistrarPaciente.setLbCedulaVacia();
                        } else if (_cedulaP2Vacia == true) {
                            _panelRegistrarPaciente.setLbVaciarAvisosCedula();
                            _panelRegistrarPaciente.ErrorCedulaP2(_cedulaP2Vacia);
                            _panelRegistrarPaciente.setLbCodigoVerificadorVacio();
                        } else if (_codigoPErroneo == true) {
                            _panelRegistrarPaciente.setLbVaciarAvisosCedula();
                            _panelRegistrarPaciente.ErrorCedulaP1(_codigoPErroneo);
                            _panelRegistrarPaciente.setLbCodigoProvinciaError();
                        } else if (_codigoVErroneo == true) {
                            _panelRegistrarPaciente.setLbVaciarAvisosCedula();
                            _panelRegistrarPaciente.ErrorCedulaP2(_codigoVErroneo);
                            _panelRegistrarPaciente.setLbCodigoVerificadorError();
                        } else if (_digitosMenor9 == true) {
                            _panelRegistrarPaciente.setLbVaciarAvisosCedula();
                            _panelRegistrarPaciente.ErrorCedulaP1(_digitosMenor9);
                            _panelRegistrarPaciente.setLbCedulaMenorA9Digitos();
                        }

                        //cosas  raras est[an paando aqu[i
                        if (_edadPaciente < 18 && _edadPaciente != 0) {
                            if (_nombreRVacio == true) {
                                _panelRegistrarPaciente.ErrorNombreR(true);
                                _panelRegistrarPaciente.setLbNombreRVacio();
                            }

                            if (_telefonoRVacio == true) {
                                _panelRegistrarPaciente.ErrorTelefonoR(true);
                                _panelRegistrarPaciente.setLbNumeroRVacio();
                            } else {
                                if (_codigoTelefonicoRVerificado == false) {
                                    _panelRegistrarPaciente.ErrorTelefonoR(true);
                                    _panelRegistrarPaciente.setLbNumeroRError();
                                }

                                if (_faltanDigitosTelefonoR == true) {
                                    _panelRegistrarPaciente.ErrorTelefonoR(true);
                                    _panelRegistrarPaciente.setLbNumeroFaltanDigitosR();
                                } else if (_sobranDigitosTelefono == true) {
                                    _panelRegistrarPaciente.ErrorTelefonoR(true);
                                    _panelRegistrarPaciente.setLbNumeroSobranDigitos();
                                }
                                if (_faltanDigitosTelefonoR == true) {
                                    _panelRegistrarPaciente.ErrorTelefonoR(true);
                                    _panelRegistrarPaciente.setLbNumeroFaltanDigitosR();
                                } else if (_sobranDigitosTelefonoR == true) {
                                    _panelRegistrarPaciente.ErrorTelefonoR(true);
                                    _panelRegistrarPaciente.setLbNumeroSobranDigitosR();
                                }
                            }

                            if (_apellidoRVacio == true) {
                                _panelRegistrarPaciente.ErrorApellidoR(true);
                                _panelRegistrarPaciente.setLbApellidoRVacio();
                            }
                        }
                        //-------------------

                    }

                } else if (evento.getSource() == _panelRegistrarPaciente.getBotonVolver()) {
                    _panelRegistrarPaciente.setTextNombreP();
                    _panelRegistrarPaciente.setTextApellidoP();
                    _panelRegistrarPaciente.setTextCedulaP2();
                    _panelRegistrarPaciente.setTextTelefonoP();
                    _panelRegistrarPaciente.setTextCorreoP();
                    _panelRegistrarPaciente.setTextOcupacionP();
                    _panelRegistrarPaciente.setAreaDireccionP();
                    _panelRegistrarPaciente.setTextNombreRBorrar();
                    _panelRegistrarPaciente.setTextApellidoRBorrar();
                    _panelRegistrarPaciente.setTextTelefonoRBorrar();
                    _panelRegistrarPaciente.setTextApellidoR();
                    _panelRegistrarPaciente.setTextTelefonoR();
                    _panelRegistrarPaciente.setTextNombreR();
                    _panelRegistrarPaciente.setComboAno();
                    _panelRegistrarPaciente.setComboMes();
                    _panelRegistrarPaciente.setComboDia();
                    _panelRegistrarPaciente.setComboGenero();
                    _panelRegistrarPaciente.setComboEstadoCivil();
                    _frameAPaciente.dispose();
                    _frameContenedorPaciente.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error" + e);
            }
        }

    }

}
