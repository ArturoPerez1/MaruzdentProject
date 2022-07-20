package packagePrincipal.ControladorRegistroPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import packagePrincipal.vistaMenu.FrameContenedorMenu;
import packagePrincipal.vistaPaciente.FrameContenedor;
import packagePrincipal.vistaPaciente.PanelPaciente;

public class ControladorRegistroPaciente {

    private FrameContenedorMenu _frameContenedorMenu;
    private ControladorRegistrarHistorial _controladorRegistrarHistorial;
    private FrameContenedor _frameContenedor;
    private PanelPaciente _panelPaciente;
    private ControladorRegistrarPaciente _controladorRegistrarPaciente;
    private ControladorArraysList _controladorArrayList;
    private ControladorACuentaPaciente _controladorACuenta;
    private ControladorCitasPaciente _controladorConsultaPaciente;

    public ControladorRegistroPaciente(FrameContenedorMenu frameContenedorMenu, ControladorArraysList controladorArrayList) {
        _frameContenedorMenu = frameContenedorMenu;
        this._frameContenedor = new FrameContenedor();
        this._controladorArrayList = controladorArrayList;
        _frameContenedor.setVisible(true);
        _frameContenedor.AgregarVentanaRegistro();
        this._panelPaciente = _frameContenedor.getPanelPaciente();
        _panelPaciente.AddActionListener(new AddActionListenerVentanaRegistro());
    }

    public class AddActionListenerVentanaRegistro implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelPaciente.getBotonADatosPaciente()) {
                    _panelPaciente.setLabelAviso();
                    _frameContenedor.setVisible(false);
                    _controladorRegistrarPaciente = new ControladorRegistrarPaciente(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelPaciente.getBotonAHistoriaClinica() && _controladorArrayList.isPrimerPaciente() == false) {
                    _panelPaciente.setLabelAviso();
                    _frameContenedor.setVisible(false);
                    _controladorRegistrarHistorial = new ControladorRegistrarHistorial(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelPaciente.getBotonAHistoriaClinica() && _controladorArrayList.isPrimerPaciente() == true) {
                    _panelPaciente.setLabelAviso();
                    _panelPaciente.AvisoAgregarPaciente();
                } else if (evento.getSource() == _panelPaciente.getBotonACuentaPaciente() && _controladorArrayList.isPrimerPaciente() == false && _controladorArrayList.isPrimerConsulta() == false) {
                    _panelPaciente.setLabelAviso();
                    _frameContenedor.setVisible(false);
                    _controladorACuenta = new ControladorACuentaPaciente(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelPaciente.getBotonACuentaPaciente() && _controladorArrayList.isPrimerPaciente() == true && _controladorArrayList.isPrimerConsulta() == true) {
                    _panelPaciente.setLabelAviso();
                    _panelPaciente.Aviso1();
                } else if (evento.getSource() == _panelPaciente.getBotonACuentaPaciente() && _controladorArrayList.isPrimerPaciente() == false && _controladorArrayList.isPrimerConsulta() == true) {
                    _panelPaciente.setLabelAviso();
                    _panelPaciente.AvisoFaltaConsulta();
                } else if (evento.getSource() == _panelPaciente.getBotonAConsulta() && _controladorArrayList.isPrimerPaciente() == false) {
                    _panelPaciente.setLabelAviso();
                    _frameContenedor.setVisible(false);
                    _controladorConsultaPaciente = new ControladorCitasPaciente(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelPaciente.getBotonAConsulta() && _controladorArrayList.isPrimerPaciente() == true) {
                    _panelPaciente.setLabelAviso();
                    _panelPaciente.Aviso2();
                } else if (evento.getSource() == _panelPaciente.getBotonVolver()) {
                    _panelPaciente.setLabelAviso();
                    _frameContenedor.dispose();
                    _frameContenedorMenu.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error" + e);
            }
        }

    }
}
