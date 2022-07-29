package packagePrincipal.ControladorMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import packagePrincipal.ControladorListaCitas.ControladorListaCita;
import packagePrincipal.ControladorDatosClinica.ControladorDatosClinica;
import packagePrincipal.ControladorListaPaciente.ControladorListaPaciente;
import packagePrincipal.ControladorPagos.ControladorPagos;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.ControladorRegistroPaciente.ControladorRegistroPaciente;
import packagePrincipal.vistaMenu.FrameContenedorMenu;
import packagePrincipal.vistaMenu.PanelMenuCompleto;
import packagePrincipal.vistaMenu.PanelBotonesMenu;

public class ControladorMenu {

    private boolean _mostrarBotones;
    private ControladorRegistroPaciente _controladorRPaciente;
    private ControladorArraysList _controladorArrayList;
    private ControladorListaPaciente _controladorListaPaciente;
    private ControladorPagos _controladorPagos;
    private ControladorDatosClinica _controladorDatosClinica;
    private ControladorListaCita _controladorConsultas;
    private PanelBotonesMenu _panelMenu;
    private PanelMenuCompleto _panelContenedorMenu;
    private FrameContenedorMenu _frameContenedor;

    public ControladorMenu(FrameContenedorMenu contenedor) {
        this._frameContenedor = contenedor;
        this._controladorArrayList = new ControladorArraysList();
        this._mostrarBotones = false;
        _frameContenedor.AgregarVentanaContenedorMenu();
        this._panelContenedorMenu = _frameContenedor.getPanelMenu();
        _panelContenedorMenu.AgregarVentanaMenu();
        _panelMenu = _panelContenedorMenu.getPanelMenu();
        _panelMenu.AddActionListener(new AgregarListenerBotonesMenu());
    }

    public class AgregarListenerBotonesMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelMenu.getBotonPaciente() /*&& _controladorArrayList.isPrimerMedico() == false*/) {
                    _panelContenedorMenu.setLabelAvisos();
                    _frameContenedor.setVisible(false);
                    _controladorRPaciente = new ControladorRegistroPaciente(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelMenu.getBotonPaciente() && _controladorArrayList.isPrimerMedico() == true) {
                    _panelContenedorMenu.AvisoFaltaMedico();
                } else if (evento.getSource() == _panelMenu.getBotonMDatosClinica()) {
                    _panelContenedorMenu.setLabelAvisos();
                    _frameContenedor.setVisible(false);
                    _controladorDatosClinica = new ControladorDatosClinica(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelMenu.getBotonListaC() /*&& _controladorArrayList.isPrimerConsulta() == false*/) {
                    _panelContenedorMenu.setLabelAvisos();
                    _frameContenedor.setVisible(false);
                    _controladorConsultas = new ControladorListaCita(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelMenu.getBotonListaC() && _controladorArrayList.isPrimerConsulta() == true) {
                    _panelContenedorMenu.setLabelAvisos();
                    _panelContenedorMenu.AvisoListaConsulta2();
                } else if (evento.getSource() == _panelMenu.getBotonListaP() && _controladorArrayList.isPrimerPaciente() == false) {
                    _panelContenedorMenu.setLabelAvisos();
                    _frameContenedor.setVisible(false);
                    _controladorListaPaciente = new ControladorListaPaciente(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelMenu.getBotonListaP() && _controladorArrayList.isPrimerPaciente() == true) {
                    _panelContenedorMenu.setLabelAvisos();
                    _panelContenedorMenu.AvisoListaPaciente1();
                } else if (evento.getSource() == _panelMenu.getBotonPagos() && _controladorArrayList.isPrimerCuenta() == false) {
                    _panelContenedorMenu.setLabelAvisos();
                    _frameContenedor.setVisible(false);
                    _controladorPagos = new ControladorPagos(_frameContenedor, _controladorArrayList);
                } else if (evento.getSource() == _panelMenu.getBotonPagos() && _controladorArrayList.isPrimerCuenta() == true) {
                    _panelContenedorMenu.setLabelAvisos();
                    _panelContenedorMenu.AvisoListaCuenta();
                }
            } catch (Error e) {
                System.out.println("Error" + e);
            }
        }

    }

}
