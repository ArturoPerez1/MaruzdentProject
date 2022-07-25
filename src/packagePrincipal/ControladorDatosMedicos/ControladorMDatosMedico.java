package packagePrincipal.ControladorDatosMedicos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.modelo.VerificarDatosMedico;
import packagePrincipal.ventanaMDatosClinica.FrameMDatosClinica;
import packagePrincipal.vistaMDatosmedico.FrameMDatosMedicos;
import packagePrincipal.vistaMDatosmedico.PanelListaMedicos;
import packagePrincipal.vistaMDatosmedico.PanelMDatosMedicos;
import packagePrincipal.vistaMDatosmedico.PanelModificadores;

public class ControladorMDatosMedico {

    private int _posicionMedico;
    private boolean _cedulaRepetida;
    private boolean _cedulaP1Vacia;
    private boolean _codigoPErroneo;
    private boolean _digitosMenor10;
    private boolean _cedulaP2Vacia;
    private boolean _codigoVErroneo;
    private String _cedulaCompleta;
    private VerificarDatosMedico _verificarDatosMedicos;
    private ControladorArraysList _controladorArrayList;
    private PanelListaMedicos _panelListaMedicos;
    private PanelModificadores _panelModificadores;
    private PanelMDatosMedicos _panelMDatosMedicos;
    private FrameMDatosClinica _frameMDatosClinica;
    private FrameMDatosMedicos _frameMDatosMedicos;

    public ControladorMDatosMedico(FrameMDatosClinica frameMDatosClinica, ControladorArraysList controladorArrayList) {
        this._controladorArrayList = controladorArrayList;
        this._frameMDatosClinica = frameMDatosClinica;
        this._frameMDatosMedicos = new FrameMDatosMedicos();
        this._verificarDatosMedicos = new VerificarDatosMedico();
        _frameMDatosMedicos.setVisible(true);
        _frameMDatosMedicos.AgregarPanelListaMedicos();
        this._panelListaMedicos = _frameMDatosMedicos.getPanelListaMedicos();
        _panelListaMedicos.LlenaComboBoxCedulas(_controladorArrayList.getRegistroMedicos());
        _panelListaMedicos.LlenarTable(_controladorArrayList.getRegistroMedicos());
        _panelListaMedicos.AddActionListener(new AddActionListenerVentanaMDatosMedicos());
    }

