package packagePrincipal.modelo;

import java.util.ArrayList;

public class RegistroMedicos {

    private ArrayList<DatosMedicos> _registroMedicos;

    public RegistroMedicos() {
        this._registroMedicos = new ArrayList<>();
    }
    
    public void AgregarMedico(DatosMedicos medico){
        _registroMedicos.add(medico);
    }
    
    public ArrayList<DatosMedicos> getRegistroMedicos() {
        return _registroMedicos;
    }

}
