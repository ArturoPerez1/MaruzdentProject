package packagePrincipal.ControladorRegistroPaciente;

import java.util.ArrayList;
import packagePrincipal.modelo.CuentaPaciente;
import packagePrincipal.modelo.DatosConsulta;
import packagePrincipal.modelo.DatosMedicos;
import packagePrincipal.modelo.DatosPaciente;
import packagePrincipal.modelo.HistorialClinico;
import packagePrincipal.modelo.RegistroCuentaPaciente;
import packagePrincipal.modelo.RegistroDatosConsulta;
import packagePrincipal.modelo.RegistroHistorialClinico;
import packagePrincipal.modelo.RegistroMedicos;
import packagePrincipal.modelo.RegistroPaciente;

public class ControladorArraysList {

    private boolean _primerMedico;
    private boolean _primerPaciente;
    private boolean _primerHistorial;
    private boolean _primerCuenta;
    private boolean _primerConsulta;
    private boolean _cedulaConsultaRepetida;
    private boolean _cedulaRepetida;
    private HistorialClinico _historialClinico;
    private DatosPaciente _datosPaciente;
    private CuentaPaciente _cuentaPaciente;
    private DatosMedicos _datosMedicos;
    private DatosConsulta _datosConsulta;
    private RegistroPaciente _registroPaciente;
    private RegistroHistorialClinico _registroHistorial;
    private RegistroCuentaPaciente _registroCuenta;
    private RegistroMedicos _registroMedicos;
    private RegistroDatosConsulta _registroConsulta;

    public ControladorArraysList() {
        _primerPaciente = true;
        _primerMedico = true;
        _primerHistorial = true;
        _primerCuenta = true;
        _primerConsulta = true;
        _cedulaRepetida = false;
        _registroMedicos = new RegistroMedicos();
        _registroPaciente = new RegistroPaciente();
        _registroHistorial = new RegistroHistorialClinico();
        _registroCuenta = new RegistroCuentaPaciente();
        _registroConsulta = new RegistroDatosConsulta();
    }

    public void AgregarPaciente(String nombres, String apellidos, String Id, String fechaNacimiento, String edad, String genero, String numeroTelefonico, String estadoCivil, String ocupacion,
            String direccionResidencia, String correoElectronico, String nombreResponsable, String numeroTelefonicoR, String apellidosResponsable) {

        if (_primerPaciente == true) {
            _datosPaciente = new DatosPaciente(nombres, apellidos, Id, fechaNacimiento, edad, genero, numeroTelefonico, estadoCivil, ocupacion,
                    direccionResidencia, correoElectronico, nombreResponsable, numeroTelefonicoR, apellidosResponsable);
            _registroPaciente.AgregarPaciente(_datosPaciente);
            _primerPaciente = false;
        } else {
            _cedulaRepetida = CedulaPacienteRepetida(Id);
            if (_cedulaRepetida == false) {
                _datosPaciente = new DatosPaciente(nombres, apellidos, Id, fechaNacimiento, edad, genero, numeroTelefonico, estadoCivil, ocupacion,
                        direccionResidencia, correoElectronico, nombreResponsable, numeroTelefonicoR, apellidosResponsable);
                _registroPaciente.AgregarPaciente(_datosPaciente);
            }
        }

    }

    public void AgregarHistorialClinico(String razonConsulta, String enfermedadActual, String antecedentesPersonales, String antecedentesFamiliares,
            String antecedentesPatologicos, String antecedentesFarmacologicos, String examenFisico, String tipoDeConsulta,
            String diagnostico, String planTratamiento, String fechaConsulta, String cedulaAsociada) {

        if (_primerHistorial == true) {
            _historialClinico = new HistorialClinico(razonConsulta, enfermedadActual, antecedentesPersonales, antecedentesFamiliares, antecedentesPatologicos, antecedentesFarmacologicos, examenFisico,
                    tipoDeConsulta, diagnostico, planTratamiento, fechaConsulta, cedulaAsociada);
            _registroHistorial.AgregarHistorial(_historialClinico);
            _primerHistorial = false;
        } else {
            _cedulaRepetida = CedulaAsociadaHistorialRepetida(cedulaAsociada);
            if (_cedulaRepetida == false) {
                _historialClinico = new HistorialClinico(razonConsulta, enfermedadActual, antecedentesPersonales, antecedentesFamiliares, antecedentesPatologicos, antecedentesFarmacologicos, examenFisico,
                        tipoDeConsulta, diagnostico, planTratamiento, fechaConsulta, cedulaAsociada);
                _registroHistorial.AgregarHistorial(_historialClinico);
            }
        }

    }

