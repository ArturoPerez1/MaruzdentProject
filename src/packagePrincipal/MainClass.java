package packagePrincipal;

import packagePrincipal.ManejadoresXml.LecturaDeDatos;
import packagePrincipal.ControladorMenu.ControladorMenu;
import packagePrincipal.ControladorRegistroPaciente.ControladorArraysList;
import packagePrincipal.modelo.ContenedorSizeRegistros;
import packagePrincipal.modelo.RegistroCuentaPaciente;
import packagePrincipal.modelo.RegistroDatosConsulta;
import packagePrincipal.modelo.RegistroHistorialClinico;
import packagePrincipal.modelo.RegistroMedicos;
import packagePrincipal.modelo.RegistroPaciente;
import packagePrincipal.vistaMenu.FrameContenedorMenu;

public class MainClass {

    public static RegistroPaciente CargarArchivoPaciente(LecturaDeDatos cargarDatos) {
        RegistroPaciente pacientes = null;
        pacientes = cargarDatos.CargarDatosPaciente();
        return pacientes;
    }

    public static RegistroMedicos CargarArchivoMedico(LecturaDeDatos cargarDatos) {
        RegistroMedicos medicos = null;
        medicos = cargarDatos.CargarDatosMedico();
        return medicos;
    }

    public static RegistroHistorialClinico CargarArchivoHistorial(LecturaDeDatos cargarDatos) {
        RegistroHistorialClinico histroial = null;
        histroial = cargarDatos.CargarDatosHistorial();
        return histroial;
    }

    public static RegistroDatosConsulta CargarArchivoCitas(LecturaDeDatos cargarDatos) {
        RegistroDatosConsulta citas = null;
        citas = cargarDatos.CargarDatosCitas();
        return citas;
    }

    public static RegistroCuentaPaciente CargarArchivoCuentaPaciente(LecturaDeDatos cargarDatos) {
        RegistroCuentaPaciente cuenta = null;
        cuenta = cargarDatos.CargarCuentaPaciente();
        return cuenta;
    }

    public static ContenedorSizeRegistros CargarArchivoSizes(LecturaDeDatos cargarDatos) {
        ContenedorSizeRegistros size = null;
        size = cargarDatos.CargarSizeRegistros();
        return size;
    }

    public static void main(String[] args) {
        LecturaDeDatos cargarDatos = new LecturaDeDatos();
        boolean pacienteE = cargarDatos.ExisteElArchivoPacientes();
        boolean medicoE = cargarDatos.ExisteElArchivoMedico();
        boolean historialE = cargarDatos.ExisteElArchivoHistorial();
        boolean citasE = cargarDatos.ExisteElArchivoCitas();
        boolean cuentaE = cargarDatos.ExisteElArchivoCuenta();
        boolean sizeE = cargarDatos.ExisteElArchivoSize();

        if (pacienteE == false && medicoE == false && historialE == false && citasE == false && cuentaE == false && sizeE == false) {
            FrameContenedorMenu frameContenedorMenu;
            frameContenedorMenu = new FrameContenedorMenu();
            frameContenedorMenu.setVisible(true);
            ContenedorSizeRegistros sizeRegistros = CargarArchivoSizes(cargarDatos);
            ControladorMenu controladorMenu;
            ControladorArraysList controladorArrayList = new ControladorArraysList();
            controladorArrayList.setRegistroPaciente(CargarArchivoPaciente(cargarDatos));
            controladorArrayList.setRegistroMedicos(CargarArchivoMedico(cargarDatos));
            controladorArrayList.setRegistroHistorial(CargarArchivoHistorial(cargarDatos));
            controladorArrayList.setRegistroConsulta(CargarArchivoCitas(cargarDatos));
            controladorArrayList.setRegistroCuenta(CargarArchivoCuentaPaciente(cargarDatos));
            controladorArrayList.setPrimerPaciente();
            controladorArrayList.setPrimerMedico();
            controladorArrayList.setPrimerHistorial();
            controladorArrayList.setPrimerConsulta1();
            controladorArrayList.setPrimerCuenta();
            controladorMenu = new ControladorMenu(frameContenedorMenu, controladorArrayList, sizeRegistros);
        } else {

            FrameContenedorMenu frameContendor;
            frameContendor = new FrameContenedorMenu();
            frameContendor.setVisible(true);

            ControladorMenu controladorMenu;
            controladorMenu = new ControladorMenu(frameContendor);
        }
    }

}
