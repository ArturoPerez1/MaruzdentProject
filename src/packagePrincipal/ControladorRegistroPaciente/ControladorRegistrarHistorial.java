package packagePrincipal.ControladorRegistroPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import packagePrincipal.modelo.VerificarDatosHistorial;
import packagePrincipal.vistaAHistorialClinico.FrameAHistorialMedico;
import packagePrincipal.vistaAHistorialClinico.PanelAHistorialClinico;
import packagePrincipal.vistaPaciente.FrameContenedor;

public class ControladorRegistrarHistorial {
    
    /*Las variables booleanas la uso para poder verificar que todos los datos
    cumples y poder proceder a registrar al historial*/
    private boolean _razonV;
    private boolean _tipoV;
    private boolean _anteFV;
    private boolean _antePV;
    private boolean _antePTV;
    private boolean _anteFMV;
    private boolean _diagnosticoV;
    private boolean _examenV;
    private boolean _enfermedadV;
    private boolean _planTratamientoV;
    private boolean _cedulaAV;
    private VerificarDatosHistorial _verificarHistorial;
    private ControladorArraysList _controladorArrayList;    
    private PanelAHistorialClinico _panelAHistorialClinico;
    private FrameContenedor _frameContenedorPaciente;
    private FrameAHistorialMedico _frameAHistorialMedico;

    public ControladorRegistrarHistorial(FrameContenedor frameContenedorPaciente, ControladorArraysList controladorArrayList) {
        this._frameContenedorPaciente = frameContenedorPaciente;
        this._controladorArrayList = controladorArrayList;
        this._frameAHistorialMedico = new FrameAHistorialMedico();
        this._verificarHistorial = new VerificarDatosHistorial();
        _frameAHistorialMedico.setVisible(true);
        _frameAHistorialMedico.AgregarHistorialMedico();
        this._panelAHistorialClinico = _frameAHistorialMedico.getPanelAHistorialClinico();
        _panelAHistorialClinico.LlenaComboBoxCedulas(_controladorArrayList.getRegistroPaciente().getRegistroPacientes());
        _panelAHistorialClinico.AddActionListener(new AddActionListenerVentanaAgregarHistorialClinico());
    }

