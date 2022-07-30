package packagePrincipal.vistaAPaciente;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import vista.PlaceHolder;

public class PanelRegistrarPaciente extends javax.swing.JPanel {

    public PanelRegistrarPaciente() {
        initComponents();
        _lbIFNImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenesMedicos/IconoPorDefecto.jpg")));
        _placeHolders = new PlaceHolder("       INGRESAR NOMBRE", _textNombreP);
        _placeHolders = new PlaceHolder("       INGRESAR APELLIDO", _textApellidoP);
        _placeHolders = new PlaceHolder("       INGRESAR TELÉFONO", _textTelefonoP);
        _placeHolders = new PlaceHolder("       INGRESAR CÉDULA", _tFCedulaP1);
        _placeHolders = new PlaceHolder("  0", _fTCedulaP2);
        _placeHolders = new PlaceHolder("       INGRESAR CORREO", _textCorreoP);
        _placeHolders = new PlaceHolder("       INGRESAR OCUPACIÓN", _textOcupacionP);
        _placeHolders = new PlaceHolder("       INGRESAR DIRECCIÓN", _areaDireccionP);
        _placeHolders = new PlaceHolder("       INGRESAR NOMBRE", _textNombreR);
        _placeHolders = new PlaceHolder("       INGRESAR APELLIDO", _textApellidoR);
        _placeHolders = new PlaceHolder("       INGRESAR TELÉFONO", _textTelefonoR);

    }

    public void Resetearimagen() {
        _lbIFNImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenesMedicos/IconoPorDefecto.jpg")));
    }

