package packagePrincipal.vistaAPaciente;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class PanelRegistrarPaciente extends javax.swing.JPanel {

    public PanelRegistrarPaciente() {
        initComponents();
    }

    public void ErrorNombreP(boolean error) {
        if (error == true) {
            _textNombreP.setBackground(Color.red);
        }
    }

    public void ErrorApellidoP(boolean error) {
        if (error == true) {
            _textApellidoP.setBackground(Color.red);
        }
    }

    public void ErrorCedulaP(boolean error) {
        if (error == true) {
            _textCedula.setBackground(Color.red);
        }
    }

    public void ErrorCorreoP(boolean error) {
        if (error == true) {
            _textCorreoP.setBackground(Color.red);
        }
    }

    public void ErrorTelefonoP(boolean error) {
        if (error == true) {
            _textTelefonoP.setBackground(Color.red);
        }
    }

    public void ErrorOcupacionP(boolean error) {
        if (error == true) {
            _textOcupacionP.setBackground(Color.red);
        }
    }

    public void ErrorDireccionP(boolean error) {
        if (error == true) {
            _areaDireccionP.setBackground(Color.red);
        }
    }

    public void ErrorMes(boolean error) {
        if (error == true) {
            _comboMes.setBackground(Color.red);
        } else {
            _comboMes.setBackground(Color.white);
        }
    }

    public void ErrorDia(boolean error) {
        if (error == true) {
            _comboDia.setBackground(Color.red);
        } else {
            _comboDia.setBackground(Color.white);
        }
    }

    public void ErrorAno(boolean error) {
        if (error == true) {
            _comboAno.setBackground(Color.red);
        } else {
            _comboAno.setBackground(Color.white);
        }
    }

    public void ErrorEdadP(boolean error) {
        if (error == true) {
            _comboEdad.setBackground(Color.red);
        } else {
            _comboEdad.setBackground(Color.white);
        }
    }

    public void ErrorGenero(boolean error) {
        if (error == true) {
            _comboGenero.setBackground(Color.red);
        } else {
            _comboGenero.setBackground(Color.white);
        }
    }

    public void ErrorEstadoCivil(boolean error) {
        if (error == true) {
            _comboEstadoCivil.setBackground(Color.red);
        } else {
            _comboEstadoCivil.setBackground(Color.white);
        }
    }

    public void ErrorNombreR(boolean error) {
        if (error == true) {
            _textNombreR.setBackground(Color.red);
        }
    }

    public void ErrorApellidoR(boolean error) {
        if (error == true) {
            _textApellidoR.setBackground(Color.red);
        }
    }

    public void ErrorTelefonoR(boolean error) {
        if (error == true) {
            _textTelefonoR.setBackground(Color.red);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _botonRegistrar = new javax.swing.JButton();
        _labelNombreP = new javax.swing.JLabel();
        _textNombreP = new javax.swing.JTextField();
        _labelApellidoP = new javax.swing.JLabel();
        _textApellidoP = new javax.swing.JTextField();
        _labelCedulaP = new javax.swing.JLabel();
        _textCedula = new javax.swing.JTextField();
        _comboMes = new javax.swing.JComboBox<>();
        _comboDia = new javax.swing.JComboBox<>();
        _comboAno = new javax.swing.JComboBox<>();
        _labelMes = new javax.swing.JLabel();
        _labelDia = new javax.swing.JLabel();
        _labelAno = new javax.swing.JLabel();
        _labelFNacimientoP = new javax.swing.JLabel();
        _comboEdad = new javax.swing.JComboBox<>();
        _labelEdad = new javax.swing.JLabel();
        _labelGenero = new javax.swing.JLabel();
        _comboGenero = new javax.swing.JComboBox<>();
        _labelEstadoCivil = new javax.swing.JLabel();
        _comboEstadoCivil = new javax.swing.JComboBox<>();
        _textTelefonoP = new javax.swing.JTextField();
        _labelTelefonoP = new javax.swing.JLabel();
        _textOcupacionP = new javax.swing.JTextField();
        _labelOcupacionP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _areaDireccionP = new javax.swing.JTextArea();
        _labelDireccionP = new javax.swing.JLabel();
        _textCorreoP = new javax.swing.JTextField();
        _labelCorreoP = new javax.swing.JLabel();
        _labelNombreR = new javax.swing.JLabel();
        _textNombreR = new javax.swing.JTextField();
        _labelApellidoR = new javax.swing.JLabel();
        _textApellidoR = new javax.swing.JTextField();
        _labelTelefonoR = new javax.swing.JLabel();
        _textTelefonoR = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        _labelLogo = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        _labelCedulaRepetida = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 188, 156));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonRegistrar.setBackground(new java.awt.Color(54, 203, 167));
        _botonRegistrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        _botonRegistrar.setText("REGISTRAR");
        _botonRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 310, 50));

        _labelNombreP.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelNombreP.setForeground(new java.awt.Color(153, 255, 255));
        _labelNombreP.setText("NOMBRES ");
        add(_labelNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, -1));

        _textNombreP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textNombreP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textNombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textNombrePKeyTyped(evt);
            }
        });
        add(_textNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 30));

        _labelApellidoP.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelApellidoP.setForeground(new java.awt.Color(153, 255, 255));
        _labelApellidoP.setText("APELLIDOS");
        _labelApellidoP.setPreferredSize(new java.awt.Dimension(41, 17));
        add(_labelApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 110, -1));

        _textApellidoP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textApellidoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textApellidoPKeyTyped(evt);
            }
        });
        add(_textApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 200, 30));

        _labelCedulaP.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelCedulaP.setForeground(new java.awt.Color(153, 255, 255));
        _labelCedulaP.setText("CÉDULA");
        _labelCedulaP.setPreferredSize(new java.awt.Dimension(41, 17));
        add(_labelCedulaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 100, -1));

        _textCedula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textCedulaKeyTyped(evt);
            }
        });
        add(_textCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 200, 30));

        _comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        _comboMes.setToolTipText("");
        _comboMes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _comboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _comboMesActionPerformed(evt);
            }
        });
        add(_comboMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 90, 40));

        _comboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        _comboDia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _comboDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _comboDiaActionPerformed(evt);
            }
        });
        add(_comboDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 90, 40));

        _comboAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        _comboAno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _comboAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _comboAnoActionPerformed(evt);
            }
        });
        add(_comboAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 120, 40));

        _labelMes.setFont(new java.awt.Font("Metropolis Black", 1, 13)); // NOI18N
        _labelMes.setForeground(new java.awt.Color(255, 255, 255));
        _labelMes.setText("MES");
        add(_labelMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 60, -1));

        _labelDia.setFont(new java.awt.Font("Metropolis Black", 1, 13)); // NOI18N
        _labelDia.setForeground(new java.awt.Color(255, 255, 255));
        _labelDia.setText("DÍA");
        add(_labelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        _labelAno.setFont(new java.awt.Font("Metropolis Black", 1, 13)); // NOI18N
        _labelAno.setForeground(new java.awt.Color(255, 255, 255));
        _labelAno.setText("AÑO");
        add(_labelAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 70, -1));

        _labelFNacimientoP.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelFNacimientoP.setForeground(new java.awt.Color(153, 255, 255));
        _labelFNacimientoP.setText("FECHA DE NACIMIENTO");
        add(_labelFNacimientoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 200, 20));

        _comboEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120" }));
        _comboEdad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _comboEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _comboEdadActionPerformed(evt);
            }
        });
        add(_comboEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 100, 40));

        _labelEdad.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelEdad.setForeground(new java.awt.Color(153, 255, 255));
        _labelEdad.setText("EDAD");
        add(_labelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        _labelGenero.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelGenero.setForeground(new java.awt.Color(153, 255, 255));
        _labelGenero.setText("GÉNERO");
        add(_labelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 80, -1));

        _comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Femenino", "Otro." }));
        _comboGenero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _comboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _comboGeneroActionPerformed(evt);
            }
        });
        add(_comboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 110, 40));

        _labelEstadoCivil.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelEstadoCivil.setForeground(new java.awt.Color(153, 255, 255));
        _labelEstadoCivil.setText("ESTADO CIVIL");
        add(_labelEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, -1));

        _comboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Casado", "Casada", "Soltero", "Soltera", "Otro." }));
        _comboEstadoCivil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _comboEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _comboEstadoCivilActionPerformed(evt);
            }
        });
        add(_comboEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 170, 40));

        _textTelefonoP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textTelefonoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textTelefonoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textTelefonoPKeyTyped(evt);
            }
        });
        add(_textTelefonoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 200, 30));

        _labelTelefonoP.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelTelefonoP.setForeground(new java.awt.Color(153, 255, 255));
        _labelTelefonoP.setText("NÚMERO TELEFÓNICO");
        add(_labelTelefonoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        _textOcupacionP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textOcupacionP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textOcupacionP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textOcupacionPKeyTyped(evt);
            }
        });
        add(_textOcupacionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 200, 30));

        _labelOcupacionP.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelOcupacionP.setForeground(new java.awt.Color(153, 255, 255));
        _labelOcupacionP.setText("OCUPACIÓN");
        add(_labelOcupacionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        _areaDireccionP.setColumns(20);
        _areaDireccionP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _areaDireccionP.setRows(5);
        _areaDireccionP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _areaDireccionPKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(_areaDireccionP);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 260, -1));

        _labelDireccionP.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelDireccionP.setForeground(new java.awt.Color(153, 255, 255));
        _labelDireccionP.setText("DIRECCIÓN DE RESIDENCIA");
        add(_labelDireccionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 230, -1));

        _textCorreoP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textCorreoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textCorreoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textCorreoPKeyTyped(evt);
            }
        });
        add(_textCorreoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, 30));

        _labelCorreoP.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelCorreoP.setForeground(new java.awt.Color(153, 255, 255));
        _labelCorreoP.setText("CORREO ELECTRÓNICO");
        add(_labelCorreoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        _labelNombreR.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelNombreR.setForeground(new java.awt.Color(153, 255, 255));
        _labelNombreR.setText("NOMBRE DEL RESPONSABLE");
        add(_labelNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        _textNombreR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textNombreR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textNombreR.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        _textNombreR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textNombreRKeyTyped(evt);
            }
        });
        add(_textNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 240, 30));

        _labelApellidoR.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelApellidoR.setForeground(new java.awt.Color(153, 255, 255));
        _labelApellidoR.setText("APELLIDO DEL RESPONSABLE");
        add(_labelApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        _textApellidoR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textApellidoR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textApellidoR.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        _textApellidoR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textApellidoRKeyTyped(evt);
            }
        });
        add(_textApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 250, 30));

        _labelTelefonoR.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelTelefonoR.setForeground(new java.awt.Color(153, 255, 255));
        _labelTelefonoR.setText("NÜMERO DEL RESPONSABLE");
        add(_labelTelefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, -1));

        _textTelefonoR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textTelefonoR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textTelefonoR.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        _textTelefonoR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textTelefonoRKeyTyped(evt);
            }
        });
        add(_textTelefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 240, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 900, 10));

        _labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/registrarPaciente.png"))); // NOI18N
        add(_labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 730, 70));

        _botonVolver.setBackground(new java.awt.Color(26, 188, 156));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setToolTipText("");
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 60));

        _labelCedulaRepetida.setFont(new java.awt.Font("Metropolis Black", 0, 14)); // NOI18N
        _labelCedulaRepetida.setForeground(new java.awt.Color(255, 255, 255));
        add(_labelCedulaRepetida, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 180, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void _textNombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textNombrePKeyTyped
        char c = evt.getKeyChar();
        _textNombreP.setBackground(Color.white);
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
    }//GEN-LAST:event__textNombrePKeyTyped

    private void _textApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textApellidoPKeyTyped
        char c = evt.getKeyChar();
        _textApellidoP.setBackground(Color.white);
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
    }//GEN-LAST:event__textApellidoPKeyTyped

    private void _textCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textCedulaKeyTyped
        char c = evt.getKeyChar();
        this._labelCedulaRepetida.setText("");
        _textCedula.setBackground(Color.white);
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event__textCedulaKeyTyped

    private void _textTelefonoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textTelefonoPKeyTyped
        char c = evt.getKeyChar();
        _textTelefonoP.setBackground(Color.white);
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event__textTelefonoPKeyTyped

    private void _textNombreRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textNombreRKeyTyped
        char c = evt.getKeyChar();
        _textNombreR.setBackground(Color.white);
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
    }//GEN-LAST:event__textNombreRKeyTyped

    private void _textApellidoRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textApellidoRKeyTyped
        char c = evt.getKeyChar();
        _textApellidoR.setBackground(Color.white);
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
    }//GEN-LAST:event__textApellidoRKeyTyped

    private void _textTelefonoRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textTelefonoRKeyTyped
        char c = evt.getKeyChar();
        _textTelefonoR.setBackground(Color.white);
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event__textTelefonoRKeyTyped

    private void _textOcupacionPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textOcupacionPKeyTyped
        char c = evt.getKeyChar();
        _textOcupacionP.setBackground(Color.white);
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
    }//GEN-LAST:event__textOcupacionPKeyTyped

    private void _textCorreoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textCorreoPKeyTyped
    _textCorreoP.setBackground(Color.white);
    }//GEN-LAST:event__textCorreoPKeyTyped

    private void _areaDireccionPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__areaDireccionPKeyTyped
        char c = evt.getKeyChar();
        _areaDireccionP.setBackground(Color.white);
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }

    }//GEN-LAST:event__areaDireccionPKeyTyped

    private void _comboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__comboMesActionPerformed
        _comboMes.setBackground(Color.white);
        _textoCMes = _comboMes.getSelectedItem().toString();
    }//GEN-LAST:event__comboMesActionPerformed

    private void _comboDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__comboDiaActionPerformed
        _comboDia.setBackground(Color.white);
        _textoCDia = _comboDia.getSelectedItem().toString();
    }//GEN-LAST:event__comboDiaActionPerformed

    private void _comboAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__comboAnoActionPerformed
        _comboAno.setBackground(Color.white);
        _textoCAno = _comboAno.getSelectedItem().toString();
    }//GEN-LAST:event__comboAnoActionPerformed

    private void _comboEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__comboEdadActionPerformed
        _comboEdad.setBackground(Color.white);
        _textoEdad = _comboEdad.getSelectedItem().toString();
        if (_textoEdad.equals(" ") == false) {
            if (Integer.valueOf(_textoEdad) >= 18) {
                _textNombreR.setBackground(Color.gray);
                _textNombreR.setForeground(Color.white);
                this._textNombreR.setText("NO APLICA, PACIENTE MAYOR");
                _textNombreR.setEnabled(false);
                _textApellidoR.setBackground(Color.gray);
                _textApellidoR.setForeground(Color.white);
                this._textApellidoR.setText("NO APLICA, PACIENTE MAYOR");
                _textApellidoR.setEnabled(false);
                _textTelefonoR.setForeground(Color.white);
                _textTelefonoR.setBackground(Color.gray);
                this._textTelefonoR.setText("NO APLICA, PACIENTE MAYOR");
            } else if (Integer.valueOf(_textoEdad) < 18) {
                _textNombreR.setBackground(Color.white);
                _textNombreR.setForeground(Color.black);
                this._textNombreR.setText("");
                _textNombreR.setEnabled(true);
                _textApellidoR.setBackground(Color.white);
                _textApellidoR.setForeground(Color.black);
                this._textApellidoR.setText("");
                _textApellidoR.setEnabled(true);
                _textTelefonoR.setBackground(Color.white);
                _textTelefonoR.setForeground(Color.black);
                this._textTelefonoR.setText("");
                _textTelefonoR.setEnabled(true);
            }
        } else if (_textoEdad.equals(" ") == true) {
            _textNombreR.setBackground(Color.white);
            _textNombreR.setForeground(Color.black);
            this._textNombreR.setText("");
            _textNombreR.setEnabled(true);
            _textApellidoR.setBackground(Color.white);
            _textApellidoR.setForeground(Color.black);
            this._textApellidoR.setText("");
            _textApellidoR.setEnabled(true);
            _textTelefonoR.setBackground(Color.white);
            _textTelefonoR.setForeground(Color.black);
            this._textTelefonoR.setText("");
            _textTelefonoR.setEnabled(true);
        }
    }//GEN-LAST:event__comboEdadActionPerformed

    private void _comboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__comboGeneroActionPerformed
        _comboGenero.setBackground(Color.white);
        _textoGenero = _comboGenero.getSelectedItem().toString();
    }//GEN-LAST:event__comboGeneroActionPerformed

    private void _comboEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__comboEstadoCivilActionPerformed
        _comboEstadoCivil.setBackground(Color.white);
        _textoEstadoCivil = _comboEstadoCivil.getSelectedItem().toString();
    }//GEN-LAST:event__comboEstadoCivilActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonRegistrar.addActionListener(listener);
        _botonVolver.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextArea _areaDireccionP;
    javax.swing.JButton _botonRegistrar;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _comboAno;
    javax.swing.JComboBox<String> _comboDia;
    javax.swing.JComboBox<String> _comboEdad;
    javax.swing.JComboBox<String> _comboEstadoCivil;
    javax.swing.JComboBox<String> _comboGenero;
    javax.swing.JComboBox<String> _comboMes;
    javax.swing.JLabel _labelAno;
    javax.swing.JLabel _labelApellidoP;
    javax.swing.JLabel _labelApellidoR;
    javax.swing.JLabel _labelCedulaP;
    javax.swing.JLabel _labelCedulaRepetida;
    javax.swing.JLabel _labelCorreoP;
    javax.swing.JLabel _labelDia;
    javax.swing.JLabel _labelDireccionP;
    javax.swing.JLabel _labelEdad;
    javax.swing.JLabel _labelEstadoCivil;
    javax.swing.JLabel _labelFNacimientoP;
    javax.swing.JLabel _labelGenero;
    javax.swing.JLabel _labelLogo;
    javax.swing.JLabel _labelMes;
    javax.swing.JLabel _labelNombreP;
    javax.swing.JLabel _labelNombreR;
    javax.swing.JLabel _labelOcupacionP;
    javax.swing.JLabel _labelTelefonoP;
    javax.swing.JLabel _labelTelefonoR;
    javax.swing.JTextField _textApellidoP;
    javax.swing.JTextField _textApellidoR;
    javax.swing.JTextField _textCedula;
    javax.swing.JTextField _textCorreoP;
    javax.swing.JTextField _textNombreP;
    javax.swing.JTextField _textNombreR;
    javax.swing.JTextField _textOcupacionP;
    javax.swing.JTextField _textTelefonoP;
    javax.swing.JTextField _textTelefonoR;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    private String _textoCMes = "";
    private String _textoCDia = "";
    private String _textoCAno = "";
    private String _textoEdad = "";
    private String _textoGenero = "";
    private String _textoEstadoCivil = "";

    public JButton getBotonRegistrar() {
        return _botonRegistrar;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public String getTextNombreP() {
        return _textNombreP.getText();
    }

    public String getAreaDireccionP() {
        return _areaDireccionP.getText();
    }

    public String getTextApellidoP() {
        return _textApellidoP.getText();
    }

    public String getTextApellidoR() {
        return _textApellidoR.getText();
    }

    public String getTextCedula() {
        return _textCedula.getText();
    }

    public String getTextNombreR() {
        return _textNombreR.getText();
    }

    public String getTextOcupacionP() {
        return _textOcupacionP.getText();
    }

    public String getTextTelefonoP() {
        return _textTelefonoP.getText();
    }

    public String getTextCorreoP() {
        return _textCorreoP.getText();
    }

    public String getTextTelefonoR() {
        return _textTelefonoR.getText();
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

    public String getTextoEdad() {
        return _textoEdad;
    }

    public String getTextoGenero() {
        return _textoGenero;
    }

    public String getTextoEstadoCivil() {
        return _textoEstadoCivil;
    }

    public void setTextNombreR() {
        _textNombreR.setBackground(Color.white);
        _textNombreR.setEnabled(true);
    }

    public void setTextApellidoR() {
        _textApellidoR.setBackground(Color.white);
        _textApellidoR.setEnabled(true);
    }

    public void setTextTelefonoR() {
        _textTelefonoR.setBackground(Color.white);
        _textTelefonoR.setEnabled(true);
    }

    public void setLabelCedulaRepetida() {
        this._labelCedulaRepetida.setText("CÉDULA YA EXISTENTE");
    }

    public void setLabelCedulaRepetida1() {
        this._labelCedulaRepetida.setText("");
    }

    public void setAreaDireccionP() {
        this._areaDireccionP.setText("");
    }

    public void setTextApellidoP() {
        this._textApellidoP.setText("");
    }

    public void setTextApellidoRBorrar() {
        this._textApellidoR.setText("");
    }

    public void setTextCedula() {
        this._textCedula.setText("");
    }

    public void setTextCorreoP() {
        this._textCorreoP.setText("");
    }

    public void setTextNombreP() {
        this._textNombreP.setText("");
    }

    public void setTextNombreRBorrar() {
        this._textNombreR.setText("");
    }

    public void setTextOcupacionP() {
        this._textOcupacionP.setText("");
    }

    public void setTextTelefonoP() {
        this._textTelefonoP.setText("");
    }

    public void setTextTelefonoRBorrar() {
        this._textTelefonoR.setText("");
    }

    public void setComboAno() {
        this._comboAno.setSelectedItem(" ");;
    }

    public void setComboDia() {
        this._comboDia.setSelectedItem(" ");
    }

    public void setComboEdad() {
        this._comboEdad.setSelectedItem(" ");
    }

    public void setComboEstadoCivil() {
        this._comboEstadoCivil.setSelectedItem(" ");
    }

    public void setComboGenero() {
        this._comboGenero.setSelectedItem(" ");
    }

    public void setComboMes() {
        this._comboMes.setSelectedItem(" ");
    }

}
