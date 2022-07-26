package packagePrincipal.ventanaMDatosClinica;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class PanelMDatosClinica extends javax.swing.JPanel {

    public PanelMDatosClinica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _panelContenedorBotones = new javax.swing.JPanel();
        _botonADatosMedicos = new javax.swing.JButton();
        _botonMDatosMedico = new javax.swing.JButton();
        _lbLogo = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        _lbAviso1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _panelContenedorBotones.setBackground(new java.awt.Color(0, 137, 123));
        _panelContenedorBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonADatosMedicos.setBackground(new java.awt.Color(54, 203, 167));
        _botonADatosMedicos.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonADatosMedicos.setForeground(new java.awt.Color(255, 255, 255));
        _botonADatosMedicos.setText("AÑADIR DATOS MÉDICOS");
        _botonADatosMedicos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonADatosMedicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonADatosMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonADatosMedicosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonADatosMedicosMouseExited(evt);
            }
        });
        _panelContenedorBotones.add(_botonADatosMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 350, 48));

        _botonMDatosMedico.setBackground(new java.awt.Color(54, 203, 167));
        _botonMDatosMedico.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonMDatosMedico.setForeground(new java.awt.Color(255, 255, 255));
        _botonMDatosMedico.setText("MODIFICAR DATOS MÉDICOS");
        _botonMDatosMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonMDatosMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonMDatosMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonMDatosMedicoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonMDatosMedicoMouseExited(evt);
            }
        });
        _panelContenedorBotones.add(_botonMDatosMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 350, 48));

        add(_panelContenedorBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 700));

        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/logoProyecto.png"))); // NOI18N
        add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 650, 290));

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        _lbAviso1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbAviso1.setForeground(new java.awt.Color(255, 255, 255));
        _lbAviso1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbAviso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 640, 580, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void _botonADatosMedicosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonADatosMedicosMouseEntered
        _botonADatosMedicos.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonADatosMedicosMouseEntered

    private void _botonADatosMedicosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonADatosMedicosMouseExited
        _botonADatosMedicos.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonADatosMedicosMouseExited

    private void _botonMDatosMedicoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonMDatosMedicoMouseEntered
        _botonMDatosMedico.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonMDatosMedicoMouseEntered

    private void _botonMDatosMedicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonMDatosMedicoMouseExited
        _botonMDatosMedico.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonMDatosMedicoMouseExited

    public void AddActionListener(ActionListener listener) {
        _botonADatosMedicos.addActionListener(listener);
        _botonVolver.addActionListener(listener);
        _botonMDatosMedico.addActionListener(listener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonADatosMedicos;
    javax.swing.JButton _botonMDatosMedico;
    javax.swing.JButton _botonVolver;
    javax.swing.JLabel _lbAviso1;
    javax.swing.JLabel _lbLogo;
    javax.swing.JPanel _panelContenedorBotones;
    // End of variables declaration//GEN-END:variables

    public JButton getBotonADatosMedicos() {
        return _botonADatosMedicos;
    }

    public JButton getBotonMDatosMedico() {
        return _botonMDatosMedico;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public void AvisoFaltaMedico() {
        this._lbAviso1.setText("PADA PODER MODIFICAR AGREGUE UN MÉDICO A LA LISTA");
    }

    public void setAviso1() {
        this._lbAviso1.setText("");
    }

}
