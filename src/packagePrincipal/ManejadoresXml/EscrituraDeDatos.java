package packagePrincipal.ManejadoresXml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import packagePrincipal.modelo.ContenedorSizeRegistros;
import packagePrincipal.modelo.RegistroCuentaPaciente;
import packagePrincipal.modelo.RegistroDatosConsulta;
import packagePrincipal.modelo.RegistroHistorialClinico;
import packagePrincipal.modelo.RegistroMedicos;
import packagePrincipal.modelo.RegistroPaciente;

public class EscrituraDeDatos {

    private boolean _pacienteGuardado;
    private boolean _medicoGuardado;
    private boolean _historialGuardado;
    private boolean _citaGuardado;
    private boolean _cuentaGuardado;
    private boolean _sizeRegistrosGuardados;

    public EscrituraDeDatos() {
    }

    public void InsertarDatosPaciente(RegistroPaciente pacientes) {
        try {
            JAXBContext context = JAXBContext.newInstance(RegistroPaciente.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            try {
                File file = new File("ArchivosXml/DatosPaciente.xml");
                File carpeta = file.getParentFile();
                if (!carpeta.exists()) {
                    carpeta.mkdirs();
                }
                marshaller.marshal(pacientes, new FileWriter(file));
                _pacienteGuardado = true;
            } catch (IOException ex) {
                Logger.getLogger(EscrituraDeDatos.class.getName()).log(Level.SEVERE, null, ex);
                _pacienteGuardado = false;
            }
        } catch (JAXBException ex) {
            Logger.getLogger(EscrituraDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void InsertarDatosMedico(RegistroMedicos medicos) {
        try {
            JAXBContext context = JAXBContext.newInstance(RegistroMedicos.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            try {
                File file = new File("ArchivosXml/DatosMedico.xml");
                File carpeta = file.getParentFile();
                if (!carpeta.exists()) {
                    carpeta.mkdirs();
                }
                marshaller.marshal(medicos, new FileWriter(file));
                _medicoGuardado = true;
            } catch (IOException ex) {
                Logger.getLogger(EscrituraDeDatos.class.getName()).log(Level.SEVERE, null, ex);
                _medicoGuardado = false;
            }
        } catch (JAXBException ex) {
            Logger.getLogger(EscrituraDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void InsertarDatosHistorial(RegistroHistorialClinico historial) {
        try {
            JAXBContext context = JAXBContext.newInstance(RegistroHistorialClinico.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            try {
                File file = new File("ArchivosXml/DatosHistorial.xml");
                File carpeta = file.getParentFile();
                if (!carpeta.exists()) {
                    carpeta.mkdirs();
                }
                marshaller.marshal(historial, new FileWriter(file));
                _historialGuardado = true;
            } catch (IOException ex) {
                Logger.getLogger(EscrituraDeDatos.class.getName()).log(Level.SEVERE, null, ex);
                _historialGuardado = false;
            }
        } catch (JAXBException ex) {
            Logger.getLogger(EscrituraDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void InsertarDatosCita(RegistroDatosConsulta citas) {
        try {
            JAXBContext context = JAXBContext.newInstance(RegistroDatosConsulta.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            try {
                File file = new File("ArchivosXml/DatosCitas.xml");
                File carpeta = file.getParentFile();
                if (!carpeta.exists()) {
                    carpeta.mkdirs();
                }
                marshaller.marshal(citas, new FileWriter(file));
                _citaGuardado = true;
            } catch (IOException ex) {
                Logger.getLogger(EscrituraDeDatos.class.getName()).log(Level.SEVERE, null, ex);
                _citaGuardado = false;
            }
        } catch (JAXBException ex) {
            Logger.getLogger(EscrituraDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void InsertarDatosCuenta(RegistroCuentaPaciente cuenta) {
        try {
            JAXBContext context = JAXBContext.newInstance(RegistroCuentaPaciente.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            try {
                File file = new File("ArchivosXml/DatosCuenta.xml");
                File carpeta = file.getParentFile();
                if (!carpeta.exists()) {
                    carpeta.mkdirs();
                }
                marshaller.marshal(cuenta, new FileWriter(file));
                _cuentaGuardado = true;
            } catch (IOException ex) {
                Logger.getLogger(EscrituraDeDatos.class.getName()).log(Level.SEVERE, null, ex);
                _cuentaGuardado = false;
            }
        } catch (JAXBException ex) {
            Logger.getLogger(EscrituraDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void InsertarDatosSizeRegistros(ContenedorSizeRegistros sizes) {
        try {
            JAXBContext context = JAXBContext.newInstance(ContenedorSizeRegistros.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            try {
                File file = new File("ArchivosXml/SizeRegistros.xml");
                File carpeta = file.getParentFile();
                if (!carpeta.exists()) {
                    carpeta.mkdirs();
                }
                marshaller.marshal(sizes, new FileWriter(file));
                _sizeRegistrosGuardados = true;
            } catch (IOException ex) {
                Logger.getLogger(EscrituraDeDatos.class.getName()).log(Level.SEVERE, null, ex);
                _sizeRegistrosGuardados = false;
            }
        } catch (JAXBException ex) {
            Logger.getLogger(EscrituraDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isPacienteGuardado() {
        return _pacienteGuardado;
    }

    public boolean isMedicoGuardado() {
        return _medicoGuardado;
    }

    public boolean isHistorialGuardado() {
        return _historialGuardado;
    }

    public boolean isCitaGuardado() {
        return _citaGuardado;
    }

    public boolean isCuentaGuardado() {
        return _cuentaGuardado;
    }

    public boolean isSizeRegistrosGuardados() {
        return _sizeRegistrosGuardados;
    }

}
