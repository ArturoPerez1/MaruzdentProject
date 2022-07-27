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

    public void LlenarTablaParcialMedico(ArrayList<DatosMedicos> registroMedicos, int i) {
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

        Object[] fila = {
            _registrarMedico.get(i).getNombreMedico(),
            _registrarMedico.get(i).getCedulaMedico(),
            _registrarMedico.get(i).getNumeroTelefonico(),
            _registrarMedico.get(i).getEspecialidad()};

        _model.addRow(fila);
        
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
                paciente.getNombre()+" "+paciente.getApellidos(),
                paciente.getCedula(),
                paciente.getNumeroTelefonico(),
                paciente.getCorreoElectronico()};

            _model.addRow(fila);
        }
        
        _jtDatosPaciente.setEnabled(false);

    }

    public void LlenarTablaParcialPaciente(ArrayList<DatosPaciente> registroPaciente, int i) {
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

        Object[] fila = {
            _registrarPaciente.get(i).getNombre()+" "+_registrarPaciente.get(i).getApellidos(),
            _registrarPaciente.get(i).getCedula(),
            _registrarPaciente.get(i).getNumeroTelefonico(),
            _registrarPaciente.get(i).getCorreoElectronico()};

        _model.addRow(fila);
        
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

    public void ErrorEstadoConsulta(boolean error) {
        if (error == true) {
            _cbEstadoConsulta.setBackground(Color.red);
        } else {
            _cbEstadoConsulta.setBackground(Color.white);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _lbLogo = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        _lbEstadoConsulta = new javax.swing.JLabel();
        _cbEstadoConsulta = new javax.swing.JComboBox<>();
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
        _botonRegistrar = new javax.swing.JButton();
        _lbAviso2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/agendarCita.png"))); // NOI18N
        add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        _lbEstadoConsulta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbEstadoConsulta.setForeground(new java.awt.Color(153, 255, 255));
        _lbEstadoConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lbEstadoConsulta.setText("ESTADO DE LA CITA");
        add(_lbEstadoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 240, 30));

        _cbEstadoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Creada", "No Creada", "Suspendida" }));
        _cbEstadoConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbEstadoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbEstadoConsultaActionPerformed(evt);
            }
        });
        add(_cbEstadoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 220, 40));

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

        _botonRegistrar.setBackground(new java.awt.Color(54, 203, 167));
        _botonRegistrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        _botonRegistrar.setText("REGISTRAR CONSULTA");
        _botonRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, 250, 40));

        _lbAviso2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 11)); // NOI18N
        _lbAviso2.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbAviso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 300, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void _cbCedulaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulaMedicoActionPerformed
        _cbCedulaMedico.setBackground(Color.white);
        _textoCedulaM = _cbCedulaMedico.getSelectedItem().toString();
    }//GEN-LAST:event__cbCedulaMedicoActionPerformed

    private void _cbEstadoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbEstadoConsultaActionPerformed
        _cbEstadoConsulta.setBackground(Color.white);
        _textoConsulta = _cbEstadoConsulta.getSelectedItem().toString();
    }//GEN-LAST:event__cbEstadoConsultaActionPerformed

    private void _cbCedulaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulaPacienteActionPerformed
        _cbCedulaPaciente.setBackground(Color.white);
        setAviso();
        _textoCedulaP = _cbCedulaPaciente.getSelectedItem().toString();
    }//GEN-LAST:event__cbCedulaPacienteActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonVolver.addActionListener(listener);
        _botonRegistrar.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonRegistrar;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _cbCedulaMedico;
    javax.swing.JComboBox<String> _cbCedulaPaciente;
    javax.swing.JComboBox<String> _cbEstadoConsulta;
    javax.swing.JTable _jtDatosMedico;
    javax.swing.JTable _jtDatosPaciente;
    javax.swing.JLabel _lbAviso2;
    javax.swing.JLabel _lbCedulaMedico;
    javax.swing.JLabel _lbCedulaPaciente;
    javax.swing.JLabel _lbDatosMedico;
    javax.swing.JLabel _lbDatosPaciente;
    javax.swing.JLabel _lbEstadoConsulta;
    javax.swing.JLabel _lbLogo;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    private String _textoCedulaP = "";
    private String _textoCedulaM = "";
    private String _textoConsulta = "";
    private ArrayList<DatosMedicos> _registrarMedico;
    private ArrayList<DatosPaciente> _registrarPaciente;
    private DefaultTableModel _model;

    public JButton getBotonRegistrar() {
        return _botonRegistrar;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public String getTextoCedulaP() {
        return _textoCedulaP;
    }

    public String getTextoCedulaM() {
        return _textoCedulaM;
    }

    public String getTextoConsulta() {
        return _textoConsulta;
    }

    public void setCbCedulaMedico() {
        this._cbCedulaMedico.setSelectedItem(" ");
    }

    public void setCbCedulaPaciente() {
        this._cbCedulaPaciente.setSelectedItem(" ");
    }

    public void setCbEstadoConsulta() {
        this._cbEstadoConsulta.setSelectedItem(" ");
    }

    public void setTextoCedulaP() {
        this._textoCedulaP = "";
    }

    public void setTextoCedulaM() {
        this._textoCedulaM = "";
    }

    public void setTextoConsulta() {
        this._textoConsulta = "";
    }

    public void AvisoCedulaAsociada() {
        this._lbAviso2.setText("ESTA CÉDULA YA TIENE UNA CONSULTA");
    }

    public void setAviso() {
        this._lbAviso2.setText("");
    }
}
