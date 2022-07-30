package packagePrincipal.modelo;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AlmacenamientoMedicos")
@XmlType(propOrder = {"registroMedicos"})
public class RegistroMedicos {

    private ArrayList<DatosMedicos> registroMedicos;

    public RegistroMedicos() {
        this.registroMedicos = new ArrayList<>();
    }

    public void AgregarMedico(DatosMedicos medico) {
        registroMedicos.add(medico);
    }

    @XmlElementWrapper(name = "registroMedicos")
    @XmlElement(name = "medico")
    public ArrayList<DatosMedicos> getRegistroMedicos() {
        return registroMedicos;
    }

}
