package packagePrincipal.ControladorRegistroPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import packagePrincipal.modelo.VerificarCuentaPaciente;
import packagePrincipal.vistaACuenta.FrameACuenta;
import packagePrincipal.vistaACuenta.PanelACuenta;
import packagePrincipal.vistaPaciente.FrameContenedor;

public class ControladorACuentaPaciente {

    private boolean _costoConsultaV;
    private boolean _costoTratamientoV;
    private boolean _cedulaAsociadaV;
    private VerificarCuentaPaciente _verificarCuentaPaciente;
    private ControladorArraysList _controladorArrayList;
    private PanelACuenta _panelACuenta;
    private FrameContenedor _frameContenedorPaciente;
    private FrameACuenta _frameACuenta;

    public ControladorACuentaPaciente(FrameContenedor frameContenedorPaciente, ControladorArraysList controladorArrayList) {
        this._controladorArrayList = controladorArrayList;
        this._frameContenedorPaciente = frameContenedorPaciente;
        this._frameACuenta = new FrameACuenta();
        _frameACuenta.setVisible(true);
        _frameACuenta.AgregarVentanaACuenta();
        this._panelACuenta = _frameACuenta.getPanelACuenta();
        this._verificarCuentaPaciente = new VerificarCuentaPaciente();
        _panelACuenta.LlenaComboBoxCedulas(_controladorArrayList.getRegistroPaciente().getRegistroPacientes());
        _panelACuenta.AddActionListener(new AddActionListenerVentaACuenta());
    }

    public class AddActionListenerVentaACuenta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelACuenta.getBotonRegistrar()) {
                    /*Se verifica los datos en las cajas de texto*/
                    _verificarCuentaPaciente.VerificarCedula(_panelACuenta.getTextoCedula());
                    _panelACuenta.ErrorCedulaAsociada(_verificarCuentaPaciente.IsCedulaVerificada());
                    _verificarCuentaPaciente.VerificarCostoConsulta(_panelACuenta.getTfCConsulta());
                    _panelACuenta.ErrorCuntaConsulta(_verificarCuentaPaciente.IsCostoConsultaVerificado());
                    _verificarCuentaPaciente.VerificarCostoTratatmiento(_panelACuenta.getTfCTratamiento());
                    _panelACuenta.ErrorCuentaTratamiento(_verificarCuentaPaciente.IsCostoTratamientoVerificado());

                    _costoConsultaV = _verificarCuentaPaciente.IsCostoConsultaVerificado();
                    _costoTratamientoV = _verificarCuentaPaciente.IsCostoTratamientoVerificado();
                    _cedulaAsociadaV = _verificarCuentaPaciente.IsCedulaVerificada();
                    
                    /*--------------------------------------------------------------------------*/
                    
                    /*Si se confirma que los datos están correctos se procede a crear el registro de la cuenta*/
                    if (_costoConsultaV == false && _costoTratamientoV == false && _cedulaAsociadaV == false) {
                        _controladorArrayList.AgregarCuentaPaciente(_panelACuenta.getTfCTratamiento(), _panelACuenta.getTfCTratamiento(), _panelACuenta.getTfCConsulta(), _panelACuenta.getTextoCedula());
                        if (_controladorArrayList.isCedulaRepetida() == true) {
                            _panelACuenta.ErrorCedulaAsociada(true);
                            _panelACuenta.setLabelErrorCedula();
                        } else {
                            _panelACuenta.setTextoCedula();
                            _panelACuenta.setTfCConsulta();
                            _panelACuenta.setTfCTratamiento();
                            _panelACuenta.setCbCedulaAsociada();
                            _panelACuenta.setLabelErrorCedula1();
                        }

                    } 
                    /*-----------------------------------------------------------------------------------*/
                    else {

                        if (_verificarCuentaPaciente.IsMuchosPuntosT() == true && _verificarCuentaPaciente.IsMuchosPuntosC() == true) {
                            _panelACuenta.AvisoDoblePunto();
                            _panelACuenta.AvisoDoblePunto1();
                        } else if (_verificarCuentaPaciente.IsMuchosPuntosT() == true) {
                            _panelACuenta.AvisoDoblePunto();
                        } else if (_verificarCuentaPaciente.IsMuchosPuntosC() == true) {
                            _panelACuenta.AvisoDoblePunto1();
                        }
                    }

                } else if (evento.getSource() == _panelACuenta.getBotonVolver()) {
                    _panelACuenta.setTextoCedula();
                    _panelACuenta.setTfCConsulta();
                    _panelACuenta.setTfCTratamiento();
                    _panelACuenta.setCbCedulaAsociada();
                    _frameACuenta.dispose();
                    _frameContenedorPaciente.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
