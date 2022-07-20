package packagePrincipal.modelo;

public class CuentaPaciente {
    private String _costoTotalTratamiento;
    private String _deudaTotalAcumulada;
    private String _costoConsulta;
    private String _cedulaAsociada;

    public CuentaPaciente(String costoTotalTratamiento, String deudaTotalAcumulada, String costoConsulta, String cedulaAsociada) {
        this._costoTotalTratamiento = costoTotalTratamiento;
        this._deudaTotalAcumulada = deudaTotalAcumulada;
        this._costoConsulta = costoConsulta;
        this._cedulaAsociada = cedulaAsociada;
    }

    public String getCostoTotalTratamiento() {
        return _costoTotalTratamiento;
    }

    public String getDeudaTotalAcumulada() {
        return _deudaTotalAcumulada;
    }

    public String getCostoConsulta() {
        return _costoConsulta;
    }

    public String getCedulaAsociada() {
        return _cedulaAsociada;
    }
    
    
       
}
