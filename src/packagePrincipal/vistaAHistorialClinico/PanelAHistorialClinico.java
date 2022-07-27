package packagePrincipal.vistaAHistorialClinico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import packagePrincipal.modelo.DatosPaciente;

public class PanelAHistorialClinico extends javax.swing.JPanel {

    public PanelAHistorialClinico() {
        initComponents();
    }

    public void AgregarDatosPaciente(ArrayList<DatosPaciente> _registroPaciente, int i) {
        _panelDatosPaciente = new PanelDatosPaciente();
        _panelDatosPaciente.LlenarDatosPaciente(_registroPaciente, i);
        _panelDatosPaciente.setSize(290, 420);
        _panelContenedorDatos.removeAll();
        _panelContenedorDatos.add(_panelDatosPaciente, BorderLayout.CENTER);
        _panelContenedorDatos.revalidate();
        _panelContenedorDatos.repaint();
    }

    public void QuitarDatosPaciente() {
        _panelContenedorDatos.removeAll();
        _panelContenedorDatos.revalidate();
        _panelContenedorDatos.repaint();
    }

    public void LlenaComboBoxCedulas(ArrayList<DatosPaciente> registroPaciente) {
        _cbCedula.addItem(" ");
        _registroPaciente = registroPaciente;
        for (int i = 0; i < registroPaciente.size(); i++) {
            _cbCedula.addItem(registroPaciente.get(i).getCedula());
        }
    }
    
    public void ObtenerPosicionPersona(String cedula, ArrayList<DatosPaciente> registroPaciente){
        for (int i = 0; i < registroPaciente.size(); i++) {
            if(registroPaciente.get(i).getCedula().equals(cedula)){
                _posicion = i;
                break;
            }         
        }
    }

    public void ErrorAnteFamiliares(boolean error) {
        if (error == true) {
            _aaAnteFamiliares.setBackground(Color.red);
        }
    }

    public void ErrorAntePersonales(boolean error) {
        if (error == true) {
            _aaAntePersonales.setBackground(Color.red);
        }
    }

    public void ErrorAntePatalogico(boolean error) {
        if (error == true) {
            _aaAntePatologicos.setBackground(Color.red);
        }
    }

    public void ErrorAnteFarmacologico(boolean error) {
        if (error == true) {
            _aaAnteFarmacologicos.setBackground(Color.red);
        }
    }

    public void ErrorExamenFisico(boolean error) {
        if (error == true) {
            _aaExamenFisico.setBackground(Color.red);
        }
    }

    public void ErrorTipoConsulta(boolean error) {
        if (error == true) {
            _aaTipoConsulta.setBackground(Color.red);
        }
    }

    public void ErrorDiagnostico(boolean error) {
        if (error == true) {
            _aaDiagnostico.setBackground(Color.red);
        }
    }

    public void ErrorPlanTratamiento(boolean error) {
        if (error == true) {
            _aaPlanDeTratamiento.setBackground(Color.red);
        }
    }

    public void ErrorEnfermedadActual(boolean error) {
        if (error == true) {
            _aaEnfermedadActual.setBackground(Color.red);
        }
    }

    public void ErrorRazonConsulta(boolean error) {
        if (error == true) {
            _tfRazonConsulta.setBackground(Color.red);
        }
    }

    public void ErrorCedula(boolean error) {
        if (error == true) {
            _cbCedula.setBackground(Color.red);
        } else {
            _cbCedula.setBackground(Color.white);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _botonVolver = new javax.swing.JButton();
        _botonRegistrarH = new javax.swing.JButton();
        _lbRazonConsilta = new javax.swing.JLabel();
        _tfRazonConsulta = new javax.swing.JTextField();
        _lbEnfermedadActual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _aaEnfermedadActual = new javax.swing.JTextArea();
        _lbAntePersonales = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        _aaAntePersonales = new javax.swing.JTextArea();
        _lbAnteFamiliares = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        _aaAnteFamiliares = new javax.swing.JTextArea();
        _lbAntePatologicos = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        _aaAntePatologicos = new javax.swing.JTextArea();
        _lbAnteFarmacologicos = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        _aaAnteFarmacologicos = new javax.swing.JTextArea();
        _lbTipoConsulta = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        _aaTipoConsulta = new javax.swing.JTextArea();
        _lbExamenFisico = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        _aaExamenFisico = new javax.swing.JTextArea();
        _lbDiagnostico = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        _aaDiagnostico = new javax.swing.JTextArea();
        _lbPlanDeTratamiento = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        _aaPlanDeTratamiento = new javax.swing.JTextArea();
        _lbCedulaAsociado = new javax.swing.JLabel();
        _cbCedula = new javax.swing.JComboBox<>();
        _labelError1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        _panelContenedorDatos = new javax.swing.JPanel();
        _lbLogo1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(38, 166, 154));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        _botonRegistrarH.setBackground(new java.awt.Color(54, 203, 167));
        _botonRegistrarH.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonRegistrarH.setForeground(new java.awt.Color(255, 255, 255));
        _botonRegistrarH.setText("REGISTRAR HISTORIAL");
        _botonRegistrarH.setToolTipText("");
        _botonRegistrarH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        add(_botonRegistrarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, 310, 50));

