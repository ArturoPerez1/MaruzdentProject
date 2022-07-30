package packagePrincipal.modelo;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AlmacenamientoCuenta")
@XmlType(propOrder = {"registroCuenta"})
public class RegistroCuentaPaciente {

    private ArrayList<CuentaPaciente> registroCuenta;

    public RegistroCuentaPaciente() {
        this.registroCuenta = new ArrayList<>();
    }

    public void AgregarCuenta(CuentaPaciente cuenta) {
        registroCuenta.add(cuenta);
    }

    @XmlElementWrapper(name = "registroCuenta")
    @XmlElement(name = "cuenta")
    public ArrayList<CuentaPaciente> getRegistroCuenta() {
        return registroCuenta;
    }

}
