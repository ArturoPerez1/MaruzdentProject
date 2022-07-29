package packagePrincipal.ControladorPagos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import packagePrincipal.ControladorListaCitas.ControladorListaCita;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.vistaListaConsulta.FrameFiltroCedula;
import packagePrincipal.vistaMenu.FrameContenedorMenu;
import packagePrincipal.vistaPago.FrameEliminarCuenta;
import packagePrincipal.vistaPago.FramePago;
import packagePrincipal.vistaPago.PanelPago;

public class ControladorPagos {

    private ControladorArraysList _controladorArrayList;
    private PanelPago _panelPago;
    private FrameContenedorMenu _frameContenedor;
    private FramePago _framePagos;
    private FrameEliminarCuenta _frameEliminarCuenta;
    private FrameFiltroCedula _frameFiltrarCedula;

    public ControladorPagos(FrameContenedorMenu frameContenedor, ControladorArraysList controladorArrayList) {
        this._controladorArrayList = controladorArrayList;
        if (controladorArrayList.getRegistroCuenta().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "AGREGUE UNA CUENTA ANTES", "AGREGAR CUENTA", JOptionPane.WARNING_MESSAGE);
            frameContenedor.setVisible(true);
        } else {
            this._frameContenedor = frameContenedor;
            _frameContenedor.setVisible(false);
            this._framePagos = new FramePago();
            _framePagos.setVisible(true);
            _framePagos.AgregarVentanaPago();
            _panelPago = _framePagos.getPanelPago();
            _panelPago.ObtenerArrays(_controladorArrayList.getRegistroCuenta(), _controladorArrayList.getRegistroPaciente1());
            _panelPago.LlenaTablaPagos(_controladorArrayList.getRegistroCuenta(), _controladorArrayList.getRegistroPaciente1());
            _panelPago.AddActionListener(new AddActionListenerVentanaPagos());
        }
    }

    public class AddActionListenerVentanaPagos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelPago.getBotonEliminarCuenta()) {
                    _panelPago.ObtenerCedulaCuentaEliminar(new AddActionListenerObtenerCedula());
                    _frameFiltrarCedula = _panelPago.getFrameFiltroCedula();
                } else if (evento.getSource() == _panelPago.getBotonVolver()) {
                    _framePagos.dispose();
                    _frameContenedor.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AddActionListenerObtenerCedula implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                _frameFiltrarCedula = _panelPago.getFrameFiltroCedula();
                if (evento.getSource() == _frameFiltrarCedula.getBotonObtenerCedula()) {
                    String cedulaFiltrada = _frameFiltrarCedula.getCedula();
                    if (cedulaFiltrada.isEmpty() == false) {
                        _panelPago.EliminarCuenta(cedulaFiltrada);
                        _frameEliminarCuenta = _panelPago.getFrameEliminarCuenta();
                        _frameEliminarCuenta.AddActionListener(new AddActionListenerVentanaEliminarCuenta());
                    } else {
                        JOptionPane.showMessageDialog(null, "SELECCIONE UNA CÉDULA", "SELECCIÓN CÉDULA", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AddActionListenerVentanaEliminarCuenta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _frameEliminarCuenta.getBotonEliminar()) {
                    _frameFiltrarCedula.dispose();
                    int posicion = _panelPago.getPosicion();
                    _controladorArrayList.EliminarCuenta(posicion);
                    _frameEliminarCuenta.dispose();
                    if (_controladorArrayList.getRegistroCuenta().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "LISTA VACÍA AGREGUE UNA CUENTA", "LISTA VACÍA", JOptionPane.INFORMATION_MESSAGE);
                        _framePagos.dispose();
                        _frameContenedor.setVisible(true);
                    } else {
                        _panelPago.ObtenerArrays(_controladorArrayList.getRegistroCuenta(), _controladorArrayList.getRegistroPaciente1());
                        _panelPago.LlenaTablaPagos(_controladorArrayList.getRegistroCuenta(), _controladorArrayList.getRegistroPaciente1());
                        _panelPago.AddActionListener(new AddActionListenerVentanaPagos());
                    }
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
