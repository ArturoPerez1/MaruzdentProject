package packagePrincipal.modelo;

import java.util.ArrayList;

public class RegistroEstadosActuales {

    private ArrayList<EstadosActuales> _registroEstados;

    public RegistroEstadosActuales() {
        this._registroEstados = new ArrayList<>();
    }

    public void AgregarEstado(EstadosActuales estado) {
        _registroEstados.add(estado);
    }

    public ArrayList<EstadosActuales> getRegistroEstados() {
        return _registroEstados;
    }

}
