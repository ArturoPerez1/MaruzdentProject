package packagePrincipal.modelo;

public class DatosConsulta {

    private String _estadoConsulta;
    private DatosMedicos _medicoAsociado;
    private String _nombrePaciente;
    private String _cedulaPaciente;
    private String _fechaCita;
    private String _horaCita;

    public DatosConsulta(String estadoConsulta, DatosMedicos medicoAsociado, String nombrePaciente, String cedulaPaciente, String fechaCita, String horaCita) {
        this._estadoConsulta = estadoConsulta;
        this._medicoAsociado = medicoAsociado;
        this._cedulaPaciente = cedulaPaciente;
        this._nombrePaciente = nombrePaciente;
        this._fechaCita = fechaCita;
        this._horaCita = horaCita;
    }

    public String getEstadoConsulta() {
        return _estadoConsulta;
    }

    public DatosMedicos getMedicoAsociado() {
        return _medicoAsociado;
    }

    public String getNombrePaciente() {
        return _nombrePaciente;
    }

    public String getCedulaPaciente() {
        return _cedulaPaciente;
    }

    public String getFechaCita() {
        return _fechaCita;
    }

    public void setFechaCita(String _fechaCita) {
        this._fechaCita = _fechaCita;
    }

    public String getHoraCita() {
        return _horaCita;
    }

    public void setHoraCita(String _horaCita) {
        this._horaCita = _horaCita;
    }

    public void setEstadoConsulta(String _estadoConsulta) {
        this._estadoConsulta = _estadoConsulta;
    }

    public void setMedicoAsociado(DatosMedicos _medicoAsociado) {
        this._medicoAsociado = _medicoAsociado;
    }

    public void setNombrePaciente(String _nombrePaciente) {
        this._nombrePaciente = _nombrePaciente;
    }

    public void setCedulaPaciente(String _cedulaPaciente) {
        this._cedulaPaciente = _cedulaPaciente;
    }

}