    public boolean FiltrarExtensionesFileChooser(String path) {
        String extension = "";
        boolean extensionValida = false;
        int posicionExtension = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '.') {
                posicionExtension = i + 1;
                break;
            }
        }

        for (int i = posicionExtension; i < path.length(); i++) {
            extension += path.charAt(i);
        }

        if (extension.equals("png") || extension.equals("jpg")) {
            extensionValida = true;
        }

        return extensionValida;
    }

    public void AgregarJFileChooser() {
        boolean extensionValida;
        JFileChooser jFChooser = new JFileChooser();
        jFChooser.setMultiSelectionEnabled(false);
        if (jFChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            extensionValida = FiltrarExtensionesFileChooser(jFChooser.getSelectedFile().toString());
            if (extensionValida == true) {
                _lbIFNImagen.setIcon(new javax.swing.ImageIcon(jFChooser.getSelectedFile().toString()));
            } else {
                JOptionPane.showMessageDialog(null, "SOLO SON VÁLIDOS LOS ARCHIVOS CON \n EXTENSIÓN (.png ó .jpg)", "ERROR DE EXTENSIÓN", JOptionPane.ERROR_MESSAGE);
            }
        }
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

    public void ErrorCedulaP1(boolean error) {
        if (error == true) {
            _tFCedulaP1.setBackground(Color.red);
        }
    }

    public void ErrorCedulaP2(boolean error) {
        if (error == true) {
            _fTCedulaP2.setBackground(Color.red);
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
        _tFCedulaP1 = new javax.swing.JTextField();
        _comboMes = new javax.swing.JComboBox<>();
        _comboDia = new javax.swing.JComboBox<>();
        _comboAno = new javax.swing.JComboBox<>();
        _labelMes = new javax.swing.JLabel();
        _labelDia = new javax.swing.JLabel();
        _labelAno = new javax.swing.JLabel();
        _labelFNacimientoP = new javax.swing.JLabel();
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
        _botonVolver = new javax.swing.JButton();
        _lbCedulaError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        _lbIFNImagen = new javax.swing.JLabel();
        _botonAgregarImagen = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        _lbNombreVacio = new javax.swing.JLabel();
        _lbApellidoVacio = new javax.swing.JLabel();
        _lbNumeroError = new javax.swing.JLabel();
        _lbGuion = new javax.swing.JLabel();
        _fTCedulaP2 = new javax.swing.JTextField();
        _lbCorreoError = new javax.swing.JLabel();
        _lbOcupacion = new javax.swing.JLabel();
        _lbDireccionVacia = new javax.swing.JLabel();
        _lbSeleccioneFecha = new javax.swing.JLabel();
        _lbSeleccionEstado = new javax.swing.JLabel();
        _lbSeleccioneGenero = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        _lbDatosResponsable = new javax.swing.JLabel();
        _lbNombreRVacio = new javax.swing.JLabel();
        _lbApellidoRVacio = new javax.swing.JLabel();
        _lbNumeroRError = new javax.swing.JLabel();
        _botonAyuda = new javax.swing.JButton();

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonRegistrar.setBackground(new java.awt.Color(54, 203, 167));
        _botonRegistrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        _botonRegistrar.setText("REGISTRAR");
        _botonRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 650, 310, 40));

        _labelNombreP.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _labelNombreP.setForeground(new java.awt.Color(153, 255, 255));
        _labelNombreP.setText("NOMBRE");
        add(_labelNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 90, -1));

        _textNombreP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textNombreP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textNombreP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _textNombrePMouseClicked(evt);
            }
        });
        _textNombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textNombrePKeyTyped(evt);
            }
        });
        add(_textNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 240, 30));

        _labelApellidoP.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _labelApellidoP.setForeground(new java.awt.Color(153, 255, 255));
        _labelApellidoP.setText("APELLIDO");
        _labelApellidoP.setPreferredSize(new java.awt.Dimension(41, 17));
        add(_labelApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 110, -1));

        _textApellidoP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textApellidoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textApellidoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _textApellidoPMouseClicked(evt);
            }
        });
        _textApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textApellidoPKeyTyped(evt);
            }
        });
        add(_textApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 230, 30));

        _labelCedulaP.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _labelCedulaP.setForeground(new java.awt.Color(153, 255, 255));
        _labelCedulaP.setText("CÉDULA");
        _labelCedulaP.setPreferredSize(new java.awt.Dimension(41, 17));
        add(_labelCedulaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 100, -1));

        _tFCedulaP1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _tFCedulaP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tFCedulaP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _tFCedulaP1MouseClicked(evt);
            }
        });
        _tFCedulaP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _tFCedulaP1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tFCedulaP1KeyTyped(evt);
            }
        });
        add(_tFCedulaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 170, 30));

        _comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        _comboMes.setToolTipText("");
        _comboMes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _comboMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _comboMesActionPerformed(evt);
            }
        });
        add(_comboMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 415, 90, 40));

        _comboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        _comboDia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _comboDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _comboDiaActionPerformed(evt);
            }
        });
        add(_comboDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 415, 90, 40));

        _comboAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        _comboAno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _comboAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _comboAnoActionPerformed(evt);
            }
        });
        add(_comboAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 415, 120, 40));

        _labelMes.setFont(new java.awt.Font("Metropolis Black", 1, 13)); // NOI18N
        _labelMes.setForeground(new java.awt.Color(255, 255, 255));
        _labelMes.setText("MES");
        add(_labelMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 50, -1));

        _labelDia.setFont(new java.awt.Font("Metropolis Black", 1, 13)); // NOI18N
        _labelDia.setForeground(new java.awt.Color(255, 255, 255));
        _labelDia.setText("DÍA");
        add(_labelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, -1, -1));

        _labelAno.setFont(new java.awt.Font("Metropolis Black", 1, 13)); // NOI18N
        _labelAno.setForeground(new java.awt.Color(255, 255, 255));
        _labelAno.setText("AÑO");
        add(_labelAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 400, 70, -1));

        _labelFNacimientoP.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _labelFNacimientoP.setForeground(new java.awt.Color(153, 255, 255));
        _labelFNacimientoP.setText("FECHA DE NACIMIENTO");
        add(_labelFNacimientoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 220, 20));

        _labelGenero.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _labelGenero.setForeground(new java.awt.Color(153, 255, 255));
        _labelGenero.setText("GÉNERO");
        add(_labelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 520, 80, -1));

        _comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Femenino", "Otro." }));
        _comboGenero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _comboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _comboGeneroActionPerformed(evt);
            }
        });
        add(_comboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 540, 110, 40));

        _labelEstadoCivil.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _labelEstadoCivil.setForeground(new java.awt.Color(153, 255, 255));
        _labelEstadoCivil.setText("ESTADO CIVIL");
        add(_labelEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        _comboEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Casado", "Casada", "Soltero", "Soltera", "Otro." }));
        _comboEstadoCivil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _comboEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _comboEstadoCivilActionPerformed(evt);
            }
        });
        add(_comboEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 170, 40));

        _textTelefonoP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textTelefonoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textTelefonoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _textTelefonoPMouseClicked(evt);
            }
        });
        _textTelefonoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textTelefonoPKeyTyped(evt);
            }
        });
        add(_textTelefonoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, 230, 30));

        _labelTelefonoP.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _labelTelefonoP.setForeground(new java.awt.Color(153, 255, 255));
        _labelTelefonoP.setText("NÚMERO TELEFÓNICO");
        add(_labelTelefonoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, -1, -1));

        _textOcupacionP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textOcupacionP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textOcupacionP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _textOcupacionPMouseClicked(evt);
            }
        });
        _textOcupacionP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textOcupacionPKeyTyped(evt);
            }
        });
        add(_textOcupacionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, 210, 30));

        _labelOcupacionP.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _labelOcupacionP.setForeground(new java.awt.Color(153, 255, 255));
        _labelOcupacionP.setText("OCUPACIÓN");
        add(_labelOcupacionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 250, -1, -1));

        _areaDireccionP.setColumns(20);
        _areaDireccionP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _areaDireccionP.setRows(5);
        _areaDireccionP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _areaDireccionPMouseClicked(evt);
            }
        });
        _areaDireccionP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _areaDireccionPKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(_areaDireccionP);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 270, -1));

        _labelDireccionP.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _labelDireccionP.setForeground(new java.awt.Color(153, 255, 255));
        _labelDireccionP.setText("DIRECCIÓN DE RESIDENCIA");
        add(_labelDireccionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 250, -1));

        _textCorreoP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textCorreoP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textCorreoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _textCorreoPMouseClicked(evt);
            }
        });
        _textCorreoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textCorreoPKeyTyped(evt);
            }
        });
        add(_textCorreoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 230, 30));

        _labelCorreoP.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _labelCorreoP.setForeground(new java.awt.Color(153, 255, 255));
        _labelCorreoP.setText("CORREO ELECTRÓNICO");
        add(_labelCorreoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, -1, -1));

        _labelNombreR.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelNombreR.setForeground(new java.awt.Color(153, 255, 255));
        _labelNombreR.setText("NOMBRE ");
        add(_labelNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        _textNombreR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textNombreR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textNombreR.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        _textNombreR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _textNombreRMouseClicked(evt);
            }
        });
        _textNombreR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textNombreRKeyTyped(evt);
            }
        });
        add(_textNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 240, 30));

        _labelApellidoR.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelApellidoR.setForeground(new java.awt.Color(153, 255, 255));
        _labelApellidoR.setText("APELLIDO ");
        add(_labelApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, -1, -1));

        _textApellidoR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textApellidoR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textApellidoR.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        _textApellidoR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _textApellidoRMouseClicked(evt);
            }
        });
        _textApellidoR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textApellidoRKeyTyped(evt);
            }
        });
        add(_textApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 250, 30));

        _labelTelefonoR.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _labelTelefonoR.setForeground(new java.awt.Color(153, 255, 255));
        _labelTelefonoR.setText("NÜMERO TELEFÓNICO");
        add(_labelTelefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, -1, -1));

        _textTelefonoR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _textTelefonoR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _textTelefonoR.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        _textTelefonoR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _textTelefonoRMouseClicked(evt);
            }
        });
        _textTelefonoR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _textTelefonoRKeyTyped(evt);
            }
        });
        add(_textTelefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 240, 30));

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setToolTipText("");
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        _lbCedulaError.setFont(new java.awt.Font("Metropolis Black", 0, 12)); // NOI18N
        _lbCedulaError.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbCedulaError, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 270, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/registrarPaciente.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 90));

        jPanel1.setBackground(new java.awt.Color(0, 137, 123));
        jPanel1.setLayout(null);
        jPanel1.add(_lbIFNImagen);
        _lbIFNImagen.setBounds(20, 20, 150, 150);

        _botonAgregarImagen.setBackground(new java.awt.Color(54, 203, 167));
        _botonAgregarImagen.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _botonAgregarImagen.setForeground(new java.awt.Color(255, 255, 255));
        _botonAgregarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/File-Explorer-fluent-icon.png"))); // NOI18N
        _botonAgregarImagen.setText("AGREGAR FOTO");
        _botonAgregarImagen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonAgregarImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonAgregarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _botonAgregarImagenActionPerformed(evt);
            }
        });
        jPanel1.add(_botonAgregarImagen);
        _botonAgregarImagen.setBounds(190, 70, 210, 40);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 420, 180));

        jLabel2.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("AGREGAR FOTO");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        _lbNombreVacio.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbNombreVacio.setForeground(new java.awt.Color(255, 255, 255));
        _lbNombreVacio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbNombreVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 240, 20));

        _lbApellidoVacio.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbApellidoVacio.setForeground(new java.awt.Color(255, 255, 255));
        _lbApellidoVacio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbApellidoVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 210, 20));

        _lbNumeroError.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 13)); // NOI18N
        _lbNumeroError.setForeground(new java.awt.Color(255, 255, 255));
        _lbNumeroError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbNumeroError, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, 260, 20));

        _lbGuion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        _lbGuion.setForeground(new java.awt.Color(255, 255, 255));
        _lbGuion.setText("-");
        add(_lbGuion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, 30));

        _fTCedulaP2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _fTCedulaP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _fTCedulaP2.setToolTipText("");
        _fTCedulaP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _fTCedulaP2MouseClicked(evt);
            }
        });
        _fTCedulaP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _fTCedulaP2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _fTCedulaP2KeyTyped(evt);
            }
        });
        add(_fTCedulaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 30, 30));

        _lbCorreoError.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbCorreoError.setForeground(new java.awt.Color(255, 255, 255));
        _lbCorreoError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbCorreoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 240, 20));

        _lbOcupacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbOcupacion.setForeground(new java.awt.Color(255, 255, 255));
        _lbOcupacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 310, 210, 20));

        _lbDireccionVacia.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbDireccionVacia.setForeground(new java.awt.Color(255, 255, 255));
        _lbDireccionVacia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbDireccionVacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 240, 20));

        _lbSeleccioneFecha.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbSeleccioneFecha.setForeground(new java.awt.Color(255, 255, 255));
        _lbSeleccioneFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbSeleccioneFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 340, 20));

        _lbSeleccionEstado.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbSeleccionEstado.setForeground(new java.awt.Color(255, 255, 255));
        _lbSeleccionEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbSeleccionEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 590, 230, 20));

        _lbSeleccioneGenero.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbSeleccioneGenero.setForeground(new java.awt.Color(255, 255, 255));
        _lbSeleccioneGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbSeleccioneGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 590, 220, 20));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 20, 350));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 330, -1));

        _lbDatosResponsable.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbDatosResponsable.setForeground(new java.awt.Color(153, 255, 255));
        _lbDatosResponsable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lbDatosResponsable.setText("DATOS DEL RESPONSABLE");
        add(_lbDatosResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        _lbNombreRVacio.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbNombreRVacio.setForeground(new java.awt.Color(255, 255, 255));
        _lbNombreRVacio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbNombreRVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 210, 20));

        _lbApellidoRVacio.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbApellidoRVacio.setForeground(new java.awt.Color(255, 255, 255));
        _lbApellidoRVacio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbApellidoRVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 210, 20));

        _lbNumeroRError.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbNumeroRError.setForeground(new java.awt.Color(255, 255, 255));
        _lbNumeroRError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbNumeroRError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 290, 20));

        _botonAyuda.setBackground(new java.awt.Color(54, 203, 167));
        _botonAyuda.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _botonAyuda.setForeground(new java.awt.Color(255, 255, 255));
        _botonAyuda.setText("AYUDA");
        _botonAyuda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _botonAyudaActionPerformed(evt);
            }
        });
        add(_botonAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void _textApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textApellidoPKeyTyped
        char c = evt.getKeyChar();
        setLbApellidoVacio1();
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

    private void _tFCedulaP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tFCedulaP1KeyTyped
        _tFCedulaP1.setBackground(Color.white);
        setLbVaciarAvisosCedula();
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        } else {
            if (_tFCedulaP1.getText().isEmpty() == false) {
                if (_contNumCedula1 >= 9) {
                    evt.consume();
                } else {
                    _contNumCedula1++;
                }
            } else {
                _contNumCedula1 = 1;
            }
        }
    }//GEN-LAST:event__tFCedulaP1KeyTyped

    private void _textTelefonoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textTelefonoPKeyTyped
        char c = evt.getKeyChar();
        setLbVaciarAvisoNumero();
        _textTelefonoP.setBackground(Color.white);
        if (c != '+') {
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event__textTelefonoPKeyTyped

    private void _textNombreRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textNombreRKeyTyped
        char c = evt.getKeyChar();
        setLbVaciarAvisoNumeroR();
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
        setLbApellidoRVacio1();
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
        setLbVaciarAvisoNumeroR();
        _textTelefonoR.setBackground(Color.white);
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event__textTelefonoRKeyTyped

    private void _textOcupacionPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textOcupacionPKeyTyped
        char c = evt.getKeyChar();
        setLbOcupacion1();
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

        setLbVaciarAvisoCorreo();
    }//GEN-LAST:event__textCorreoPKeyTyped

    private void _areaDireccionPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__areaDireccionPKeyTyped
        char c = evt.getKeyChar();
        setLbVaciarAvisoDireccion();
        _areaDireccionP.setBackground(Color.white);
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }

    }//GEN-LAST:event__areaDireccionPKeyTyped

    private void _comboMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__comboMesActionPerformed
        _comboMes.setBackground(Color.white);
        setLbVaciarAvisoFecha();
        _textoCMes = _comboMes.getSelectedItem().toString();
    }//GEN-LAST:event__comboMesActionPerformed

    private void _comboDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__comboDiaActionPerformed
        _comboDia.setBackground(Color.white);
        setLbVaciarAvisoFecha();
        _textoCDia = _comboDia.getSelectedItem().toString();
    }//GEN-LAST:event__comboDiaActionPerformed

    private void _comboAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__comboAnoActionPerformed
        _comboAno.setBackground(Color.white);
        setLbVaciarAvisoFecha();
        _textoCAno = _comboAno.getSelectedItem().toString();
    }//GEN-LAST:event__comboAnoActionPerformed

    private void _comboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__comboGeneroActionPerformed
        _comboGenero.setBackground(Color.white);
        setLbVaciarAvisoGenero();
        _textoGenero = _comboGenero.getSelectedItem().toString();
    }//GEN-LAST:event__comboGeneroActionPerformed

    private void _comboEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__comboEstadoCivilActionPerformed
        _comboEstadoCivil.setBackground(Color.white);
        setLbVaciarAvisoEstado();
        _textoEstadoCivil = _comboEstadoCivil.getSelectedItem().toString();
    }//GEN-LAST:event__comboEstadoCivilActionPerformed

    private void _tFCedulaP1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tFCedulaP1KeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            _contNumCedula1--;
        }
    }//GEN-LAST:event__tFCedulaP1KeyReleased

    private void _tFCedulaP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__tFCedulaP1MouseClicked
        _tFCedulaP1.setBackground(Color.white);
    }//GEN-LAST:event__tFCedulaP1MouseClicked

    private void _fTCedulaP2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__fTCedulaP2KeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            _contNumCedula2--;
        }
    }//GEN-LAST:event__fTCedulaP2KeyReleased

    private void _fTCedulaP2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__fTCedulaP2KeyTyped
        _fTCedulaP2.setBackground(Color.white);
        setLbVaciarAvisosCedula();
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        } else {
            if (_fTCedulaP2.getText().isEmpty() == false) {
                if (_contNumCedula2 >= 1) {
                    evt.consume();
                } else {
                    _contNumCedula2++;
                }
            } else {
                _contNumCedula2 = 1;
            }
        }
    }//GEN-LAST:event__fTCedulaP2KeyTyped

    private void _fTCedulaP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__fTCedulaP2MouseClicked
        _fTCedulaP2.setBackground(Color.white);
    }//GEN-LAST:event__fTCedulaP2MouseClicked

    private void _textNombrePMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__textNombrePMouseClicked
        _textNombreP.setBackground(Color.white);
    }//GEN-LAST:event__textNombrePMouseClicked

    private void _textApellidoPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__textApellidoPMouseClicked
        _textApellidoP.setBackground(Color.white);
    }//GEN-LAST:event__textApellidoPMouseClicked

    private void _textTelefonoPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__textTelefonoPMouseClicked
        _textTelefonoP.setBackground(Color.white);
    }//GEN-LAST:event__textTelefonoPMouseClicked

    private void _textCorreoPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__textCorreoPMouseClicked
        _textCorreoP.setBackground(Color.white);
    }//GEN-LAST:event__textCorreoPMouseClicked

    private void _textOcupacionPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__textOcupacionPMouseClicked
        _textOcupacionP.setBackground(Color.white);
    }//GEN-LAST:event__textOcupacionPMouseClicked

    private void _areaDireccionPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__areaDireccionPMouseClicked
        _areaDireccionP.setBackground(Color.white);
    }//GEN-LAST:event__areaDireccionPMouseClicked

    private void _textNombreRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__textNombreRMouseClicked
        _textNombreR.setBackground(Color.white);
    }//GEN-LAST:event__textNombreRMouseClicked

    private void _textApellidoRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__textApellidoRMouseClicked
        _textApellidoR.setBackground(Color.white);
    }//GEN-LAST:event__textApellidoRMouseClicked

    private void _textTelefonoRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__textTelefonoRMouseClicked
        _textTelefonoR.setBackground(Color.white);
    }//GEN-LAST:event__textTelefonoRMouseClicked

    private void _botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__botonAyudaActionPerformed
        FrameAyuda frameayuda = new FrameAyuda();
        frameayuda.setVisible(true);
    }//GEN-LAST:event__botonAyudaActionPerformed

    private void _textNombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__textNombrePKeyTyped
        char c = evt.getKeyChar();
        setLbVaciarAvisoNombreP();
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

    private void _botonAgregarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__botonAgregarImagenActionPerformed
        System.out.println("hola");
        AgregarJFileChooser();
    }//GEN-LAST:event__botonAgregarImagenActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonRegistrar.addActionListener(listener);
        _botonVolver.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextArea _areaDireccionP;
    javax.swing.JButton _botonAgregarImagen;
    javax.swing.JButton _botonAyuda;
    javax.swing.JButton _botonRegistrar;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _comboAno;
    javax.swing.JComboBox<String> _comboDia;
    javax.swing.JComboBox<String> _comboEstadoCivil;
    javax.swing.JComboBox<String> _comboGenero;
    javax.swing.JComboBox<String> _comboMes;
    javax.swing.JTextField _fTCedulaP2;
    javax.swing.JLabel _labelAno;
    javax.swing.JLabel _labelApellidoP;
    javax.swing.JLabel _labelApellidoR;
    javax.swing.JLabel _labelCedulaP;
    javax.swing.JLabel _labelCorreoP;
    javax.swing.JLabel _labelDia;
    javax.swing.JLabel _labelDireccionP;
    javax.swing.JLabel _labelEstadoCivil;
    javax.swing.JLabel _labelFNacimientoP;
    javax.swing.JLabel _labelGenero;
    javax.swing.JLabel _labelMes;
    javax.swing.JLabel _labelNombreP;
    javax.swing.JLabel _labelNombreR;
    javax.swing.JLabel _labelOcupacionP;
    javax.swing.JLabel _labelTelefonoP;
    javax.swing.JLabel _labelTelefonoR;
    javax.swing.JLabel _lbApellidoRVacio;
    javax.swing.JLabel _lbApellidoVacio;
    javax.swing.JLabel _lbCedulaError;
    javax.swing.JLabel _lbCorreoError;
    javax.swing.JLabel _lbDatosResponsable;
    javax.swing.JLabel _lbDireccionVacia;
    javax.swing.JLabel _lbGuion;
    javax.swing.JLabel _lbIFNImagen;
    javax.swing.JLabel _lbNombreRVacio;
    javax.swing.JLabel _lbNombreVacio;
    javax.swing.JLabel _lbNumeroError;
    javax.swing.JLabel _lbNumeroRError;
    javax.swing.JLabel _lbOcupacion;
    javax.swing.JLabel _lbSeleccionEstado;
    javax.swing.JLabel _lbSeleccioneFecha;
    javax.swing.JLabel _lbSeleccioneGenero;
    javax.swing.JTextField _tFCedulaP1;
    javax.swing.JTextField _textApellidoP;
    javax.swing.JTextField _textApellidoR;
    javax.swing.JTextField _textCorreoP;
    javax.swing.JTextField _textNombreP;
    javax.swing.JTextField _textNombreR;
    javax.swing.JTextField _textOcupacionP;
    javax.swing.JTextField _textTelefonoP;
    javax.swing.JTextField _textTelefonoR;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    private PlaceHolder _placeHolders;
    private int _contNumCedula2 = 0;
    private int _contNumCedula1 = 0;
    private String _textoCMes = "";
    private String _textoCDia = "";
    private String _textoCAno = "";
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

    public String getCedulaP1() {
        return _tFCedulaP1.getText();
    }

    public String getCedulaP2() {
        return _fTCedulaP2.getText();
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

    public String getTextoGenero() {
        return _textoGenero;
    }

    public String getTextoEstadoCivil() {
        return _textoEstadoCivil;
    }

    public String getLbIFNImagen() {
        return _lbIFNImagen.getIcon().toString();
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
        this._lbCedulaError.setText("CÉDULA YA EXISTENTE");
    }

    public void setLabelCedulaRepetida1() {
        this._lbCedulaError.setText("");
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

    public void setTextCedulaP2() {
        _fTCedulaP2.setBackground(Color.white);
        this._fTCedulaP2.setText("");
    }

    public void setTextCedulaP1() {
        _tFCedulaP1.setBackground(Color.white);
        this._tFCedulaP1.setText("");
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

    public void setComboEstadoCivil() {
        this._comboEstadoCivil.setSelectedItem(" ");
    }

    public void setComboGenero() {
        this._comboGenero.setSelectedItem(" ");
    }

    public void setComboMes() {
        this._comboMes.setSelectedItem(" ");
    }

    //label de Aviso
    public void setLbApellidoRVacio() {
        this._lbApellidoRVacio.setText("CAMPO APELLIDO VACÍO");
    }

    public void setLbOcupacion() {
        this._lbOcupacion.setText("CAMPO OCUPACIÓN VACÍO");
    }

    public void setLbOcupacion1() {
        this._lbOcupacion.setText("");
    }

    public void setLbApellidoRVacio1() {
        this._lbApellidoRVacio.setText("");
    }

    public void setLbApellidoVacio() {
        this._lbApellidoVacio.setText("CAMPO APELLIDO VACÍO");
    }

    public void setLbApellidoVacio1() {
        this._lbApellidoVacio.setText("");
    }

    public void setLbCedulaVacia() {
        this._lbCedulaError.setText("CAMPO CÉDULA VACÍA");
    }

    public void setLbCodigoVerificadorVacio() {
        this._lbCedulaError.setText("CODIGO VERIDICACOR VACÍO");
    }

    public void setLbCedulaYVerificadorVacio() {
        this._lbCedulaError.setText("CÓDIGO VERIFICADOR Y CÉDULA VACÍOS");
    }

    public void setLbCodigoProvinciaError() {
        this._lbCedulaError.setText("CÓDIGO DE PROVICIA ERRÓNEO");
    }

    public void setLbCodigoVerificadorError() {
        this._lbCedulaError.setText("CÓDIGO VERIFICADOR ERRÓNEO");
    }

    public void setLbCedulaMenorA9Digitos() {
        this._lbCedulaError.setText("CÉDULA MENOR A 9 DÍGITOS");
    }

    public void setLbCedulaRepetida() {
        this._lbCedulaError.setText("CÉDULA YA EXISTE");
    }

    public void setLbVaciarAvisosCedula() {
        this._lbCedulaError.setText("");
    }

    public void setLbCorreoVacio() {
        this._lbCorreoError.setText("CAMPO CORREO VACÍO");
    }

    public void setLbCorreoError() {
        this._lbCorreoError.setText("EL CORREO NO CUMPLE");
    }

    public void setLbVaciarAvisoCorreo() {
        this._lbCorreoError.setText("");
    }

    public void setLbDireccionVacia() {
        this._lbDireccionVacia.setText("CAMPO DIRECCIÓN VACÍO");
    }

    public void setLbVaciarAvisoDireccion() {
        this._lbDireccionVacia.setText("");
    }

    public void setLbNombreRVacio() {
        this._lbNombreRVacio.setText("CAMPO NOMBRE VACÍO");
    }

    public void setLbVaciarAvisoNombre() {
        this._lbNombreRVacio.setText("");
    }

    public void setLbNombreVacio() {
        this._lbNombreVacio.setText("CAMPO NOMBRE VACÍO");
    }

    public void setLbVaciarAvisoNombreP() {
        this._lbNombreVacio.setText("");
    }

    public void setLbNumeroVacio() {
        this._lbNumeroError.setText("CAMPO NÚMERO TELEFÓNICO VACÍO");
    }

    public void setLbNumeroFaltanDigitos() {
        this._lbNumeroError.setText("FALTAN DÍGITOS");
    }

    public void setLbNumeroSobranDigitos() {
        this._lbNumeroError.setText("SOBRAN DÍGITOS");
    }

    public void setLbNumeroError() {
        this._lbNumeroError.setText("CÓDIGO TELEFÓNICO ERRÓNEO");
    }

    public void setLbVaciarAvisoNumero() {
        this._lbNumeroError.setText("");
    }

    public void setLbNumeroRVacio() {
        this._lbNumeroRError.setText("CAMPO NÚMERO TELEFÓNICO VACÍO");
    }

    public void setLbNumeroFaltanDigitosR() {
        this._lbNumeroRError.setText("FALTAN DÍGITOS");
    }

    public void setLbNumeroSobranDigitosR() {
        this._lbNumeroRError.setText("SOBRAN DÍGITOS");
    }

    public void setLbNumeroRError() {
        this._lbNumeroRError.setText("CÓDIGO TELEFÓNICO ERRÓNEO");
    }

    public void setColorDatosResponsable() {
        _textNombreR.setBackground(Color.white);
        _textApellidoR.setBackground(Color.white);
        _textTelefonoR.setBackground(Color.white);
    }

    public void setLbVaciarAvisoNumeroR() {
        this._lbNumeroRError.setText("");
    }

    public void setLbSeleccionEstado() {
        this._lbSeleccionEstado.setText("SELECCIONE UN ESTADO CIVIL");
    }

    public void setLbVaciarAvisoEstado() {
        this._lbSeleccionEstado.setText("");
    }

    public void setLbSeleccioneFecha() {
        this._lbSeleccioneFecha.setText("SELECCIONE UNA FECHA DE NACIMIENTO");
    }

    public void setLbFechaNoCumple() {
        this._lbSeleccioneFecha.setText("LA FECHA NO CUMPLE");
    }

    public void setLbSeleccioneMes() {
        this._lbSeleccioneFecha.setText("SELECCIONE UN MES");
    }

    public void setLbSeleccioneDia() {
        this._lbSeleccioneFecha.setText("SELECCIONE UN DÍA");
    }

    public void setLbSeleccioneAno() {
        this._lbSeleccioneFecha.setText("SELECCIONE UN AÑO");
    }

    public void setLbVaciarAvisoFecha() {
        this._lbSeleccioneFecha.setText("");
    }

    public void setLbSeleccioneGenero() {
        this._lbSeleccioneGenero.setText("SELECCIONE UN GÉNERO");
    }

    public void setLbVaciarAvisoGenero() {
        this._lbSeleccioneGenero.setText("");
    }

}
