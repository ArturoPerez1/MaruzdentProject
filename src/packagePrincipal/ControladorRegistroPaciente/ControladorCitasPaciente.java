package packagePrincipal.ControladorRegistroPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import packagePrincipal.modelo.DatosMedicos;
import packagePrincipal.modelo.DatosPaciente;
import packagePrincipal.modelo.VerificarDatosMedico;
import packagePrincipal.modelo.VerificarDatosPaciente;
import packagePrincipal.modelo.VerificarFechaYHoraCita;
import packagePrincipal.vistaADatosConsulta.FrameADatosConsulta;
import packagePrincipal.vistaADatosConsulta.FrameAjustarFechaHoraCita;
import packagePrincipal.vistaADatosConsulta.PanelADatosConsulta;
import packagePrincipal.vistaPaciente.FrameContenedor;

public class ControladorCitasPaciente {

    /*Las variables enteras y booleanas las uso para verificar
    si los datos cumplen o no para poder registrar la cita*/
    private int _posicionMedicoAsociado;
    private int _posicionPacienteAsociado;
    private boolean _botonAjustarFHPresionado;
    private boolean _cedulaPV;
    private boolean _cedulaMV;
    private boolean _fechaVerificada;
    private boolean _fechaCumple;
    private String _fechaCita;
    private String _horaCita;
    private VerificarFechaYHoraCita _verificarFH;
    private DatosMedicos _datosDatosMedicos;
    private FrameAjustarFechaHoraCita _frameJFH;
    private VerificarDatosPaciente _verificarDatosPaciente;
    private VerificarDatosMedico _verificarDatosMedico;
    private ControladorArraysList _controladorArrayList;
    private PanelADatosConsulta _panelADatosConsulta;
    private FrameContenedor _frameContenedorPaciente;
    private FrameADatosConsulta _frameADatosConsulta;
    private ArrayList<DatosMedicos> _registroMedicos;
    private ArrayList<DatosPaciente> _registroPaciente;

    public ControladorCitasPaciente(FrameContenedor frameContenedorPaciente, ControladorArraysList controladorArrayList) {
        this._botonAjustarFHPresionado = false;
        this._fechaVerificada = false;
        this._frameContenedorPaciente = frameContenedorPaciente;
        this._controladorArrayList = controladorArrayList;
        this._frameADatosConsulta = new FrameADatosConsulta();
        this._verificarDatosMedico = new VerificarDatosMedico();
        this._verificarDatosPaciente = new VerificarDatosPaciente();
        _frameADatosConsulta.setVisible(true);
        _frameADatosConsulta.AgregarVentanaADatosConsulta();
        this._panelADatosConsulta = _frameADatosConsulta.getPanelADatosConsulta();
        _panelADatosConsulta.LlenarCedulaM(_controladorArrayList.getRegistroMedicos());
        _panelADatosConsulta.LlenarCedulaPaciente(_controladorArrayList.getRegistroPaciente1());
        _panelADatosConsulta.LlenarTablaGeneralMedico(_controladorArrayList.getRegistroMedicos());
        _panelADatosConsulta.LlenarTablaGeneralPaciente(_controladorArrayList.getRegistroPaciente1());
        _panelADatosConsulta.AddActionListener(new AddActionListenerVentanaADatosConsulta());
    }

