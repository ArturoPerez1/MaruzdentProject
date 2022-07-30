package packagePrincipal.modelo;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AlmacenamientoHistorial")
@XmlType(propOrder = {"registroHistorial"})
public class RegistroHistorialClinico {

    private ArrayList<HistorialClinico> registroHistorial;

    public RegistroHistorialClinico() {
        this.registroHistorial = new ArrayList<>();
    }

    public void AgregarHistorial(HistorialClinico historial) {
        registroHistorial.add(historial);
    }

    @XmlElementWrapper(name = "registroHistorial")
    @XmlElement(name = "historial")
    public ArrayList<HistorialClinico> getRegistroHistorial() {
        return registroHistorial;
    }

}
