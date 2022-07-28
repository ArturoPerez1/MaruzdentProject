package packagePrincipal.modelo;

public class CuentaPaciente {

    private String _costoTratamiento;
    private String _cedulaAsociada;
    private String _presupuestoPaciente;
    private String _tipoTratamiento;
    private boolean _tratamientoUnico;

    public CuentaPaciente(String costoTotalTratamiento, String cedulaAsociada, String presupuestoPaciente, String tipoTratamiento, boolean tratamientoUnico) {
        this._costoTratamiento = costoTotalTratamiento;
        this._cedulaAsociada = cedulaAsociada;
        this._presupuestoPaciente = presupuestoPaciente;
        this._tipoTratamiento = tipoTratamiento;
        this._tratamientoUnico = tratamientoUnico;
    }

    public String getCostoTratamiento() {
        return _costoTratamiento;
    }

    public void setCostoTratamiento(String _costoTratamiento) {
        this._costoTratamiento = _costoTratamiento;
    }

    public String getCedulaAsociada() {
        return _cedulaAsociada;
    }

    public void setCedulaAsociada(String _cedulaAsociada) {
        this._cedulaAsociada = _cedulaAsociada;
    }

    public String getPresupuestoPaciente() {
        return _presupuestoPaciente;
    }

    public void setPresupuestoPaciente(String _presupuestoPaciente) {
        this._presupuestoPaciente = _presupuestoPaciente;
    }

    public String getTipoTratamiento() {
        return _tipoTratamiento;
    }

    public void setTipoTratamiento(String _tipoTratamiento) {
        this._tipoTratamiento = _tipoTratamiento;
    }

    public boolean isTratamientoUnico() {
        return _tratamientoUnico;
    }

    public void setTratamientoUnico(boolean _tratamientoUnico) {
        this._tratamientoUnico = _tratamientoUnico;
    }

}
