/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagePrincipal.vistaADatosMedicos;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class PanelADatosMedico extends javax.swing.JPanel {

    public PanelADatosMedico() {
        initComponents();
    }

    public void ErrorNombreMedico(boolean error) {
        if (error == true) {
            _ftNombreMedico.setBackground(Color.red);
        }
    }

    public void ErrorCedula(boolean error) {
        if (error == true) {
            _ftCedulaMedico.setBackground(Color.red);
        }
    }

    public void ErrorTelefono(boolean error) {
        if (error == true) {
            _ftTelefonoMedico.setBackground(Color.red);
        }
    }

    public void ErrorEspecialidad(boolean error) {
        if (error == true) {
            _cbEspecialidadMedico.setBackground(Color.red);
        } else {
            _cbEspecialidadMedico.setBackground(Color.white);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _lbLogo = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        _lbNombreMedico = new javax.swing.JLabel();
        _ftNombreMedico = new javax.swing.JTextField();
        _lbCedulaMedico = new javax.swing.JLabel();
        _ftCedulaMedico = new javax.swing.JTextField();
        _cbEspecialidadMedico = new javax.swing.JComboBox<>();
        _lbEspecialidad = new javax.swing.JLabel();
        _lbTelefonoMedico = new javax.swing.JLabel();
        _ftTelefonoMedico = new javax.swing.JTextField();
        _botonRegistrar = new javax.swing.JButton();
        _labelError1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 188, 156));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/datosMedico.png"))); // NOI18N
        add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        _botonVolver.setBackground(new java.awt.Color(54, 203, 167));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 60));

        _lbNombreMedico.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbNombreMedico.setForeground(new java.awt.Color(153, 255, 255));
        _lbNombreMedico.setText("NOMBRE Y DEL MÉDICO");
        add(_lbNombreMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 220, 30));

        _ftNombreMedico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _ftNombreMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _ftNombreMedicoKeyTyped(evt);
            }
        });
        add(_ftNombreMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 270, 40));

        _lbCedulaMedico.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbCedulaMedico.setForeground(new java.awt.Color(153, 255, 255));
        _lbCedulaMedico.setText("CÉDULA DEL MÉDICO");
        add(_lbCedulaMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, 30));

        _ftCedulaMedico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _ftCedulaMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _ftCedulaMedicoKeyTyped(evt);
            }
        });
        add(_ftCedulaMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 270, 40));

        _cbEspecialidadMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Odontólogo general", "Odontopediatra", "Ortodoncista", "Periodoncista", "Endodoncista", "Patólogo oral o Cirujano oral", "Prostodoncista" }));
        _cbEspecialidadMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbEspecialidadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbEspecialidadMedicoActionPerformed(evt);
            }
        });
        add(_cbEspecialidadMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 270, 40));

        _lbEspecialidad.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbEspecialidad.setForeground(new java.awt.Color(153, 255, 255));
        _lbEspecialidad.setText("ESPECIALIDAD DEL MÉDICO");
        add(_lbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 30));

        _lbTelefonoMedico.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbTelefonoMedico.setForeground(new java.awt.Color(153, 255, 255));
        _lbTelefonoMedico.setText("TELÉFONO MÉDICO");
        add(_lbTelefonoMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, 30));

        _ftTelefonoMedico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _ftTelefonoMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _ftTelefonoMedicoKeyTyped(evt);
            }
        });
        add(_ftTelefonoMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 270, 40));

        _botonRegistrar.setBackground(new java.awt.Color(54, 203, 167));
        _botonRegistrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        _botonRegistrar.setText("REGISTRAR MÉDICO");
        _botonRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        add(_botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 290, 60));

        _labelError1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _labelError1.setForeground(new java.awt.Color(255, 255, 255));
        add(_labelError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 280, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void _ftNombreMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftNombreMedicoKeyTyped
        _ftNombreMedico.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }

        if (c != ' ') {
            if (c == '0' || c < '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event__ftNombreMedicoKeyTyped

    private void _ftCedulaMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftCedulaMedicoKeyTyped
        _ftCedulaMedico.setBackground(Color.white);
        setLabelErrorCedula1();
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

    }//GEN-LAST:event__ftCedulaMedicoKeyTyped

    private void _ftTelefonoMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftTelefonoMedicoKeyTyped
        _ftTelefonoMedico.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event__ftTelefonoMedicoKeyTyped

    private void _cbEspecialidadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbEspecialidadMedicoActionPerformed
        _cbEspecialidadMedico.setBackground(Color.white);
        _textoEspecialidad = _cbEspecialidadMedico.getSelectedItem().toString();
    }//GEN-LAST:event__cbEspecialidadMedicoActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonVolver.addActionListener(listener);
        _botonRegistrar.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonRegistrar;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _cbEspecialidadMedico;
    javax.swing.JTextField _ftCedulaMedico;
    javax.swing.JTextField _ftNombreMedico;
    javax.swing.JTextField _ftTelefonoMedico;
    javax.swing.JLabel _labelError1;
    javax.swing.JLabel _lbCedulaMedico;
    javax.swing.JLabel _lbEspecialidad;
    javax.swing.JLabel _lbLogo;
    javax.swing.JLabel _lbNombreMedico;
    javax.swing.JLabel _lbTelefonoMedico;
    // End of variables declaration//GEN-END:variables
    private String _textoEspecialidad = "";

    public JButton getBotonRegistrar() {
        return _botonRegistrar;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public String getFtCedulaMedico() {
        return _ftCedulaMedico.getText();
    }

    public String getFtNombreMedico() {
        return _ftNombreMedico.getText();
    }

    public String getFtTelefonoMedico() {
        return _ftTelefonoMedico.getText();
    }

    public String getTextoEspecialidad() {
        return _textoEspecialidad;
    }

    public void setCbEspecialidadMedico() {
        this._cbEspecialidadMedico.setSelectedItem(" ");
    }

    public void setFtCedulaMedico() {
        this._ftCedulaMedico.setText("");
    }

    public void setFtNombreMedico() {
        this._ftNombreMedico.setText("");
    }

    public void setFtTelefonoMedico() {
        this._ftTelefonoMedico.setText("");
    }

    public void setTextoEspecialidad() {
        this._textoEspecialidad = "";
    }

    public void setLabelErrorCedula() {
        this._labelError1.setText("ESTA CÉDULA YA EXISTE");
    }

    public void setLabelErrorCedula1() {
        this._labelError1.setText("");
    }

}
