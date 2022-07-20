package packagePrincipal.ControladorRegistroPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import packagePrincipal.modelo.DatosMedicos;
import packagePrincipal.modelo.DatosPaciente;
import packagePrincipal.modelo.VerificarCuentaPaciente;
import packagePrincipal.modelo.VerificarDatosMedico;
import packagePrincipal.modelo.VerificarDatosPaciente;
import packagePrincipal.vistaADatosConsulta.FrameADatosConsulta;
import packagePrincipal.vistaADatosConsulta.PanelADatosConsulta;
import packagePrincipal.vistaPaciente.FrameContenedor;

public class ControladorCitasPaciente {
    
    /*Las variables enteras y booleanas las uso para verificar
    si los datos cumplen o no para poder registrar la cita*/
    private int _posicionMedicoAsociado;
    private int _posicionPacienteAsociado;
    private boolean _cedulaPV;
    private boolean _cedulaMV;
    private boolean _estadoCV;
    private boolean _cedulaPRepetida;
    private boolean _cedulaMRepetida;
    private DatosMedicos _datosDatosMedicos;
    private VerificarDatosPaciente _verificarDatosPaciente;
    private VerificarDatosMedico _verificarDatosMedico;
    private ControladorArraysList _controladorArrayList;
    private PanelADatosConsulta _panelADatosConsulta;
    private FrameContenedor _frameContenedorPaciente;
    private FrameADatosConsulta _frameADatosConsulta;
    private ArrayList<DatosMedicos> _registroMedicos;
    private ArrayList<DatosPaciente> _registroPaciente;

    public ControladorCitasPaciente(FrameContenedor frameContenedorPaciente, ControladorArraysList controladorArrayList) {
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
                    _verificarDatosMedico.VerificarCedula(_panelADatosConsulta.getTextoCedulaM());
                    _verificarDatosPaciente.VerificarCedula(_panelADatosConsulta.getTextoCedulaP());
                    _verificarDatosMedico.VerificarEstadoConsulta(_panelADatosConsulta.getTextoConsulta());
                    _estadoCV = _verificarDatosMedico.IsEstadoConsultaVerificado();
                    _cedulaPV = _verificarDatosPaciente.IsCedulaVerificada();
                    _cedulaMV = _verificarDatosMedico.IsCedulaVerificada();
                    /*---------------------------------------------------------------------*/
                    
                    /*----Si se confirma que los datos están correcto entonces se registra una consulta---*/
                    if (_cedulaMV == false && _cedulaPV == false && _estadoCV == false) {
                        _registroMedicos = _controladorArrayList.getRegistroMedicos();
                        _registroPaciente = _controladorArrayList.getRegistroPaciente1();
                        _posicionMedicoAsociado = _controladorArrayList.ObtenerIndiceCedulaMedico(_panelADatosConsulta.getTextoCedulaM());
                        _posicionPacienteAsociado = _controladorArrayList.ObtenerIndiceCedulaPaciente(_panelADatosConsulta.getTextoCedulaP());
                        _datosDatosMedicos = new DatosMedicos(_registroMedicos.get(_posicionMedicoAsociado).getNombreMedico(),
                                _registroMedicos.get(_posicionMedicoAsociado).getCedulaMedico(), _registroMedicos.get(_posicionMedicoAsociado).getEspecialidad(), _registroMedicos.get(_posicionMedicoAsociado).getNumeroTelefonico());

                        _controladorArrayList.AgregarConsulta(_panelADatosConsulta.getTextoConsulta(), _datosDatosMedicos, _registroPaciente.get(_posicionPacienteAsociado).getNombre(), _panelADatosConsulta.getTextoCedulaP());
                        if (_controladorArrayList.isCedulaPacienteRepetida() == true) {
                            _panelADatosConsulta.ErrorCedulaPaciente(true);
                            _panelADatosConsulta.AvisoCedulaAsociada();
                        } else {
                            _panelADatosConsulta.setTextoCedulaM();
                            _panelADatosConsulta.setTextoCedulaP();
                            _panelADatosConsulta.setTextoConsulta();
                            _panelADatosConsulta.setCbCedulaMedico();
                            _panelADatosConsulta.setCbCedulaPaciente();
                            _panelADatosConsulta.setCbEstadoConsulta();
                        }

                    }
                    /*---------------------------------------------------------------------------------------*/
                    
                    /*Si no confirma que los datos están correcto entonces no registra una consulta y se muestra el error*/
                    else {
                        _panelADatosConsulta.ErrorCedulaMedico(_cedulaMV);
                        _panelADatosConsulta.ErrorCedulaPaciente(_cedulaPV);
                        _panelADatosConsulta.ErrorEstadoConsulta(_estadoCV);
                    }
                } else if (evento.getSource() == _panelADatosConsulta.getBotonVolver()) {
                    _panelADatosConsulta.setTextoCedulaM();
                    _panelADatosConsulta.setTextoCedulaP();
                    _panelADatosConsulta.setTextoConsulta();
                    _panelADatosConsulta.setCbCedulaMedico();
                    _panelADatosConsulta.setCbCedulaPaciente();
                    _panelADatosConsulta.setCbEstadoConsulta();
                    _frameADatosConsulta.dispose();
                    _frameContenedorPaciente.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
