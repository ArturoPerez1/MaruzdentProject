package packagePrincipal.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "citas")
@XmlType(propOrder = {"estadoConsulta", "medicoAsociado", "nombrePaciente", "cedulaPaciente",
    "fechaCita", "horaCita"})
public class DatosConsulta {

    private String estadoConsulta;
    private DatosMedicos medicoAsociado;
    private String nombrePaciente;
    private String cedulaPaciente;
    private String fechaCita;
    private String horaCita;

    public DatosConsulta() {
    }

    public DatosConsulta(String estadoConsulta, DatosMedicos medicoAsociado, String nombrePaciente, String cedulaPaciente, String fechaCita, String horaCita) {
        this.estadoConsulta = estadoConsulta;
        this.medicoAsociado = medicoAsociado;
        this.cedulaPaciente = cedulaPaciente;
        this.nombrePaciente = nombrePaciente;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
    }

    public String getEstadoConsulta() {
        return estadoConsulta;
    }

    public DatosMedicos getMedicoAsociado() {
        return medicoAsociado;
    }

    @XmlAttribute(name = "nombrePaciente")
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getCedulaPaciente() {
        return cedulaPaciente;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String _fechaCita) {
        this.fechaCita = _fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String _horaCita) {
        this.horaCita = _horaCita;
    }

    public void setEstadoConsulta(String _estadoConsulta) {
        this.estadoConsulta = _estadoConsulta;
    }

    public void setMedicoAsociado(DatosMedicos _medicoAsociado) {
        this.medicoAsociado = _medicoAsociado;
    }

    public void setNombrePaciente(String _nombrePaciente) {
        this.nombrePaciente = _nombrePaciente;
    }

    public void setCedulaPaciente(String _cedulaPaciente) {
        this.cedulaPaciente = _cedulaPaciente;
    }

}
