package packagePrincipal.ControladorDatosMedicos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.modelo.VerificarDatosMedico;
import packagePrincipal.ventanaMDatosClinica.FrameMDatosClinica;
import packagePrincipal.vistaADatosMedicos.FrameADatosMedicos;
import packagePrincipal.vistaADatosMedicos.PanelADatosMedico;

public class ControladorDatosMedicos {

    /*Las variables booleanas la uso para poder verificar que todos los datos
    cumples y poder proceder a registrar al medico*/
    private boolean _nombreV;
    private boolean _cedulaV;
    private boolean _especialidadV;
    private boolean _telefonoV;
    private VerificarDatosMedico _verificarDatosMedico;
    private ControladorArraysList _controladorArrayList;
    private PanelADatosMedico _panelADatosMedico;
    private FrameMDatosClinica _frameMDatosClinica;
    private FrameADatosMedicos _frameADatosMedico;

    public ControladorDatosMedicos(FrameMDatosClinica frameMDatosClinica, ControladorArraysList controladorArrayList) {
        this._frameMDatosClinica = frameMDatosClinica;
        this._controladorArrayList = controladorArrayList;
        this._frameADatosMedico = new FrameADatosMedicos();
        this._verificarDatosMedico = new VerificarDatosMedico();
        _frameADatosMedico.setVisible(true);
        this._panelADatosMedico = _frameADatosMedico.getPanelADatosMedico();
        _panelADatosMedico.AddActionListener(new AddActionListenerVentanaADatosMedico());
    }

    public class AddActionListenerVentanaADatosMedico implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelADatosMedico.getBotonRegistrar()) {
                    /*------Verificamos los datos de las cajas de texto y comboBoxes-------*/
                    _verificarDatosMedico.VerificarNombreMedico(_panelADatosMedico.getFtNombreMedico());
                    _panelADatosMedico.ErrorNombreMedico(_verificarDatosMedico.IsNombreVerificado());
                    _nombreV = _verificarDatosMedico.IsNombreVerificado();
                    _verificarDatosMedico.VerificarCedula(_panelADatosMedico.getFtCedulaMedico());
                    _panelADatosMedico.ErrorCedula(_verificarDatosMedico.IsCedulaVerificada());
                    _cedulaV = _verificarDatosMedico.IsCedulaVerificada();
                    _verificarDatosMedico.VerificarTelefono(_panelADatosMedico.getFtTelefonoMedico());
                    _panelADatosMedico.ErrorTelefono(_verificarDatosMedico.IsTelefonoVerificado());
                    _telefonoV = _verificarDatosMedico.IsTelefonoVerificado();
                    _verificarDatosMedico.VerificarEspecialidad(_panelADatosMedico.getTextoEspecialidad());
                    _panelADatosMedico.ErrorEspecialidad(_verificarDatosMedico.IsEspecialidadVerificada());
                    _especialidadV = _verificarDatosMedico.IsEspecialidadVerificada();
                    /*-------------------------------------------------------------------------*/

 /*----Si se confirma que los datos están correctos se registra al médico----------*/
                    if (_nombreV == false && _cedulaV == false && _telefonoV == false && _especialidadV == false) {
                        _controladorArrayList.AgregarMedico(_panelADatosMedico.getFtNombreMedico(), _panelADatosMedico.getFtCedulaMedico(), _panelADatosMedico.getTextoEspecialidad(), _panelADatosMedico.getFtTelefonoMedico());
                        if (_controladorArrayList.isCedulaRepetida()) {
                            _panelADatosMedico.setLabelErrorCedula();
                            _panelADatosMedico.ErrorCedula(true);
                        } else {
                            _panelADatosMedico.setLabelErrorCedula1();
                            _panelADatosMedico.setFtCedulaMedico();
                            _panelADatosMedico.setFtNombreMedico();
                            _panelADatosMedico.setFtTelefonoMedico();
                            _panelADatosMedico.setCbEspecialidadMedico();
                            _panelADatosMedico.setTextoEspecialidad();
                        }
                    }
                    /*--------------------------------------------------------------------------------*/

                } else if (evento.getSource() == _panelADatosMedico.getBotonVolver()) {
                    _panelADatosMedico.setLabelErrorCedula1();
                    _panelADatosMedico.setFtCedulaMedico();
                    _panelADatosMedico.setFtNombreMedico();
                    _panelADatosMedico.setFtTelefonoMedico();
                    _panelADatosMedico.setCbEspecialidadMedico();
                    _panelADatosMedico.setTextoEspecialidad();
                    _frameADatosMedico.dispose();
                    _frameMDatosClinica.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
