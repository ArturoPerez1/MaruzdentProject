package packagePrincipal.modelo;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AlmacenamientoCitas")
@XmlType(propOrder = {"registroConsulta"})
public class RegistroDatosConsulta {

    private ArrayList<DatosConsulta> registroConsulta;

    public RegistroDatosConsulta() {
        this.registroConsulta = new ArrayList<>();
    }

    public void AgregarDatosConsulta(DatosConsulta datosConsulta) {
        registroConsulta.add(datosConsulta);
    }

    @XmlElementWrapper(name = "registroConsulta")
    @XmlElement(name = "citas")
    public ArrayList<DatosConsulta> getRegistroConsulta() {
        return registroConsulta;
    }

}
