package packagePrincipal.ControladorDatosMedicos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.modelo.VerificarDatosMedico;
import packagePrincipal.ventanaMDatosClinica.FrameMDatosClinica;
import packagePrincipal.vistaMDatosmedico.FrameMDatosMedicos;
import packagePrincipal.vistaMDatosmedico.PanelMDatosMedicos;
import packagePrincipal.vistaMDatosmedico.PanelModificadores;

public class ControladorMDatosMedico {

    private int _posicionMedico;
    private boolean _cedulaRepetida;
    private boolean _cedulaP1Vacia;
    private boolean _codigoPErroneo;
    private boolean _digitosMenor10;
    private boolean _cedulaP2Vacia;
    private boolean _codigoVErroneo;
    private String _cedulaCompleta;
    private VerificarDatosMedico _verificarDatosMedicos;
    private ControladorArraysList _controladorArrayList;
    private PanelMDatosMedicos _panelMDatosMedicos;
    private PanelModificadores _panelModificadores;
    private FrameMDatosClinica _frameMDatosClinica;
    private FrameMDatosMedicos _frameMDatosMedicos;

    public ControladorMDatosMedico(FrameMDatosClinica frameMDatosClinica, ControladorArraysList controladorArrayList) {
        this._controladorArrayList = controladorArrayList;
        this._frameMDatosClinica = frameMDatosClinica;
        this._frameMDatosMedicos = new FrameMDatosMedicos();
        this._verificarDatosMedicos = new VerificarDatosMedico();
        _frameMDatosMedicos.setVisible(true);
        _frameMDatosMedicos.AgregarPanelMDatosMedicos();
        this._panelMDatosMedicos = _frameMDatosMedicos.getPanelMDatosMedicos();
        _panelMDatosMedicos.LlenaComboBoxCedulas(_controladorArrayList.getRegistroMedicos());
        _panelMDatosMedicos.LlenarTable(_controladorArrayList.getRegistroMedicos());
        _panelMDatosMedicos.AddActionListener(new AddActionListenerVentanaMDatosMedicos());
    }