    public class AddActionListenerVentanaADatosConsulta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelADatosConsulta.getBotonRegistrar()) {
                    /*----------Verificamos el contenido de los comboBoxes------------*/
                    _verificarDatosMedico.VerificarCedulaMedicoM(_panelADatosConsulta.getTextoCedulaM());
                    _verificarDatosPaciente.VerificarCedulaPacienteLista(_panelADatosConsulta.getTextoCedulaP());
                    _cedulaPV = _verificarDatosPaciente.IsCedulaP1Vacia();
                    _cedulaMV = _verificarDatosMedico.IsCedulaP1Vacia();
                    /*---------------------------------------------------------------------*/

 /*----Si se confirma que los datos están correcto entonces se registra una consulta---*/
                    if (_cedulaMV == false && _cedulaPV == false && _botonAjustarFHPresionado == true && _fechaVerificada == true && _fechaCumple == true) {
                        _registroMedicos = _controladorArrayList.getRegistroMedicos();
                        _registroPaciente = _controladorArrayList.getRegistroPaciente1();
                        _posicionMedicoAsociado = _controladorArrayList.ObtenerIndiceCedulaMedico(_panelADatosConsulta.getTextoCedulaM());
                        _posicionPacienteAsociado = _controladorArrayList.ObtenerIndiceCedulaPaciente(_panelADatosConsulta.getTextoCedulaP());
                        _datosDatosMedicos = new DatosMedicos(_registroMedicos.get(_posicionMedicoAsociado).getNombreMedico(),
                                _registroMedicos.get(_posicionMedicoAsociado).getCedulaMedico(), _registroMedicos.get(_posicionMedicoAsociado).getEspecialidad(),
                                _registroMedicos.get(_posicionMedicoAsociado).getNumeroTelefonico(), _registroMedicos.get(_posicionMedicoAsociado).getRutaImagen());

                        _controladorArrayList.AgregarConsulta("", _datosDatosMedicos, _registroPaciente.get(_posicionPacienteAsociado).getNombre(), _panelADatosConsulta.getTextoCedulaP(), _fechaCita, _horaCita);
                        if (_controladorArrayList.isCedulaPacienteRepetida() == true) {
                            _panelADatosConsulta.ErrorCedulaPaciente(true);
                            _panelADatosConsulta.AvisoCedulaAsociada();
                        } else {
                            JOptionPane.showMessageDialog(null, "CITA AGREGADA EXITOSAMENTE", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                            _panelADatosConsulta.setTextoCedulaM();
                            _panelADatosConsulta.setTextoCedulaP();
                            _panelADatosConsulta.setCbCedulaMedico();
                            _panelADatosConsulta.setCbCedulaPaciente();
                            _panelADatosConsulta.QuitarAvisoSCedulaM();
                            _panelADatosConsulta.QuitarAvisoSFecha();
                            _panelADatosConsulta.setAviso();
                        }

                    } /*---------------------------------------------------------------------------------------*/ /*Si no confirma que los datos están correcto entonces no registra una consulta y se muestra el error*/ else {
                        if (_cedulaMV == true) {
                            _panelADatosConsulta.ErrorCedulaMedico(_cedulaMV);
                            _panelADatosConsulta.AvisoSCedulaM();
                        }

                        if (_cedulaPV == true) {
                            _panelADatosConsulta.ErrorCedulaPaciente(_cedulaPV);
                            _panelADatosConsulta.AvisoCedula();
                        }

                        if (_fechaVerificada == false || _botonAjustarFHPresionado == false) {
                            _panelADatosConsulta.AvisoSFecha();
                        }
                    }
                } else if (evento.getSource() == _panelADatosConsulta.getBotonAgregarFechaHora()) {
                    _panelADatosConsulta.QuitarAvisoSFecha();
                    _botonAjustarFHPresionado = true;
                    _panelADatosConsulta.AgregarVentanaAjustarFH();
                    _frameJFH = _panelADatosConsulta.getFrameJFH();

                    _frameJFH.AddActionListener(new AgregarActionListenerVentanaAjustarFH());
                } else if (evento.getSource() == _panelADatosConsulta.getBotonVolver()) {
                    _panelADatosConsulta.setTextoCedulaM();
                    _panelADatosConsulta.setTextoCedulaP();
                    _panelADatosConsulta.setCbCedulaMedico();
                    _panelADatosConsulta.setCbCedulaPaciente();
                    _frameADatosConsulta.dispose();
                    _frameContenedorPaciente.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AgregarActionListenerVentanaAjustarFH implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == evento.getSource()) {
                    _verificarFH = new VerificarFechaYHoraCita();
                    _verificarFH.VerificarFechaCita(_frameJFH.getFecha());
                    _fechaVerificada = _verificarFH.isFechaVerificada();
                    _fechaCumple = _verificarFH.isFechaCumple();
                    if (_fechaVerificada == true) {
                        if (_fechaCumple == true) {
                            _fechaCita = _frameJFH.getFecha();
                            _horaCita = _frameJFH.getHora() + ":" + _frameJFH.getMinutos() + " " + _frameJFH.getTurno();
                            _frameJFH.dispose();
                        }else{
                            JOptionPane.showMessageDialog(null, "LA FECHA SELECCIONADA ES ANTIGUA \n SELECCIONE UNA QUE SEA ACTUAL", "SELECCIÓN DE FECHA", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "SELECCIONE UN FECHA PARA PODER REGISTRAR", "SELECCIÓN DE FECHA", JOptionPane.WARNING_MESSAGE);
                    }
                }

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
