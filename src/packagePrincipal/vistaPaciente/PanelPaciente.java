package packagePrincipal.vistaPaciente;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class PanelPaciente extends javax.swing.JPanel {

    public PanelPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        _botonADatosPaciente = new javax.swing.JButton();
        _botonAHistoriaClinica = new javax.swing.JButton();
        _botonACuentaPaciente = new javax.swing.JButton();
        _botonAConsulta = new javax.swing.JButton();
        _botonVolver = new javax.swing.JButton();
        _labelAvisos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 166, 154));
        setPreferredSize(new java.awt.Dimension(900, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 137, 123));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 121, 107));
        jPanel2.setLayout(null);

        _botonADatosPaciente.setBackground(new java.awt.Color(54, 203, 167));
        _botonADatosPaciente.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _botonADatosPaciente.setForeground(new java.awt.Color(255, 255, 255));
        _botonADatosPaciente.setText("AÑADIR DATOS PERSONALES");
        _botonADatosPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonADatosPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonADatosPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonADatosPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonADatosPacienteMouseExited(evt);
            }
        });
        jPanel2.add(_botonADatosPaciente);
        _botonADatosPaciente.setBounds(20, 20, 260, 50);

        _botonAHistoriaClinica.setBackground(new java.awt.Color(54, 203, 167));
        _botonAHistoriaClinica.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _botonAHistoriaClinica.setForeground(new java.awt.Color(255, 255, 255));
        _botonAHistoriaClinica.setText("AÑADIR HISTORIA CLÍLINICA");
        _botonAHistoriaClinica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonAHistoriaClinica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonAHistoriaClinica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonAHistoriaClinicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonAHistoriaClinicaMouseExited(evt);
            }
        });
        jPanel2.add(_botonAHistoriaClinica);
        _botonAHistoriaClinica.setBounds(20, 210, 260, 50);

        _botonACuentaPaciente.setBackground(new java.awt.Color(54, 203, 167));
        _botonACuentaPaciente.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _botonACuentaPaciente.setForeground(new java.awt.Color(255, 255, 255));
        _botonACuentaPaciente.setText("AÑADIR CUENTA PACIENTE");
        _botonACuentaPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonACuentaPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonACuentaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonACuentaPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonACuentaPacienteMouseExited(evt);
            }
        });
        jPanel2.add(_botonACuentaPaciente);
        _botonACuentaPaciente.setBounds(20, 570, 260, 50);

        _botonAConsulta.setBackground(new java.awt.Color(54, 203, 167));
        _botonAConsulta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _botonAConsulta.setForeground(new java.awt.Color(255, 255, 255));
        _botonAConsulta.setText("AÑADIR CITA");
        _botonAConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonAConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonAConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonAConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonAConsultaMouseExited(evt);
            }
        });
        jPanel2.add(_botonAConsulta);
        _botonAConsulta.setBounds(20, 380, 260, 50);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 310, 660));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 700));

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        _labelAvisos.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _labelAvisos.setForeground(new java.awt.Color(255, 255, 0));
        _labelAvisos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _labelAvisos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(_labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, 740, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/registroPaciente.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void _botonADatosPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonADatosPacienteMouseEntered
        _botonADatosPaciente.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonADatosPacienteMouseEntered

    private void _botonADatosPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonADatosPacienteMouseExited
        _botonADatosPaciente.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonADatosPacienteMouseExited

    private void _botonAHistoriaClinicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonAHistoriaClinicaMouseEntered
        _botonAHistoriaClinica.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonAHistoriaClinicaMouseEntered

    private void _botonAHistoriaClinicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonAHistoriaClinicaMouseExited
        _botonAHistoriaClinica.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonAHistoriaClinicaMouseExited

    private void _botonAConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonAConsultaMouseEntered
        _botonAConsulta.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonAConsultaMouseEntered

    private void _botonAConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonAConsultaMouseExited
        _botonAConsulta.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonAConsultaMouseExited

    private void _botonACuentaPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonACuentaPacienteMouseEntered
        _botonACuentaPaciente.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonACuentaPacienteMouseEntered

    private void _botonACuentaPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonACuentaPacienteMouseExited
        _botonACuentaPaciente.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonACuentaPacienteMouseExited

    public void AddActionListener(ActionListener listener) {
        _botonAConsulta.addActionListener(listener);
        _botonACuentaPaciente.addActionListener(listener);
        _botonADatosPaciente.addActionListener(listener);
        _botonAHistoriaClinica.addActionListener(listener);
        _botonVolver.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonAConsulta;
    javax.swing.JButton _botonACuentaPaciente;
    javax.swing.JButton _botonADatosPaciente;
    javax.swing.JButton _botonAHistoriaClinica;
    javax.swing.JButton _botonVolver;
    javax.swing.JLabel _labelAvisos;
    javax.swing.JLabel jLabel2;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public JButton getBotonAConsulta() {
        return _botonAConsulta;
    }

    public JButton getBotonACuentaPaciente() {
        return _botonACuentaPaciente;
    }

    public JButton getBotonADatosPaciente() {
        return _botonADatosPaciente;
    }

    public JButton getBotonAHistoriaClinica() {
        return _botonAHistoriaClinica;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public void AvisoAgregarPaciente() {
        this._labelAvisos.setText("POR FAVOR AGREGUE UN PACIENTE ANTES ");
    }

    public void AvisoFaltaHistorial() {
        this._labelAvisos.setText("AGREGUE UN HISTORIAL CLÍNICO ANTES");
    }

    public void Aviso1() {
        this._labelAvisos.setText("POR FAVOR AGREGUE UN PACIENTE Y UN HISTORIAL ANTES");
    }

    public void Aviso2() {
        this._labelAvisos.setText("POR FAVOR AGREGUE UN PACIENTE ANTES");
    }

    public void setLabelAviso() {
        this._labelAvisos.setText("");
    }

}