    public class AddActionListenerVentanaMDatosMedicos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelMDatosMedicos.getBotonBuscar()) {
                    _panelMDatosMedicos.QuitarPanelModificadore();
                    _verificarDatosMedicos.VerificarCedulaMedicoM(_panelMDatosMedicos.getTextoBuscarCedula());
                    if (_verificarDatosMedicos.IsCedulaP1Vacia() == false) {
                        _posicionMedico = _controladorArrayList.ObtenerIndiceCedulaMedico(_panelMDatosMedicos.getTextoBuscarCedula());
                        _panelMDatosMedicos.LlenarTableParcial(_controladorArrayList.getRegistroMedicos(), _posicionMedico);
                        _panelMDatosMedicos.AgregarPanelModificadore();
                        _panelModificadores = _panelMDatosMedicos.getPanelModificadores();
                        _panelModificadores.AddActionListener(new AddActionListenerVentanaModificadores());
                    } else {
                        _panelMDatosMedicos.ErrorCedula(true);
                    }
                } else if (evento.getSource() == _panelMDatosMedicos.getBotonVolver()) {
                    _panelMDatosMedicos.QuitarPanelModificadore();
                    _panelMDatosMedicos.setCbCedula();
                    _panelMDatosMedicos.setTextoBuscarCedula();
                    _frameMDatosMedicos.dispose();
                    _frameMDatosClinica.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AddActionListenerVentanaModificadores implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelModificadores.getBotonMCedula()) {
                    _verificarDatosMedicos.VerificarCedula(_panelModificadores.getFtMCedulP1(), _panelModificadores.getFtCedulaP2());
                    _cedulaP1Vacia = _verificarDatosMedicos.IsCedulaP1Vacia();
                    _cedulaP2Vacia = _verificarDatosMedicos.IsCedulaP2Vacia();
                    _codigoPErroneo = _verificarDatosMedicos.IsCedulaP1CodigoPVerificado();
                    _codigoVErroneo = _verificarDatosMedicos.IsCedulaP2CodigoVerificacionV();
                    _digitosMenor10 = _verificarDatosMedicos.IsCedulaP1PocoDigitos();

                    if (_cedulaP1Vacia == false && _cedulaP2Vacia == false && _codigoPErroneo == false
                            && _codigoVErroneo == false && _digitosMenor10 == false) {

                        _cedulaCompleta = _panelModificadores.getFtMCedulP1() + "-" + _panelModificadores.getFtCedulaP2();
                        _cedulaRepetida = _controladorArrayList.CedulaMedicosRepetida(_cedulaCompleta);
                        if (_cedulaRepetida == false) {
                            _controladorArrayList.ModificarCedulaMedico(_posicionMedico, _cedulaCompleta);
                            _panelModificadores.setFtMCedula();
                            _panelModificadores.setFtMCedula1();
                            _panelMDatosMedicos.LlenarTable(_controladorArrayList.getRegistroMedicos());
                            _panelMDatosMedicos.LlenaComboBoxCedulas1(_controladorArrayList.getRegistroMedicos());
                        } else {
                            _panelModificadores.setLabelCedulaExistente();
                            _panelModificadores.ErrorCedulaP1(true);
                            _panelModificadores.ErrorCedulaP2(true);
                        }
                    } else {
                        if (_cedulaP1Vacia == true && _cedulaP2Vacia == true) {
                            _panelModificadores.ErrorCedulaP1(_cedulaP1Vacia);
                            _panelModificadores.ErrorCedulaP2(_cedulaP2Vacia);
                            _panelModificadores.CedulaP1Y2Vacia();
                        } else if (_cedulaP1Vacia == true) {
                            _panelModificadores.setLabelErrorCedula1();
                            _panelModificadores.ErrorCedulaP1(_cedulaP1Vacia);
                            _panelModificadores.CedulaP1Vacia();
                        } else if (_cedulaP2Vacia == true) {
                            _panelModificadores.setLabelErrorCedula1();
                            _panelModificadores.ErrorCedulaP2(_cedulaP2Vacia);
                            _panelModificadores.CedulaP2Vacia();
                        } else if (_codigoPErroneo == true) {
                            _panelModificadores.setLabelErrorCedula1();
                            _panelModificadores.ErrorCedulaP1(_codigoPErroneo);
                            _panelModificadores.CodigoProviciaE();
                        } else if (_codigoVErroneo == true) {
                            _panelModificadores.setLabelErrorCedula1();
                            _panelModificadores.ErrorCedulaP2(_codigoVErroneo);
                            _panelModificadores.CodigoVerificacionE();
                        } else if (_digitosMenor10 == true) {
                            _panelModificadores.setLabelErrorCedula1();
                            _panelModificadores.ErrorCedulaP1(_digitosMenor10);
                            _panelModificadores.DigitosMenorA10();
                        }
                    }
                } else if (evento.getSource() == _panelModificadores.getBotonMEspecialidad()) {
                    _verificarDatosMedicos.VerificarEspecialidad(_panelModificadores.getTextoEspecialidad());
                    if (_verificarDatosMedicos.IsEspecialidadVerificada() == false) {
                        _controladorArrayList.ModificarEspecialidadMedico(_posicionMedico, _panelModificadores.getTextoEspecialidad());
                        _panelMDatosMedicos.LlenarTable(_controladorArrayList.getRegistroMedicos());
                        _panelModificadores.setcBMEspecialidad();
                        _panelModificadores.setTextoEspecialidad();
                    } else {
                        _panelModificadores.ErrorEspecialidad(true);
                    }
                } else if (evento.getSource() == _panelModificadores.getBotonMNombre()) {
                    _verificarDatosMedicos.VerificarNombreMedico(_panelModificadores.getFtMNombre());
                    if (_verificarDatosMedicos.IsNombreVerificado() == false) {
                        _controladorArrayList.ModificarNombreMedico(_posicionMedico, _panelModificadores.getFtMNombre());
                        _panelMDatosMedicos.LlenarTable(_controladorArrayList.getRegistroMedicos());
                        _panelModificadores.setFtMNombre();
                    } else {
                        _panelModificadores.ErrorNombre(true);
                        _panelModificadores.setLabelNombreVacio();
                    }
                } else if (evento.getSource() == _panelModificadores.getBotonMTelefono()) {
                    _verificarDatosMedicos.VerificarTelefono(_panelModificadores.getFtMTelefono());
                    if (_verificarDatosMedicos.IsTelefonoVerificado() == false) {
                        _controladorArrayList.ModificarTelefonoMedico(_posicionMedico, _panelModificadores.getFtMTelefono());
                        _panelMDatosMedicos.LlenarTable(_controladorArrayList.getRegistroMedicos());
                        _panelModificadores.setFtMTelefono();
                    } else {
                        _panelModificadores.ErrorTelefono(true);
                        _panelModificadores.setLabelTelefonoVacio();
                    }
                } else if (evento.getSource() == _panelModificadores.getBotonTableC()) {
                    _panelMDatosMedicos.QuitarPanelModificadore();
                    _panelMDatosMedicos.LlenaComboBoxCedulas(_controladorArrayList.getRegistroMedicos());
                    _panelMDatosMedicos.LlenarTable(_controladorArrayList.getRegistroMedicos());
                    _panelMDatosMedicos.LlenaComboBoxCedulas1(_controladorArrayList.getRegistroMedicos());
                    _panelMDatosMedicos.AddActionListener(new AddActionListenerVentanaMDatosMedicos());
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
