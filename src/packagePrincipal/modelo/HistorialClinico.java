package packagePrincipal.modelo;

public class HistorialClinico {

    private String _razonConsulta;
    private String _enfermedadActual;
    private String _antecedentesPersonales;
    private String _antecedentesFamiliares;
    private String _antecedentesPatologicos;
    private String _antecedentesFarmacologicos;
    private String _examenFisico;
    private String _tipoDeConsulta;
    private String _diagnostico;
    private String _planTratamiento;
    private String _cedulaAsociada;

    public HistorialClinico(String razonConsulta, String enfermedadActual, String antecedentesPersonales, String antecedentesFamiliares,
            String antecedentesPatologicos, String antecedentesFarmacologicos, String examenFisico, String tipoDeConsulta,
            String diagnostico, String planTratamiento, String cedulaAsociada) {
        this._razonConsulta = razonConsulta;
        this._enfermedadActual = enfermedadActual;
        this._antecedentesPersonales = antecedentesPersonales;
        this._antecedentesFamiliares = antecedentesFamiliares;
        this._antecedentesPatologicos = antecedentesPatologicos;
        this._antecedentesFarmacologicos = antecedentesFarmacologicos;
        this._examenFisico = examenFisico;
        this._tipoDeConsulta = tipoDeConsulta;
        this._diagnostico = diagnostico;
        this._planTratamiento = planTratamiento;
        this._cedulaAsociada = cedulaAsociada;
    }

    public String getRazonConsulta() {
        return _razonConsulta;
    }

    public String getEnfermedadActual() {
        return _enfermedadActual;
    }

    public String getAntecedentesPersonales() {
        return _antecedentesPersonales;
    }

    public String getAntecedentesFamiliares() {
        return _antecedentesFamiliares;
    }

    public String getAntecedentesPatologicos() {
        return _antecedentesPatologicos;
    }

    public String getAntecedentesFarmacologicos() {
        return _antecedentesFarmacologicos;
    }

    public String getExamenFisico() {
        return _examenFisico;
    }

    public String getTipoDeConsulta() {
        return _tipoDeConsulta;
    }

    public String getDiagnostico() {
        return _diagnostico;
    }

    public String getPlanTratamiento() {
        return _planTratamiento;
    }

    public String getCedulaAsociada() {
        return _cedulaAsociada;
    }

}
