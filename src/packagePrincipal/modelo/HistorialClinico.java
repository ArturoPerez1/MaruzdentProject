package packagePrincipal.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "historial")
@XmlType(propOrder = {"cedulaAsociada", "razonConsulta", "enfermedadActual", "antecedentesPersonales", "antecedentesFamiliares",
    "antecedentesPatologicos", "antecedentesFarmacologicos", "examenFisico", "tipoDeConsulta", "diagnostico", "planTratamiento"})
public class HistorialClinico {

    private String cedulaAsociada;
    private String razonConsulta;
    private String enfermedadActual;
    private String antecedentesPersonales;
    private String antecedentesFamiliares;
    private String antecedentesPatologicos;
    private String antecedentesFarmacologicos;
    private String examenFisico;
    private String tipoDeConsulta;
    private String diagnostico;
    private String planTratamiento;

    public HistorialClinico() {
    }

    public HistorialClinico(String razonConsulta, String enfermedadActual, String antecedentesPersonales, String antecedentesFamiliares,
            String antecedentesPatologicos, String antecedentesFarmacologicos, String examenFisico, String tipoDeConsulta,
            String diagnostico, String planTratamiento, String cedulaAsociada) {
        this.cedulaAsociada = cedulaAsociada;
        this.razonConsulta = razonConsulta;
        this.enfermedadActual = enfermedadActual;
        this.antecedentesPersonales = antecedentesPersonales;
        this.antecedentesFamiliares = antecedentesFamiliares;
        this.antecedentesPatologicos = antecedentesPatologicos;
        this.antecedentesFarmacologicos = antecedentesFarmacologicos;
        this.examenFisico = examenFisico;
        this.tipoDeConsulta = tipoDeConsulta;
        this.diagnostico = diagnostico;
        this.planTratamiento = planTratamiento;
    }

    @XmlAttribute(name = "cedulaAsociada")

    public String getCedulaAsociada() {
        return cedulaAsociada;
    }

    public void setCedulaAsociada(String cedulaAsociada) {
        this.cedulaAsociada = cedulaAsociada;
    }

    public String getRazonConsulta() {
        return razonConsulta;
    }

    public void setRazonConsulta(String razonConsulta) {
        this.razonConsulta = razonConsulta;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public String getAntecedentesPersonales() {
        return antecedentesPersonales;
    }

    public void setAntecedentesPersonales(String antecedentesPersonales) {
        this.antecedentesPersonales = antecedentesPersonales;
    }

    public String getAntecedentesFamiliares() {
        return antecedentesFamiliares;
    }

    public void setAntecedentesFamiliares(String antecedentesFamiliares) {
        this.antecedentesFamiliares = antecedentesFamiliares;
    }

    public String getAntecedentesPatologicos() {
        return antecedentesPatologicos;
    }

    public void setAntecedentesPatologicos(String antecedentesPatologicos) {
        this.antecedentesPatologicos = antecedentesPatologicos;
    }

    public String getAntecedentesFarmacologicos() {
        return antecedentesFarmacologicos;
    }

    public void setAntecedentesFarmacologicos(String antecedentesFarmacologicos) {
        this.antecedentesFarmacologicos = antecedentesFarmacologicos;
    }

    public String getExamenFisico() {
        return examenFisico;
    }

    public void setExamenFisico(String examenFisico) {
        this.examenFisico = examenFisico;
    }

    public String getTipoDeConsulta() {
        return tipoDeConsulta;
    }

    public void setTipoDeConsulta(String tipoDeConsulta) {
        this.tipoDeConsulta = tipoDeConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPlanTratamiento() {
        return planTratamiento;
    }

    public void setPlanTratamiento(String planTratamiento) {
        this.planTratamiento = planTratamiento;
    }


}
