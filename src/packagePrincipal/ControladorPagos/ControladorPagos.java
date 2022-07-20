package packagePrincipal.ControladorPagos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.vistaMenu.FrameContenedorMenu;
import packagePrincipal.vistaPago.FramePago;
import packagePrincipal.vistaPago.PanelPago;

public class ControladorPagos {

    private ControladorArraysList _controladorArrayList;
    private PanelPago _panelPago;
    private FrameContenedorMenu _frameContenedor;
    private FramePago _framePagos;

    public ControladorPagos(FrameContenedorMenu frameContenedor, ControladorArraysList controladorArrayList) {
        this._controladorArrayList = controladorArrayList;
        this._frameContenedor = frameContenedor;
        this._framePagos = new FramePago();
        _framePagos.setVisible(true);
        _framePagos.AgregarVentanaPago();
        _panelPago = _framePagos.getPanelPago();
        _panelPago.LlenaTablaPagos(_controladorArrayList.getRegistroCuenta(), _controladorArrayList.getRegistroPaciente1());
        _panelPago.AddActionListener(new AddActionListenerVentanaPagos());
    }

    public class AddActionListenerVentanaPagos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelPago.getBotonVolver()) {
                    _framePagos.dispose();
                    _frameContenedor.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
