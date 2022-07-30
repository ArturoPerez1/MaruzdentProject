package packagePrincipal.modelo;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AlmacenamientoPacientes")
@XmlType(propOrder = {"registroPacientes"})
public class RegistroPaciente {

    private ArrayList<DatosPaciente> registroPacientes;

    public RegistroPaciente() {
        this.registroPacientes = new ArrayList<>();
    }

    public void AgregarPaciente(DatosPaciente paciente) {
        registroPacientes.add(paciente);
    }

    public void EliminarPaciente(int posicionPaciente) {
        registroPacientes.remove(posicionPaciente);
    }

    @XmlElementWrapper(name = "registroPacientes")
    @XmlElement(name = "paciente")
    public ArrayList<DatosPaciente> getRegistroPacientes() {
        return registroPacientes;
    }

}
