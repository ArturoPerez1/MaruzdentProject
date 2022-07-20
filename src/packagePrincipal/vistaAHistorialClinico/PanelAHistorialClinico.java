package packagePrincipal.vistaAHistorialClinico;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import packagePrincipal.modelo.DatosPaciente;

public class PanelAHistorialClinico extends javax.swing.JPanel {

    public PanelAHistorialClinico() {
        initComponents();
    }

    public void LlenaComboBoxCedulas(ArrayList<DatosPaciente> _registroPaciente) {
        _cbCedula.addItem(" ");
        for (int i = 0; i < _registroPaciente.size(); i++) {
            _cbCedula.addItem(_registroPaciente.get(i).getCedula());
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

    public void ErrorMes(boolean error) {
        if (error == true) {
            _cbMes.setBackground(Color.red);
        } else {
            _cbMes.setBackground(Color.white);
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

    public void ErrorDia(boolean error) {
        if (error == true) {
            _cbDia.setBackground(Color.red);
        } else {
            _cbDia.setBackground(Color.white);
        }
    }

    public void ErrorAno(boolean error) {
        if (error == true) {
            _cbAno.setBackground(Color.red);
        } else {
            _cbAno.setBackground(Color.white);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _labelLogo = new javax.swing.JLabel();
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
        _lbFechaConsulta = new javax.swing.JLabel();
        _lbMes = new javax.swing.JLabel();
        _lbDia = new javax.swing.JLabel();
        _lbAno = new javax.swing.JLabel();
        _cbMes = new javax.swing.JComboBox<>();
        _cbDia = new javax.swing.JComboBox<>();
        _cbAno = new javax.swing.JComboBox<>();
        _lbCedulaAsociado = new javax.swing.JLabel();
        _cbCedula = new javax.swing.JComboBox<>();
        _labelError1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 188, 156));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/agregarHistorial.png"))); // NOI18N
        _labelLogo.setToolTipText("");
        add(_labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 730, 60));

        _botonVolver.setBackground(new java.awt.Color(26, 188, 156));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 60));

        _botonRegistrarH.setBackground(new java.awt.Color(54, 203, 167));
        _botonRegistrarH.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonRegistrarH.setForeground(new java.awt.Color(255, 255, 255));
        _botonRegistrarH.setText("REGISTRAR HISTORIAL");
        _botonRegistrarH.setToolTipText("");
        _botonRegistrarH.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        add(_botonRegistrarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 310, 50));

