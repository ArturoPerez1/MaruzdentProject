package packagePrincipal.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "medico")
@XmlType(propOrder = {"nombreMedico", "cedulaMedico", "especialidad", "numeroTelefonico", "rutaImagen"})
public class DatosMedicos {

    private String nombreMedico;
    private String cedulaMedico;
    private String especialidad;
    private String numeroTelefonico;
    private String rutaImagen;

    public DatosMedicos() {
    }

    public DatosMedicos(String nombreMedico, String cedulaMedico, String especialidad, String numeroTelefonico, String rutaImagen) {
        this.nombreMedico = nombreMedico;
        this.cedulaMedico = cedulaMedico;
        this.especialidad = especialidad;
        this.numeroTelefonico = numeroTelefonico;
        this.rutaImagen = rutaImagen;
    }

    @XmlAttribute(name = "nombreMedico")
    public String getNombreMedico() {
        return nombreMedico;
    }

    public String getCedulaMedico() {
        return cedulaMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String _rutaImagen) {
        this.rutaImagen = _rutaImagen;
    }

    public void setNombreMedico(String _nombreMedico) {
        this.nombreMedico = _nombreMedico;
    }

    public void setCedulaMedico(String _cedulaMedico) {
        this.cedulaMedico = _cedulaMedico;
    }

    public void setEspecialidad(String _especialidad) {
        this.especialidad = _especialidad;
    }

    public void setNumeroTelefonico(String _numeroTelefonico) {
        this.numeroTelefonico = _numeroTelefonico;
    }

}