    public class AddActionListenerVentanaMDatosMedicos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelListaMedicos.getBotonBuscar()) {
                    _verificarDatosMedicos.VerificarCedulaMedicoM(_panelListaMedicos.getTextoBuscarCedula());
                    if (_verificarDatosMedicos.IsCedulaP1Vacia() == false) {
                        _posicionMedico = _controladorArrayList.ObtenerIndiceCedulaMedico(_panelListaMedicos.getTextoBuscarCedula());
                        _frameMDatosMedicos.AgregarPanelMDAtosMedicos();
                        _panelMDatosMedicos = _frameMDatosMedicos.getPanelMDatosMedicos();
                        _panelMDatosMedicos.LlenarLabels(_controladorArrayList.getRegistroMedicos(), _posicionMedico);
                        _panelMDatosMedicos.AgregarPanelModificadore();
                        _panelModificadores = _panelMDatosMedicos.getPanelModificadores();
                        _panelMDatosMedicos.AddActionListener(new AddActionListenerBotonVolverVentanaModificarDatos());
                        _panelMDatosMedicos.AddActionlistenerModificadores(new AddActionListenerVentanaModificarDatos());
                    } else {
                        _panelListaMedicos.ErrorCedula(true);
                        _panelListaMedicos.setLabelSelecCError();
                    }
                } else if (evento.getSource() == _panelListaMedicos.getBotonVolver()) {
                    _panelListaMedicos.setCbCedula();
                    _panelListaMedicos.setTextoBuscarCedula();
                    _frameMDatosMedicos.dispose();
                    _frameMDatosClinica.setVisible(true);
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AddActionListenerBotonVolverVentanaModificarDatos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelMDatosMedicos.getBotonVolver()) {
                    _frameMDatosMedicos.AgregarPanelListaMedicos();
                    _panelListaMedicos = _frameMDatosMedicos.getPanelListaMedicos();
                    _panelListaMedicos.LlenaComboBoxCedulas(_controladorArrayList.getRegistroMedicos());
                    _panelListaMedicos.LlenarTable(_controladorArrayList.getRegistroMedicos());
                    _panelListaMedicos.AddActionListener(new AddActionListenerVentanaMDatosMedicos());
                }else if(evento.getSource() == _panelMDatosMedicos.getBotonMImagen()){
                    _panelMDatosMedicos.AgregarJFileChooser();
                    _controladorArrayList.ModificarRutaImagenMedico(_posicionMedico, _panelMDatosMedicos.getLabelImagen());         
                }

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AddActionListenerVentanaModificarDatos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _panelModificadores.getBotonMCedula()) {
                    _verificarDatosMedicos.VerificarCedula(_panelModificadores.getFtMCedulP1(), _panelModificadores.getFtCedulaP2());
                    _cedulaP1Vacia = _verificarDatosMedicos.IsCedulaP1Vacia();
                    _cedulaP2Vacia = _verificarDatosMedicos.IsCedulaP2Vacia();
                    _codigoPErroneo = _verificarDatosMedicos.IsCedulaP1CodigoPVerificado();
                    _codigoVErroneo = _verificarDatosMedicos.IsCedulaP2CodigoVerificacionV();
                    _digitosMenor10 = _verificarDatosMedicos.IsCedulaP1PocoDigitos();

                    if (_cedulaP1Vacia == false && _cedulaP2Vacia == false && _codigoPErroneo == false
                            && _codigoVErroneo == false && _digitosMenor10 == false) {

                        _cedulaCompleta = _panelModificadores.getFtMCedulP1() + "-" + _panelModificadores.getFtCedulaP2();
                        _cedulaRepetida = _controladorArrayList.CedulaMedicosRepetida(_cedulaCompleta);
                        if (_cedulaRepetida == false) {
                            JOptionPane.showMessageDialog(null, "CÉDULA MODIFICADA EXITOSAMENTE", "MODIFICACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                            _controladorArrayList.ModificarCedulaMedico(_posicionMedico, _cedulaCompleta);
                            _panelMDatosMedicos.LlenarLabels(_controladorArrayList.getRegistroMedicos(), _posicionMedico);
                            _panelModificadores.setFtMCedula();
                            _panelModificadores.setFtMCedula1();
                        } else {
                            _panelModificadores.setLabelCedulaExistente();
                            _panelModificadores.ErrorCedulaP1(true);
                            _panelModificadores.ErrorCedulaP2(true);
                        }
                    } else {
                        if (_cedulaP1Vacia == true && _cedulaP2Vacia == true) {
                            _panelModificadores.ErrorCedulaP1(_cedulaP1Vacia);
                            _panelModificadores.ErrorCedulaP2(_cedulaP2Vacia);
                            _panelModificadores.CedulaP1Y2Vacia();
                        } else if (_cedulaP1Vacia == true) {
                            _panelModificadores.setLabelErrorCedula1();
                            _panelModificadores.ErrorCedulaP1(_cedulaP1Vacia);
                            _panelModificadores.CedulaP1Vacia();
                        } else if (_cedulaP2Vacia == true) {
                            _panelModificadores.setLabelErrorCedula1();
                            _panelModificadores.ErrorCedulaP2(_cedulaP2Vacia);
                            _panelModificadores.CedulaP2Vacia();
                        } else if (_codigoPErroneo == true) {
                            _panelModificadores.setLabelErrorCedula1();
                            _panelModificadores.ErrorCedulaP1(_codigoPErroneo);
                            _panelModificadores.CodigoProviciaE();
                        } else if (_codigoVErroneo == true) {
                            _panelModificadores.setLabelErrorCedula1();
                            _panelModificadores.ErrorCedulaP2(_codigoVErroneo);
                            _panelModificadores.CodigoVerificacionE();
                        } else if (_digitosMenor10 == true) {
                            _panelModificadores.setLabelErrorCedula1();
                            _panelModificadores.ErrorCedulaP1(_digitosMenor10);
                            _panelModificadores.DigitosMenorA10();
                        }
                    }
                } else if (evento.getSource() == _panelModificadores.getBotonMEspecialidad()) {
                    _verificarDatosMedicos.VerificarEspecialidad(_panelModificadores.getTextoEspecialidad());
                    if (_verificarDatosMedicos.IsEspecialidadVerificada() == false) {
                        JOptionPane.showMessageDialog(null, "ESPECIALIDAD MODIFICADA EXITOSAMENTE", "MODIFICACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                        _controladorArrayList.ModificarEspecialidadMedico(_posicionMedico, _panelModificadores.getTextoEspecialidad());
                        _panelMDatosMedicos.LlenarLabels(_controladorArrayList.getRegistroMedicos(), _posicionMedico);
                        _panelModificadores.setcBMEspecialidad();
                        _panelModificadores.setTextoEspecialidad();
                    } else {
                        _panelModificadores.ErrorEspecialidad(true);
                        _panelModificadores.setLabelEspecialidadError();
                    }
                } else if (evento.getSource() == _panelModificadores.getBotonMNombre()) {
                    _verificarDatosMedicos.VerificarNombreMedico(_panelModificadores.getFtMNombre());
                    if (_verificarDatosMedicos.IsNombreVerificado() == false) {
                        JOptionPane.showMessageDialog(null, "NOMBRE MODIFICADO EXITOSAMENTE", "MODIFICACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                        _controladorArrayList.ModificarNombreMedico(_posicionMedico, _panelModificadores.getFtMNombre());
                        _panelMDatosMedicos.LlenarLabels(_controladorArrayList.getRegistroMedicos(), _posicionMedico);
                        _panelModificadores.setFtMNombre();
                    } else {
                        _panelModificadores.ErrorNombre(true);
                        _panelModificadores.setLabelNombreVacio();
                    }
                } else if (evento.getSource() == _panelModificadores.getBotonMTelefono()) {
                    _verificarDatosMedicos.VerificarTelefono(_panelModificadores.getFtMTelefono());
                    if (_verificarDatosMedicos.IsTelefonoVerificado() == false) {
                        JOptionPane.showMessageDialog(null, "NÚMERO TELEFÓNICO MODIFICADO EXITOSAMENTE", "MODIFICACIÓN EXITOSA", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/okImage.png")));
                        _controladorArrayList.ModificarTelefonoMedico(_posicionMedico, _panelModificadores.getFtMTelefono());
                        _panelMDatosMedicos.LlenarLabels(_controladorArrayList.getRegistroMedicos(), _posicionMedico);
                        _panelModificadores.setFtMTelefono();
                    } else {
                        _panelModificadores.ErrorTelefono(true);
                        _panelModificadores.setLabelTelefonoVacio();
                    }
                }
            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

}
