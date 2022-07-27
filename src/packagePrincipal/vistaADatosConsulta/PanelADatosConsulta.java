package packagePrincipal.vistaADatosConsulta;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import packagePrincipal.modelo.DatosMedicos;
import packagePrincipal.modelo.DatosPaciente;

public class PanelADatosConsulta extends javax.swing.JPanel {

    public PanelADatosConsulta() {
        initComponents();
    }

    public void AgregarVentanaAjustarFH() {
        _frameJFH = new FrameAjustarFechaHoraCita();
        _frameJFH.setVisible(true);
    }

    public void ObtenerTablaPacientePersonalizada() {
        _jtDatosPaciente.getTableHeader().setBackground(new Color(2, 119, 189));
        _jtDatosPaciente.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        _jtDatosPaciente.getTableHeader().setForeground(new Color(255, 255, 255));
        _jtDatosPaciente.setRowHeight(25);
    }

    public void ObtenerTablaMedicoPersonalizada() {
        _jtDatosMedico.getTableHeader().setBackground(new Color(2, 119, 189));
        _jtDatosMedico.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        _jtDatosMedico.getTableHeader().setForeground(new Color(255, 255, 255));
        _jtDatosMedico.setRowHeight(25);
    }

    public void LlenarCedulaM(ArrayList<DatosMedicos> registroMedicos) {
        _cbCedulaMedico.addItem(" ");
        for (DatosMedicos medico : registroMedicos) {
            _cbCedulaMedico.addItem(medico.getCedulaMedico());
        }
    }

    public void LlenarCedulaPaciente(ArrayList<DatosPaciente> registroPaciente) {
        _cbCedulaPaciente.addItem(" ");
        for (DatosPaciente paciente : registroPaciente) {
            _cbCedulaPaciente.addItem(paciente.getCedula());
        }
    }

    public void LlenarTablaGeneralMedico(ArrayList<DatosMedicos> registroMedicos) {
        _model = new DefaultTableModel();
        ObtenerTablaMedicoPersonalizada();
        _jtDatosMedico.setEnabled(true);
        this._registrarMedico = registroMedicos;

        _model.addColumn("NOMBRE Y APELLIDO");
        _model.addColumn("CÉDULA");
        _model.addColumn("TELÉFONO");
        _model.addColumn("ESPECIALIDAD");

        _jtDatosMedico.setModel(_model);

        _model.setRowCount(0);

        for (DatosMedicos medico : registroMedicos) {
            Object[] fila = {
                medico.getNombreMedico(),
                medico.getCedulaMedico(),
                medico.getNumeroTelefonico(),
                medico.getEspecialidad()};
            _model.addRow(fila);
        }

        _jtDatosMedico.setEnabled(false);
    }

    public void LlenarTablaGeneralPaciente(ArrayList<DatosPaciente> registroPaciente) {
        _model = new DefaultTableModel();
        ObtenerTablaPacientePersonalizada();
        _jtDatosPaciente.setEnabled(true);
        this._registrarPaciente = registroPaciente;

        _model.addColumn("NOMBRE Y APELLIDO");
        _model.addColumn("CÉDULA");
        _model.addColumn("TELÉFONO");
        _model.addColumn("CORREO");

        _jtDatosPaciente.setModel(_model);

        _model.setRowCount(0);

        for (DatosPaciente paciente : registroPaciente) {
            Object[] fila = {
                paciente.getNombre() + " " + paciente.getApellidos(),
                paciente.getCedula(),
                paciente.getNumeroTelefonico(),
                paciente.getCorreoElectronico()};

            _model.addRow(fila);
        }

        _jtDatosPaciente.setEnabled(false);

    }

    public void ErrorCedulaPaciente(boolean error) {
        if (error == true) {
            _cbCedulaPaciente.setBackground(Color.red);
        } else {
            _cbCedulaPaciente.setBackground(Color.white);
        }
    }

