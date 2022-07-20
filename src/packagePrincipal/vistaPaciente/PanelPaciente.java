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
        _botonADatosPaciente = new javax.swing.JButton();
        _botonAHistoriaClinica = new javax.swing.JButton();
        _botonACuentaPaciente = new javax.swing.JButton();
        _botonAConsulta = new javax.swing.JButton();
        _botonVolver = new javax.swing.JButton();
        _labelLogo = new javax.swing.JLabel();
        _labelAvisos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 188, 156));
        setPreferredSize(new java.awt.Dimension(900, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 160, 133));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonADatosPaciente.setBackground(new java.awt.Color(54, 203, 167));
        _botonADatosPaciente.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _botonADatosPaciente.setForeground(new java.awt.Color(255, 255, 255));
        _botonADatosPaciente.setText("AÑADIR DATOS PERSONALES");
        _botonADatosPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonADatosPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(_botonADatosPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 260, 50));

        _botonAHistoriaClinica.setBackground(new java.awt.Color(54, 203, 167));
        _botonAHistoriaClinica.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _botonAHistoriaClinica.setForeground(new java.awt.Color(255, 255, 255));
        _botonAHistoriaClinica.setText("AÑADIR HISTORIA CLÍLINICA");
        _botonAHistoriaClinica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonAHistoriaClinica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(_botonAHistoriaClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 260, 50));

        _botonACuentaPaciente.setBackground(new java.awt.Color(54, 203, 167));
        _botonACuentaPaciente.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _botonACuentaPaciente.setForeground(new java.awt.Color(255, 255, 255));
        _botonACuentaPaciente.setText("AÑADIR CUENTA PACIENTE");
        _botonACuentaPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonACuentaPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(_botonACuentaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 260, 50));

        _botonAConsulta.setBackground(new java.awt.Color(54, 203, 167));
        _botonAConsulta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _botonAConsulta.setForeground(new java.awt.Color(255, 255, 255));
        _botonAConsulta.setText("AÑADIR CITA");
        _botonAConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonAConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(_botonAConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 260, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 700));

        _botonVolver.setBackground(new java.awt.Color(26, 188, 156));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 60));

        _labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/registroPaciente.png"))); // NOI18N
        add(_labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 590, 310));

        _labelAvisos.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _labelAvisos.setForeground(new java.awt.Color(255, 255, 255));
        _labelAvisos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _labelAvisos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(_labelAvisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 570, 20));
    }// </editor-fold>//GEN-END:initComponents

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
    javax.swing.JLabel _labelLogo;
    javax.swing.JPanel jPanel1;
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
        this._labelAvisos.setText("POR FAVOR AÑADA UN PACIENTE ANTES ");
    }

    public void AvisoFaltaConsulta() {
        this._labelAvisos.setText("AÑADA UNA cITA ANTES");
    }

    public void Aviso1() {
        this._labelAvisos.setText("POR FAVOR AÑADA UN PACIENTE ANTES Y TAMBIÉN UN ESTADO DE CITA");
    }

    public void Aviso2() {
        this._labelAvisos.setText("AÑADA UN PACIENTE");
    }

    public void setLabelAviso() {
        this._labelAvisos.setText("");
    }

}
