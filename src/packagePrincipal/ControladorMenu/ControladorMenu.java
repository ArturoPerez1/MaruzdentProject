package packagePrincipal.ControladorMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import packagePrincipal.ManejadoresXml.EscrituraDeDatos;
import packagePrincipal.ControladorListaCitas.ControladorListaCita;
import packagePrincipal.ControladorDatosClinica.ControladorDatosClinica;
import packagePrincipal.ControladorListaPaciente.ControladorListaPaciente;
import packagePrincipal.ControladorPagos.ControladorPagos;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.ControladorRegistroPaciente.ControladorRegistroPaciente;
import packagePrincipal.modelo.ComparadorDeSizeRegistros;
import packagePrincipal.modelo.ContenedorSizeRegistros;
import packagePrincipal.modelo.RegistroCuentaPaciente;
import packagePrincipal.modelo.RegistroDatosConsulta;
import packagePrincipal.modelo.RegistroHistorialClinico;
import packagePrincipal.modelo.RegistroMedicos;
import packagePrincipal.modelo.RegistroPaciente;
import packagePrincipal.vistaMenu.FrameContenedorMenu;
import packagePrincipal.vistaMenu.PanelMenuCompleto;
import packagePrincipal.vistaMenu.PanelBotonesMenu;

public class ControladorMenu {

    private ContenedorSizeRegistros _sizeRegistros;
    private EscrituraDeDatos _escribirDatos;
    private boolean _mostrarBotones;
    private ControladorRegistroPaciente _controladorRPaciente;
    private ControladorArraysList _controladorArrayList;
    private ControladorListaPaciente _controladorListaPaciente;
    private ControladorPagos _controladorPagos;
    private ControladorDatosClinica _controladorDatosClinica;
    private ControladorListaCita _controladorConsultas;
    private PanelBotonesMenu _panelMenu;
    private PanelMenuCompleto _panelContenedorMenu;
    private FrameContenedorMenu _frameContenedor;

    public ControladorMenu(FrameContenedorMenu contenedor, ControladorArraysList controladorArrayList, ContenedorSizeRegistros sizeRegistros) {
        this._sizeRegistros = sizeRegistros;
        this._frameContenedor = contenedor;
        this._controladorArrayList = controladorArrayList;
        this._mostrarBotones = false;
        _frameContenedor.AgregarVentanaContenedorMenu();
        this._panelContenedorMenu = _frameContenedor.getPanelMenu();
        _panelContenedorMenu.AgregarVentanaMenu();
        _panelMenu = _panelContenedorMenu.getPanelMenu();
        _panelContenedorMenu.AddActionListener(new AgregarListenerBotonSalir());
        _panelMenu.AddActionListener(new AgregarListenerBotonesMenu());
    }

    public ControladorMenu(FrameContenedorMenu contenedor) {
        _sizeRegistros = new ContenedorSizeRegistros();
        _sizeRegistros.setPrimerGuardado(true);
        this._frameContenedor = contenedor;
        this._controladorArrayList = new ControladorArraysList();
        this._mostrarBotones = false;
        _frameContenedor.AgregarVentanaContenedorMenu();
        this._panelContenedorMenu = _frameContenedor.getPanelMenu();
        _panelContenedorMenu.AgregarVentanaMenu();
        _panelMenu = _panelContenedorMenu.getPanelMenu();
        _panelContenedorMenu.AddActionListener(new AgregarListenerBotonSalir());
        _panelMenu.AddActionListener(new AgregarListenerBotonesMenu());
    }

