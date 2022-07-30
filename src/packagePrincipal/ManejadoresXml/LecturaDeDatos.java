package packagePrincipal.ManejadoresXml;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import packagePrincipal.modelo.RegistroCuentaPaciente;
import packagePrincipal.modelo.RegistroDatosConsulta;
import packagePrincipal.modelo.RegistroHistorialClinico;
import packagePrincipal.modelo.RegistroMedicos;
import packagePrincipal.modelo.RegistroPaciente;

public class LecturaDeDatos {

    public RegistroPaciente CargarDatosPaciente() {
        RegistroPaciente pacientes = null;

        try {
            JAXBContext context = JAXBContext.newInstance(RegistroPaciente.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            pacientes = (RegistroPaciente) unmarshaller.unmarshal(new File("ArchivosXml/DatosPaciente.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pacientes;
    }

    public RegistroMedicos CargarDatosMedico() {
        RegistroMedicos medicos = null;

        try {
            JAXBContext context = JAXBContext.newInstance(RegistroMedicos.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            medicos = (RegistroMedicos) unmarshaller.unmarshal(new File("ArchivosXml/DatosMedico.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return medicos;
    }

    public RegistroHistorialClinico CargarDatosHistorial() {
        RegistroHistorialClinico historial = null;

        try {
            JAXBContext context = JAXBContext.newInstance(RegistroHistorialClinico.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            historial = (RegistroHistorialClinico) unmarshaller.unmarshal(new File("ArchivosXml/DatosHistorial.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return historial;
    }

    public RegistroDatosConsulta CargarDatosCitas() {
        RegistroDatosConsulta citas = null;

        try {
            JAXBContext context = JAXBContext.newInstance(RegistroDatosConsulta.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            citas = (RegistroDatosConsulta) unmarshaller.unmarshal(new File("ArchivosXml/DatosCitas.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return citas;
    }

    public RegistroCuentaPaciente CargarCuentaPaciente() {
        RegistroCuentaPaciente cuenta = null;

        try {
            JAXBContext context = JAXBContext.newInstance(RegistroCuentaPaciente.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            cuenta = (RegistroCuentaPaciente) unmarshaller.unmarshal(new File("ArchivosXml/DatosCuenta.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cuenta;
    }

    public boolean ExisteElArchivoPacientes() {
        boolean existe = false;
        File file = new File("ArchivosXml/DatosPaciente.xml");

        existe = (file.length() == 0);

        return existe;
    }

    public boolean ExisteElArchivoMedico() {
        boolean existe = false;
        File file = new File("ArchivosXml/DatosMedico.xml");

        existe = (file.length() == 0);

        return existe;
    }

    public boolean ExisteElArchivoHistorial() {
        boolean existe = false;
        File file = new File("ArchivosXml/DatosHistorial.xml");

        existe = (file.length() == 0);

        return existe;
    }

    public boolean ExisteElArchivoCitas() {
        boolean existe = false;
        File file = new File("ArchivosXml/DatosCitas.xml");

        existe = (file.length() == 0);

        return existe;
    }

    public boolean ExisteElArchivoCuenta() {
        boolean existe = false;
        File file = new File("ArchivosXml/DatosCuenta.xml");

        existe = (file.length() == 0);

        return existe;
    }

}
