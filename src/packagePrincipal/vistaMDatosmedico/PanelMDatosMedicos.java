package packagePrincipal.vistaMDatosmedico;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import packagePrincipal.modelo.DatosMedicos;

public class PanelMDatosMedicos extends javax.swing.JPanel {

    public PanelMDatosMedicos() {
        initComponents();
    }

    public boolean FiltrarExtensionesFileChooser(String path) {
        String extension = "";
        boolean extensionValida = false;
        int posicionExtension = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '.') {
                posicionExtension = i + 1;
                break;
            }
        }

        for (int i = posicionExtension; i < path.length(); i++) {
            extension += path.charAt(i);
        }

        if (extension.equals("png") || extension.equals("jpg")) {
            extensionValida = true;
        }

        return extensionValida;
    }

    public void AgregarJFileChooser() {
        boolean extensionValida;
        JFileChooser jFChooser = new JFileChooser();
        jFChooser.setMultiSelectionEnabled(false);
        if (jFChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            extensionValida = FiltrarExtensionesFileChooser(jFChooser.getSelectedFile().toString());
            if (extensionValida == true) {
                _labelImagen.setIcon(new javax.swing.ImageIcon(jFChooser.getSelectedFile().toString()));
            } else {
                JOptionPane.showMessageDialog(null, "SOLO SON VÁLIDOS LOS ARCHIVOS CON \n EXTENSIÓN (.png ó .jpg)", "ERROR DE EXTENSIÓN", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void AgregarPanelModificadore() {
        _panelModificadores = new PanelModificadores();
        _panelModificadores.setSize(490, 570);
        _panelContendorModificadores.removeAll();
        _panelContendorModificadores.add(_panelModificadores, BorderLayout.CENTER);
        _panelContendorModificadores.revalidate();
        _panelContendorModificadores.repaint();
    }

    public void LlenarLabels(ArrayList<DatosMedicos> medico, int i) {
        _lbINFNombre.setText(medico.get(i).getNombreMedico());
        _lbINFCedula.setText(medico.get(i).getCedulaMedico());
        _lbINFTelefono.setText(medico.get(i).getNumeroTelefonico());
        _lbINFEspecialidad.setText(medico.get(i).getEspecialidad());
        URL imagenRegistro;
        URL defecto;
        try {
            imagenRegistro = new URL(medico.get(i).getRutaImagen());
            defecto = getClass().getResource("/packagePrincipal/assets/imagenesMedicos/IconoPorDefecto.jpg");
            if (imagenRegistro.equals(defecto)) {
                _labelImagen.setIcon(new javax.swing.ImageIcon(defecto));

            } else {
                _labelImagen.setIcon(new javax.swing.ImageIcon(imagenRegistro));
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(PanelMDatosMedicos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _botonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        _labelImagen = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        _lbFoto = new javax.swing.JLabel();
        _lbCedula = new javax.swing.JLabel();
        _lbTelefono = new javax.swing.JLabel();
        _lbEspecialidad = new javax.swing.JLabel();
        _lbINFNombre = new javax.swing.JLabel();
        _lbINFCedula = new javax.swing.JLabel();
        _lbINFTelefono = new javax.swing.JLabel();
        _lbINFEspecialidad = new javax.swing.JLabel();
        _panelContendorModificadores = new javax.swing.JPanel();
        _botonMImagen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/panelMDatosM.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, 110));
        add(_labelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 150));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("NOMBRE Y APELLIDO :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 30));

        _lbFoto.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        _lbFoto.setForeground(new java.awt.Color(153, 255, 255));
        _lbFoto.setText("FOTO DEL MÉDICO");
        add(_lbFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        _lbCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        _lbCedula.setForeground(new java.awt.Color(153, 255, 255));
        _lbCedula.setText("CÉDULA :");
        add(_lbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 30));

        _lbTelefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        _lbTelefono.setForeground(new java.awt.Color(153, 255, 255));
        _lbTelefono.setText("NÚMERO TELEFÓNICO :");
        add(_lbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, 30));

        _lbEspecialidad.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        _lbEspecialidad.setForeground(new java.awt.Color(153, 255, 255));
        _lbEspecialidad.setText("ESPECIALIDAD :");
        add(_lbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, 30));

        _lbINFNombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbINFNombre.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbINFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 370, 30));

        _lbINFCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbINFCedula.setForeground(new java.awt.Color(255, 255, 255));
        _lbINFCedula.setToolTipText("");
        add(_lbINFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 260, 30));

        _lbINFTelefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbINFTelefono.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbINFTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 320, 30));

        _lbINFEspecialidad.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbINFEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbINFEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 430, 30));

        _panelContendorModificadores.setBackground(new java.awt.Color(0, 137, 123));
        _panelContendorModificadores.setLayout(null);
        add(_panelContendorModificadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 490, 570));

        _botonMImagen.setBackground(new java.awt.Color(54, 203, 167));
        _botonMImagen.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _botonMImagen.setForeground(new java.awt.Color(255, 255, 255));
        _botonMImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/File-Explorer-fluent-icon.png"))); // NOI18N
        _botonMImagen.setText("MODIFICAR FOTO");
        _botonMImagen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonMImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonMImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 210, 40));

        jButton1.setBackground(new java.awt.Color(54, 203, 167));
        jButton1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AYUDA");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 55, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameAyuda ayuda = new FrameAyuda();
        ayuda.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void AddActionlistenerModificadores(ActionListener listener) {
        _panelModificadores.AddActionListener(listener);
    }

    public void AddActionListener(ActionListener listener) {
        _botonVolver.addActionListener(listener);
        _botonMImagen.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonMImagen;
    javax.swing.JButton _botonVolver;
    javax.swing.JLabel _labelImagen;
    javax.swing.JLabel _lbCedula;
    javax.swing.JLabel _lbEspecialidad;
    javax.swing.JLabel _lbFoto;
    javax.swing.JLabel _lbINFCedula;
    javax.swing.JLabel _lbINFEspecialidad;
    javax.swing.JLabel _lbINFNombre;
    javax.swing.JLabel _lbINFTelefono;
    javax.swing.JLabel _lbTelefono;
    javax.swing.JPanel _panelContendorModificadores;
    javax.swing.JButton jButton1;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
    private PanelModificadores _panelModificadores;

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public JButton getBotonMImagen() {
        return _botonMImagen;
    }

    public String getLabelImagen() {
        return _labelImagen.getIcon().toString();
    }

    public PanelModificadores getPanelModificadores() {
        return _panelModificadores;
    }

}
