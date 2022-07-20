package packagePrincipal.ControladorRegistroPaciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import packagePrincipal.modelo.VerificarDatosPaciente;
import packagePrincipal.vistaAPaciente.FrameAPaciente;
import packagePrincipal.vistaAPaciente.PanelRegistrarPaciente;
import packagePrincipal.vistaPaciente.FrameContenedor;

public class ControladorRegistrarPaciente {
    
    /*Las variables booleanas la uso para poder verificar que todos los datos
    cumples y poder proceder a registrar al paciente*/
    private boolean _nombrePV;
    private boolean _nombreRV;
    private boolean _apellidoPV;
    private boolean _apellidoRV;
    private boolean _cedulaPV;
    private boolean _correoPV;
    private boolean _telefonoPV;
    private boolean _telefonoRV;
    private boolean _ocupacionPV;
    private boolean _direccionPV;
    private boolean _diaV;
    private boolean _mesV;
    private boolean _anoV;
    private boolean _edadV;
    private boolean _generoV;
    private boolean _estadoCV;
    private VerificarDatosPaciente _verificarDatos;
    private ControladorArraysList _controladorArrayList;
    private PanelRegistrarPaciente _panelRegistrarPaciente;
    private FrameContenedor _frameContenedorPaciente;
    private FrameAPaciente _frameAPaciente;

    public ControladorRegistrarPaciente(FrameContenedor frameContenedorPaciente, ControladorArraysList controladorArrayList) {
        this._frameContenedorPaciente = frameContenedorPaciente;
        this._frameAPaciente = new FrameAPaciente();
        this._controladorArrayList = controladorArrayList;
        this._verificarDatos = new VerificarDatosPaciente();
        this._nombreRV = false;
        this._apellidoRV = false;
        this._telefonoRV = false;
        _frameAPaciente.setVisible(true);
        _frameAPaciente.AgregarVentanaRegistrarPaciente();
        _panelRegistrarPaciente = _frameAPaciente.getPanelRegistrarPaciente();
        _panelRegistrarPaciente.AddActionListener(new AddActionListenerVentanaRegistrarPaciente());
    }

