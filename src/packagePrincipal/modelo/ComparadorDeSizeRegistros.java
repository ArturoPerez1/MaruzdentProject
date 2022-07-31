package packagePrincipal.modelo;

public class ComparadorDeSizeRegistros {

    private RegistroCuentaPaciente registroCuenta;
    private RegistroMedicos registroMedico;
    private RegistroHistorialClinico registroHistorial;
    private RegistroPaciente registroPaciente;
    private RegistroDatosConsulta registroCita;
    private ContenedorSizeRegistros sizeRegistros;

    public ComparadorDeSizeRegistros() {
    }

    public ComparadorDeSizeRegistros(RegistroCuentaPaciente registroCuenta, RegistroMedicos registroMedico, RegistroHistorialClinico registroHistorial, RegistroPaciente registroPaciente, RegistroDatosConsulta registroCita, ContenedorSizeRegistros sizeRegistros) {
        this.registroCuenta = registroCuenta;
        this.registroMedico = registroMedico;
        this.registroHistorial = registroHistorial;
        this.registroPaciente = registroPaciente;
        this.registroCita = registroCita;
        this.sizeRegistros = sizeRegistros;
    }

    public boolean CompararSizeRegistroPaciente() {
        boolean retornar;
        int size = sizeRegistros.getSizeRegistroPaciente();
        int sizeRegistro = registroPaciente.getRegistroPacientes().size();
        retornar = (sizeRegistro > size) || (sizeRegistro < size);

        return retornar;
    }

    public boolean CompararSizeRegistroHistorial() {
        boolean retornar;
        int size = sizeRegistros.getSizeRegistroHistorial();
        int sizeRegistro = registroHistorial.getRegistroHistorial().size();
        retornar = (sizeRegistro > size) || (sizeRegistro < size);

        return retornar;
    }

    public boolean CompararSizeRegistroCuenta() {
        boolean retornar;
        int size = sizeRegistros.getSizeRegistroCuenta();
        int sizeRegistro = registroCuenta.getRegistroCuenta().size();
        retornar = (sizeRegistro > size) || (sizeRegistro < size);

        return retornar;
    }

    public boolean CompararSizeRegistroCita() {
        boolean retornar;
        int size = sizeRegistros.getSizeRegistroCita();
        int sizeRegistro = registroCita.getRegistroConsulta().size();
        retornar = (sizeRegistro > size) || (sizeRegistro < size);

        return retornar;
    }

    public boolean CompararSizeRegistroMedico() {
        boolean retornar;
        int size = sizeRegistros.getSizeRegistroMedico();
        int sizeRegistro = registroMedico.getRegistroMedicos().size();
        retornar = (sizeRegistro > size) || (sizeRegistro < size);

        return retornar;
    }

    public RegistroCuentaPaciente getRegistroCuenta() {
        return registroCuenta;
    }

    public void setRegistroCuenta(RegistroCuentaPaciente registroCuenta) {
        this.registroCuenta = registroCuenta;
    }

    public RegistroMedicos getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(RegistroMedicos registroMedico) {
        this.registroMedico = registroMedico;
    }

    public RegistroHistorialClinico getRegistroHistorial() {
        return registroHistorial;
    }

    public void setRegistroHistorial(RegistroHistorialClinico registroHistorial) {
        this.registroHistorial = registroHistorial;
    }

    public RegistroPaciente getRegistroPaciente() {
        return registroPaciente;
    }

    public void setRegistroPaciente(RegistroPaciente registroPaciente) {
        this.registroPaciente = registroPaciente;
    }

    public RegistroDatosConsulta getRegistroCita() {
        return registroCita;
    }

    public void setRegistroCita(RegistroDatosConsulta registroCita) {
        this.registroCita = registroCita;
    }

    public ContenedorSizeRegistros getSizeRegistros() {
        return sizeRegistros;
    }

    public void setSizeRegistros(ContenedorSizeRegistros sizeRegistros) {
        this.sizeRegistros = sizeRegistros;
    }

}
