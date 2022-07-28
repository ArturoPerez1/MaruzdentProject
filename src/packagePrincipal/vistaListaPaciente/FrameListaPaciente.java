package packagePrincipal.vistaListaPaciente;

import java.awt.BorderLayout;
import java.util.ArrayList;
import packagePrincipal.modelo.DatosPaciente;
import packagePrincipal.modelo.HistorialClinico;

public class FrameListaPaciente extends javax.swing.JFrame {

    public FrameListaPaciente() {
        initComponents();
    }

    public void AgregarVentaPacienteDetallado() {
        _panelPacienteDetallado = new PanelPacienteDetallado();
        _panelPacienteDetallado.setSize(1200, 700);
        _panelContenedor.removeAll();
        _panelContenedor.add(_panelPacienteDetallado, BorderLayout.CENTER);
        _panelContenedor.revalidate();
        _panelContenedor.repaint();
    }

    public void AgregarVentaListaPaciente() {
        _panelListaPaciente = new PanelListaPaciente();
        _panelListaPaciente.setSize(1200, 700);
        _panelContenedor.removeAll();
        _panelContenedor.add(_panelListaPaciente, BorderLayout.CENTER);
        _panelContenedor.revalidate();
        _panelContenedor.repaint();
    }

    public void AgregarVentaHistorialPaciente() {
        _panelHistorialPaciente = new PanelHistorialPaciente();
        _panelHistorialPaciente.setSize(1200, 700);
        _panelContenedor.removeAll();
        _panelContenedor.add(_panelHistorialPaciente, BorderLayout.CENTER);
        _panelContenedor.revalidate();
        _panelContenedor.repaint();
    }

    public void LlenarDatosPacienteDetallado(ArrayList<DatosPaciente> _registroPaciente, int i) {
        String nombres = _registroPaciente.get(i).getNombre();
        String apellidos = _registroPaciente.get(i).getApellidos();
        String Id = _registroPaciente.get(i).getCedula();
        String fechaNacimiento = _registroPaciente.get(i).getFechaNacimiento();
        String edad = _registroPaciente.get(i).getEdad();
        String genero = _registroPaciente.get(i).getGenero();
        String numeroTelefonico = _registroPaciente.get(i).getNumeroTelefonico();
        String estadoCivil = _registroPaciente.get(i).getEstadoCivil();
        String ocupacion = _registroPaciente.get(i).getOcupacion();
        String direccionResidencia = _registroPaciente.get(i).getDireccionResidencia();
        String correoElectronico = _registroPaciente.get(i).getCorreoElectronico();
        String nombreResponsable = _registroPaciente.get(i).getNombreResponsable();
        String numeroTelefonicoR = _registroPaciente.get(i).getNumeroTelefonicoR();
        String apellidoResponsable = _registroPaciente.get(i).getApellidoResponsable();
        String rutaImagen = _registroPaciente.get(i).getRutaImagen();

        _panelPacienteDetallado.setLbTNombre(nombres);
        _panelPacienteDetallado.setLbTNombreR(nombreResponsable);
        _panelPacienteDetallado.setLbTApellido(apellidos);
        _panelPacienteDetallado.setLbTApellidoR(apellidoResponsable);
        _panelPacienteDetallado.setLbTTelefono(numeroTelefonico);
        _panelPacienteDetallado.setLbTNumeroR(numeroTelefonicoR);
        _panelPacienteDetallado.setLbTCedula(Id);
        _panelPacienteDetallado.setLbTCorreo(correoElectronico);
        _panelPacienteDetallado.setLbTGenero(genero);
        _panelPacienteDetallado.setLbTEdad(edad);
        _panelPacienteDetallado.setLbTOcupacion(ocupacion);
        _panelPacienteDetallado.setLbTFechaNacimieto(fechaNacimiento);
        _panelPacienteDetallado.setaDireccionResidencial(direccionResidencia);
        _panelPacienteDetallado.setLbTEstadoCivil(estadoCivil);
        _panelPacienteDetallado.setLbImagen(rutaImagen);
    }

    public void LlenarHistorialPaciente(ArrayList<HistorialClinico> _registroHistorial, int i) {
        String razonConsulta = _registroHistorial.get(i).getRazonConsulta();
        String enfermedadActual = _registroHistorial.get(i).getEnfermedadActual();
        String antecedentesPersonales = _registroHistorial.get(i).getAntecedentesPersonales();
        String antecedentesFamiliares = _registroHistorial.get(i).getAntecedentesFamiliares();
        String antecedentesPatologicos = _registroHistorial.get(i).getAntecedentesPatologicos();
        String antecedentesFarmacologicos = _registroHistorial.get(i).getAntecedentesFarmacologicos();
        String examenFisico = _registroHistorial.get(i).getExamenFisico();
        String tipoDeConsulta = _registroHistorial.get(i).getTipoDeConsulta();
        String diagnostico = _registroHistorial.get(i).getDiagnostico();
        String planTratamiento = _registroHistorial.get(i).getPlanTratamiento();
        
        _panelHistorialPaciente.setaAnteFamiliares(antecedentesFamiliares);
        _panelHistorialPaciente.setaAnteFarmacologicos(antecedentesFarmacologicos);
        _panelHistorialPaciente.setaAntePatalogico(antecedentesPatologicos);
        _panelHistorialPaciente.setaAntePersonales(antecedentesPersonales);
        _panelHistorialPaciente.setaDiagnostico(diagnostico);
        _panelHistorialPaciente.setaEnfermedadActual(enfermedadActual);
        _panelHistorialPaciente.setaExamenFisico(examenFisico);
        _panelHistorialPaciente.setaPlanTratamiento(planTratamiento);
        _panelHistorialPaciente.setLbTRazonConsulta(razonConsulta);
        _panelHistorialPaciente.setLbTTipoConsulta(tipoDeConsulta);
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _panelContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        _panelContenedor.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1200, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel _panelContenedor;
    // End of variables declaration//GEN-END:variables
    private PanelListaPaciente _panelListaPaciente;
    private PanelPacienteDetallado _panelPacienteDetallado;
    private PanelHistorialPaciente _panelHistorialPaciente;

    public PanelListaPaciente getPanelListaPaciente() {
        return _panelListaPaciente;
    }

    public PanelHistorialPaciente getPanelHistorialPaciente() {
        return _panelHistorialPaciente;
    }

    public PanelPacienteDetallado getPanelPacienteDetallado() {
        return _panelPacienteDetallado;
    }

}
