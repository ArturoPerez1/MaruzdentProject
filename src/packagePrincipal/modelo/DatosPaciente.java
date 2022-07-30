package packagePrincipal.modelo;
//Id = documento de identificacion

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "paciente")
@XmlType(propOrder = {"nombre", "apellidos", "cedula", "correoElectronico",
    "numeroTelefonico", "fechaNacimiento", "edad", "genero", "estadoCivil", "ocupacion", "direccionResidencia",
    "nombreResponsable", "apellidoResponsable", "numeroTelefonicoR", "rutaImagen"})
public class DatosPaciente {

    private String nombre;
    private String apellidos;
    private String cedula;
    private String fechaNacimiento;
    private String edad;
    private String genero;
    private String numeroTelefonico;
    private String estadoCivil;
    private String ocupacion;
    private String direccionResidencia;
    private String correoElectronico;
    private String nombreResponsable;
    private String numeroTelefonicoR;
    private String apellidoResponsable;
    private String rutaImagen;

    public DatosPaciente() {
    }

    public DatosPaciente(String nombre, String apellidos, String Id, String fechaNacimiento, String edad, String genero, String numeroTelefonico, String estadoCivil, String ocupacion,
            String direccionResidencia, String correoElectronico, String nombreResponsable, String numeroTelefonicoR, String apellidosResponsable, String rutaImagen) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = Id;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.genero = genero;
        this.numeroTelefonico = numeroTelefonico;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.direccionResidencia = direccionResidencia;
        this.correoElectronico = correoElectronico;
        this.nombreResponsable = nombreResponsable;
        this.numeroTelefonicoR = numeroTelefonicoR;
        this.apellidoResponsable = apellidosResponsable;
        this.rutaImagen = rutaImagen;
    }

    @XmlAttribute(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public String getApellidoResponsable() {
        return apellidoResponsable;
    }

    public String getNumeroTelefonicoR() {
        return numeroTelefonicoR;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    public void setApellidos(String _apellidos) {
        this.apellidos = _apellidos;
    }

    public void setCedula(String _cedula) {
        this.cedula = _cedula;
    }

    public void setFechaNacimiento(String _fechaNacimiento) {
        this.fechaNacimiento = _fechaNacimiento;
    }

    public void setEdad(String _edad) {
        this.edad = _edad;
    }

    public void setGenero(String _genero) {
        this.genero = _genero;
    }

    public void setNumeroTelefonico(String _numeroTelefonico) {
        this.numeroTelefonico = _numeroTelefonico;
    }

    public void setEstadoCivil(String _estadoCivil) {
        this.estadoCivil = _estadoCivil;
    }

    public void setOcupacion(String _ocupacion) {
        this.ocupacion = _ocupacion;
    }

    public void setDireccionResidencia(String _direccionResidencia) {
        this.direccionResidencia = _direccionResidencia;
    }

    public void setCorreoElectronico(String _correoElectronico) {
        this.correoElectronico = _correoElectronico;
    }

    public void setNombreResponsable(String _nombreResponsable) {
        this.nombreResponsable = _nombreResponsable;
    }

    public void setNumeroTelefonicoR(String _numeroTelefonicoR) {
        this.numeroTelefonicoR = _numeroTelefonicoR;
    }

    public void setApellidoResponsable(String _ApellidoResponsable) {
        this.apellidoResponsable = _ApellidoResponsable;
    }

    public void setRutaImagen(String _rutaImagen) {
        this.rutaImagen = _rutaImagen;
    }

}
