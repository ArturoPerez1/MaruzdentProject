package packagePrincipal.modelo;

import java.util.ArrayList;

public class RegistroHistorialClinico {

    private ArrayList<HistorialClinico> _registroHistorial;

    public RegistroHistorialClinico() {
        this._registroHistorial = new ArrayList<>();
    }

    public void AgregarHistorial(HistorialClinico historial) {
        _registroHistorial.add(historial);
    }

    public ArrayList<HistorialClinico> getRegistroHistorial() {
        return _registroHistorial;
    }

}