        _lbRazonConsilta.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbRazonConsilta.setForeground(new java.awt.Color(153, 255, 255));
        _lbRazonConsilta.setText("RAZON CONSULTA");
        add(_lbRazonConsilta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 180, 20));

        _tfRazonConsulta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _tfRazonConsulta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfRazonConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfRazonConsultaKeyTyped(evt);
            }
        });
        add(_tfRazonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 200, 30));

        _lbEnfermedadActual.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbEnfermedadActual.setForeground(new java.awt.Color(153, 255, 255));
        _lbEnfermedadActual.setText("ENFERMEDAD ACTUAL");
        add(_lbEnfermedadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 210, 20));

        _aaEnfermedadActual.setColumns(20);
        _aaEnfermedadActual.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaEnfermedadActual.setRows(5);
        _aaEnfermedadActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaEnfermedadActualKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(_aaEnfermedadActual);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 220, 80));

        _lbAntePersonales.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbAntePersonales.setForeground(new java.awt.Color(153, 255, 255));
        _lbAntePersonales.setText("ANTECEDENTES PERSONALES");
        _lbAntePersonales.setToolTipText("");
        add(_lbAntePersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, -1, -1));

        _aaAntePersonales.setColumns(20);
        _aaAntePersonales.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaAntePersonales.setRows(5);
        _aaAntePersonales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaAntePersonalesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(_aaAntePersonales);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, 230, 80));

        _lbAnteFamiliares.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbAnteFamiliares.setForeground(new java.awt.Color(153, 255, 255));
        _lbAnteFamiliares.setText("ANTECEDENTES FAMILIARES");
        add(_lbAnteFamiliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, -1, -1));

        _aaAnteFamiliares.setColumns(20);
        _aaAnteFamiliares.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaAnteFamiliares.setRows(5);
        _aaAnteFamiliares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaAnteFamiliaresKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(_aaAnteFamiliares);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 230, 80));

        _lbAntePatologicos.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbAntePatologicos.setForeground(new java.awt.Color(153, 255, 255));
        _lbAntePatologicos.setText("ANTECEDENTES PATOLÓGICOS");
        add(_lbAntePatologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, -1, -1));

        _aaAntePatologicos.setColumns(20);
        _aaAntePatologicos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaAntePatologicos.setRows(5);
        _aaAntePatologicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaAntePatologicosKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(_aaAntePatologicos);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 420, 230, 80));

        _lbAnteFarmacologicos.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbAnteFarmacologicos.setForeground(new java.awt.Color(153, 255, 255));
        _lbAnteFarmacologicos.setText("ANTECEDENTES FARMACOLÓGICOS");
        add(_lbAnteFarmacologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, -1, -1));

        _aaAnteFarmacologicos.setColumns(20);
        _aaAnteFarmacologicos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaAnteFarmacologicos.setRows(5);
        _aaAnteFarmacologicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaAnteFarmacologicosKeyTyped(evt);
            }
        });
        jScrollPane5.setViewportView(_aaAnteFarmacologicos);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 570, 240, 80));

        _lbTipoConsulta.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbTipoConsulta.setForeground(new java.awt.Color(153, 255, 255));
        _lbTipoConsulta.setText("TIPO DE CONSULTA");
        add(_lbTipoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        _aaTipoConsulta.setColumns(20);
        _aaTipoConsulta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaTipoConsulta.setRows(5);
        _aaTipoConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaTipoConsultaKeyTyped(evt);
            }
        });
        jScrollPane6.setViewportView(_aaTipoConsulta);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 210, 80));

        _lbExamenFisico.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbExamenFisico.setForeground(new java.awt.Color(153, 255, 255));
        _lbExamenFisico.setText("EXAMEN FÍSICO");
        _lbExamenFisico.setToolTipText("");
        add(_lbExamenFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        _aaExamenFisico.setColumns(20);
        _aaExamenFisico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaExamenFisico.setRows(5);
        _aaExamenFisico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaExamenFisicoKeyTyped(evt);
            }
        });
        jScrollPane7.setViewportView(_aaExamenFisico);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 210, 80));

        _lbDiagnostico.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbDiagnostico.setForeground(new java.awt.Color(153, 255, 255));
        _lbDiagnostico.setText("DIAGNÓSTICO");
        add(_lbDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));

        _aaDiagnostico.setColumns(20);
        _aaDiagnostico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaDiagnostico.setRows(5);
        _aaDiagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaDiagnosticoKeyTyped(evt);
            }
        });
        jScrollPane8.setViewportView(_aaDiagnostico);

        add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 210, 80));

        _lbPlanDeTratamiento.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbPlanDeTratamiento.setForeground(new java.awt.Color(153, 255, 255));
        _lbPlanDeTratamiento.setText("PLAN DE TRATAMIENTO");
        add(_lbPlanDeTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, -1));

        _aaPlanDeTratamiento.setColumns(20);
        _aaPlanDeTratamiento.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaPlanDeTratamiento.setRows(5);
        _aaPlanDeTratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaPlanDeTratamientoKeyTyped(evt);
            }
        });
        jScrollPane9.setViewportView(_aaPlanDeTratamiento);

        add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 210, 80));

        _lbCedulaAsociado.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbCedulaAsociado.setForeground(new java.awt.Color(153, 255, 255));
        _lbCedulaAsociado.setText("CÉDULA ASOCIADA AL HISTORIAL");
        add(_lbCedulaAsociado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        _cbCedula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbCedulaActionPerformed(evt);
            }
        });
        add(_cbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 260, 40));

        _labelError1.setFont(new java.awt.Font("Metropolis Black", 1, 10)); // NOI18N
        _labelError1.setForeground(new java.awt.Color(255, 255, 255));
        add(_labelError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 300, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/agregarHistorial.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, 90));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 30, 590));

        _panelContenedorDatos.setBackground(new java.awt.Color(0, 137, 123));
        _panelContenedorDatos.setLayout(null);
        add(_panelContenedorDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 290, 420));

        _lbLogo1.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbLogo1.setForeground(new java.awt.Color(255, 255, 255));
        _lbLogo1.setText("DATOS DEL PACIENTE");
        add(_lbLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jButton1.setBackground(new java.awt.Color(54, 203, 167));
        jButton1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AYUDA");
        jButton1.setToolTipText("");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 55, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void _tfRazonConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfRazonConsultaKeyTyped
        _tfRazonConsulta.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event__tfRazonConsultaKeyTyped

    private void _aaTipoConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__aaTipoConsultaKeyTyped
        _aaTipoConsulta.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event__aaTipoConsultaKeyTyped

    private void _aaEnfermedadActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__aaEnfermedadActualKeyTyped
        _aaEnfermedadActual.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event__aaEnfermedadActualKeyTyped

    private void _aaExamenFisicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__aaExamenFisicoKeyTyped
        _aaExamenFisico.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event__aaExamenFisicoKeyTyped

    private void _aaAntePersonalesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__aaAntePersonalesKeyTyped
        _aaAntePersonales.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event__aaAntePersonalesKeyTyped

    private void _aaDiagnosticoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__aaDiagnosticoKeyTyped
        _aaDiagnostico.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event__aaDiagnosticoKeyTyped

    private void _aaAnteFamiliaresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__aaAnteFamiliaresKeyTyped
        _aaAnteFamiliares.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event__aaAnteFamiliaresKeyTyped

    private void _aaPlanDeTratamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__aaPlanDeTratamientoKeyTyped
        _aaPlanDeTratamiento.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event__aaPlanDeTratamientoKeyTyped

    private void _aaAntePatologicosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__aaAntePatologicosKeyTyped
        _aaAntePatologicos.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event__aaAntePatologicosKeyTyped

    private void _aaAnteFarmacologicosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__aaAnteFarmacologicosKeyTyped
        _aaAnteFarmacologicos.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event__aaAnteFarmacologicosKeyTyped

    private void _cbCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulaActionPerformed
        _cbCedula.setBackground(Color.white);
        setAviso();
        _textoCedula = _cbCedula.getSelectedItem().toString();
        if(_textoCedula != " "){
            ObtenerPosicionPersona(_textoCedula, _registroPaciente);
            AgregarDatosPaciente(_registroPaciente, _posicion);
        }
    }//GEN-LAST:event__cbCedulaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameAyuda ayuda = new FrameAyuda();
        ayuda.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonVolver.addActionListener(listener);
        _botonRegistrarH.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextArea _aaAnteFamiliares;
    javax.swing.JTextArea _aaAnteFarmacologicos;
    javax.swing.JTextArea _aaAntePatologicos;
    javax.swing.JTextArea _aaAntePersonales;
    javax.swing.JTextArea _aaDiagnostico;
    javax.swing.JTextArea _aaEnfermedadActual;
    javax.swing.JTextArea _aaExamenFisico;
    javax.swing.JTextArea _aaPlanDeTratamiento;
    javax.swing.JTextArea _aaTipoConsulta;
    javax.swing.JButton _botonRegistrarH;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _cbCedula;
    javax.swing.JLabel _labelError1;
    javax.swing.JLabel _lbAnteFamiliares;
    javax.swing.JLabel _lbAnteFarmacologicos;
    javax.swing.JLabel _lbAntePatologicos;
    javax.swing.JLabel _lbAntePersonales;
    javax.swing.JLabel _lbCedulaAsociado;
    javax.swing.JLabel _lbDiagnostico;
    javax.swing.JLabel _lbEnfermedadActual;
    javax.swing.JLabel _lbExamenFisico;
    javax.swing.JLabel _lbLogo1;
    javax.swing.JLabel _lbPlanDeTratamiento;
    javax.swing.JLabel _lbRazonConsilta;
    javax.swing.JLabel _lbTipoConsulta;
    javax.swing.JPanel _panelContenedorDatos;
    javax.swing.JTextField _tfRazonConsulta;
    javax.swing.JButton jButton1;
    javax.swing.JLabel jLabel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JScrollPane jScrollPane3;
    javax.swing.JScrollPane jScrollPane4;
    javax.swing.JScrollPane jScrollPane5;
    javax.swing.JScrollPane jScrollPane6;
    javax.swing.JScrollPane jScrollPane7;
    javax.swing.JScrollPane jScrollPane8;
    javax.swing.JScrollPane jScrollPane9;
    javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    private String _textoCedula = "";
    private int _posicion;
    private PanelDatosPaciente _panelDatosPaciente;
    private ArrayList<DatosPaciente> _registroPaciente;

    public JButton getBotonRegistrarH() {
        return _botonRegistrarH;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public String getAaAnteFamiliares() {
        return _aaAnteFamiliares.getText();
    }

    public String getTextoCedula() {
        return _textoCedula;
    }

    public String getAaAnteFarmacologicos() {
        return _aaAnteFarmacologicos.getText();
    }

    public String getAaAntePatologicos() {
        return _aaAntePatologicos.getText();
    }

    public String getAaAntePersonales() {
        return _aaAntePersonales.getText();
    }

    public String getAaDiagnostico() {
        return _aaDiagnostico.getText();
    }

    public String getAaEnfermedadActual() {
        return _aaEnfermedadActual.getText();
    }

    public String getAaExamenFisico() {
        return _aaExamenFisico.getText();
    }

    public String getAaPlanDeTratamiento() {
        return _aaPlanDeTratamiento.getText();
    }

    public String getAaTipoConsulta() {
        return _aaTipoConsulta.getText();
    }

    public String getTfRazonConsulta() {
        return _tfRazonConsulta.getText();
    }

    public void setAaAnteFamiliares() {
        this._aaAnteFamiliares.setText("");
    }

    public void setAaAnteFarmacologicos() {
        this._aaAnteFarmacologicos.setText("");
    }

    public void setAaAntePatologicos() {
        this._aaAntePatologicos.setText("");
    }

    public void setAaAntePersonales() {
        this._aaAntePersonales.setText("");
    }

    public void setAaDiagnostico() {
        this._aaDiagnostico.setText("");
    }

    public void setAaEnfermedadActual() {
        this._aaEnfermedadActual.setText("");
    }

    public void setAaExamenFisico() {
        this._aaExamenFisico.setText("");
    }

    public void setAaPlanDeTratamiento() {
        this._aaPlanDeTratamiento.setText("");
    }

    public void setAaTipoConsulta() {
        this._aaTipoConsulta.setText("");
    }

    public void setTfRazonConsulta() {
        this._tfRazonConsulta.setText("");
    }

    public void setCbCedula() {
        this._cbCedula.setSelectedItem(" ");
    }

    public void AvisoCedulaAsociada() {
        this._labelError1.setText("ESTA CÉDULA YA ESTÁ ASOCIADA A UN HISTORIAL");
    }

    public void setAviso() {
        this._labelError1.setText("");
    }

}