    public class AgregarListenerBotonSalir implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelContenedorMenu.getBotonClose()) {
                    boolean pacientev = _controladorArrayList.getRegistroPaciente1().isEmpty();
                    boolean historialV = _controladorArrayList.getRegistroHistorial().isEmpty();
                    boolean medicoV = _controladorArrayList.getRegistroMedicos().isEmpty();
                    boolean citasV = _controladorArrayList.getRegistroDatosConsulta().isEmpty();
                    boolean cuentaV = _controladorArrayList.getRegistroCuenta().isEmpty();
                    if (pacientev == false && historialV == false && medicoV == false && citasV == false && cuentaV == false) {
                        /*Guardamos el tamaño de los arreglos para poder hacer la comparación de los arreglos*/
                        int sizePaciente = _controladorArrayList.getRegistroPaciente1().size();
                        int sizeHistorial = _controladorArrayList.getRegistroHistorial().size();
                        int sizeCuenta = _controladorArrayList.getRegistroCuenta().size();
                        int sizeMedico = _controladorArrayList.getRegistroMedicos().size();
                        int sizeCita = _controladorArrayList.getRegistroDatosConsulta().size();
                        _sizeRegistros.setSizeRegistroCita(sizeCita);
                        _sizeRegistros.setSizeRegistroCuenta(sizeCuenta);
                        _sizeRegistros.setSizeRegistroHistorial(sizeHistorial);
                        _sizeRegistros.setSizeRegistroMedico(sizeMedico);
                        _sizeRegistros.setSizeRegistroPaciente(sizePaciente);

                        if (_sizeRegistros.isPrimerGuardado() == true) {
                            _escribirDatos = new EscrituraDeDatos();
                            RegistroPaciente pacientes = _controladorArrayList.getRegistroPaciente();
                            RegistroMedicos medicos = _controladorArrayList.getRegistroMedicos1();
                            RegistroHistorialClinico historial = _controladorArrayList.getRegistroHistorial1();
                            RegistroDatosConsulta citas = _controladorArrayList.getRegistroDatosConsulta1();
                            RegistroCuentaPaciente cuenta = _controladorArrayList.getRegistroCuenta1();
                            _escribirDatos.InsertarDatosPaciente(pacientes);
                            _escribirDatos.InsertarDatosMedico(medicos);
                            _escribirDatos.InsertarDatosHistorial(historial);
                            _escribirDatos.InsertarDatosCita(citas);
                            _escribirDatos.InsertarDatosCuenta(cuenta);
                            _escribirDatos.InsertarDatosSizeRegistros(_sizeRegistros);
                            _sizeRegistros.setPrimerGuardado(false);
                            boolean pacienteG = _escribirDatos.isPacienteGuardado();
                            boolean medicoG = _escribirDatos.isMedicoGuardado();
                            boolean historialG = _escribirDatos.isHistorialGuardado();
                            boolean citasG = _escribirDatos.isCitaGuardado();
                            boolean cuentaG = _escribirDatos.isCuentaGuardado();
                            if (pacienteG == true && medicoG == true && historialG == true && citasG == true && cuentaG == true) {
                                JOptionPane.showMessageDialog(null, "DATOS GUARDADOS DE FORMA CORRECTA EN LA BASE DE DATOS\n "
                                        + "(PRESIONE ACEPTAR PARA TERMINAR DE CERRAR EL PROGRAMA)", "GuardadoCorrecto", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                                System.exit(1);
                            }
                        } else if (_sizeRegistros.isPrimerGuardado() == false) {
                            ComparadorDeSizeRegistros comparadorSizes;
                            RegistroPaciente pacientes = _controladorArrayList.getRegistroPaciente();
                            RegistroMedicos medicos = _controladorArrayList.getRegistroMedicos1();
                            RegistroHistorialClinico historial = _controladorArrayList.getRegistroHistorial1();
                            RegistroDatosConsulta citas = _controladorArrayList.getRegistroDatosConsulta1();
                            RegistroCuentaPaciente cuenta = _controladorArrayList.getRegistroCuenta1();
                            comparadorSizes = new ComparadorDeSizeRegistros(cuenta, medicos, historial, pacientes, citas, _sizeRegistros);

                            if (comparadorSizes.CompararSizeRegistroPaciente() == true) {
                                _escribirDatos.InsertarDatosPaciente(pacientes);
                            }

                            if (comparadorSizes.CompararSizeRegistroCuenta() == true) {
                                _escribirDatos.InsertarDatosCuenta(cuenta);
                            }

                            if (comparadorSizes.CompararSizeRegistroCita() == true) {
                                _escribirDatos.InsertarDatosCita(citas);
                            }

                            if (comparadorSizes.CompararSizeRegistroHistorial() == true) {
                                _escribirDatos.InsertarDatosHistorial(historial);
                            }

                            if (comparadorSizes.CompararSizeRegistroMedico() == true) {
                                _escribirDatos.InsertarDatosMedico(medicos);
                            }

                            sizePaciente = _controladorArrayList.getRegistroPaciente1().size();
                            sizeHistorial = _controladorArrayList.getRegistroHistorial().size();
                            sizeCuenta = _controladorArrayList.getRegistroCuenta().size();
                            sizeMedico = _controladorArrayList.getRegistroMedicos().size();
                            sizeCita = _controladorArrayList.getRegistroDatosConsulta().size();
                            _sizeRegistros.setSizeRegistroCita(sizeCita);
                            _sizeRegistros.setSizeRegistroCuenta(sizeCuenta);
                            _sizeRegistros.setSizeRegistroHistorial(sizeHistorial);
                            _sizeRegistros.setSizeRegistroMedico(sizeMedico);
                            _sizeRegistros.setSizeRegistroPaciente(sizePaciente);
                            _escribirDatos.InsertarDatosSizeRegistros(_sizeRegistros);
                            _sizeRegistros.setPrimerGuardado(false);

                            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS DE FORMA CORRECTA EN LA BASE DE DATOS\n "
                                    + "(PRESIONE ACEPTAR PARA TERMINAR DE CERRAR EL PROGRAMA)", "GuardadoCorrecto", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                            System.exit(1);
                        }
                    } else {
                        if (pacientev == true || historialV == true || medicoV == true || citasV == true || cuentaV == true) {
                            int salir = JOptionPane.showConfirmDialog(null,"¿DESEA SALIR DE LA APLICACIÓN?", "CONFIRMAR SALIDA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                            if (salir == 0) {
                                _escribirDatos = new EscrituraDeDatos();
                                RegistroPaciente pacientes = _controladorArrayList.getRegistroPaciente();
                                RegistroMedicos medicos = _controladorArrayList.getRegistroMedicos1();
                                RegistroHistorialClinico historial = _controladorArrayList.getRegistroHistorial1();
                                RegistroDatosConsulta citas = _controladorArrayList.getRegistroDatosConsulta1();
                                RegistroCuentaPaciente cuenta = _controladorArrayList.getRegistroCuenta1();
                                int sizePaciente = _controladorArrayList.getRegistroPaciente1().size();
                                int sizeHistorial = _controladorArrayList.getRegistroHistorial().size();
                                int sizeCuenta = _controladorArrayList.getRegistroCuenta().size();
                                int sizeMedico = _controladorArrayList.getRegistroMedicos().size();
                                int sizeCita = _controladorArrayList.getRegistroDatosConsulta().size();
                                _sizeRegistros.setSizeRegistroCita(sizeCita);
                                _sizeRegistros.setSizeRegistroCuenta(sizeCuenta);
                                _sizeRegistros.setSizeRegistroHistorial(sizeHistorial);
                                _sizeRegistros.setSizeRegistroMedico(sizeMedico);
                                _sizeRegistros.setSizeRegistroPaciente(sizePaciente);
                                _escribirDatos.InsertarDatosPaciente(pacientes);
                                _escribirDatos.InsertarDatosMedico(medicos);
                                _escribirDatos.InsertarDatosHistorial(historial);
                                _escribirDatos.InsertarDatosCita(citas);
                                _escribirDatos.InsertarDatosCuenta(cuenta);
                                _escribirDatos.InsertarDatosSizeRegistros(_sizeRegistros);
                                _sizeRegistros.setPrimerGuardado(false);
                                System.exit(1);
                            }
                        }
                    }
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AgregarListenerBotonesMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelMenu.getBotonPaciente() && _controladorArrayList.isPrimerMedico() == false) {
                    _panelContenedorMenu.setLabelAvisos();
                    _frameContenedor.setVisible(false);
                    _controladorRPaciente = new ControladorRegistroPaciente(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelMenu.getBotonPaciente() && _controladorArrayList.isPrimerMedico() == true) {
                    _panelContenedorMenu.AvisoFaltaMedico();
                } else if (evento.getSource() == _panelMenu.getBotonMDatosClinica()) {
                    _panelContenedorMenu.setLabelAvisos();
                    _frameContenedor.setVisible(false);
                    _controladorDatosClinica = new ControladorDatosClinica(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelMenu.getBotonListaC() && _controladorArrayList.isPrimerConsulta() == false) {
                    _panelContenedorMenu.setLabelAvisos();
                    _controladorConsultas = new ControladorListaCita(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelMenu.getBotonListaC() && _controladorArrayList.isPrimerConsulta() == true) {
                    _panelContenedorMenu.setLabelAvisos();
                    _panelContenedorMenu.AvisoListaConsulta2();
                } else if (evento.getSource() == _panelMenu.getBotonListaP() && _controladorArrayList.isPrimerPaciente() == false) {
                    _panelContenedorMenu.setLabelAvisos();
                    _controladorListaPaciente = new ControladorListaPaciente(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelMenu.getBotonListaP() && _controladorArrayList.isPrimerPaciente() == true) {
                    _panelContenedorMenu.setLabelAvisos();
                    _panelContenedorMenu.AvisoListaPaciente1();
                } else if (evento.getSource() == _panelMenu.getBotonPagos() && _controladorArrayList.isPrimerCuenta() == false) {
                    _panelContenedorMenu.setLabelAvisos();
                    _controladorPagos = new ControladorPagos(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelMenu.getBotonPagos() && _controladorArrayList.isPrimerCuenta() == true) {
                    _panelContenedorMenu.setLabelAvisos();
                    _panelContenedorMenu.AvisoListaCuenta();
                }
            } catch (Error e) {
                System.out.println("Error" + e);
            }
        }

    }

}
