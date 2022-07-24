package packagePrincipal.vistaMenu;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class PanelBotonesMenu extends javax.swing.JPanel {

    public PanelBotonesMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _botonPaciente = new javax.swing.JButton();
        _botonListaP = new javax.swing.JButton();
        _botonPagos = new javax.swing.JButton();
        _botonListaC = new javax.swing.JButton();
        _botonMDatosClinica = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 121, 107));
        setPreferredSize(new java.awt.Dimension(290, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonPaciente.setBackground(new java.awt.Color(54, 203, 167));
        _botonPaciente.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonPaciente.setForeground(new java.awt.Color(255, 255, 255));
        _botonPaciente.setText("PACIENTE");
        _botonPaciente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonPacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonPacienteMouseExited(evt);
            }
        });
        add(_botonPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 270, 48));

        _botonListaP.setBackground(new java.awt.Color(54, 203, 167));
        _botonListaP.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonListaP.setForeground(new java.awt.Color(255, 255, 255));
        _botonListaP.setText("LISTA PACIENTES");
        _botonListaP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonListaP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonListaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonListaPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonListaPMouseExited(evt);
            }
        });
        add(_botonListaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 270, 48));

        _botonPagos.setBackground(new java.awt.Color(54, 203, 167));
        _botonPagos.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonPagos.setForeground(new java.awt.Color(255, 255, 255));
        _botonPagos.setText("PAGOS");
        _botonPagos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonPagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonPagosMouseExited(evt);
            }
        });
        add(_botonPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 270, 48));

        _botonListaC.setBackground(new java.awt.Color(54, 203, 167));
        _botonListaC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonListaC.setForeground(new java.awt.Color(255, 255, 255));
        _botonListaC.setText("LISTA CITAS");
        _botonListaC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonListaC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonListaC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonListaCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonListaCMouseExited(evt);
            }
        });
        add(_botonListaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 270, 48));

        _botonMDatosClinica.setBackground(new java.awt.Color(54, 203, 167));
        _botonMDatosClinica.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonMDatosClinica.setForeground(new java.awt.Color(255, 255, 255));
        _botonMDatosClinica.setText(" DATOS CLINICA");
        _botonMDatosClinica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonMDatosClinica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonMDatosClinica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonMDatosClinicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonMDatosClinicaMouseExited(evt);
            }
        });
        add(_botonMDatosClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 270, 48));
    }// </editor-fold>//GEN-END:initComponents

    private void _botonPacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonPacienteMouseEntered
        _botonPaciente.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonPacienteMouseEntered

    private void _botonPacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonPacienteMouseExited
        _botonPaciente.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonPacienteMouseExited

    private void _botonListaPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonListaPMouseEntered
        _botonListaP.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonListaPMouseEntered

    private void _botonListaPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonListaPMouseExited
        _botonListaP.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonListaPMouseExited

    private void _botonListaCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonListaCMouseEntered
        _botonListaC.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonListaCMouseEntered

    private void _botonListaCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonListaCMouseExited
        _botonListaC.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonListaCMouseExited

    private void _botonMDatosClinicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonMDatosClinicaMouseEntered
        _botonMDatosClinica.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonMDatosClinicaMouseEntered

    private void _botonMDatosClinicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonMDatosClinicaMouseExited
        _botonMDatosClinica.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonMDatosClinicaMouseExited

    private void _botonPagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonPagosMouseEntered
        _botonPagos.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonPagosMouseEntered

    private void _botonPagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonPagosMouseExited
        _botonPagos.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonPagosMouseExited

    public void AddActionListener(ActionListener listener) {
        _botonListaC.addActionListener(listener);
        _botonListaP.addActionListener(listener);
        _botonPaciente.addActionListener(listener);
        _botonPagos.addActionListener(listener);
        _botonMDatosClinica.addActionListener(listener);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonListaC;
    javax.swing.JButton _botonListaP;
    javax.swing.JButton _botonMDatosClinica;
    javax.swing.JButton _botonPaciente;
    javax.swing.JButton _botonPagos;
    // End of variables declaration//GEN-END:variables

    public JButton getBotonListaC() {
        return _botonListaC;
    }

    public JButton getBotonListaP() {
        return _botonListaP;
    }

    public JButton getBotonPaciente() {
        return _botonPaciente;
    }

    public JButton getBotonPagos() {
        return _botonPagos;
    }

    public JButton getBotonMDatosClinica() {
        return _botonMDatosClinica;
    }

}
