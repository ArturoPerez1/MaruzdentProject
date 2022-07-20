package packagePrincipal.ControladorListaCitas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.modelo.FechaActual;
import packagePrincipal.modelo.VerificarDatosMedico;
import packagePrincipal.vistaListaConsulta.FrameListaConsulta;
import packagePrincipal.vistaListaConsulta.PanelBotonCancelar;
import packagePrincipal.vistaListaConsulta.PanelListaConsulta;
import packagePrincipal.vistaMenu.FrameContenedorMenu;

public class ControladorListaCita {

    private boolean _estadoV;
    private boolean _cedulaP;
    private boolean _confirmacion;
    private FechaActual _fechaActual;
    private VerificarDatosMedico _verificarDatos;
    private ControladorArraysList _controladorArrayList;
    private PanelListaConsulta _panelListaConsulta;
    private PanelBotonCancelar _panelBotonCancelar;
    private FrameContenedorMenu _frameContenedorMenu;
    private FrameListaConsulta _frameLsitaConsulta;

    public ControladorListaCita(FrameContenedorMenu frameContenedorMenu, ControladorArraysList controladorArrayList) {
        this._controladorArrayList = controladorArrayList;
        _confirmacion = false;
        this._frameContenedorMenu = frameContenedorMenu;
        this._fechaActual = new FechaActual();
        this._frameLsitaConsulta = new FrameListaConsulta();
        this._verificarDatos = new VerificarDatosMedico();
        _frameLsitaConsulta.setVisible(true);
        _frameLsitaConsulta.AgregarVentanaListaConsultas();
        this._panelListaConsulta = _frameLsitaConsulta.getPanelListaConsultas();
        _panelListaConsulta.LlenarTableConsultas(_controladorArrayList.getRegistroDatosConsulta(), _controladorArrayList.getRegistroHistorial());
        _panelListaConsulta.LlenarCedula(_controladorArrayList.getRegistroDatosConsulta());
        _panelListaConsulta.setLbFecha(_fechaActual.ObtenerFechaActual());
        _panelListaConsulta.AddActionListener(new AddActionlistenerVentanaListaConsultas());
    }

    public class AddActionlistenerVentanaListaConsultas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelListaConsulta.getBotonMConsulta()) {
                    /*Verificamos los datos de los comboBoxes*/
                    _verificarDatos.VerificarCedula(_panelListaConsulta.getTextoCedula());
                    _verificarDatos.VerificarEstadoConsulta(_panelListaConsulta.getTextoEstadoConsulta());
                    _estadoV = _verificarDatos.IsEstadoConsultaVerificado();
                    _cedulaP = _verificarDatos.IsCedulaVerificada();
                    /*-------------------------------------------*/
                    
                    /*Si se confirma que los datos cumples entonces se procede a modificar
                    los campos de la cita solicitados, en este caso el estado de la cita*/
                    if (_estadoV == false && _cedulaP == false) {
                        _controladorArrayList.ModificarEstadoConsulta(_panelListaConsulta.getTextoEstadoConsulta(), _panelListaConsulta.getTextoCedula());
                        _panelListaConsulta.LlenarTableConsultas(_controladorArrayList.getRegistroDatosConsulta(), _controladorArrayList.getRegistroHistorial());
                        _panelListaConsulta.setCbEstadoConsulta();
                        _panelListaConsulta.setTextoCedula();
                        _panelListaConsulta.setCbEstadoConsulta();
                        _panelListaConsulta.setTextoEstadoConsulta();
                    } 
                    /*-------------------------------------------------------------*/
                    else {
                        if (_estadoV == true && _cedulaP == true) {
                            _panelListaConsulta.setLabelAviso3();
                            _panelListaConsulta.ErrorEstadoCedula(true);
                            _panelListaConsulta.ErrorEstadoConsulta(true);
                        } else if (_estadoV == true) {
                            _panelListaConsulta.setLabelAviso2();
                            _panelListaConsulta.ErrorEstadoConsulta(true);
                        } else if (_cedulaP == true) {
                            _panelListaConsulta.setLabelAviso1();
                            _panelListaConsulta.ErrorEstadoCedula(true);
                        }
                    }

                } else if (evento.getSource() == _panelListaConsulta.getBotonEliminarRegistro() && _confirmacion == false) {
                    _confirmacion = true;
                    _panelListaConsulta.setLbConfirmacion();
                    _panelListaConsulta.AgregarBotonCancelar();
                    _panelBotonCancelar = _panelListaConsulta.getBotonCancelar();
                    _panelBotonCancelar.AddActionListener(new AddActionListenerBotonCancelar());
                } else if (evento.getSource() == _panelListaConsulta.getBotonEliminarRegistro() && _confirmacion == true) {
                    _controladorArrayList.EliminarConsultasRegistradas();
                    _controladorArrayList.setPrimerConsulta();
                    _panelListaConsulta.setLbConfirmacion1();
                    _frameLsitaConsulta.dispose();
                    _frameContenedorMenu.setVisible(true);
                } else if (evento.getSource() == _panelListaConsulta.getBotonVolver()) {
                    _panelListaConsulta.setCbEstadoConsulta();
                    _panelListaConsulta.setTextoCedula();
                    _panelListaConsulta.setCbEstadoConsulta();
                    _panelListaConsulta.setTextoEstadoConsulta();
                    _frameLsitaConsulta.dispose();
                    _frameContenedorMenu.setVisible(true);
                }

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AddActionListenerBotonCancelar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelBotonCancelar.getBotonCancelar()) {
                    _confirmacion = false;
                    _panelListaConsulta.setLbConfirmacion1();
                    _panelListaConsulta.QuitarBotonCancelar();
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
