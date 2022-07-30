package packagePrincipal.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "paciente")
@XmlType(propOrder = {"costoTratamiento", "cedulaAsociada", "presupuestoPaciente", "tipoTratamiento",
    "tratamientoUnico"})
public class CuentaPaciente {

    private String costoTratamiento;
    private String cedulaAsociada;
    private String presupuestoPaciente;
    private String tipoTratamiento;
    private boolean tratamientoUnico;

    public CuentaPaciente() {
    }

    public CuentaPaciente(String costoTotalTratamiento, String cedulaAsociada, String presupuestoPaciente, String tipoTratamiento, boolean tratamientoUnico) {
        this.costoTratamiento = costoTotalTratamiento;
        this.cedulaAsociada = cedulaAsociada;
        this.presupuestoPaciente = presupuestoPaciente;
        this.tipoTratamiento = tipoTratamiento;
        this.tratamientoUnico = tratamientoUnico;
    }

    public String getCostoTratamiento() {
        return costoTratamiento;
    }

    public void setCostoTratamiento(String _costoTratamiento) {
        this.costoTratamiento = _costoTratamiento;
    }

    @XmlAttribute(name = "cedulaAsociada")
    public String getCedulaAsociada() {
        return cedulaAsociada;
    }

    public void setCedulaAsociada(String _cedulaAsociada) {
        this.cedulaAsociada = _cedulaAsociada;
    }

    public String getPresupuestoPaciente() {
        return presupuestoPaciente;
    }

    public void setPresupuestoPaciente(String _presupuestoPaciente) {
        this.presupuestoPaciente = _presupuestoPaciente;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String _tipoTratamiento) {
        this.tipoTratamiento = _tipoTratamiento;
    }

    public boolean isTratamientoUnico() {
        return tratamientoUnico;
    }

    public void setTratamientoUnico(boolean _tratamientoUnico) {
        this.tratamientoUnico = _tratamientoUnico;
    }

}
