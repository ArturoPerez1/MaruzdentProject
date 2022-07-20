package packagePrincipal.modelo;

import java.util.Scanner;

public class MiniMenu {
 /*   
    int salir;
    Scanner sc;

    //VARIABLES PARA DATOS PERSONALES DEL PACIENTE
    private String _cedulaPaciente;
    private String _fechaActual;
    private String _numeroTPaciente;
    private String _nombrePaciente;
    private String _apellidoPaciente;
    private String _correoEPaciente;
    //VARIABLES DATOS CONSULTA
    private int _turnoConsulta;
    private String _razonConsulta;
    private boolean _estadoConsulta;
    private boolean _estadoPago;
    private FechaActual _obtenerFecha;
    
    public void Menu() {
        int turno = 1;
        boolean retornado;
        VerificarDatosPaciente verificar = new VerificarDatosPaciente();
        Paciente pacinte;
        RegistroPaciente registrar;
        registrar = new RegistroPaciente();
        _obtenerFecha = new FechaActual();
        _fechaActual = _obtenerFecha.ObtenerFechaActual();
        
        sc = new Scanner(System.in);
        
        do {
            do {
                System.out.println(" INTRODUCIR EL NOMBRE = ");
                _nombrePaciente = sc.nextLine();
                retornado = verificar.VerificarNombre(_nombrePaciente);
            } while (retornado != false);
            
            do {
                System.out.println("INTRODUCIR APELLIDO = ");
                _apellidoPaciente = sc.nextLine();
                retornado = verificar.VerificarApellido(_apellidoPaciente);
            } while (retornado != false);
            
            do {
                System.out.println("INTRODUCIR CEDULA = ");
                _cedulaPaciente = sc.nextLine();
                retornado = verificar.VerificarCedula(_cedulaPaciente);
            } while (retornado != false);
            
            do {
                System.out.println("INTRODUCIR NUMERO DE TELEFONO = ");
                _numeroTPaciente = sc.nextLine();
                retornado = verificar.VerificarTelefono(_numeroTPaciente);
            } while (retornado != false);
            
            do {
                System.out.println("INTRODUCIR CORREO ELECTRONICO");
                _correoEPaciente = sc.nextLine();
                retornado = verificar.VerificarCorreo(_correoEPaciente);
            } while (retornado != false);
            
            System.out.println("Turno = " + turno);
            _turnoConsulta = turno;
            
            do {
                System.out.println("INTRODUCIR RAZON DE CONSULTA");
                _razonConsulta = sc.nextLine();
                retornado = verificar.VerificarRazonConsulta(_razonConsulta);
            } while (retornado != false);
            
            System.out.println("QUIERE SALIR 1/SI CUALQUIER OTRO NUMERO NO = ");
            salir = Integer.valueOf(sc.nextLine());
            
            turno++;
            
            pacinte = new Paciente(_cedulaPaciente, _numeroTPaciente, _nombrePaciente, _apellidoPaciente, _correoEPaciente, _turnoConsulta, _razonConsulta, _estadoConsulta, _estadoPago);
            registrar.AgregarPaciente(pacinte);
        } while (salir != 1);
        
        for (int i = 0; i < registrar.getRegistroPacientes().size(); i++) {
            System.out.println("NOMBRE = " + registrar.getRegistroPacientes().get(i).getNombrePaciente());
            System.out.println("APELLIDO = " + registrar.getRegistroPacientes().get(i).getApellidoPaciente());
            System.out.println("CEDULA = " + registrar.getRegistroPacientes().get(i).getCedulaPaciente());
            System.out.println("TELEFONO = " + registrar.getRegistroPacientes().get(i).getNumeroTPaciente());
            System.out.println("CORREO = " + registrar.getRegistroPacientes().get(i).getCorreoEPaciente());
            System.out.println("TURNO = " + registrar.getRegistroPacientes().get(i).getTurnoConsulta());
            System.out.println("RAZON CONSULTA = " + registrar.getRegistroPacientes().get(i).getRazonConsulta());
            
        }
        
        System.out.println("Fecha Actual = " + _fechaActual);
        
    }
    */
}
