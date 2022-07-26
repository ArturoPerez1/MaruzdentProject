package packagePrincipal.ControladorDatosMedicos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.modelo.VerificarDatosMedico;
import packagePrincipal.ventanaMDatosClinica.FrameMDatosClinica;
import packagePrincipal.vistaADatosMedicos.FrameADatosMedicos;
import packagePrincipal.vistaADatosMedicos.PanelADatosMedico;

public class ControladorDatosMedicos {

    /*Las variables booleanas la uso para poder verificar que todos los datos
    cumples y poder proceder a registrar al medico*/
    private boolean _nombreV;
    private boolean _cedulaP1Vacia;
    private boolean _codigoPErroneo;
    private boolean _digitosMenor10;
    private boolean _cedulaP2Vacia;
    private boolean _codigoVErroneo;
    private boolean _especialidadV;
    private boolean _telefonoVacio;
    private boolean _faltanDigitosTelefono;
    private boolean _sobranDigitosTelefono;
    private boolean _codigoTelefonicoVerificado;
    private String _cedulaCompleta;
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
                    _nombreV = _verificarDatosMedico.IsNombreVerificado();
                    _verificarDatosMedico.VerificarCedula(_panelADatosMedico.getFtCedulaP1(), _panelADatosMedico.getFtCedulaP2());
                    _cedulaP1Vacia = _verificarDatosMedico.IsCedulaP1Vacia();
                    _cedulaP2Vacia = _verificarDatosMedico.IsCedulaP2Vacia();
                    _codigoPErroneo = _verificarDatosMedico.IsCedulaP1CodigoPVerificado();
                    _codigoVErroneo = _verificarDatosMedico.IsCedulaP2CodigoVerificacionV();
                    _digitosMenor10 = _verificarDatosMedico.IsCedulaP1PocoDigitos();
                    _verificarDatosMedico.VerificarTelefono(_panelADatosMedico.getFtTelefonoMedico());
                    _codigoTelefonicoVerificado = _verificarDatosMedico.IsCodigoTelefonicoVerificado();
                    _faltanDigitosTelefono = _verificarDatosMedico.isFaltanDigitosTelefono();
                    _sobranDigitosTelefono = _verificarDatosMedico.isSobranDigitosTelefono();
                    _telefonoVacio = _verificarDatosMedico.IsTelefonoVacio();
                    _verificarDatosMedico.VerificarEspecialidad(_panelADatosMedico.getTextoEspecialidad());
                    _especialidadV = _verificarDatosMedico.IsEspecialidadVerificada();
                    /*-------------------------------------------------------------------------*/

 /*----Si se confirma que los datos están correctos se registra al médico----------*/
                    if (_nombreV == false && _telefonoVacio == false && _especialidadV == false && _cedulaP1Vacia == false
                            && _cedulaP2Vacia == false && _codigoPErroneo == false && _codigoVErroneo == false && _digitosMenor10 == false
                            && _faltanDigitosTelefono == false && _sobranDigitosTelefono == false && _codigoTelefonicoVerificado == true && _telefonoVacio == false) {
                        _cedulaCompleta = _panelADatosMedico.getFtCedulaP1() + "-" + _panelADatosMedico.getFtCedulaP2();
                        _controladorArrayList.AgregarMedico(_panelADatosMedico.getFtNombreMedico(), _cedulaCompleta, _panelADatosMedico.getTextoEspecialidad(), _panelADatosMedico.getFtTelefonoMedico(), _panelADatosMedico.getLabelImagenMedico());
                        if (_controladorArrayList.isCedulaRepetida()) {
                            _panelADatosMedico.setLabelErrorCedula();
                            _panelADatosMedico.ErrorCedulaP1(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "MÉDICO REGISTRADO EXITOSAMENTE", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                            _panelADatosMedico.Resetearimagen();
                            _panelADatosMedico.setLabelErrorCedula1();
                            _panelADatosMedico.setFtCedulaMedico();
                            _panelADatosMedico.setFtNombreMedico();
                            _panelADatosMedico.setFtTelefonoMedico();
                            _panelADatosMedico.setCbEspecialidadMedico();
                            _panelADatosMedico.setTextoEspecialidad();
                        }
                    } else {
                        if (_nombreV == true) {
                            _panelADatosMedico.ErrorNombreMedico(_nombreV);
                            _panelADatosMedico.setLabelNombreVacio();
                        }

                        if (_telefonoVacio == true) {
                            _panelADatosMedico.ErrorTelefono(true);
                            _panelADatosMedico.setLbNumeroVacio();
                        } else {
                            if (_codigoTelefonicoVerificado == false) {
                                _panelADatosMedico.ErrorTelefono(true);
                                _panelADatosMedico.setLbNumeroError();
                            } else {

                                if (_faltanDigitosTelefono == true) {
                                    _panelADatosMedico.ErrorTelefono(true);
                                    _panelADatosMedico.setLbNumeroFaltanDigitos();
                                } else if (_sobranDigitosTelefono == true) {
                                    _panelADatosMedico.ErrorTelefono(true);
                                    _panelADatosMedico.setLbNumeroSobranDigitos();
                                }

                            }
                        }

                        if (_especialidadV == true) {
                            _panelADatosMedico.ErrorEspecialidad(_especialidadV);
                            _panelADatosMedico.setLabelEscogerEspecialidad();
                        }

                        if (_cedulaP1Vacia == true && _cedulaP2Vacia == true) {
                            _panelADatosMedico.ErrorCedulaP1(_cedulaP1Vacia);
                            _panelADatosMedico.ErrorCedulaP2(_cedulaP2Vacia);
                            _panelADatosMedico.CedulaP1Y2Vacia();
                        } else if (_cedulaP1Vacia == true) {
                            _panelADatosMedico.setLabelErrorCedula1();
                            _panelADatosMedico.ErrorCedulaP1(_cedulaP1Vacia);
                            _panelADatosMedico.CedulaP1Vacia();
                        } else if (_cedulaP2Vacia == true) {
                            _panelADatosMedico.setLabelErrorCedula1();
                            _panelADatosMedico.ErrorCedulaP2(_cedulaP2Vacia);
                            _panelADatosMedico.CedulaP2Vacia();
                        } else if (_codigoPErroneo == true) {
                            _panelADatosMedico.setLabelErrorCedula1();
                            _panelADatosMedico.ErrorCedulaP1(_codigoPErroneo);
                            _panelADatosMedico.CodigoProviciaE();
                        } else if (_codigoVErroneo == true) {
                            _panelADatosMedico.setLabelErrorCedula1();
                            _panelADatosMedico.ErrorCedulaP2(_codigoVErroneo);
                            _panelADatosMedico.CodigoVerificacionE();
                        } else if (_digitosMenor10 == true) {
                            _panelADatosMedico.setLabelErrorCedula1();
                            _panelADatosMedico.ErrorCedulaP1(_digitosMenor10);
                            _panelADatosMedico.DigitosMenorA9();
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
