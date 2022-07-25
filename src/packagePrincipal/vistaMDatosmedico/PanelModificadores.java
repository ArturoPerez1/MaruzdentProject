/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagePrincipal.vistaMDatosmedico;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PanelModificadores extends javax.swing.JPanel {

    public PanelModificadores() {
        initComponents();
    }

    public void ErrorNombre(boolean error) {
        if (error == true) {
            _ftMNombre.setBackground(Color.red);
        }
    }

    public void ErrorCedulaP1(boolean error) {
        if (error == true) {
            _ftCedulaP1.setBackground(Color.red);
        }
    }

    public void ErrorCedulaP2(boolean error) {
        if (error == true) {
            _ftCedulaP2.setBackground(Color.red);
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
        _ftCedulaP1 = new javax.swing.JTextField();
        _lbModificarTelefono = new javax.swing.JLabel();
        _ftMTelefono = new javax.swing.JTextField();
        _lbModificarEspecialidad = new javax.swing.JLabel();
        _botonMNombre = new javax.swing.JButton();
        _botonMCedula = new javax.swing.JButton();
        _botonMTelefono = new javax.swing.JButton();
        _botonMEspecialidad = new javax.swing.JButton();
        _cBMEspecialidad = new javax.swing.JComboBox<>();
        _ftCedulaP2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        _labelError1 = new javax.swing.JLabel();
        _labelNombreVacio = new javax.swing.JLabel();
        _labelTelofonoVacio = new javax.swing.JLabel();
        _labelEspecialidadError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 137, 123));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbModificarNombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbModificarNombre.setForeground(new java.awt.Color(153, 255, 255));
        _lbModificarNombre.setText("MODIFICAR NOMBRE");
        add(_lbModificarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        _ftMNombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _ftMNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _ftMNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _ftMNombreMouseClicked(evt);
            }
        });
        _ftMNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _ftMNombreKeyTyped(evt);
            }
        });
        add(_ftMNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 190, 30));

        _lbModificarCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbModificarCedula.setForeground(new java.awt.Color(153, 255, 255));
        _lbModificarCedula.setText("MODIFICAR CÉDULA");
        add(_lbModificarCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        _ftCedulaP1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _ftCedulaP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _ftCedulaP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _ftCedulaP1MouseClicked(evt);
            }
        });
        _ftCedulaP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _ftCedulaP1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _ftCedulaP1KeyTyped(evt);
            }
        });
        add(_ftCedulaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 170, 30));

        _lbModificarTelefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbModificarTelefono.setForeground(new java.awt.Color(153, 255, 255));
        _lbModificarTelefono.setText("MODIFICAR TELÉFONO");
        add(_lbModificarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        _ftMTelefono.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _ftMTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _ftMTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _ftMTelefonoMouseClicked(evt);
            }
        });
        _ftMTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _ftMTelefonoKeyTyped(evt);
            }
        });
        add(_ftMTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 190, 30));

        _lbModificarEspecialidad.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbModificarEspecialidad.setForeground(new java.awt.Color(153, 255, 255));
        _lbModificarEspecialidad.setText("MODIFICAR ESPECIALIDAD");
        add(_lbModificarEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 30));

        _botonMNombre.setBackground(new java.awt.Color(54, 203, 167));
        _botonMNombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonMNombre.setForeground(new java.awt.Color(255, 255, 255));
        _botonMNombre.setText("MODIFICAR");
        _botonMNombre.setToolTipText("");
        _botonMNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonMNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonMNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonMNombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonMNombreMouseExited(evt);
            }
        });
        add(_botonMNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 130, 30));

        _botonMCedula.setBackground(new java.awt.Color(54, 203, 167));
        _botonMCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonMCedula.setForeground(new java.awt.Color(255, 255, 255));
        _botonMCedula.setText("MODIFICAR");
        _botonMCedula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonMCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonMCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonMCedulaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonMCedulaMouseExited(evt);
            }
        });
        add(_botonMCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 130, 30));

        _botonMTelefono.setBackground(new java.awt.Color(54, 203, 167));
        _botonMTelefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonMTelefono.setForeground(new java.awt.Color(255, 255, 255));
        _botonMTelefono.setText("MODIFICAR");
        _botonMTelefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonMTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonMTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonMTelefonoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonMTelefonoMouseExited(evt);
            }
        });
        add(_botonMTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 130, 30));

        _botonMEspecialidad.setBackground(new java.awt.Color(54, 203, 167));
        _botonMEspecialidad.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonMEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        _botonMEspecialidad.setText("MODIFICAR");
        _botonMEspecialidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonMEspecialidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonMEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonMEspecialidadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonMEspecialidadMouseExited(evt);
            }
        });
        add(_botonMEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 130, 30));

        _cBMEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Odontólogo general", "Odontopediatra", "Ortodoncista", "Periodoncista", "Endodoncista", "Patólogo oral o Cirujano oral", "Prostodoncista" }));
        _cBMEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _cBMEspecialidadMouseClicked(evt);
            }
        });
        _cBMEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cBMEspecialidadActionPerformed(evt);
            }
        });
        add(_cBMEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 220, 30));

        _ftCedulaP2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _ftCedulaP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _ftCedulaP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _ftCedulaP2MouseClicked(evt);
            }
        });
        _ftCedulaP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _ftCedulaP2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _ftCedulaP2KeyTyped(evt);
            }
        });
        add(_ftCedulaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 30, 30));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("-");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, 30));

        _labelError1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _labelError1.setForeground(new java.awt.Color(255, 255, 255));
        _labelError1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_labelError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 230, 30));

        _labelNombreVacio.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _labelNombreVacio.setForeground(new java.awt.Color(255, 255, 255));
        _labelNombreVacio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_labelNombreVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 200, 30));

        _labelTelofonoVacio.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _labelTelofonoVacio.setForeground(new java.awt.Color(255, 255, 255));
        add(_labelTelofonoVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 220, 30));

        _labelEspecialidadError.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _labelEspecialidadError.setForeground(new java.awt.Color(255, 255, 255));
        _labelEspecialidadError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_labelEspecialidadError, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 210, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void _ftMNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftMNombreKeyTyped
        char c = evt.getKeyChar();
        _ftMNombre.setBackground(Color.white);
        setLabelNombreVacio1();
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

    private void _ftCedulaP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftCedulaP1KeyTyped
        char c = evt.getKeyChar();
        _ftCedulaP1.setBackground(Color.white);
        setLabelErrorCedula1();
        if (c < '0' || c > '9') {
            evt.consume();
        } else {
            if (_ftCedulaP1.getText().isEmpty() == false) {
                if (_contNumCedula1 >= 9) {
                    evt.consume();
                } else {
                    _contNumCedula1++;
                }
            } else {
                _contNumCedula1 = 1;
            }
        }
    }//GEN-LAST:event__ftCedulaP1KeyTyped

    private void _ftMTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftMTelefonoKeyTyped
        char c = evt.getKeyChar();
        _ftMTelefono.setBackground(Color.white);
        setLabelTelefonoVacio1();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event__ftMTelefonoKeyTyped

    private void _cBMEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cBMEspecialidadActionPerformed
        setLabelEspecialidadError1();
        _cBMEspecialidad.setBackground(Color.white);
        _textoEspecialidad = _cBMEspecialidad.getSelectedItem().toString();
    }//GEN-LAST:event__cBMEspecialidadActionPerformed

    private void _ftCedulaP2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftCedulaP2KeyTyped
        char c = evt.getKeyChar();
        setLabelErrorCedula1();
         _ftCedulaP2.setBackground(Color.white);
        if (c < '0' || c > '9') {
            evt.consume();
        } else {
            if (_ftCedulaP2.getText().isEmpty() == false) {
                if (_contNumCedula2 >= 1) {
                    evt.consume();
                } else {
                    _contNumCedula2++;
                }
            } else {
                _contNumCedula2 = 1;
            }
        }
    }//GEN-LAST:event__ftCedulaP2KeyTyped

    private void _ftCedulaP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__ftCedulaP2MouseClicked
        _ftCedulaP2.setBackground(Color.white);
    }//GEN-LAST:event__ftCedulaP2MouseClicked

    private void _ftCedulaP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__ftCedulaP1MouseClicked
        _ftCedulaP1.setBackground(Color.white);
    }//GEN-LAST:event__ftCedulaP1MouseClicked

    private void _ftCedulaP1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftCedulaP1KeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            _contNumCedula1--;
        }
    }//GEN-LAST:event__ftCedulaP1KeyReleased

    private void _ftCedulaP2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftCedulaP2KeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            _contNumCedula2--;
        }
    }//GEN-LAST:event__ftCedulaP2KeyReleased

    private void _botonMNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonMNombreMouseEntered
        _botonMNombre.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonMNombreMouseEntered

    private void _botonMNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonMNombreMouseExited
        _botonMNombre.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonMNombreMouseExited

    private void _botonMEspecialidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonMEspecialidadMouseEntered
        _botonMEspecialidad.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonMEspecialidadMouseEntered

    private void _botonMEspecialidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonMEspecialidadMouseExited
        _botonMEspecialidad.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonMEspecialidadMouseExited

    private void _botonMCedulaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonMCedulaMouseEntered
        _botonMCedula.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonMCedulaMouseEntered

    private void _botonMCedulaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonMCedulaMouseExited
        _botonMCedula.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonMCedulaMouseExited

    private void _botonMTelefonoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonMTelefonoMouseEntered
        _botonMTelefono.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonMTelefonoMouseEntered

    private void _botonMTelefonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonMTelefonoMouseExited
        _botonMTelefono.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonMTelefonoMouseExited

    private void _ftMNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__ftMNombreMouseClicked
        _ftMNombre.setBackground(Color.white);
    }//GEN-LAST:event__ftMNombreMouseClicked

    private void _cBMEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__cBMEspecialidadMouseClicked
        _cBMEspecialidad.setBackground(Color.white);
    }//GEN-LAST:event__cBMEspecialidadMouseClicked

    private void _ftMTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__ftMTelefonoMouseClicked
        _ftMTelefono.setBackground(Color.white);
    }//GEN-LAST:event__ftMTelefonoMouseClicked

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
    javax.swing.JTextField _ftCedulaP1;
    javax.swing.JTextField _ftCedulaP2;
    javax.swing.JTextField _ftMNombre;
    javax.swing.JTextField _ftMTelefono;
    javax.swing.JLabel _labelError1;
    javax.swing.JLabel _labelEspecialidadError;
    javax.swing.JLabel _labelNombreVacio;
    javax.swing.JLabel _labelTelofonoVacio;
    javax.swing.JLabel _lbModificarCedula;
    javax.swing.JLabel _lbModificarEspecialidad;
    javax.swing.JLabel _lbModificarNombre;
    javax.swing.JLabel _lbModificarTelefono;
    javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private String _textoEspecialidad = "";
    private int _contNumCedula2 = 0;
    private int _contNumCedula1 = 0;

    public JButton getBotonMCedula() {
        return _botonMCedula;
    }

    public JButton getBotonMEspecialidad() {
        return _botonMEspecialidad;
    }

    public String getFtCedulaP2() {
        return _ftCedulaP2.getText();
    }

    public JButton getBotonMNombre() {
        return _botonMNombre;
    }

    public JButton getBotonMTelefono() {
        return _botonMTelefono;
    }

    public String getFtMCedulP1() {
        return _ftCedulaP1.getText();
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
        this._ftCedulaP1.setText("");
    }

    public void setFtMCedula1() {
        this._ftCedulaP2.setText("");
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

    public void CedulaP1Vacia() {
        this._labelError1.setText("CÉDULA VACÍA");
    }

    public void CedulaP2Vacia() {
        this._labelError1.setText("CÓDIGO VERIFICADOR VACÍO");
    }

    public void CedulaP1Y2Vacia() {
        this._labelError1.setText("CÓDIGO Y CÉDULA VACÍOS");
    }

    public void CodigoProviciaE() {
        this._labelError1.setText("CÓDIGO DE PROVINCIA ERRÓNEO");
    }

    public void DigitosMenorA10() {
        this._labelError1.setText("CÉDULA MENOR A 9 DÍGITOS");
    }

    public void CodigoVerificacionE() {
        this._labelError1.setText("CÓDIGO VERIFICADOR ERRÓNEO");
    }

    public void setLabelErrorCedula() {
        this._labelError1.setText("ESTA CÉDULA YA EXISTE");
    }

    public void setLabelErrorCedula1() {
        _ftCedulaP1.setBackground(Color.white);
        _ftCedulaP2.setBackground(Color.white);
        this._labelError1.setText("");
    }

    public void setLabelCedulaExistente() {
        this._labelError1.setText("CÉDULA YA EXISTENTE");
    }

    public void setLabelNombreVacio() {
        this._labelNombreVacio.setText("CAMPO NOMBRE VACÍO");
    }

    public void setLabelNombreVacio1() {
        this._labelNombreVacio.setText("");
    }

    public void setLabelTelefonoVacio() {
        this._labelTelofonoVacio.setText("CAMPO TELÉFONO VACÍO");
    }

    public void setLabelTelefonoVacio1() {
        this._labelTelofonoVacio.setText("");
    }

    public void setLabelEspecialidadError() {
        this._labelEspecialidadError.setText("SELECCIONE UNA ESPECIALIDAD");
    }

    public void setLabelEspecialidadError1() {
        this._labelEspecialidadError.setText("");
    }

}
