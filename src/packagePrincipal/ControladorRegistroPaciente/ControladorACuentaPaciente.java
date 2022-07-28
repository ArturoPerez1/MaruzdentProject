package packagePrincipal.ControladorRegistroPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import packagePrincipal.modelo.ObtenerDatosPacienteEHistorial;
import packagePrincipal.vistaACuenta.FrameACuenta;
import packagePrincipal.vistaACuenta.FrameAgregarCuenta;
import packagePrincipal.vistaACuenta.PanelListaPacienteCuenta;
import packagePrincipal.vistaPaciente.FrameContenedor;

public class ControladorACuentaPaciente {

    private boolean _botonAgregarPulsado;
    private boolean _cuentaAgregada;
    private String _cedulaAsociada;
    private int _posicionPaciente;
    private int _posicionHistorial;
    private String _costoTratamiento;
    private String _presupuestoPaciente;
    private String _tipoTratamiento;
    private boolean _tratamientoUnico;
    private ObtenerDatosPacienteEHistorial _obtenerDatos;
    private ControladorArraysList _controladorArrayList;
    private PanelListaPacienteCuenta _panellistaPacienteCuenta;
    private FrameContenedor _frameContenedorPaciente;
    private FrameACuenta _frameACuenta;
    private FrameAgregarCuenta _frameAgragarCuenta;

    public ControladorACuentaPaciente(FrameContenedor frameContenedorPaciente, ControladorArraysList controladorArrayList) {
        this._obtenerDatos = new ObtenerDatosPacienteEHistorial();
        this._controladorArrayList = controladorArrayList;
        this._frameContenedorPaciente = frameContenedorPaciente;
        this._botonAgregarPulsado = false;
        this._cuentaAgregada = false;
        this._frameACuenta = new FrameACuenta();
        _frameACuenta.setVisible(true);
        _frameACuenta.AgregarVentanaACuenta();
        this._panellistaPacienteCuenta = _frameACuenta.getPanelACuenta();
        _panellistaPacienteCuenta.LlenaComboBoxCedulas(_controladorArrayList.getRegistroPaciente().getRegistroPacientes());
        _panellistaPacienteCuenta.LlenarTablaGeneralPaciente(_controladorArrayList.getRegistroPaciente1());
        _panellistaPacienteCuenta.AddActionListener(new AddActionListenerVentaACuenta());
    }

    public class AddActionListenerVentaACuenta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panellistaPacienteCuenta.getBotonRegistrar()) {
                    _cedulaAsociada = _panellistaPacienteCuenta.getTextoCedula();
                    if (_cedulaAsociada.equals(" ") == true) {
                        _panellistaPacienteCuenta.ErrorCedulaAsociada(true);
                        _panellistaPacienteCuenta.setLabelErrorCedula2();
                    } else {
                        if (_botonAgregarPulsado == true && _cuentaAgregada == true) {
                            _controladorArrayList.AgregarCuentaPaciente(_costoTratamiento, _cedulaAsociada, _presupuestoPaciente, _tipoTratamiento, _tratamientoUnico);
                            if (_controladorArrayList.CedulaCuentaPacienteRepetida(_cedulaAsociada) == true) {
                                _panellistaPacienteCuenta.ErrorCedulaAsociada(true);
                                _panellistaPacienteCuenta.setLabelErrorCedula();
                            } else {
                                _panellistaPacienteCuenta.setCbCedulaAsociada();
                                JOptionPane.showMessageDialog(null, "CUENTA AGREGADA EXITOSAMENTE", "REGISTRO EXITOSO", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "AGREGUE UNA CUENTA ANTES DE REGISTRARLA", "AGREGAR CUENTA", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } else if (evento.getSource() == _panellistaPacienteCuenta.getBotonAgregarCuenta()) {
                    _botonAgregarPulsado = true;
                    _posicionPaciente = _obtenerDatos.ObtenerIndicePacientePorCedula(_controladorArrayList.getRegistroPaciente1(), _panellistaPacienteCuenta.getTextoCedula());
                    _posicionHistorial = _obtenerDatos.ObtenerIndiceRazonPorCedula(_controladorArrayList.getRegistroHistorial(), _panellistaPacienteCuenta.getTextoCedula());
                    _panellistaPacienteCuenta.AgregarVentanaDeAdjuntarCuenta(_controladorArrayList.getRegistroPaciente1(), _posicionPaciente, _controladorArrayList.getRegistroHistorial(), _posicionHistorial);
                    _frameAgragarCuenta = _panellistaPacienteCuenta.getFrameAgregarCuenta();
                    _frameAgragarCuenta.setVisible(true);
                    _frameAgragarCuenta.AddActionListener(new AgregarActionListenerVentanaAgregarCuenta());
                } else if (evento.getSource() == _panellistaPacienteCuenta.getBotonVolver()) {
                    _frameACuenta.dispose();
                    _frameContenedorPaciente.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }
    }

    public class AgregarActionListenerVentanaAgregarCuenta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _frameAgragarCuenta.getBotonAgregarCuenta()) {
                    _costoTratamiento = _frameAgragarCuenta.getTfCostoConsulta();
                    _presupuestoPaciente = _frameAgragarCuenta.getTfPresupuesto();
                    _tipoTratamiento = _frameAgragarCuenta.getTextoTipoTratamiento();
                    if(_tipoTratamiento.equals("TRATAMIENTO POR PARTES") == true){
                        _tratamientoUnico = false;
                    }else{
                        _tratamientoUnico = true;
                    }
                    if (_tratamientoUnico == true) {
                        if (_costoTratamiento.isEmpty() == true) {
                            _frameAgragarCuenta.ErrorCosto(true);
                            _frameAgragarCuenta.AvisoCostoTratamiento();
                        } else {
                            _frameAgragarCuenta.QuitarAvisoCostoTratamiento();
                            _costoTratamiento = _frameAgragarCuenta.getTfCostoConsulta();
                            _presupuestoPaciente = _frameAgragarCuenta.getTfPresupuesto();
                            _tipoTratamiento = _frameAgragarCuenta.getTextoTipoTratamiento();
                            _cuentaAgregada = true;
                            _frameAgragarCuenta.dispose();
                        }
                    } else {
                        if (_costoTratamiento.isEmpty() == true && _presupuestoPaciente.isEmpty() == true) {
                            _frameAgragarCuenta.ErrorCosto(true);
                            _frameAgragarCuenta.AvisoCostoTratamiento();
                            _frameAgragarCuenta.ErrorPresupuesto(true);
                            _frameAgragarCuenta.AvisoPresupuesto();
                        } else if (_costoTratamiento.isEmpty() == true) {
                            _frameAgragarCuenta.ErrorCosto(true);
                            _frameAgragarCuenta.AvisoCostoTratamiento();
                        } else if (_presupuestoPaciente.isEmpty() == true) {
                            _frameAgragarCuenta.ErrorPresupuesto(true);
                            _frameAgragarCuenta.AvisoPresupuesto();
                        } else if (_costoTratamiento.isEmpty() == false && _presupuestoPaciente.isEmpty() == false) {
                             _frameAgragarCuenta.QuitarAvisoCostoTratamiento();
                             _frameAgragarCuenta.QuitarAvisoPresupuesto();
                            _costoTratamiento = _frameAgragarCuenta.getTfCostoConsulta();
                            _presupuestoPaciente = _frameAgragarCuenta.getTfPresupuesto();
                            _tipoTratamiento = _frameAgragarCuenta.getTextoTipoTratamiento();
                            _cuentaAgregada = true;
                            _frameAgragarCuenta.dispose();
                        }
                    }
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
