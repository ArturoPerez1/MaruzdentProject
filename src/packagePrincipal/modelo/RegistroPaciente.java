package packagePrincipal.modelo;

import java.util.ArrayList;

public class RegistroPaciente {

    private ArrayList<DatosPaciente> _registroPacientes;

    public RegistroPaciente() {
        this._registroPacientes = new ArrayList<>();
    }

    public void AgregarPaciente(DatosPaciente paciente) {
        _registroPacientes.add(paciente);
    }

    public void EliminarPaciente(int posicionPaciente) {
        _registroPacientes.remove(posicionPaciente);
    }

    public ArrayList<DatosPaciente> getRegistroPacientes() {
        return _registroPacientes;
    }

}
