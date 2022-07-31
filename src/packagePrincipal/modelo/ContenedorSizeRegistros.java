package packagePrincipal.modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "AlmacenamientoSizeRegistros")
@XmlType(propOrder = {"sizeRegistroPaciente", "sizeRegistroHistorial", "sizeRegistroCita", "sizeRegistroMedico",
    "sizeRegistroCuenta", "primerGuardado"})
public class ContenedorSizeRegistros {

    private int sizeRegistroPaciente;
    private int sizeRegistroHistorial;
    private int sizeRegistroCita;
    private int sizeRegistroMedico;
    private int sizeRegistroCuenta;
    private boolean primerGuardado;

    public ContenedorSizeRegistros() {
    }

    public ContenedorSizeRegistros(int sizeRegistroPaciente, int sizeRegistroHistorial, int sizeRegistroCita, int sizeRegistroMedico, int sizeReistroCuenta) {
        this.sizeRegistroPaciente = sizeRegistroPaciente;
        this.sizeRegistroHistorial = sizeRegistroHistorial;
        this.sizeRegistroCita = sizeRegistroCita;
        this.sizeRegistroMedico = sizeRegistroMedico;
        this.sizeRegistroCuenta = sizeReistroCuenta;
        this.primerGuardado = true;
    }

    public int getSizeRegistroPaciente() {
        return sizeRegistroPaciente;
    }

    public void setSizeRegistroPaciente(int sizeRegistroPaciente) {
        this.sizeRegistroPaciente = sizeRegistroPaciente;
    }

    public int getSizeRegistroHistorial() {
        return sizeRegistroHistorial;
    }

    public void setSizeRegistroHistorial(int sizeRegistroHistorial) {
        this.sizeRegistroHistorial = sizeRegistroHistorial;
    }

    public int getSizeRegistroCita() {
        return sizeRegistroCita;
    }

    public void setSizeRegistroCita(int sizeRegistroCita) {
        this.sizeRegistroCita = sizeRegistroCita;
    }

    public int getSizeRegistroMedico() {
        return sizeRegistroMedico;
    }

    public void setSizeRegistroMedico(int sizeRegistroMedico) {
        this.sizeRegistroMedico = sizeRegistroMedico;
    }

    public int getSizeRegistroCuenta() {
        return sizeRegistroCuenta;
    }

    public void setSizeRegistroCuenta(int sizeReistroCuenta) {
        this.sizeRegistroCuenta = sizeReistroCuenta;
    }

    @XmlAttribute(name = "primerGuardado")
    public boolean isPrimerGuardado() {
        return primerGuardado;
    }

    public void setPrimerGuardado(boolean primerGuardado) {
        this.primerGuardado = primerGuardado;
    }

}
