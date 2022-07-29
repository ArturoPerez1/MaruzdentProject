package packagePrincipal.vistaListaConsulta;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import packagePrincipal.modelo.CuentaPaciente;
import packagePrincipal.modelo.DatosConsulta;

public class FrameFiltroCedula extends javax.swing.JFrame {

    public FrameFiltroCedula() {
        initComponents();
    }

    public void LlenaComboBoxCedulas(ArrayList<DatosConsulta> citas) {
        for (int i = 0; i < citas.size(); i++) {
            _cbCedula.addItem(citas.get(i).getCedulaPaciente());
        }
    }

    public void LlenaComboBoxCedulasCuenta(ArrayList<CuentaPaciente> cuenta) {
        for (int i = 0; i < cuenta.size(); i++) {
            _cbCedula.addItem(cuenta.get(i).getCedulaAsociada());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        _cbCedula = new javax.swing.JComboBox<>();
        _botonObtenerCedula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(38, 166, 154));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/seleccionarCedula.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 137, 123));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _cbCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbCedulaActionPerformed(evt);
            }
        });
        jPanel2.add(_cbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 380, 50));

        _botonObtenerCedula.setBackground(new java.awt.Color(54, 203, 167));
        _botonObtenerCedula.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _botonObtenerCedula.setForeground(new java.awt.Color(255, 255, 255));
        _botonObtenerCedula.setText("FILTRAR");
        _botonObtenerCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        _botonObtenerCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(_botonObtenerCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 250, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 510, 250));

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

        setSize(new java.awt.Dimension(568, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void _cbCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulaActionPerformed
        _cedula = _cbCedula.getSelectedItem().toString();
    }//GEN-LAST:event__cbCedulaActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonObtenerCedula.addActionListener(listener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonObtenerCedula;
    javax.swing.JComboBox<String> _cbCedula;
    javax.swing.JLabel jLabel1;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    private String _cedula;

    public JComboBox<String> getCbCedula() {
        return _cbCedula;
    }

    public JButton getBotonObtenerCedula() {
        return _botonObtenerCedula;
    }

    public String getCedula() {
        return _cedula;
    }

}
