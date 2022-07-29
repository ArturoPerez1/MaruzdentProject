package packagePrincipal.ControladorListaCitas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.modelo.FechaActual;
import packagePrincipal.modelo.VerificarDatosMedico;
import packagePrincipal.vistaListaConsulta.FrameEliminarCita;
import packagePrincipal.vistaListaConsulta.FrameListaConsulta;
import packagePrincipal.vistaListaConsulta.PanelListaConsulta;
import packagePrincipal.vistaMenu.FrameContenedorMenu;

public class ControladorListaCita {

    private FechaActual _fechaActual;
    private VerificarDatosMedico _verificarDatos;
    private ControladorArraysList _controladorArrayList;
    private PanelListaConsulta _panelListaConsulta;
    private FrameContenedorMenu _frameContenedorMenu;
    private FrameListaConsulta _frameLsitaConsulta;
    private FrameEliminarCita _frameEliminarCita;

    public ControladorListaCita(FrameContenedorMenu frameContenedorMenu, ControladorArraysList controladorArrayList) {
        this._controladorArrayList = controladorArrayList;
        this._frameContenedorMenu = frameContenedorMenu;
        this._fechaActual = new FechaActual();
        this._frameLsitaConsulta = new FrameListaConsulta();
        this._verificarDatos = new VerificarDatosMedico();
        _frameLsitaConsulta.setVisible(true);
        _frameLsitaConsulta.AgregarVentanaListaConsultas();
        this._panelListaConsulta = _frameLsitaConsulta.getPanelListaConsultas();
        _panelListaConsulta.ObtenerArrays(_controladorArrayList.getRegistroDatosConsulta(), _controladorArrayList.getRegistroHistorial());
        _panelListaConsulta.LlenarTableConsultas(_controladorArrayList.getRegistroDatosConsulta(), _controladorArrayList.getRegistroHistorial());
        _panelListaConsulta.setFechaActual(_fechaActual.ObtenerFechaActual());
        _panelListaConsulta.AddActionListener(new AddActionlistenerVentanaListaConsultas());
    }

    public class AddActionlistenerVentanaListaConsultas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelListaConsulta.getBotonFFecha()) {
                    _panelListaConsulta.PopUpFiltrarFecha();
                } else if (evento.getSource() == _panelListaConsulta.getBotonFCedula()) {
                    _panelListaConsulta.PopUpFiltrarCedula();
                } else if (evento.getSource() == _panelListaConsulta.getBotonFHoy()) {
                    _panelListaConsulta.LlenarTablaCitasDeHoy();
                } else if (evento.getSource() == _panelListaConsulta.getBotonFTodasCitas()) {
                    _panelListaConsulta.LlenarTableConsultas(_controladorArrayList.getRegistroDatosConsulta(), _controladorArrayList.getRegistroHistorial());
                    _panelListaConsulta.setFechaActual(_fechaActual.ObtenerFechaActual());
                    _panelListaConsulta.ObtenerArrays(_controladorArrayList.getRegistroDatosConsulta(), _controladorArrayList.getRegistroHistorial());
                } else if (evento.getSource() == _panelListaConsulta.getBotonEliminarCita()) {
                    _panelListaConsulta.ObtenerCedulaEliminarCita(new AgregarListenerObtenerCedula());
                } else if (evento.getSource() == _panelListaConsulta.getBotonVolver()) {

                    _frameLsitaConsulta.dispose();
                    _frameContenedorMenu.setVisible(true);
                }

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AgregarListenerObtenerCedula implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                String cedulaFiltrada = _panelListaConsulta.getFrameFiltrarCedula().getCedula();
                _panelListaConsulta.PopUpEliminarCita(cedulaFiltrada);
                _frameEliminarCita = _panelListaConsulta.getFrameEliminarCita();
                _frameEliminarCita.AddActionListener(new AgregarActionListenerVentanaEliminarCita());

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AgregarActionListenerVentanaEliminarCita implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _frameEliminarCita.getBotonEliminar()) {
                    _panelListaConsulta.getFrameFiltrarCedula().dispose();
                    int posicion = _panelListaConsulta.getPosionCitaEliminada();
                    _controladorArrayList.EliminarCitaRegistrada(posicion);
                    _frameEliminarCita.dispose();
                    if (_controladorArrayList.getRegistroDatosConsulta().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "LISTA VACÍA AGREGUE UNA CITA", "LISTA VACÍA", JOptionPane.INFORMATION_MESSAGE);
                        _frameLsitaConsulta.dispose();
                        _frameContenedorMenu.setVisible(true);
                    } else {
                        _panelListaConsulta.ObtenerArrays(_controladorArrayList.getRegistroDatosConsulta(), _controladorArrayList.getRegistroHistorial());
                        _panelListaConsulta.LlenarTableConsultas(_controladorArrayList.getRegistroDatosConsulta(), _controladorArrayList.getRegistroHistorial());
                        _panelListaConsulta.setFechaActual(_fechaActual.ObtenerFechaActual());
                        _panelListaConsulta.AddActionListener(new AddActionlistenerVentanaListaConsultas());
                    }
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
