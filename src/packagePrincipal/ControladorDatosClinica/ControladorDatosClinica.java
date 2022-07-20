package packagePrincipal.ControladorDatosClinica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import packagePrincipal.ControladorDatosMedicos.ControladorDatosMedicos;
import packagePrincipal.ControladorDatosMedicos.ControladorMDatosMedico;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.ventanaMDatosClinica.FrameMDatosClinica;
import packagePrincipal.ventanaMDatosClinica.PanelMDatosClinica;
import packagePrincipal.vistaMenu.FrameContenedorMenu;

public class ControladorDatosClinica {

    private ControladorArraysList _controladorArrayList;
    private ControladorDatosMedicos _controladorDatosMedicos;
    private ControladorMDatosMedico _controladorMDatosMedico;
    private PanelMDatosClinica _panelMClinica;
    private FrameContenedorMenu _frameContenedorMenu;
    private FrameMDatosClinica _frameMClinica;

    public ControladorDatosClinica(FrameContenedorMenu frameContenedorMenu, ControladorArraysList controladorArrayList) {
        this._frameContenedorMenu = frameContenedorMenu;
        this._controladorArrayList = controladorArrayList;
        this._frameMClinica = new FrameMDatosClinica();
        _frameMClinica.setVisible(true);
        _frameMClinica.AgregarVentanaDatosClinica();
        this._panelMClinica = _frameMClinica.getPanelMDatosClinica();
        _panelMClinica.AddActionListener(new AddActionListenerVentanaMDatosClinica());
    }

    public class AddActionListenerVentanaMDatosClinica implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelMClinica.getBotonADatosMedicos()) {
                    _panelMClinica.setAviso1();
                    _frameMClinica.setVisible(false);
                    _controladorDatosMedicos = new ControladorDatosMedicos(_frameMClinica, _controladorArrayList);
                } else if (evento.getSource() == _panelMClinica.getBotonMDatosMedico() && _controladorArrayList.isPrimerMedico() == false) {
                    _panelMClinica.setAviso1();
                    _frameMClinica.setVisible(false);
                    _controladorMDatosMedico = new ControladorMDatosMedico(_frameMClinica, _controladorArrayList);
                } else if (evento.getSource() == _panelMClinica.getBotonMDatosMedico() && _controladorArrayList.isPrimerMedico() == true) {
                    _panelMClinica.AvisoFaltaMedico();
                } else if (evento.getSource() == _panelMClinica.getBotonVolver()) {
                    _frameMClinica.dispose();
                    _frameContenedorMenu.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
