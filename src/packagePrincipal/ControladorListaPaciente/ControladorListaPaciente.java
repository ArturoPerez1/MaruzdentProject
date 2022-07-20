package packagePrincipal.ControladorListaPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.modelo.VerificarDatosHistorial;
import packagePrincipal.vistaListaPaciente.FrameListaPaciente;
import packagePrincipal.vistaListaPaciente.PanelListaPaciente;
import packagePrincipal.vistaListaPaciente.PanelPacienteDetallado;
import packagePrincipal.vistaMenu.FrameContenedorMenu;
import packagePrincipal.vistaListaPaciente.PanelHistorialPaciente;

public class ControladorListaPaciente {

    private int _posicion;
    private boolean _cedulaV;
    private VerificarDatosHistorial _verificarDatosPaciente;
    private ControladorArraysList _controladorArrayList;
    private PanelListaPaciente _panelListaPaciente;
    private PanelPacienteDetallado _panelPacienteDetallado;
    private PanelHistorialPaciente _panelHistorialPaciente;
    private FrameContenedorMenu _frameContenedor;
    private FrameListaPaciente _frameListaPaciente;

    public ControladorListaPaciente(FrameContenedorMenu frameContenedor, ControladorArraysList controladorArrayList) {
        this._controladorArrayList = controladorArrayList;
        this._frameContenedor = frameContenedor;
        this._frameListaPaciente = new FrameListaPaciente();
        this._verificarDatosPaciente = new VerificarDatosHistorial();
        _frameListaPaciente.setVisible(true);
        _frameListaPaciente.AgregarVentaListaPaciente();
        _panelListaPaciente = _frameListaPaciente.getPanelListaPaciente();
        _panelListaPaciente.LlenarCedula(_controladorArrayList.getRegistroPaciente1());
        _panelListaPaciente.LlenarTablaPacientes(_controladorArrayList.getRegistroPaciente1());
        _panelListaPaciente.AddActionListener(new AgregarListenerVentanaListaPacientes());
    }

    public class AgregarListenerVentanaListaPacientes implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelListaPaciente.getBotonVerInformacion()) {
                    _verificarDatosPaciente.VerificarCedula(_panelListaPaciente.getTextoCedula());
                    _cedulaV = _verificarDatosPaciente.IsCedulaVerificada();
                    if (_cedulaV == false) {
                        _posicion = _controladorArrayList.ObtenerIndiceCedulaPaciente(_panelListaPaciente.getTextoCedula());
                        _frameListaPaciente.AgregarVentaPacienteDetallado();
                        _frameListaPaciente.LlenarDatosPacienteDetallado(_controladorArrayList.getRegistroPaciente1(), _posicion);
                        _panelPacienteDetallado = _frameListaPaciente.getPanelPacienteDetallado();
                        _panelPacienteDetallado.AddActionListener(new AgregarListenerVentanaPacienteDetallado());
                    } else {
                        _panelListaPaciente.ErrorCedula(true);
                    }
                } else if (evento.getSource() == _panelListaPaciente.getBotonVolver()) {
                    _frameListaPaciente.dispose();
                    _frameContenedor.setVisible(true);
                }

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AgregarListenerVentanaPacienteDetallado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelPacienteDetallado.getBotonVerHistorial()) {
                    _posicion = _controladorArrayList.ObtenerIndiceCedulaHistorial(_panelListaPaciente.getTextoCedula());
                    /*si el historial está vacío se muestra un mensaje y no se permite el acceso
                    a la ventana del historial*/
                    if (_posicion != 0) {
                        _panelPacienteDetallado.SetAvisoAgregarHistorial();
                        _frameListaPaciente.AgregarVentaHistorialPaciente();
                        _frameListaPaciente.LlenarHistorialPaciente(_controladorArrayList.getRegistroHistorial(), _posicion);
                        _panelHistorialPaciente = _frameListaPaciente.getPanelHistorialPaciente();
                        _panelHistorialPaciente.AddActionListener(new AgregarListenerVentanaHistorialPaciente());
                    } else {
                        _panelPacienteDetallado.AvisoAgregarHistorial(_panelListaPaciente.getTextoCedula());
                    }

                } else if (evento.getSource() == _panelPacienteDetallado.getBotonVolver()) {
                    _frameListaPaciente.AgregarVentaListaPaciente();
                    _panelListaPaciente = _frameListaPaciente.getPanelListaPaciente();
                    _panelListaPaciente.LlenarCedula(_controladorArrayList.getRegistroPaciente1());
                    _panelListaPaciente.LlenarTablaPacientes(_controladorArrayList.getRegistroPaciente1());
                    _panelListaPaciente.AddActionListener(new AgregarListenerVentanaListaPacientes());
                }

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AgregarListenerVentanaHistorialPaciente implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelHistorialPaciente.getBotonVolver()) {
                    _posicion = _controladorArrayList.ObtenerIndiceCedulaPaciente(_panelListaPaciente.getTextoCedula());
                    _frameListaPaciente.AgregarVentaPacienteDetallado();
                    _frameListaPaciente.LlenarDatosPacienteDetallado(_controladorArrayList.getRegistroPaciente1(), _posicion);
                    _panelPacienteDetallado = _frameListaPaciente.getPanelPacienteDetallado();
                    _panelPacienteDetallado.AddActionListener(new AgregarListenerVentanaPacienteDetallado());
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