        _lbRazonConsilta.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbRazonConsilta.setForeground(new java.awt.Color(153, 255, 255));
        _lbRazonConsilta.setText("RAZON CONSULTA");
        add(_lbRazonConsilta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 20));

        _tfRazonConsulta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _tfRazonConsulta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfRazonConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfRazonConsultaKeyTyped(evt);
            }
        });
        add(_tfRazonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 30));

        _lbEnfermedadActual.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbEnfermedadActual.setForeground(new java.awt.Color(153, 255, 255));
        _lbEnfermedadActual.setText("ENFERMEDAD ACTUAL");
        add(_lbEnfermedadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 200, 20));

        _aaEnfermedadActual.setColumns(20);
        _aaEnfermedadActual.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaEnfermedadActual.setRows(5);
        _aaEnfermedadActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaEnfermedadActualKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(_aaEnfermedadActual);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 220, 80));

        _lbAntePersonales.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbAntePersonales.setForeground(new java.awt.Color(153, 255, 255));
        _lbAntePersonales.setText("ANTECEDENTES PERSONALES");
        _lbAntePersonales.setToolTipText("");
        add(_lbAntePersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, -1));

        _aaAntePersonales.setColumns(20);
        _aaAntePersonales.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaAntePersonales.setRows(5);
        _aaAntePersonales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaAntePersonalesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(_aaAntePersonales);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 230, 80));

        _lbAnteFamiliares.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbAnteFamiliares.setForeground(new java.awt.Color(153, 255, 255));
        _lbAnteFamiliares.setText("ANTECEDENTES FAMILIARES");
        add(_lbAnteFamiliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, -1, -1));

        _aaAnteFamiliares.setColumns(20);
        _aaAnteFamiliares.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaAnteFamiliares.setRows(5);
        _aaAnteFamiliares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaAnteFamiliaresKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(_aaAnteFamiliares);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 230, 80));

        _lbAntePatologicos.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbAntePatologicos.setForeground(new java.awt.Color(153, 255, 255));
        _lbAntePatologicos.setText("ANTECEDENTES PATOLÓGICOS");
        add(_lbAntePatologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        _aaAntePatologicos.setColumns(20);
        _aaAntePatologicos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaAntePatologicos.setRows(5);
        _aaAntePatologicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaAntePatologicosKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(_aaAntePatologicos);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 230, 80));

        _lbAnteFarmacologicos.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbAnteFarmacologicos.setForeground(new java.awt.Color(153, 255, 255));
        _lbAnteFarmacologicos.setText("ANTECEDENTES FARMACOLÓGICOS");
        add(_lbAnteFarmacologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        _aaAnteFarmacologicos.setColumns(20);
        _aaAnteFarmacologicos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaAnteFarmacologicos.setRows(5);
        _aaAnteFarmacologicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaAnteFarmacologicosKeyTyped(evt);
            }
        });
        jScrollPane5.setViewportView(_aaAnteFarmacologicos);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 240, 80));

        _lbTipoConsulta.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTipoConsulta.setForeground(new java.awt.Color(153, 255, 255));
        _lbTipoConsulta.setText("TIPO DE CONSULTA");
        add(_lbTipoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        _aaTipoConsulta.setColumns(20);
        _aaTipoConsulta.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaTipoConsulta.setRows(5);
        _aaTipoConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaTipoConsultaKeyTyped(evt);
            }
        });
        jScrollPane6.setViewportView(_aaTipoConsulta);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 210, 80));

        _lbExamenFisico.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbExamenFisico.setForeground(new java.awt.Color(153, 255, 255));
        _lbExamenFisico.setText("EXAMEN FÍSICO");
        _lbExamenFisico.setToolTipText("");
        add(_lbExamenFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        _aaExamenFisico.setColumns(20);
        _aaExamenFisico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaExamenFisico.setRows(5);
        _aaExamenFisico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaExamenFisicoKeyTyped(evt);
            }
        });
        jScrollPane7.setViewportView(_aaExamenFisico);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 210, 80));

        _lbDiagnostico.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbDiagnostico.setForeground(new java.awt.Color(153, 255, 255));
        _lbDiagnostico.setText("DIAGNÓSTICO");
        add(_lbDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        _aaDiagnostico.setColumns(20);
        _aaDiagnostico.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaDiagnostico.setRows(5);
        _aaDiagnostico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaDiagnosticoKeyTyped(evt);
            }
        });
        jScrollPane8.setViewportView(_aaDiagnostico);

        add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 210, 80));

        _lbPlanDeTratamiento.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbPlanDeTratamiento.setForeground(new java.awt.Color(153, 255, 255));
        _lbPlanDeTratamiento.setText("PLAN DE TRATAMIENTO");
        add(_lbPlanDeTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        _aaPlanDeTratamiento.setColumns(20);
        _aaPlanDeTratamiento.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _aaPlanDeTratamiento.setRows(5);
        _aaPlanDeTratamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _aaPlanDeTratamientoKeyTyped(evt);
            }
        });
        jScrollPane9.setViewportView(_aaPlanDeTratamiento);

        add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 210, 80));

        _lbFechaConsulta.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbFechaConsulta.setForeground(new java.awt.Color(153, 255, 255));
        _lbFechaConsulta.setText("FECHA CONSULTA");
        add(_lbFechaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 180, -1));

        _lbMes.setFont(new java.awt.Font("Metropolis Black", 1, 13)); // NOI18N
        _lbMes.setForeground(new java.awt.Color(255, 255, 255));
        _lbMes.setText("MES");
        add(_lbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        _lbDia.setFont(new java.awt.Font("Metropolis Black", 1, 13)); // NOI18N
        _lbDia.setForeground(new java.awt.Color(255, 255, 255));
        _lbDia.setText("DÍA");
        add(_lbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        _lbAno.setFont(new java.awt.Font("Metropolis Black", 1, 13)); // NOI18N
        _lbAno.setForeground(new java.awt.Color(255, 255, 255));
        _lbAno.setText("AÑO");
        add(_lbAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        _cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        _cbMes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbMesActionPerformed(evt);
            }
        });
        add(_cbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 70, 40));

        _cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        _cbDia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbDiaActionPerformed(evt);
            }
        });
        add(_cbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, 40));

        _cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        _cbAno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbAnoActionPerformed(evt);
            }
        });
        add(_cbAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 90, 40));

        _lbCedulaAsociado.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbCedulaAsociado.setForeground(new java.awt.Color(153, 255, 255));
        _lbCedulaAsociado.setText("CÉDULA ASOCIADA AL HISTORIAL");
        add(_lbCedulaAsociado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        _cbCedula.setEditable(true);
        _cbCedula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbCedulaActionPerformed(evt);
            }
        });
        add(_cbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 260, 40));

        _labelError1.setFont(new java.awt.Font("Metropolis Black", 1, 10)); // NOI18N
        _labelError1.setForeground(new java.awt.Color(255, 255, 255));
        add(_labelError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 300, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void _cbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbMesActionPerformed
        _cbMes.setBackground(Color.white);
        _textoCMes = _cbMes.getSelectedItem().toString();
    }//GEN-LAST:event__cbMesActionPerformed

    private void _cbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbDiaActionPerformed
        _cbDia.setBackground(Color.white);
        _textoCDia = _cbDia.getSelectedItem().toString();
    }//GEN-LAST:event__cbDiaActionPerformed

    private void _cbAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbAnoActionPerformed
        _cbAno.setBackground(Color.white);
        _textoCAno = _cbAno.getSelectedItem().toString();
    }//GEN-LAST:event__cbAnoActionPerformed

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
    }//GEN-LAST:event__cbCedulaActionPerformed

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
    javax.swing.JComboBox<String> _cbAno;
    javax.swing.JComboBox<String> _cbCedula;
    javax.swing.JComboBox<String> _cbDia;
    javax.swing.JComboBox<String> _cbMes;
    javax.swing.JLabel _labelError1;
    javax.swing.JLabel _labelLogo;
    javax.swing.JLabel _lbAno;
    javax.swing.JLabel _lbAnteFamiliares;
    javax.swing.JLabel _lbAnteFarmacologicos;
    javax.swing.JLabel _lbAntePatologicos;
    javax.swing.JLabel _lbAntePersonales;
    javax.swing.JLabel _lbCedulaAsociado;
    javax.swing.JLabel _lbDia;
    javax.swing.JLabel _lbDiagnostico;
    javax.swing.JLabel _lbEnfermedadActual;
    javax.swing.JLabel _lbExamenFisico;
    javax.swing.JLabel _lbFechaConsulta;
    javax.swing.JLabel _lbMes;
    javax.swing.JLabel _lbPlanDeTratamiento;
    javax.swing.JLabel _lbRazonConsilta;
    javax.swing.JLabel _lbTipoConsulta;
    javax.swing.JTextField _tfRazonConsulta;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JScrollPane jScrollPane3;
    javax.swing.JScrollPane jScrollPane4;
    javax.swing.JScrollPane jScrollPane5;
    javax.swing.JScrollPane jScrollPane6;
    javax.swing.JScrollPane jScrollPane7;
    javax.swing.JScrollPane jScrollPane8;
    javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
    private String _textoCMes = "";
    private String _textoCDia = "";
    private String _textoCAno = "";
    private String _textoCedula = "";

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

    public String getTextoCMes() {
        return _textoCMes;
    }

    public String getTextoCDia() {
        return _textoCDia;
    }

    public String getTextoCAno() {
        return _textoCAno;
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

    public void setCbAno() {
        this._cbAno.setSelectedItem(" ");
    }

    public void setCbCedula() {
        this._cbCedula.setSelectedItem(" ");
    }

    public void setCbDia() {
        this._cbDia.setSelectedItem(" ");
    }

    public void setCbMes() {
        this._cbMes.setSelectedItem(" ");
    }

    public void AvisoCedulaAsociada() {
        this._labelError1.setText("ESTA CÉDULA YA ESTÁ ASOCIADA A UN HISTORIAL");
    }

    public void setAviso() {
        this._labelError1.setText("");
    }

}