    public class AddActionListenerVentanaAgregarHistorialClinico implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelAHistorialClinico.getBotonRegistrarH()) {
                    /*--Verificamos los campos de texto del historial asociado al respectivo paciente--*/
                    _verificarHistorial.VerificarRazonConsulta(_panelAHistorialClinico.getTfRazonConsulta());
                    _panelAHistorialClinico.ErrorRazonConsulta(_verificarHistorial.IsRazonVerificada());
                    _razonV = _verificarHistorial.IsRazonVerificada();
                    _verificarHistorial.VerificarAntePersonales(_panelAHistorialClinico.getAaAntePersonales());
                    _panelAHistorialClinico.ErrorAntePersonales(_verificarHistorial.IsAntePersonalesVerificados());
                    _antePV = _verificarHistorial.IsAntePersonalesVerificados();
                    _verificarHistorial.VerificarAnteFamiliares(_panelAHistorialClinico.getAaAnteFamiliares());
                    _panelAHistorialClinico.ErrorAnteFamiliares(_verificarHistorial.IsAnteFamiliaresVerificados());
                    _anteFV = _verificarHistorial.IsAnteFamiliaresVerificados();
                    _verificarHistorial.VerificarAntePatologico(_panelAHistorialClinico.getAaAntePatologicos());
                    _panelAHistorialClinico.ErrorAntePatalogico(_verificarHistorial.IsAntePatologicoVerificados());
                    _antePTV = _verificarHistorial.IsAntePatologicoVerificados();
                    _verificarHistorial.VerificarAnteFarmacologico(_panelAHistorialClinico.getAaAnteFarmacologicos());
                    _panelAHistorialClinico.ErrorAnteFarmacologico(_verificarHistorial.IsAnteFarmacologicosVerificados());
                    _anteFMV = _verificarHistorial.IsAnteFarmacologicosVerificados();
                    _verificarHistorial.VerificarEnfermedadActual(_panelAHistorialClinico.getAaEnfermedadActual());
                    _panelAHistorialClinico.ErrorEnfermedadActual(_verificarHistorial.IsEnfermedadVerificada());
                    _enfermedadV = _verificarHistorial.IsEnfermedadVerificada();
                    _verificarHistorial.VerificarExamenFisico(_panelAHistorialClinico.getAaExamenFisico());
                    _panelAHistorialClinico.ErrorExamenFisico(_verificarHistorial.IsExamenFisicoVerificado());
                    _examenV = _verificarHistorial.IsExamenFisicoVerificado();
                    _verificarHistorial.VerificarDiagnostico(_panelAHistorialClinico.getAaDiagnostico());
                    _panelAHistorialClinico.ErrorDiagnostico(_verificarHistorial.IsDiagnosticoVerificado());
                    _diagnosticoV = _verificarHistorial.IsDiagnosticoVerificado();
                    _verificarHistorial.VerificarTipoConsulta(_panelAHistorialClinico.getAaTipoConsulta());
                    _panelAHistorialClinico.ErrorTipoConsulta(_verificarHistorial.IsTipoConsultaVerificado());
                    _tipoV = _verificarHistorial.IsTipoConsultaVerificado();
                    _verificarHistorial.VerificarPlanTratamiento(_panelAHistorialClinico.getAaPlanDeTratamiento());
                    _panelAHistorialClinico.ErrorPlanTratamiento(_verificarHistorial.IsPlanTratamientoVerificado());
                    _planTratamientoV = _verificarHistorial.IsPlanTratamientoVerificado();
                    /*----------------------------------------------------------------------------------------------*/
                    
                    /*------Verificamos el contenido de los comboBoxes----------------------------------------------*/
                    _verificarHistorial.VerificarCedula(_panelAHistorialClinico.getTextoCedula());
                    _panelAHistorialClinico.ErrorCedula(_verificarHistorial.IsCedulaVerificada());
                    _cedulaAV = _verificarHistorial.IsCedulaVerificada();
                    
                    /*-------------------------------------------------------------------------------------------------*/
                    
                    /*----Si se confirma que todo cumple aquí se hace el proceso de registro del historial clinico----*/
                    if (_razonV == false && _antePV == false && _anteFV == false && _antePTV == false && _anteFMV == false && _enfermedadV == false && _examenV == false
                            && _diagnosticoV == false && _tipoV == false && _planTratamientoV == false
                            && _cedulaAV == false) {
                        _controladorArrayList.AgregarHistorialClinico(_panelAHistorialClinico.getTfRazonConsulta(), _panelAHistorialClinico.getAaEnfermedadActual(),
                                _panelAHistorialClinico.getAaAntePersonales(), _panelAHistorialClinico.getAaAnteFamiliares(),
                                _panelAHistorialClinico.getAaAntePatologicos(), _panelAHistorialClinico.getAaAnteFarmacologicos(),
                                _panelAHistorialClinico.getAaExamenFisico(), _panelAHistorialClinico.getAaTipoConsulta(),
                                _panelAHistorialClinico.getAaDiagnostico(), _panelAHistorialClinico.getAaPlanDeTratamiento(),_panelAHistorialClinico.getTextoCedula());

                        if (_controladorArrayList.isCedulaRepetida() == true) {
                            _panelAHistorialClinico.ErrorCedula(true);
                            _panelAHistorialClinico.AvisoCedulaAsociada();
                        } else {
                            _panelAHistorialClinico.setAviso();
                            _panelAHistorialClinico.setAaAnteFamiliares();
                            _panelAHistorialClinico.setAaAnteFarmacologicos();
                            _panelAHistorialClinico.setAaAntePatologicos();
                            _panelAHistorialClinico.setAaAntePersonales();
                            _panelAHistorialClinico.setAaDiagnostico();
                            _panelAHistorialClinico.setAaEnfermedadActual();
                            _panelAHistorialClinico.setAaPlanDeTratamiento();
                            _panelAHistorialClinico.setAaExamenFisico();
                            _panelAHistorialClinico.setAaTipoConsulta();
                            _panelAHistorialClinico.setTfRazonConsulta();
                            _panelAHistorialClinico.setCbCedula();
                            _panelAHistorialClinico.QuitarDatosPaciente();
                        }
                    }
                    /*--------------------------------------------------------------------------------------------------------*/

                } else if (evento.getSource() == _panelAHistorialClinico.getBotonVolver()) {
                    _panelAHistorialClinico.setAaAnteFamiliares();
                    _panelAHistorialClinico.setAaAnteFarmacologicos();
                    _panelAHistorialClinico.setAaAntePatologicos();
                    _panelAHistorialClinico.setAaAntePersonales();
                    _panelAHistorialClinico.setAaDiagnostico();
                    _panelAHistorialClinico.setAaEnfermedadActual();
                    _panelAHistorialClinico.setAaPlanDeTratamiento();
                    _panelAHistorialClinico.setAaExamenFisico();
                    _panelAHistorialClinico.setAaTipoConsulta();
                    _panelAHistorialClinico.setTfRazonConsulta();
                    _panelAHistorialClinico.setCbCedula();
                    _frameAHistorialMedico.dispose();
                    _frameContenedorPaciente.setVisible(true);
                }

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
