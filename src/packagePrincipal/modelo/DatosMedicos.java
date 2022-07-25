package packagePrincipal.modelo;

public class DatosMedicos {

    private String _nombreMedico;
    private String _cedulaMedico;
    private String _especialidad;
    private String _numeroTelefonico;
    private String _rutaImagen;

    public DatosMedicos(String nombreMedico, String cedulaMedico, String especialidad, String numeroTelefonico, String rutaImagen) {
        this._nombreMedico = nombreMedico;
        this._cedulaMedico = cedulaMedico;
        this._especialidad = especialidad;
        this._numeroTelefonico = numeroTelefonico;
        this._rutaImagen = rutaImagen;
    }

    public String getNombreMedico() {
        return _nombreMedico;
    }

    public String getCedulaMedico() {
        return _cedulaMedico;
    }

    public String getEspecialidad() {
        return _especialidad;
    }

    public String getNumeroTelefonico() {
        return _numeroTelefonico;
    }

    public String getRutaImagen() {
        return _rutaImagen;
    }

    public void setRutaImagen(String _rutaImagen) {
        this._rutaImagen = _rutaImagen;
    }

    public void setNombreMedico(String _nombreMedico) {
        this._nombreMedico = _nombreMedico;
    }

    public void setCedulaMedico(String _cedulaMedico) {
        this._cedulaMedico = _cedulaMedico;
    }

    public void setEspecialidad(String _especialidad) {
        this._especialidad = _especialidad;
    }

    public void setNumeroTelefonico(String _numeroTelefonico) {
        this._numeroTelefonico = _numeroTelefonico;
    }

}
