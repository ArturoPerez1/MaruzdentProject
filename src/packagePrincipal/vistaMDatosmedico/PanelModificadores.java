/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagePrincipal.vistaMDatosmedico;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class PanelModificadores extends javax.swing.JPanel {

    public PanelModificadores() {
        initComponents();
    }

    public void ErrorNombre(boolean error) {
        if (error == true) {
            _ftMNombre.setBackground(Color.red);
        }
    }

    public void ErrorCedula(boolean error) {
        if (error == true) {
            _ftMCedula.setBackground(Color.red);
        }
    }

    public void ErrorTelefono(boolean error) {
        if (error == true) {
            _ftMTelefono.setBackground(Color.red);
        }
    }

    public void ErrorEspecialidad(boolean error) {
        if (error == true) {
            _cBMEspecialidad.setBackground(Color.red);
        } else {
            _cBMEspecialidad.setBackground(Color.white);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _lbModificarNombre = new javax.swing.JLabel();
        _ftMNombre = new javax.swing.JTextField();
        _lbModificarCedula = new javax.swing.JLabel();
        _ftMCedula = new javax.swing.JTextField();
        _lbModificarTelefono = new javax.swing.JLabel();
        _ftMTelefono = new javax.swing.JTextField();
        _lbModificarEspecialidad = new javax.swing.JLabel();
        _botonMNombre = new javax.swing.JButton();
        _botonMCedula = new javax.swing.JButton();
        _botonMTelefono = new javax.swing.JButton();
        _botonMEspecialidad = new javax.swing.JButton();
        _cBMEspecialidad = new javax.swing.JComboBox<>();
        _lbAviso1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(22, 160, 133));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbModificarNombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbModificarNombre.setForeground(new java.awt.Color(153, 255, 255));
        _lbModificarNombre.setText("MODIFICAR NOMBRE");
        add(_lbModificarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        _ftMNombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _ftMNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _ftMNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _ftMNombreKeyTyped(evt);
            }
        });
        add(_ftMNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 30));

        _lbModificarCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbModificarCedula.setForeground(new java.awt.Color(153, 255, 255));
        _lbModificarCedula.setText("MODIFICAR CÉDULA");
        add(_lbModificarCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        _ftMCedula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _ftMCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _ftMCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _ftMCedulaKeyTyped(evt);
            }
        });
        add(_ftMCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 210, 30));

        _lbModificarTelefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbModificarTelefono.setForeground(new java.awt.Color(153, 255, 255));
        _lbModificarTelefono.setText("MODIFICAR TELÉFONO");
        add(_lbModificarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        _ftMTelefono.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _ftMTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _ftMTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _ftMTelefonoKeyTyped(evt);
            }
        });
        add(_ftMTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 190, 30));

        _lbModificarEspecialidad.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbModificarEspecialidad.setForeground(new java.awt.Color(153, 255, 255));
        _lbModificarEspecialidad.setText("MODIFICAR ESPECIALIDAD");
        add(_lbModificarEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        _botonMNombre.setBackground(new java.awt.Color(54, 203, 167));
        _botonMNombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonMNombre.setForeground(new java.awt.Color(255, 255, 255));
        _botonMNombre.setText("MODIFICAR");
        _botonMNombre.setToolTipText("");
        _botonMNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        add(_botonMNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, 30));

        _botonMCedula.setBackground(new java.awt.Color(54, 203, 167));
        _botonMCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonMCedula.setForeground(new java.awt.Color(255, 255, 255));
        _botonMCedula.setText("MODIFICAR");
        _botonMCedula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        add(_botonMCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 130, 30));

        _botonMTelefono.setBackground(new java.awt.Color(54, 203, 167));
        _botonMTelefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonMTelefono.setForeground(new java.awt.Color(255, 255, 255));
        _botonMTelefono.setText("MODIFICAR");
        _botonMTelefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        add(_botonMTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 30));

        _botonMEspecialidad.setBackground(new java.awt.Color(54, 203, 167));
        _botonMEspecialidad.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonMEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        _botonMEspecialidad.setText("MODIFICAR");
        _botonMEspecialidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        add(_botonMEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 130, 30));

        _cBMEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Odontólogo general", "Odontopediatra", "Ortodoncista", "Periodoncista", "Endodoncista", "Patólogo oral o Cirujano oral", "Prostodoncista" }));
        _cBMEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cBMEspecialidadActionPerformed(evt);
            }
        });
        add(_cBMEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 220, 30));

        _lbAviso1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _lbAviso1.setForeground(new java.awt.Color(255, 255, 255));
        _lbAviso1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbAviso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 200, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void _ftMNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftMNombreKeyTyped
        char c = evt.getKeyChar();
        _ftMNombre.setBackground(Color.white);
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
    }//GEN-LAST:event__ftMNombreKeyTyped

    private void _ftMCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftMCedulaKeyTyped
        char c = evt.getKeyChar();
        setLabelAviso1_1();
        _ftMCedula.setBackground(Color.white);
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event__ftMCedulaKeyTyped

    private void _ftMTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftMTelefonoKeyTyped
        char c = evt.getKeyChar();
        _ftMTelefono.setBackground(Color.white);
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event__ftMTelefonoKeyTyped

    private void _cBMEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cBMEspecialidadActionPerformed
        _cBMEspecialidad.setBackground(Color.white);
        _textoEspecialidad = _cBMEspecialidad.getSelectedItem().toString();
    }//GEN-LAST:event__cBMEspecialidadActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonMCedula.addActionListener(listener);
        _botonMNombre.addActionListener(listener);
        _botonMTelefono.addActionListener(listener);
        _botonMEspecialidad.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonMCedula;
    javax.swing.JButton _botonMEspecialidad;
    javax.swing.JButton _botonMNombre;
    javax.swing.JButton _botonMTelefono;
    javax.swing.JComboBox<String> _cBMEspecialidad;
    javax.swing.JTextField _ftMCedula;
    javax.swing.JTextField _ftMNombre;
    javax.swing.JTextField _ftMTelefono;
    javax.swing.JLabel _lbAviso1;
    javax.swing.JLabel _lbModificarCedula;
    javax.swing.JLabel _lbModificarEspecialidad;
    javax.swing.JLabel _lbModificarNombre;
    javax.swing.JLabel _lbModificarTelefono;
    // End of variables declaration//GEN-END:variables
    private String _textoEspecialidad = "";

    public JButton getBotonMCedula() {
        return _botonMCedula;
    }

    public JButton getBotonMEspecialidad() {
        return _botonMEspecialidad;
    }

    public JButton getBotonMNombre() {
        return _botonMNombre;
    }

    public JButton getBotonMTelefono() {
        return _botonMTelefono;
    }

    public String getFtMCedula() {
        return _ftMCedula.getText();
    }

    public String getFtMNombre() {
        return _ftMNombre.getText();
    }

    public String getFtMTelefono() {
        return _ftMTelefono.getText();
    }

    public String getTextoEspecialidad() {
        return _textoEspecialidad;
    }

    public void setcBMEspecialidad() {
        this._cBMEspecialidad.setSelectedItem(" ");
    }

    public void setFtMCedula() {
        this._ftMCedula.setText("");
    }

    public void setFtMNombre() {
        this._ftMNombre.setText("");
    }

    public void setFtMTelefono() {
        this._ftMTelefono.setText("");
    }

    public void setTextoEspecialidad() {
        this._textoEspecialidad = "";
    }

    public void setLabelAviso1() {
        this._lbAviso1.setText("CÉDULA YA EXISTENTE");
    }

    public void setLabelAviso1_1() {
        this._lbAviso1.setText("");
    }

}
