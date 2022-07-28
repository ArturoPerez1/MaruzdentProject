package packagePrincipal.vistaACuenta;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextField;
import packagePrincipal.modelo.DatosPaciente;
import packagePrincipal.modelo.HistorialClinico;

public class FrameAgregarCuenta extends javax.swing.JFrame {

    public FrameAgregarCuenta() {
        initComponents();
        _textoTipoTratamiento = _cbTipoTratamiento.getSelectedItem().toString();
    }

    public void LlenarDatosPaciente(ArrayList<DatosPaciente> registroPaciente, int i, ArrayList<HistorialClinico> historial, int j) {
        _lbImagenPaciente.setIcon(new javax.swing.ImageIcon(registroPaciente.get(i).getRutaImagen()));
        _lbINFNombre.setText(registroPaciente.get(i).getNombre());
        _lbINFCedula.setText(registroPaciente.get(i).getCedula());
        _lbINFRazon.setText("\"" + historial.get(j).getRazonConsulta() + "\"");
    }

    public void ErrorPresupuesto(boolean error) {
        if (error == true) {
            _tfPresupuesto.setBackground(Color.red);
        }
    }

    public void ErrorCosto(boolean error) {
        if (error == true) {
            _tfCostoConsulta.setBackground(Color.red);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        _lbLogo = new javax.swing.JLabel();
        _logo1 = new javax.swing.JLabel();
        _tfPresupuesto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        _lbImagenPaciente = new javax.swing.JLabel();
        _lbnombre = new javax.swing.JLabel();
        _lbINFNombre = new javax.swing.JLabel();
        _lbCedula = new javax.swing.JLabel();
        _lbINFCedula = new javax.swing.JLabel();
        _lbRazonCita = new javax.swing.JLabel();
        _lbINFRazon = new javax.swing.JLabel();
        _logo2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        _lnbLogo3 = new javax.swing.JLabel();
        _tfCostoConsulta = new javax.swing.JTextField();
        _lbAvisoPresupuesto = new javax.swing.JLabel();
        _lbAvisoCostoConsulta = new javax.swing.JLabel();
        _lbTipoTratamiento = new javax.swing.JLabel();
        _cbTipoTratamiento = new javax.swing.JComboBox<>();
        _botonAgregarCuenta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 166, 154));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/agregarCuenta1.png"))); // NOI18N
        jPanel1.add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        _logo1.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _logo1.setForeground(new java.awt.Color(153, 255, 255));
        _logo1.setText("PRESUPUESTO DISPONIBLE DEL PACIENTE");
        jPanel1.add(_logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        _tfPresupuesto.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        _tfPresupuesto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfPresupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _tfPresupuestoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfPresupuestoKeyTyped(evt);
            }
        });
        jPanel1.add(_tfPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 330, 30));

        jPanel2.setBackground(new java.awt.Color(0, 121, 107));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(_lbImagenPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 150));

        _lbnombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbnombre.setForeground(new java.awt.Color(153, 255, 255));
        _lbnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lbnombre.setText("NOMBRE Y APELLIDO");
        jPanel2.add(_lbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, -1));

        _lbINFNombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbINFNombre.setForeground(new java.awt.Color(255, 255, 255));
        _lbINFNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(_lbINFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 20));

        _lbCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbCedula.setForeground(new java.awt.Color(153, 255, 255));
        _lbCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lbCedula.setText("CÉDULA ASOCIADA");
        jPanel2.add(_lbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        _lbINFCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbINFCedula.setForeground(new java.awt.Color(255, 255, 255));
        _lbINFCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(_lbINFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 20));

        _lbRazonCita.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbRazonCita.setForeground(new java.awt.Color(153, 255, 255));
        _lbRazonCita.setText("RAZÓN DE LA CONSULTA");
        jPanel2.add(_lbRazonCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        _lbINFRazon.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbINFRazon.setForeground(new java.awt.Color(255, 255, 255));
        _lbINFRazon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(_lbINFRazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 260, 410));

        _logo2.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _logo2.setForeground(new java.awt.Color(255, 255, 255));
        _logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _logo2.setText("DATOS DEL PACIENTE");
        jPanel1.add(_logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 300, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 10, 470));

        _lnbLogo3.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lnbLogo3.setForeground(new java.awt.Color(153, 255, 255));
        _lnbLogo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lnbLogo3.setText("COSTO DEL TRATAMIENTO");
        jPanel1.add(_lnbLogo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 260, 20));

        _tfCostoConsulta.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        _tfCostoConsulta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfCostoConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _tfCostoConsultaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfCostoConsultaKeyTyped(evt);
            }
        });
        jPanel1.add(_tfCostoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 210, 30));

        _lbAvisoPresupuesto.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _lbAvisoPresupuesto.setForeground(new java.awt.Color(255, 255, 255));
        _lbAvisoPresupuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(_lbAvisoPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 330, 20));

        _lbAvisoCostoConsulta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _lbAvisoCostoConsulta.setForeground(new java.awt.Color(255, 255, 255));
        _lbAvisoCostoConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(_lbAvisoCostoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 280, 20));

        _lbTipoTratamiento.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbTipoTratamiento.setForeground(new java.awt.Color(153, 255, 255));
        _lbTipoTratamiento.setText("TIPO DE TRATAMIENTO");
        jPanel1.add(_lbTipoTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, 20));

        _cbTipoTratamiento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _cbTipoTratamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRATAMIENTO ÚNICO", "TRATAMIENTO POR PARTES" }));
        _cbTipoTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbTipoTratamientoActionPerformed(evt);
            }
        });
        jPanel1.add(_cbTipoTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 230, 30));

        _botonAgregarCuenta.setBackground(new java.awt.Color(54, 203, 167));
        _botonAgregarCuenta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonAgregarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        _botonAgregarCuenta.setText("AGREGAR CUENTA");
        _botonAgregarCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonAgregarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(_botonAgregarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 290, 50));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 55, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(918, 747));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void _tfPresupuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfPresupuestoKeyTyped
        char c = evt.getKeyChar();
        _tfPresupuesto.setBackground(Color.white);
        QuitarAvisoPresupuesto();
        if ((c == '.') && _contDePuntos == 0) {
            _contDePuntos++;
        } else {
            if ((c == '.') && _contDePuntos == 1) {
                evt.consume();
            }
        }

        if (c != '.') {
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }

    }//GEN-LAST:event__tfPresupuestoKeyTyped

    private void _tfPresupuestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfPresupuestoKeyReleased
        String textoField = _tfPresupuesto.getText();
        int cont = 0;
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            for (int i = 0; i < textoField.length(); i++) {
                if (textoField.charAt(i) == '.') {
                    cont++;
                }
            }

            if (cont == 0) {
                _contDePuntos -= 1;
            }
        }
    }//GEN-LAST:event__tfPresupuestoKeyReleased

    private void _cbTipoTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbTipoTratamientoActionPerformed
        _textoTipoTratamiento = _cbTipoTratamiento.getSelectedItem().toString();
        if(_textoTipoTratamiento.equals("TRATAMIENTO ÚNICO")){
            QuitarAvisoPresupuesto();
        }
    }//GEN-LAST:event__cbTipoTratamientoActionPerformed

    private void _tfCostoConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfCostoConsultaKeyReleased
        String textoField = _tfCostoConsulta.getText();
        _tfCostoConsulta.setBackground(Color.white);
        QuitarAvisoCostoTratamiento();
        int cont = 0;
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            for (int i = 0; i < textoField.length(); i++) {
                if (textoField.charAt(i) == '.') {
                    cont++;
                }
            }

            if (cont == 0) {
                _contDePuntos -= 1;
            }
        }
    }//GEN-LAST:event__tfCostoConsultaKeyReleased

    private void _tfCostoConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfCostoConsultaKeyTyped
        char c = evt.getKeyChar();
        if ((c == '.') && _contDePuntos == 0) {
            _contDePuntos++;
        } else {
            if ((c == '.') && _contDePuntos == 1) {
                evt.consume();
            }
        }

        if (c != '.') {
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event__tfCostoConsultaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameAyuda ayuda = new FrameAyuda();
        ayuda.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonAgregarCuenta.addActionListener(listener);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonAgregarCuenta;
    javax.swing.JComboBox<String> _cbTipoTratamiento;
    javax.swing.JLabel _lbAvisoCostoConsulta;
    javax.swing.JLabel _lbAvisoPresupuesto;
    javax.swing.JLabel _lbCedula;
    javax.swing.JLabel _lbINFCedula;
    javax.swing.JLabel _lbINFNombre;
    javax.swing.JLabel _lbINFRazon;
    javax.swing.JLabel _lbImagenPaciente;
    javax.swing.JLabel _lbLogo;
    javax.swing.JLabel _lbRazonCita;
    javax.swing.JLabel _lbTipoTratamiento;
    javax.swing.JLabel _lbnombre;
    javax.swing.JLabel _lnbLogo3;
    javax.swing.JLabel _logo1;
    javax.swing.JLabel _logo2;
    javax.swing.JTextField _tfCostoConsulta;
    javax.swing.JTextField _tfPresupuesto;
    javax.swing.JButton jButton1;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    private int _contDePuntos = 0;
    private String _textoTipoTratamiento = "";

    public JButton getBotonAgregarCuenta() {
        return _botonAgregarCuenta;
    }

    public String getTfCostoConsulta() {
        return _tfCostoConsulta.getText();
    }

    public String getTfPresupuesto() {
        return _tfPresupuesto.getText();
    }
    
    public String getTextoTipoTratamiento() {
        return _textoTipoTratamiento;
    }

    public void AvisoCostoTratamiento() {
        _lbAvisoCostoConsulta.setText("COSTO VACÍO, AGREGUE UN COSTO");
    }

    public void QuitarAvisoCostoTratamiento() {
        _lbAvisoCostoConsulta.setText("");
    }

    public void AvisoPresupuesto() {
        _lbAvisoPresupuesto.setText("PRESUPUESTO VACÍO, AGREGUE UN PRESUPUESTO");
    }

    public void QuitarAvisoPresupuesto() {
        _lbAvisoPresupuesto.setText("");
    }

}