    public void AgregarCuentaPaciente(String costoTotalTratamiento, String deudaTotalAcumulada, String costoConsulta, String cedulaAsociada) {
        if (_primerCuenta == true) {
            _cuentaPaciente = new CuentaPaciente(costoTotalTratamiento, deudaTotalAcumulada, costoConsulta, cedulaAsociada);
            _registroCuenta.AgregarCuenta(_cuentaPaciente);
            _primerCuenta = false;
        } else {
            _cedulaRepetida = CedulaCuentaPacienteRepetida(cedulaAsociada);
            if (_cedulaRepetida == false) {
                _cuentaPaciente = new CuentaPaciente(costoTotalTratamiento, deudaTotalAcumulada, costoConsulta, cedulaAsociada);
                _registroCuenta.AgregarCuenta(_cuentaPaciente);
            }
        }
    }

    public void AgregarMedico(String nombreMedico, String cedulaMedico, String especialidad, String numeroTelefonico, String rutaImagen) {
        if (_primerMedico == true) {
            _datosMedicos = new DatosMedicos(nombreMedico, cedulaMedico, especialidad, numeroTelefonico,rutaImagen);
            _registroMedicos.AgregarMedico(_datosMedicos);
            _primerMedico = false;
        } else {
            _cedulaRepetida = CedulaMedicosRepetida(cedulaMedico);
            if (_cedulaRepetida == false) {
                _datosMedicos = new DatosMedicos(nombreMedico, cedulaMedico, especialidad, numeroTelefonico,rutaImagen);
                _registroMedicos.AgregarMedico(_datosMedicos);
            }
        }
    }

    public void AgregarConsulta(String estadoConsulta, DatosMedicos medicoAsociado, String nombreP, String cedulaP) {
        if (_primerConsulta) {
            _datosConsulta = new DatosConsulta(estadoConsulta, medicoAsociado, nombreP, cedulaP);
            _registroConsulta.AgregarDatosConsulta(_datosConsulta);
            _primerConsulta = false;
        } else {
            _cedulaConsultaRepetida = CedulaAsociadaConsultaRepetida(cedulaP);

            if (_cedulaConsultaRepetida == false) {
                _datosConsulta = new DatosConsulta(estadoConsulta, medicoAsociado, nombreP, cedulaP);
                _registroConsulta.AgregarDatosConsulta(_datosConsulta);
            }
        }
    }

    public int ObtenerIndiceCedulaPaciente(String cedula) {
        int retornar = 0;
        int cont = 0;

        for (DatosPaciente paciente : _registroPaciente.getRegistroPacientes()) {
            if (paciente.getCedula().equals(cedula)) {
                retornar = cont;
                break;
            }
            cont++;
        }

        return retornar;
    }

    public int ObtenerIndiceCedulaHistorial(String cedula) {
        int retornar = 0;
        int cont = 0;

        for (HistorialClinico historial : _registroHistorial.getRegistroHistorial()) {
            if (historial.getCedulaAsociada().equals(cedula)) {
                retornar = cont;
                break;
            }
            cont++;
        }

        return retornar;
    }

    public int ObtenerIndiceCedulaMedico(String cedula) {
        int retornar = 0;
        int cont = 0;

        for (DatosMedicos medico : _registroMedicos.getRegistroMedicos()) {
            if (medico.getCedulaMedico().equals(cedula)) {
                retornar = cont;
                break;
            }
            cont++;
        }

        return retornar;
    }

    public boolean CedulaPacienteRepetida(String cedula) {
        boolean repetida = false;

        for (DatosPaciente paciente : _registroPaciente.getRegistroPacientes()) {
            if (paciente.getCedula().equals(cedula)) {
                repetida = true;
                break;
            }
        }

        return repetida;
    }

