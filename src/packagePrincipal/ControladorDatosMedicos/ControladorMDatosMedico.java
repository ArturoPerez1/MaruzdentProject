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
                    _verificarDatosMedicos.VerificarCedula(_panelMDatosMedicos.getTextoBuscarCedula());
                    _posicionMedico = _controladorArrayList.ObtenerIndiceCedulaMedico(_panelMDatosMedicos.getTextoBuscarCedula());
                    _verificarDatosMedicos.VerificarCedula(_panelMDatosMedicos.getTextoBuscarCedula());
                    if (_verificarDatosMedicos.IsCedulaVerificada() == true) {
                        _panelMDatosMedicos.ErrorCedula(true);
                    } else {
                        _panelMDatosMedicos.AgregarPanelModificadore();
                        _panelModificadores = _panelMDatosMedicos.getPanelModificadores();
                        _panelModificadores.AddActionListener(new AddActionListenerVentanaModificadores());
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
                    _cedulaRepetida = _controladorArrayList.CedulaMedicosRepetida(_panelModificadores.getFtMCedula());
                    if (_cedulaRepetida == false) {
                        _controladorArrayList.ModificarCedulaMedico(_posicionMedico, _panelModificadores.getFtMCedula());
                        _panelModificadores.setFtMCedula();
                        _panelMDatosMedicos.LlenarTable(_controladorArrayList.getRegistroMedicos());
                        _panelMDatosMedicos.LlenaComboBoxCedulas1(_controladorArrayList.getRegistroMedicos());
                    } else {
                        _panelModificadores.setLabelAviso1();
                        _panelModificadores.ErrorCedula(true);
                    }
                } else if (evento.getSource() == _panelModificadores.getBotonMEspecialidad()) {
                    _verificarDatosMedicos.VerificarNombreMedico(_panelModificadores.getTextoEspecialidad());
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
                    }
                } else if (evento.getSource() == _panelModificadores.getBotonMTelefono()) {
                    _verificarDatosMedicos.VerificarTelefono(_panelModificadores.getFtMTelefono());
                    if (_verificarDatosMedicos.IsTelefonoVerificado() == false) {
                        _controladorArrayList.ModificarTelefonoMedico(_posicionMedico, _panelModificadores.getFtMTelefono());
                        _panelMDatosMedicos.LlenarTable(_controladorArrayList.getRegistroMedicos());
                        _panelModificadores.setFtMTelefono();
                    } else {
                        _panelModificadores.ErrorTelefono(true);
                    }
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
