package packagePrincipal.ControladorRegistroPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import packagePrincipal.modelo.VerificarCuentaPaciente;
import packagePrincipal.vistaACuenta.FrameACuenta;
import packagePrincipal.vistaACuenta.PanelListaPacienteCuenta;
import packagePrincipal.vistaPaciente.FrameContenedor;

public class ControladorACuentaPaciente {

    private boolean _botonAgregarPulsado;
    private boolean _cedulaAsociadaV;
    private VerificarCuentaPaciente _verificarCuentaPaciente;
    private ControladorArraysList _controladorArrayList;
    private PanelListaPacienteCuenta _panellistaPacienteCuenta;
    private FrameContenedor _frameContenedorPaciente;
    private FrameACuenta _frameACuenta;

    public ControladorACuentaPaciente(FrameContenedor frameContenedorPaciente, ControladorArraysList controladorArrayList) {
        this._controladorArrayList = controladorArrayList;
        this._frameContenedorPaciente = frameContenedorPaciente;
        this._botonAgregarPulsado = false;
        this._frameACuenta = new FrameACuenta();
        _frameACuenta.setVisible(true);
        _frameACuenta.AgregarVentanaACuenta();
        this._panellistaPacienteCuenta = _frameACuenta.getPanelACuenta();
        this._verificarCuentaPaciente = new VerificarCuentaPaciente();
        _panellistaPacienteCuenta.LlenaComboBoxCedulas(_controladorArrayList.getRegistroPaciente().getRegistroPacientes());
        _panellistaPacienteCuenta.AddActionListener(new AddActionListenerVentaACuenta());
    }

    public class AddActionListenerVentaACuenta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panellistaPacienteCuenta.getBotonRegistrar()) {
                    /*Se verifica los datos en las cajas de texto*/
                    _verificarCuentaPaciente.VerificarCedula(_panellistaPacienteCuenta.getTextoCedula());
                    _panellistaPacienteCuenta.ErrorCedulaAsociada(_verificarCuentaPaciente.IsCedulaVerificada());

                    _cedulaAsociadaV = _verificarCuentaPaciente.IsCedulaVerificada();

                    /*--------------------------------------------------------------------------*/
 /*Si se confirma que los datos están correctos se procede a crear el registro de la cuenta*/
                    if (_cedulaAsociadaV == false) {
                        _controladorArrayList.AgregarCuentaPaciente("", "", "", _panellistaPacienteCuenta.getTextoCedula());
                        if (_controladorArrayList.isCedulaRepetida() == true) {
                            _panellistaPacienteCuenta.ErrorCedulaAsociada(true);
                            _panellistaPacienteCuenta.setLabelErrorCedula();
                        } else {
                            _panellistaPacienteCuenta.setTextoCedula();
                            _panellistaPacienteCuenta.setCbCedulaAsociada();
                            _panellistaPacienteCuenta.setLabelErrorCedula1();
                        }

                    } 
                    /*-----------------------------------------------------------------------------------*/

                }else if(evento.getSource() == _panellistaPacienteCuenta.getBotonAgregarCuenta()){
                    _botonAgregarPulsado = true;
                    
                }
                else if (evento.getSource() == _panellistaPacienteCuenta.getBotonVolver()) {
                    _panellistaPacienteCuenta.setTextoCedula();
                    _panellistaPacienteCuenta.setCbCedulaAsociada();
                    _frameACuenta.dispose();
                    _frameContenedorPaciente.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
