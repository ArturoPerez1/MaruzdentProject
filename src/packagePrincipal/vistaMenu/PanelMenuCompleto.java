package packagePrincipal.vistaMenu;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class PanelMenuCompleto extends javax.swing.JPanel {

    public PanelMenuCompleto() {
        initComponents();
    }

    public void AgregarVentanaMenu() {
        _panelMenu = new PanelBotonesMenu();
        _panelMenu.setSize(290, 580);
        _contenedorMenu.removeAll();
        _contenedorMenu.add(_panelMenu, BorderLayout.CENTER);
        _contenedorMenu.revalidate();
        _contenedorMenu.repaint();
    }

    public void OcularVentanaMenu() {
        _contenedorMenu.removeAll();
        _contenedorMenu.revalidate();
        _contenedorMenu.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _panel1 = new javax.swing.JPanel();
        _botonMenu = new javax.swing.JButton();
        _contenedorMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        _labelLogo = new javax.swing.JLabel();
        _botonClose = new javax.swing.JButton();
        _labelAviso = new javax.swing.JLabel();
        _labelAviso1Complemento = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 188, 156));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _panel1.setBackground(new java.awt.Color(22, 160, 133));
        _panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonMenu.setBackground(new java.awt.Color(22, 160, 133));
        _botonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/menu.png"))); // NOI18N
        _botonMenu.setBorder(null);
        _botonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _panel1.add(_botonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        _contenedorMenu.setBackground(new java.awt.Color(22, 160, 133));
        _contenedorMenu.setLayout(null);
        _panel1.add(_contenedorMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 290, 580));

        jLabel1.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU INTERACTIVO");
        _panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, 20));

        add(_panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 700));

        _labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/logoProyecto.png"))); // NOI18N
        add(_labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 570, 300));

        _botonClose.setBackground(new java.awt.Color(26, 188, 156));
        _botonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/.png"))); // NOI18N
        _botonClose.setBorder(null);
        _botonClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _botonCloseActionPerformed(evt);
            }
        });
        add(_botonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 0, 60, 50));

        _labelAviso.setFont(new java.awt.Font("Metropolis Black", 1, 12)); // NOI18N
        _labelAviso.setForeground(new java.awt.Color(255, 255, 255));
        _labelAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_labelAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 580, 30));

        _labelAviso1Complemento.setFont(new java.awt.Font("Metropolis Black", 1, 12)); // NOI18N
        _labelAviso1Complemento.setForeground(new java.awt.Color(255, 255, 255));
        _labelAviso1Complemento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_labelAviso1Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 570, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void _botonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__botonCloseActionPerformed
        System.exit(1);
    }//GEN-LAST:event__botonCloseActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonMenu.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonClose;
    javax.swing.JButton _botonMenu;
    javax.swing.JPanel _contenedorMenu;
    javax.swing.JLabel _labelAviso;
    javax.swing.JLabel _labelAviso1Complemento;
    javax.swing.JLabel _labelLogo;
    javax.swing.JPanel _panel1;
    javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    PanelBotonesMenu _panelMenu;

    public JButton getBotonMenu() {
        return _botonMenu;
    }

    public PanelBotonesMenu getPanelMenu() {
        return _panelMenu;
    }

    public void AvisoFaltaMedico() {
        this._labelAviso.setText("PARA PODER ACCEDER AL APARTADO DE PACIENTE NECESITA");
        this._labelAviso1Complemento.setText("AGREGAR SU LISTADO DE MÉDICOS EN DATOS CLINICA");
    }

    public void AvisoListaConsulta() {
        this._labelAviso.setText("AGREGUE UNA CONSULTA E HISTORIAL ANTES EN EL ");
        this._labelAviso1Complemento.setText("APARTADO DE PACIENTES");
    }

    public void AvisoListaConsulta1() {
        this._labelAviso.setText("AGREGUE UN HISTORIAL ANTES EN EL ");
        this._labelAviso1Complemento.setText("APARTADO DE PACIENTES");
    }

    public void AvisoListaConsulta2() {
        this._labelAviso.setText("AGREGUE UNA CITA ANTES EN EL ");
        this._labelAviso1Complemento.setText("APARTADO DE PACIENTES");
    }

    public void AvisoListaPaciente1() {
        this._labelAviso.setText("AGREGUE UN PACIENTE  ANTES EN ");
        this._labelAviso1Complemento.setText("EL APARTADO DE PACIENTES");
    }

    public void AvisoListaCuenta() {
        this._labelAviso.setText("AGREGUE UNA CUENTA ANTES EN ");
        this._labelAviso1Complemento.setText("EL APARTADO DE PACIENTES");
    }

    public void setLabelAvisos() {
        this._labelAviso.setText("");
        this._labelAviso1Complemento.setText("");
    }

}