    public void ErrorCedulaMedico(boolean error) {
        if (error == true) {
            _cbCedulaMedico.setBackground(Color.red);
        } else {
            _cbCedulaMedico.setBackground(Color.white);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _lbLogo = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        _jtDatosMedico = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        _jtDatosPaciente = new javax.swing.JTable();
        _lbDatosMedico = new javax.swing.JLabel();
        _lbDatosPaciente = new javax.swing.JLabel();
        _lbCedulaMedico = new javax.swing.JLabel();
        _cbCedulaMedico = new javax.swing.JComboBox<>();
        _lbCedulaPaciente = new javax.swing.JLabel();
        _cbCedulaPaciente = new javax.swing.JComboBox<>();
        _lbAviso2 = new javax.swing.JLabel();
        _botonAgregarFechaHora = new javax.swing.JButton();
        _lbLogo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        _lbAvisoSFecha = new javax.swing.JLabel();
        _lbAvisoSCedulaM = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        _botonRegistrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/agendarCita.png"))); // NOI18N
        add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        _jtDatosMedico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _jtDatosMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE Y APELLIDO", "CÉDULA", "TELÉFONO", "ESPECIALIDAD"
            }
        ));
        _jtDatosMedico.setFocusable(false);
        _jtDatosMedico.setIntercellSpacing(new java.awt.Dimension(0, 0));
        _jtDatosMedico.setRowHeight(25);
        _jtDatosMedico.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(_jtDatosMedico);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 560, 250));

        _jtDatosPaciente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _jtDatosPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE Y APELLIDO", "CÉDULA", "TELÉFONO", "CORREO"
            }
        ));
        _jtDatosPaciente.setFocusable(false);
        _jtDatosPaciente.setIntercellSpacing(new java.awt.Dimension(0, 0));
        _jtDatosPaciente.setRowHeight(25);
        _jtDatosPaciente.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(_jtDatosPaciente);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 560, 250));

        _lbDatosMedico.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbDatosMedico.setForeground(new java.awt.Color(153, 255, 255));
        _lbDatosMedico.setText("DATOS MEDICOS REGISTRADOS");
        add(_lbDatosMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 310, 20));

        _lbDatosPaciente.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbDatosPaciente.setForeground(new java.awt.Color(153, 255, 255));
        _lbDatosPaciente.setText("DATOS PACIENTES REGISTRADOS");
        add(_lbDatosPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 310, 20));

        _lbCedulaMedico.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbCedulaMedico.setForeground(new java.awt.Color(153, 255, 255));
        _lbCedulaMedico.setText("CÉDULA MÉDICO ASOCIADO");
        add(_lbCedulaMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 270, 30));

        _cbCedulaMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbCedulaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbCedulaMedicoActionPerformed(evt);
            }
        });
        add(_cbCedulaMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 250, 40));

        _lbCedulaPaciente.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbCedulaPaciente.setForeground(new java.awt.Color(153, 255, 255));
        _lbCedulaPaciente.setText("CÉDULA PACIENTE ASOCIADO");
        add(_lbCedulaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 260, 30));

        _cbCedulaPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbCedulaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbCedulaPacienteActionPerformed(evt);
            }
        });
        add(_cbCedulaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, 240, 40));

        _lbAviso2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _lbAviso2.setForeground(new java.awt.Color(255, 255, 255));
        _lbAviso2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbAviso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 430, 20));

        _botonAgregarFechaHora.setBackground(new java.awt.Color(54, 203, 167));
        _botonAgregarFechaHora.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonAgregarFechaHora.setForeground(new java.awt.Color(255, 255, 255));
        _botonAgregarFechaHora.setText("AJUSTAR FECHA Y HORA");
        _botonAgregarFechaHora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonAgregarFechaHora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonAgregarFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 250, 40));

        _lbLogo1.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbLogo1.setForeground(new java.awt.Color(153, 255, 255));
        _lbLogo1.setText("AGREGAR FECHA Y HORA DE LA CITA");
        add(_lbLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 430, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 10, 160));

        _lbAvisoSFecha.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _lbAvisoSFecha.setForeground(new java.awt.Color(255, 255, 255));
        _lbAvisoSFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbAvisoSFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 410, 20));

        _lbAvisoSCedulaM.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _lbAvisoSCedulaM.setForeground(new java.awt.Color(255, 255, 255));
        _lbAvisoSCedulaM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbAvisoSCedulaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 370, 20));

        jPanel1.setBackground(new java.awt.Color(0, 121, 107));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonRegistrar.setBackground(new java.awt.Color(54, 203, 167));
        _botonRegistrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        _botonRegistrar.setText("REGISTRAR CONSULTA");
        _botonRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(_botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 290, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 610, 430, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void _cbCedulaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulaMedicoActionPerformed
        _cbCedulaMedico.setBackground(Color.white);
        QuitarAvisoSCedulaM();
        _textoCedulaM = _cbCedulaMedico.getSelectedItem().toString();
    }//GEN-LAST:event__cbCedulaMedicoActionPerformed

    private void _cbCedulaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulaPacienteActionPerformed
        _cbCedulaPaciente.setBackground(Color.white);
        setAviso();
        _textoCedulaP = _cbCedulaPaciente.getSelectedItem().toString();
    }//GEN-LAST:event__cbCedulaPacienteActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonVolver.addActionListener(listener);
        _botonRegistrar.addActionListener(listener);
        _botonAgregarFechaHora.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonAgregarFechaHora;
    javax.swing.JButton _botonRegistrar;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _cbCedulaMedico;
    javax.swing.JComboBox<String> _cbCedulaPaciente;
    javax.swing.JTable _jtDatosMedico;
    javax.swing.JTable _jtDatosPaciente;
    javax.swing.JLabel _lbAviso2;
    javax.swing.JLabel _lbAvisoSCedulaM;
    javax.swing.JLabel _lbAvisoSFecha;
    javax.swing.JLabel _lbCedulaMedico;
    javax.swing.JLabel _lbCedulaPaciente;
    javax.swing.JLabel _lbDatosMedico;
    javax.swing.JLabel _lbDatosPaciente;
    javax.swing.JLabel _lbLogo;
    javax.swing.JLabel _lbLogo1;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    private String _textoCedulaP = "";
    private String _textoCedulaM = "";
    private FrameAjustarFechaHoraCita _frameJFH;
    private ArrayList<DatosMedicos> _registrarMedico;
    private ArrayList<DatosPaciente> _registrarPaciente;
    private DefaultTableModel _model;

    public JButton getBotonRegistrar() {
        return _botonRegistrar;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public FrameAjustarFechaHoraCita getFrameJFH() {
        return _frameJFH;
    }

    public String getTextoCedulaP() {
        return _textoCedulaP;
    }

    public JButton getBotonAgregarFechaHora() {
        return _botonAgregarFechaHora;
    }

    public String getTextoCedulaM() {
        return _textoCedulaM;
    }

    public void setCbCedulaMedico() {
        this._cbCedulaMedico.setSelectedItem(" ");
    }

    public void setCbCedulaPaciente() {
        this._cbCedulaPaciente.setSelectedItem(" ");
    }

    public void setTextoCedulaP() {
        this._textoCedulaP = "";
    }

    public void setTextoCedulaM() {
        this._textoCedulaM = "";
    }

    public void AvisoCedulaAsociada() {
        this._lbAviso2.setText("ESTA CÉDULA YA TIENE UNA CITA ASOCIADA");
    }

    public void AvisoCedula() {
        this._lbAviso2.setText("SELECCIONE LA CÉDULA DE UN PACIENTE");
    }

    public void setAviso() {
        this._lbAviso2.setText("");
    }

    public void AvisoSFecha() {
        _lbAvisoSFecha.setText("SELECCIONE UNA FECHA PARA PODER AGREGAR UNA CITA");
    }

    public void QuitarAvisoSFecha() {
        _lbAvisoSFecha.setText("");
    }

    public void AvisoSCedulaM() {
        _lbAvisoSCedulaM.setText("SELECCIONE LA CÉDULA DE UN MÉDICO");
    }

    public void QuitarAvisoSCedulaM() {
        _lbAvisoSCedulaM.setText("");
    }
}
