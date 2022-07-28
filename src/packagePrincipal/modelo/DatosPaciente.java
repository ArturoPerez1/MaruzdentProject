package packagePrincipal.modelo;
//Id = documento de identificacion

public class DatosPaciente {

    private String _nombre;
    private String _apellidos;
    private String _cedula;
    private String _fechaNacimiento;
    private String _edad;
    private String _genero;
    private String _numeroTelefonico;
    private String _estadoCivil;
    private String _ocupacion;
    private String _direccionResidencia;
    private String _correoElectronico;
    private String _nombreResponsable;
    private String _numeroTelefonicoR;
    private String _ApellidoResponsable;
    private String _rutaImagen;

    public DatosPaciente(String nombre, String apellidos, String Id, String fechaNacimiento, String edad, String genero, String numeroTelefonico, String estadoCivil, String ocupacion,
            String direccionResidencia, String correoElectronico, String nombreResponsable, String numeroTelefonicoR, String apellidosResponsable, String rutaImagen) {
        this._nombre = nombre;
        this._apellidos = apellidos;
        this._cedula = Id;
        this._fechaNacimiento = fechaNacimiento;
        this._edad = edad;
        this._genero = genero;
        this._numeroTelefonico = numeroTelefonico;
        this._estadoCivil = estadoCivil;
        this._ocupacion = ocupacion;
        this._direccionResidencia = direccionResidencia;
        this._correoElectronico = correoElectronico;
        this._nombreResponsable = nombreResponsable;
        this._numeroTelefonicoR = numeroTelefonicoR;
        this._ApellidoResponsable = apellidosResponsable;
        this._rutaImagen = rutaImagen;
    }

    public String getNombre() {
        return _nombre;
    }

    public String getApellidos() {
        return _apellidos;
    }

    public String getCedula() {
        return _cedula;
    }

    public String getFechaNacimiento() {
        return _fechaNacimiento;
    }

    public String getEdad() {
        return _edad;
    }

    public String getGenero() {
        return _genero;
    }

    public String getNumeroTelefonico() {
        return _numeroTelefonico;
    }

    public String getEstadoCivil() {
        return _estadoCivil;
    }

    public String getOcupacion() {
        return _ocupacion;
    }

    public String getDireccionResidencia() {
        return _direccionResidencia;
    }

    public String getCorreoElectronico() {
        return _correoElectronico;
    }

    public String getNombreResponsable() {
        return _nombreResponsable;
    }

    public String getNumeroTelefonicoR() {
        return _numeroTelefonicoR;
    }

    public String getApellidoResponsable() {
        return _ApellidoResponsable;
    }

    public String getRutaImagen() {
        return _rutaImagen;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public void setApellidos(String _apellidos) {
        this._apellidos = _apellidos;
    }

    public void setCedula(String _cedula) {
        this._cedula = _cedula;
    }

    public void setFechaNacimiento(String _fechaNacimiento) {
        this._fechaNacimiento = _fechaNacimiento;
    }

    public void setEdad(String _edad) {
        this._edad = _edad;
    }

    public void setGenero(String _genero) {
        this._genero = _genero;
    }

    public void setNumeroTelefonico(String _numeroTelefonico) {
        this._numeroTelefonico = _numeroTelefonico;
    }

    public void setEstadoCivil(String _estadoCivil) {
        this._estadoCivil = _estadoCivil;
    }

    public void setOcupacion(String _ocupacion) {
        this._ocupacion = _ocupacion;
    }

    public void setDireccionResidencia(String _direccionResidencia) {
        this._direccionResidencia = _direccionResidencia;
    }

    public void setCorreoElectronico(String _correoElectronico) {
        this._correoElectronico = _correoElectronico;
    }

    public void setNombreResponsable(String _nombreResponsable) {
        this._nombreResponsable = _nombreResponsable;
    }

    public void setNumeroTelefonicoR(String _numeroTelefonicoR) {
        this._numeroTelefonicoR = _numeroTelefonicoR;
    }

    public void setApellidoResponsable(String _ApellidoResponsable) {
        this._ApellidoResponsable = _ApellidoResponsable;
    }

    public void setRutaImagen(String _rutaImagen) {
        this._rutaImagen = _rutaImagen;
    }
    
    
    

}
