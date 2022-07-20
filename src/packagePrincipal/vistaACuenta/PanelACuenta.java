package packagePrincipal.vistaACuenta;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import packagePrincipal.modelo.DatosPaciente;

public class PanelACuenta extends javax.swing.JPanel {

    public PanelACuenta() {
        initComponents();
    }

    public void LlenaComboBoxCedulas(ArrayList<DatosPaciente> _registroPaciente) {
        _cbCedulaAsociada.addItem(" ");
        for (int i = 0; i < _registroPaciente.size(); i++) {
            _cbCedulaAsociada.addItem(_registroPaciente.get(i).getCedula());
        }
    }

    public void ErrorCuentaTratamiento(boolean error) {
        if (error == true) {
            _tfCTratamiento.setBackground(Color.red);
        }
    }

    public void ErrorCuntaConsulta(boolean error) {
        if (error == true) {
            _tfCConsulta.setBackground(Color.red);
        }
    }

    public void ErrorCedulaAsociada(boolean error) {
        if (error = true) {
            _cbCedulaAsociada.setBackground(Color.red);
        } else {
            _cbCedulaAsociada.setBackground(Color.white);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _lbCTretamiento = new javax.swing.JLabel();
        _tfCTratamiento = new javax.swing.JTextField();
        _lbCConsulta = new javax.swing.JLabel();
        _tfCConsulta = new javax.swing.JTextField();
        _lbCCedulaAsociada = new javax.swing.JLabel();
        _cbCedulaAsociada = new javax.swing.JComboBox<>();
        _botonRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        _labelError1 = new javax.swing.JLabel();
        _labelError2 = new javax.swing.JLabel();
        _labelCedulaRepetida = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 188, 156));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbCTretamiento.setBackground(new java.awt.Color(153, 255, 255));
        _lbCTretamiento.setFont(new java.awt.Font("Metropolis Black", 1, 36)); // NOI18N
        _lbCTretamiento.setForeground(new java.awt.Color(153, 255, 255));
        _lbCTretamiento.setText("COSTO DEL TRATAMIENTO");
        add(_lbCTretamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        _tfCTratamiento.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        _tfCTratamiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfCTratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfCTratamientoKeyTyped(evt);
            }
        });
        add(_tfCTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 300, 40));

        _lbCConsulta.setFont(new java.awt.Font("Metropolis Black", 1, 36)); // NOI18N
        _lbCConsulta.setForeground(new java.awt.Color(153, 255, 255));
        _lbCConsulta.setText("COSTO DE LA CONSULTA");
        add(_lbCConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        _tfCConsulta.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        _tfCConsulta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfCConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfCConsultaKeyTyped(evt);
            }
        });
        add(_tfCConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 300, 40));

        _lbCCedulaAsociada.setFont(new java.awt.Font("Metropolis Black", 1, 36)); // NOI18N
        _lbCCedulaAsociada.setForeground(new java.awt.Color(153, 255, 255));
        _lbCCedulaAsociada.setText("CÉDULA ASOCIADA AL PACIENTE");
        add(_lbCCedulaAsociada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        _cbCedulaAsociada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbCedulaAsociada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbCedulaAsociadaActionPerformed(evt);
            }
        });
        add(_cbCedulaAsociada, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 390, 50));

        _botonRegistrar.setBackground(new java.awt.Color(54, 203, 167));
        _botonRegistrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        _botonRegistrar.setText("REGISTRAR CUENTA");
        _botonRegistrar.setToolTipText("");
        _botonRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 630, 280, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/agregarCuenta.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, -1));

        _botonVolver.setBackground(new java.awt.Color(26, 188, 156));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 60));

        _labelError1.setFont(new java.awt.Font("Metropolis Black", 1, 12)); // NOI18N
        _labelError1.setForeground(new java.awt.Color(255, 255, 255));
        add(_labelError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 320, 30));

        _labelError2.setFont(new java.awt.Font("Metropolis Black", 1, 12)); // NOI18N
        _labelError2.setForeground(new java.awt.Color(255, 255, 255));
        add(_labelError2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 370, 30));

        _labelCedulaRepetida.setFont(new java.awt.Font("Metropolis Black", 1, 10)); // NOI18N
        _labelCedulaRepetida.setForeground(new java.awt.Color(255, 255, 255));
        add(_labelCedulaRepetida, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 560, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void _tfCTratamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfCTratamientoKeyTyped
        _tfCTratamiento.setBackground(Color.white);
        setAvisoDoblePunto();
        char c = evt.getKeyChar();
        if (c != '.') {
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event__tfCTratamientoKeyTyped

    private void _tfCConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfCConsultaKeyTyped
        _tfCConsulta.setBackground(Color.white);
        setAvisoDoblePunto1();
        char c = evt.getKeyChar();
        if (c != '.') {
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event__tfCConsultaKeyTyped

    private void _cbCedulaAsociadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulaAsociadaActionPerformed
        _cbCedulaAsociada.setBackground(Color.white);
        setLabelErrorCedula1();
        _textoCedula = _cbCedulaAsociada.getSelectedItem().toString();
    }//GEN-LAST:event__cbCedulaAsociadaActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonRegistrar.addActionListener(listener);
        _botonVolver.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonRegistrar;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _cbCedulaAsociada;
    javax.swing.JLabel _labelCedulaRepetida;
    javax.swing.JLabel _labelError1;
    javax.swing.JLabel _labelError2;
    javax.swing.JLabel _lbCCedulaAsociada;
    javax.swing.JLabel _lbCConsulta;
    javax.swing.JLabel _lbCTretamiento;
    javax.swing.JTextField _tfCConsulta;
    javax.swing.JTextField _tfCTratamiento;
    javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private String _textoCedula = "";

    public JButton getBotonRegistrar() {
        return _botonRegistrar;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public String getTfCConsulta() {
        return _tfCConsulta.getText();
    }

    public String getTfCTratamiento() {
        return _tfCTratamiento.getText();
    }

    public String getTextoCedula() {
        return _textoCedula;
    }

    public void setCbCedulaAsociada() {
        this._cbCedulaAsociada.setSelectedItem(" ");
    }

    public void setTfCConsulta() {
        this._tfCConsulta.setText("");
    }

    public void setTfCTratamiento() {
        this._tfCTratamiento.setText("");
    }

    public void setTextoCedula() {
        this._textoCedula = "";
    }

    public void AvisoDoblePunto() {
        this._labelError1.setText("NO PUEDES INTRODUCIR MÁS DE UN PUNTO");
    }

    public void setAvisoDoblePunto() {
        this._labelError1.setText("");
    }

    public void AvisoDoblePunto1() {
        this._labelError2.setText("NO PUEDES INTRODUCIR MÁS DE UN PUNTO");
    }

    public void setAvisoDoblePunto1() {
        this._labelError2.setText("");
    }

    public void setLabelErrorCedula() {
        this._labelCedulaRepetida.setText("ESTA CÉDULA YA ESTÁ ASOCIADA A LA CUENTRA DE UN PACIENTE");
    }

    public void setLabelErrorCedula1() {
        this._labelCedulaRepetida.setText("");
    }
}