    public boolean CedulaAsociadaHistorialRepetida(String cedula) {
        boolean repetida = false;

        for (HistorialClinico historial : _registroHistorial.getRegistroHistorial()) {
            if (historial.getCedulaAsociada().equals(cedula)) {
                repetida = true;
                break;
            }
        }

        return repetida;
    }

    public boolean CedulaCuentaPacienteRepetida(String cedula) {
        boolean repetida = false;

        for (CuentaPaciente cuenta : _registroCuenta.getRegistroCuenta()) {
            if (cuenta.getCedulaAsociada().equals(cedula)) {
                repetida = true;
                break;
            }
        }

        return repetida;
    }

    public boolean CedulaMedicosRepetida(String cedula) {
        boolean repetida = false;

        for (DatosMedicos medico : _registroMedicos.getRegistroMedicos()) {
            if (medico.getCedulaMedico().equals(cedula)) {
                repetida = true;
                break;
            }
        }

        return repetida;
    }

    public boolean CedulaAsociadaConsultaRepetida(String cedula) {
        boolean repetida = false;
        String cedulaRegistrada;

        for (DatosConsulta consulta : _registroConsulta.getRegistroConsulta()) {
            if (consulta.getCedulaPaciente().equals(cedula)) {
                repetida = true;
                break;
            }
        }

        return repetida;
    }

    public void ModificarEstadoConsulta(String estado, String cedula) {
        int posicion = 0;

        for (DatosConsulta consulta : _registroConsulta.getRegistroConsulta()) {
            if (consulta.getCedulaPaciente().equals(cedula)) {
                break;
            }
            posicion++;
        }

        _registroConsulta.getRegistroConsulta().get(posicion).setEstadoConsulta(estado);
    }

    public void ModificarCedulaMedico(int posicion, String cedula) {
        _registroMedicos.getRegistroMedicos().get(posicion).setCedulaMedico(cedula);
    }

    public void ModificarNombreMedico(int posicion, String nombre) {
        _registroMedicos.getRegistroMedicos().get(posicion).setNombreMedico(nombre);
    }

    public void ModificarEspecialidadMedico(int posicion, String especialidad) {
        _registroMedicos.getRegistroMedicos().get(posicion).setEspecialidad(especialidad);
    }

    public void ModificarTelefonoMedico(int posicion, String telefono) {
        _registroMedicos.getRegistroMedicos().get(posicion).setNumeroTelefonico(telefono);
    }

    public void EliminarConsultasRegistradas() {
        for (int i = 0; i < _registroConsulta.getRegistroConsulta().size(); i++) {
            _registroConsulta.getRegistroConsulta().remove(i);
        }

        _primerConsulta = true;
    }

    public boolean isCedulaRepetida() {
        return _cedulaRepetida;
    }

    public boolean isPrimerHistorial() {
        return _primerHistorial;
    }

    public boolean isPrimerCuenta() {
        return _primerCuenta;
    }

    public boolean isCedulaPacienteRepetida() {
        return _cedulaConsultaRepetida;
    }

    public boolean isPrimerPaciente() {
        return _primerPaciente;
    }

    public boolean isPrimerConsulta() {
        return _primerConsulta;
    }

    public boolean isPrimerMedico() {
        return _primerMedico;
    }

    public void setPrimerConsulta() {
        this._primerConsulta = true;
    }

    public RegistroPaciente getRegistroPaciente() {
        return _registroPaciente;
    }

    public ArrayList<DatosPaciente> getRegistroPaciente1() {
        return _registroPaciente.getRegistroPacientes();
    }

    public ArrayList<DatosConsulta> getRegistroDatosConsulta() {
        return _registroConsulta.getRegistroConsulta();
    }

    public ArrayList<HistorialClinico> getRegistroHistorial() {
        return _registroHistorial.getRegistroHistorial();
    }

    public ArrayList<DatosMedicos> getRegistroMedicos() {
        return _registroMedicos.getRegistroMedicos();
    }

    public ArrayList<CuentaPaciente> getRegistroCuenta() {
        return _registroCuenta.getRegistroCuenta();
    }

}
