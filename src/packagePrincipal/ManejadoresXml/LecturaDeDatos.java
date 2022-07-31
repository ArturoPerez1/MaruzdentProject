package packagePrincipal.ManejadoresXml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import packagePrincipal.modelo.ContenedorSizeRegistros;
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
            try {
                pacientes = (RegistroPaciente) unmarshaller.unmarshal(new FileInputStream("ArchivosXml/DatosPaciente.xml"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            try {
                medicos = (RegistroMedicos) unmarshaller.unmarshal(new FileInputStream("ArchivosXml/DatosMedico.xml"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            try {
                historial = (RegistroHistorialClinico) unmarshaller.unmarshal(new FileInputStream("ArchivosXml/DatosHistorial.xml"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            try {
                citas = (RegistroDatosConsulta) unmarshaller.unmarshal(new FileInputStream("ArchivosXml/DatosCitas.xml"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            try {
                cuenta = (RegistroCuentaPaciente) unmarshaller.unmarshal(new FileInputStream("ArchivosXml/DatosCuenta.xml"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (JAXBException ex) {
            Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cuenta;
    }

    public ContenedorSizeRegistros CargarSizeRegistros() {
        ContenedorSizeRegistros sizeRegistros = null;

        try {
            JAXBContext context = JAXBContext.newInstance(ContenedorSizeRegistros.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            try {
                sizeRegistros = (ContenedorSizeRegistros) unmarshaller.unmarshal(new FileInputStream("ArchivosXml/SizeRegistros.xml"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (JAXBException ex) {
            Logger.getLogger(LecturaDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sizeRegistros;
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

    public boolean ExisteElArchivoSize() {
        boolean existe = false;
        File file = new File("ArchivosXml/SizeRegistros.xml");

        existe = (file.length() == 0);

        return existe;
    }

}