    public class AddActionListenerVentanaRegistrarPaciente implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelRegistrarPaciente.getBotonRegistrar()) {
                    /*---Verificamos los datos del paciente que será registrado--------------*/
                    _verificarDatos.VerificarNombre(_panelRegistrarPaciente.getTextNombreP());
                    _panelRegistrarPaciente.ErrorNombreP(_verificarDatos.IsNombrePVerificado());
                    _nombrePV = _verificarDatos.IsNombrePVerificado();
                    _verificarDatos.VerificarApellido(_panelRegistrarPaciente.getTextApellidoP());
                    _panelRegistrarPaciente.ErrorApellidoP(_verificarDatos.IsApellidoVerificado());
                    _apellidoPV = _verificarDatos.IsApellidoVerificado();
                    _verificarDatos.VerificarCedula(_panelRegistrarPaciente.getTextCedula());
                    _panelRegistrarPaciente.ErrorCedulaP(_verificarDatos.IsCedulaVerificada());
                    _cedulaPV = _verificarDatos.IsCedulaVerificada();
                    _verificarDatos.VerificarTelefono(_panelRegistrarPaciente.getTextTelefonoP());
                    _panelRegistrarPaciente.ErrorTelefonoP(_verificarDatos.IsTelefonoVerificado());
                    _telefonoPV = _verificarDatos.IsTelefonoVerificado();
                    _verificarDatos.VerificarCorreo(_panelRegistrarPaciente.getTextCorreoP());
                    _panelRegistrarPaciente.ErrorCorreoP(_verificarDatos.IsCorreoVerificado());
                    _correoPV = _verificarDatos.IsCorreoVerificado();
                    _verificarDatos.VerificarDireccion(_panelRegistrarPaciente.getAreaDireccionP());
                    _panelRegistrarPaciente.ErrorDireccionP(_verificarDatos.IsDireccionVerificada());
                    _direccionPV = _verificarDatos.IsDireccionVerificada();
                    _verificarDatos.VerificarOcupacion(_panelRegistrarPaciente.getTextOcupacionP());
                    _panelRegistrarPaciente.ErrorOcupacionP(_verificarDatos.IsOcupacionVerificada());
                    _ocupacionPV = _verificarDatos.IsOcupacionVerificada();
                    /*--------------------------------------------------------------------------*/

                    /*-----------Verificamos el contenido de los comboBoxes----------------------*/
                    _verificarDatos.VerificarFechaNacimiento(_panelRegistrarPaciente.getTextoCMes(), _panelRegistrarPaciente.getTextoCDia(), _panelRegistrarPaciente.getTextoCAno());
                    _panelRegistrarPaciente.ErrorMes(_verificarDatos.IsMesVerificado());
                    _panelRegistrarPaciente.ErrorDia(_verificarDatos.IsDiaVerificado());
                    _panelRegistrarPaciente.ErrorAno(_verificarDatos.IsAnoVerificado());
                    _diaV = _verificarDatos.IsDiaVerificado();
                    _mesV = _verificarDatos.IsMesVerificado();
                    _anoV = _verificarDatos.IsAnoVerificado();
                    _verificarDatos.VerificarEdad(_panelRegistrarPaciente.getTextoEdad());
                    _panelRegistrarPaciente.ErrorEdadP(_verificarDatos.IsEdadVerificada());
                    _edadV = _verificarDatos.IsEdadVerificada();
                    _verificarDatos.VerificarGenero(_panelRegistrarPaciente.getTextoGenero());
                    _panelRegistrarPaciente.ErrorGenero(_verificarDatos.IsGeneroVerificado());
                    _generoV = _verificarDatos.IsGeneroVerificado();
                    _verificarDatos.VerificarEstadoCivil(_panelRegistrarPaciente.getTextoEstadoCivil());
                    _panelRegistrarPaciente.ErrorEstadoCivil(_verificarDatos.IsEstadoCivilVerificado());
                    _estadoCV = _verificarDatos.IsEstadoCivilVerificado();
                    /*--------------------------------------------------------------------------------*/

                    /*-----Verificamos los datos de la persona responsable de aplicar el caso ---------*/
                    if (_verificarDatos.getEdadPaciente() < 18) {
                        _verificarDatos.VerificarNombre(_panelRegistrarPaciente.getTextNombreR());
                        _panelRegistrarPaciente.ErrorNombreR(_verificarDatos.IsNombrePVerificado());
                        _nombreRV = _verificarDatos.IsNombrePVerificado();
                        _verificarDatos.VerificarApellido(_panelRegistrarPaciente.getTextApellidoR());
                        _panelRegistrarPaciente.ErrorApellidoR(_verificarDatos.IsApellidoVerificado());
                        _apellidoRV = _verificarDatos.IsApellidoVerificado();
                        _verificarDatos.VerificarTelefono(_panelRegistrarPaciente.getTextTelefonoR());
                        _panelRegistrarPaciente.ErrorTelefonoR(_verificarDatos.IsTelefonoVerificado());
                        _telefonoRV = _verificarDatos.IsTelefonoVerificado();
                    }
                    /*----------------------------------------------------------------------------------*/

                    /*--Si se confirma que todo cumple aquí se hace el proceso de registro del paciente--*/
                    if (_nombrePV == false && _nombreRV == false && _apellidoPV == false && _apellidoRV == false && _telefonoPV == false && _telefonoRV == false
                            && _cedulaPV == false && _correoPV == false && _ocupacionPV == false && _direccionPV == false && _edadV == false && _generoV == false
                            && _estadoCV == false && _diaV == false && _mesV == false && _anoV == false) {
                        String fechaNacimientoAux = _panelRegistrarPaciente.getTextoCMes() + "/" + _panelRegistrarPaciente.getTextoCDia() + "/" + _panelRegistrarPaciente.getTextoCAno();
                        _controladorArrayList.AgregarPaciente(_panelRegistrarPaciente.getTextNombreP(), _panelRegistrarPaciente.getTextApellidoP(), _panelRegistrarPaciente.getTextCedula(),
                                fechaNacimientoAux, _panelRegistrarPaciente.getTextoEdad(), _panelRegistrarPaciente.getTextoGenero(),
                                _panelRegistrarPaciente.getTextTelefonoP(), _panelRegistrarPaciente.getTextoEstadoCivil(), _panelRegistrarPaciente.getTextOcupacionP(),
                                _panelRegistrarPaciente.getAreaDireccionP(), _panelRegistrarPaciente.getTextCorreoP(), _panelRegistrarPaciente.getTextNombreR(), _panelRegistrarPaciente.getTextTelefonoR(), _panelRegistrarPaciente.getTextApellidoR());
                        if (_controladorArrayList.isCedulaRepetida() == true) {
                            _panelRegistrarPaciente.ErrorCedulaP(true);
                            _panelRegistrarPaciente.setLabelCedulaRepetida();
                        } else {
                            _panelRegistrarPaciente.setTextNombreP();
                            _panelRegistrarPaciente.setTextApellidoP();
                            _panelRegistrarPaciente.setTextCedula();
                            _panelRegistrarPaciente.setTextTelefonoP();
                            _panelRegistrarPaciente.setTextCorreoP();
                            _panelRegistrarPaciente.setTextOcupacionP();
                            _panelRegistrarPaciente.setAreaDireccionP();
                            _panelRegistrarPaciente.setTextNombreRBorrar();
                            _panelRegistrarPaciente.setTextApellidoRBorrar();
                            _panelRegistrarPaciente.setTextTelefonoRBorrar();
                            _panelRegistrarPaciente.setTextApellidoR();
                            _panelRegistrarPaciente.setTextTelefonoR();
                            _panelRegistrarPaciente.setTextNombreR();
                            _panelRegistrarPaciente.setComboAno();
                            _panelRegistrarPaciente.setComboMes();
                            _panelRegistrarPaciente.setComboDia();
                            _panelRegistrarPaciente.setComboEdad();
                            _panelRegistrarPaciente.setComboGenero();
                            _panelRegistrarPaciente.setComboEstadoCivil();
                            _panelRegistrarPaciente.setLabelCedulaRepetida1();

                        }
                    }
                    /*-----------------------------------------------------------------------------------------*/

                } else if (evento.getSource() == _panelRegistrarPaciente.getBotonVolver()) {
                    _panelRegistrarPaciente.setTextNombreP();
                    _panelRegistrarPaciente.setTextApellidoP();
                    _panelRegistrarPaciente.setTextCedula();
                    _panelRegistrarPaciente.setTextTelefonoP();
                    _panelRegistrarPaciente.setTextCorreoP();
                    _panelRegistrarPaciente.setTextOcupacionP();
                    _panelRegistrarPaciente.setAreaDireccionP();
                    _panelRegistrarPaciente.setTextNombreRBorrar();
                    _panelRegistrarPaciente.setTextApellidoRBorrar();
                    _panelRegistrarPaciente.setTextTelefonoRBorrar();
                    _panelRegistrarPaciente.setTextApellidoR();
                    _panelRegistrarPaciente.setTextTelefonoR();
                    _panelRegistrarPaciente.setTextNombreR();
                    _panelRegistrarPaciente.setComboAno();
                    _panelRegistrarPaciente.setComboMes();
                    _panelRegistrarPaciente.setComboDia();
                    _panelRegistrarPaciente.setComboEdad();
                    _panelRegistrarPaciente.setComboGenero();
                    _panelRegistrarPaciente.setComboEstadoCivil();
                    _frameAPaciente.dispose();
                    _frameContenedorPaciente.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error" + e);
            }
        }

    }

}
