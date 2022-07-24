/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagePrincipal.vistaADatosMedicos;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import vista.PlaceHolder;

public class PanelADatosMedico extends javax.swing.JPanel {

    public PanelADatosMedico() {
        initComponents();
        _placeHolders = new PlaceHolder("                    INTRODUCIR NOMBRE DEL MÉDICO", _ftNombreMedico);
        _placeHolders = new PlaceHolder("   INTRODUCIR CÉDULA DEL MÉDICO", _ftCedulaP1);
        _placeHolders = new PlaceHolder("   0", _ftCedulaP2);
        _placeHolders = new PlaceHolder("      INTRODUCIR NÚMERO TELEFÓNICO DEL MÉDICO", _ftTelefonoMedico);
    }

    public void ErrorNombreMedico(boolean error) {
        if (error == true) {
            _ftNombreMedico.setBackground(Color.red);
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
            _ftTelefonoMedico.setBackground(Color.red);
        }
    }

    public void ErrorEspecialidad(boolean error) {
        if (error == true) {
            _cbEspecialidadMedico.setBackground(Color.red);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _botonVolver = new javax.swing.JButton();
        _lbNombreMedico = new javax.swing.JLabel();
        _ftNombreMedico = new javax.swing.JTextField();
        _lbCedulaMedico = new javax.swing.JLabel();
        _ftCedulaP1 = new javax.swing.JTextField();
        _cbEspecialidadMedico = new javax.swing.JComboBox<>();
        _lbEspecialidad = new javax.swing.JLabel();
        _lbTelefonoMedico = new javax.swing.JLabel();
        _ftTelefonoMedico = new javax.swing.JTextField();
        _botonRegistrar = new javax.swing.JButton();
        _labelError1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        _labelGuion = new javax.swing.JLabel();
        _ftCedulaP2 = new javax.swing.JTextField();
        _labelNombreVacio = new javax.swing.JLabel();
        _labelTelofonoVacio = new javax.swing.JLabel();
        _labelEError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 60));

