package packagePrincipal.modelo;

import java.util.ArrayList;

public class RegistroDatosConsulta {

    private ArrayList<DatosConsulta> _registroConsulta;

    public RegistroDatosConsulta() {
        this._registroConsulta = new ArrayList<>();
    }

    public void AgregarDatosConsulta(DatosConsulta datosConsulta) {
        _registroConsulta.add(datosConsulta);
    }

    public ArrayList<DatosConsulta> getRegistroConsulta() {
        return _registroConsulta;
    }

}
