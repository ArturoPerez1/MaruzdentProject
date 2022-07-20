package packagePrincipal.modelo;

import java.util.ArrayList;

public class RegistroCuentaPaciente {

    private ArrayList<CuentaPaciente> _registroCuenta;
    
    public RegistroCuentaPaciente() {
        this._registroCuenta = new ArrayList<>();
    }
    
    public void AgregarCuenta(CuentaPaciente cuenta) {
        _registroCuenta.add(cuenta);
    }
    
    public ArrayList<CuentaPaciente> getRegistroCuenta() {
        return _registroCuenta;
    }
    
}