        _lbNombreMedico.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbNombreMedico.setForeground(new java.awt.Color(153, 255, 255));
        _lbNombreMedico.setText("NOMBRE Y APELLIDO DEL MÉDICO");
        add(_lbNombreMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 300, 30));

        _ftNombreMedico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _ftNombreMedico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _ftNombreMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _ftNombreMedicoMouseClicked(evt);
            }
        });
        _ftNombreMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _ftNombreMedicoKeyTyped(evt);
            }
        });
        add(_ftNombreMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 340, 40));

        _lbCedulaMedico.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbCedulaMedico.setForeground(new java.awt.Color(153, 255, 255));
        _lbCedulaMedico.setText("NÚMERO CÉDULA DEL MÉDICO");
        add(_lbCedulaMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, -1, 30));

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
        add(_ftCedulaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 230, 40));

        _cbEspecialidadMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Odontólogo general", "Odontopediatra", "Ortodoncista", "Periodoncista", "Endodoncista", "Patólogo oral o Cirujano oral", "Prostodoncista" }));
        _cbEspecialidadMedico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbEspecialidadMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _cbEspecialidadMedicoMouseClicked(evt);
            }
        });
        _cbEspecialidadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbEspecialidadMedicoActionPerformed(evt);
            }
        });
        add(_cbEspecialidadMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 270, 40));

        _lbEspecialidad.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbEspecialidad.setForeground(new java.awt.Color(153, 255, 255));
        _lbEspecialidad.setText("ESPECIALIDAD DEL MÉDICO");
        add(_lbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, 30));

        _lbTelefonoMedico.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbTelefonoMedico.setForeground(new java.awt.Color(153, 255, 255));
        _lbTelefonoMedico.setText("NÚMERO TELEFÓNICO MÉDICO");
        add(_lbTelefonoMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, 30));

        _ftTelefonoMedico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _ftTelefonoMedico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _ftTelefonoMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _ftTelefonoMedicoMouseClicked(evt);
            }
        });
        _ftTelefonoMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _ftTelefonoMedicoKeyTyped(evt);
            }
        });
        add(_ftTelefonoMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 340, 40));

        _botonRegistrar.setBackground(new java.awt.Color(54, 203, 167));
        _botonRegistrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        _botonRegistrar.setText("REGISTRAR MÉDICO");
        _botonRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonRegistrarMouseExited(evt);
            }
        });
        add(_botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 290, 60));

        _labelError1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _labelError1.setForeground(new java.awt.Color(255, 255, 255));
        _labelError1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_labelError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 390, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/registrarMedico (2).png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 90));

        _labelGuion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        _labelGuion.setForeground(new java.awt.Color(255, 255, 255));
        _labelGuion.setText("-");
        add(_labelGuion, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 20, 20));

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
        add(_ftCedulaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 30, 40));

        _labelNombreVacio.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _labelNombreVacio.setForeground(new java.awt.Color(255, 255, 255));
        _labelNombreVacio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_labelNombreVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 290, 30));

        _labelTelofonoVacio.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _labelTelofonoVacio.setForeground(new java.awt.Color(255, 255, 255));
        _labelTelofonoVacio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_labelTelofonoVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 260, 30));

        _labelEError.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _labelEError.setForeground(new java.awt.Color(255, 255, 255));
        _labelEError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_labelEError, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 280, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void _ftNombreMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftNombreMedicoKeyTyped
        setLabelNombreVacio1();
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

    private void _ftCedulaP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftCedulaP1KeyTyped
        setLabelErrorCedula1();
        _ftCedulaP1.setBackground(Color.white);
        char c = evt.getKeyChar();
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

    private void _ftTelefonoMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftTelefonoMedicoKeyTyped
        setLabelTelefonoVacio1();
        _ftTelefonoMedico.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event__ftTelefonoMedicoKeyTyped

    private void _cbEspecialidadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbEspecialidadMedicoActionPerformed
        setLabelEscogerEspecialidad1();
        _cbEspecialidadMedico.setBackground(Color.white);
        _textoEspecialidad = _cbEspecialidadMedico.getSelectedItem().toString();
    }//GEN-LAST:event__cbEspecialidadMedicoActionPerformed

    private void _botonRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonRegistrarMouseEntered
        _botonRegistrar.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonRegistrarMouseEntered

    private void _botonRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonRegistrarMouseExited
        _botonRegistrar.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonRegistrarMouseExited

    private void _ftCedulaP2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__ftCedulaP2KeyTyped
        setLabelErrorCedula1();
        char c = evt.getKeyChar();
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

    private void _ftNombreMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__ftNombreMedicoMouseClicked
        _ftNombreMedico.setBackground(Color.white);
    }//GEN-LAST:event__ftNombreMedicoMouseClicked

    private void _ftCedulaP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__ftCedulaP1MouseClicked
        _ftCedulaP1.setBackground(Color.white);
    }//GEN-LAST:event__ftCedulaP1MouseClicked

    private void _ftCedulaP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__ftCedulaP2MouseClicked
        _ftCedulaP2.setBackground(Color.white);
    }//GEN-LAST:event__ftCedulaP2MouseClicked

    private void _ftTelefonoMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__ftTelefonoMedicoMouseClicked
        _ftTelefonoMedico.setBackground(Color.white);
    }//GEN-LAST:event__ftTelefonoMedicoMouseClicked

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

    private void _cbEspecialidadMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__cbEspecialidadMedicoMouseClicked
        _cbEspecialidadMedico.setBackground(Color.white);
    }//GEN-LAST:event__cbEspecialidadMedicoMouseClicked

    public void AddActionListener(ActionListener listener) {
        _botonVolver.addActionListener(listener);
        _botonRegistrar.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonRegistrar;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _cbEspecialidadMedico;
    javax.swing.JTextField _ftCedulaP1;
    javax.swing.JTextField _ftCedulaP2;
    javax.swing.JTextField _ftNombreMedico;
    javax.swing.JTextField _ftTelefonoMedico;
    javax.swing.JLabel _labelEError;
    javax.swing.JLabel _labelError1;
    javax.swing.JLabel _labelGuion;
    javax.swing.JLabel _labelNombreVacio;
    javax.swing.JLabel _labelTelofonoVacio;
    javax.swing.JLabel _lbCedulaMedico;
    javax.swing.JLabel _lbEspecialidad;
    javax.swing.JLabel _lbNombreMedico;
    javax.swing.JLabel _lbTelefonoMedico;
    javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private String _textoEspecialidad = "";
    private PlaceHolder _placeHolders;
    private int _contNumCedula2 = 0;
    private int _contNumCedula1 = 0;

    public JButton getBotonRegistrar() {
        return _botonRegistrar;
    }

    public String getFtCedulaP2() {
        return _ftCedulaP2.getText();
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public String getFtCedulaP1() {
        return _ftCedulaP1.getText();
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
        this._ftCedulaP1.setText("");
        this._ftCedulaP2.setText("");
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

    public void setLabelEscogerEspecialidad() {
        this._labelEError.setText("SELECCIONE UNA ESPECIALIDAD");
    }

    public void setLabelEscogerEspecialidad1() {
        this._labelEError.setText("");
    }

}
