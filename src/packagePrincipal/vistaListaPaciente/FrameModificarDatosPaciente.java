package packagePrincipal.vistaListaPaciente;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import packagePrincipal.modelo.DatosPaciente;

public class FrameModificarDatosPaciente extends javax.swing.JFrame {

    public FrameModificarDatosPaciente() {
        initComponents();
    }

    public void LlenarDatosPaciente(ArrayList<DatosPaciente> paciente, int i) {
        _lbINFNombre.setText(paciente.get(i).getNombre());
        _lbINFApellido.setText(paciente.get(i).getApellidos());
        _lbINFCedula.setText(paciente.get(i).getCedula());
        _lbINFCorreo.setText(paciente.get(i).getCorreoElectronico());
        _lbINFTelefono.setText(paciente.get(i).getNumeroTelefonico());
        _lbINFFecha.setText(paciente.get(i).getFechaNacimiento());
        _lbINFEdad.setText(paciente.get(i).getEdad());
        _lbINFEstado.setText(paciente.get(i).getEstadoCivil());
        _lbINFGenero.setText(paciente.get(i).getGenero());
        _areaINFdireccion.setText(paciente.get(i).getDireccionResidencia());

        if (Integer.valueOf(paciente.get(i).getEdad()) < 18) {
            _lbINFNombreR.setText(paciente.get(i).getNombreResponsable());
            _lbINFApellidoR.setText(paciente.get(i).getApellidoResponsable());
            _lbINFTelefonoR.setText(paciente.get(i).getNumeroTelefonicoR());
        } else {
            _lbINFNombreR.setText("PACIENTE MAYOR DE EDAD");
            _lbINFApellidoR.setText("PACIENTE MAYOR DE EDAD");
            _lbINFTelefonoR.setText("PACIENTE MAYOR DE EDAD");
        }
    }

    public void ErrorNombreApellidoCorreo(boolean error) {
        if (error == true) {
            _tfNAC.setBackground(Color.red);
        }
    }

    public void ErrorCedulaP1(boolean error) {
        if (error == true) {
            _tfCedulaP1.setBackground(Color.red);
        }
    }

    public void ErrorCedulaP2(boolean error) {
        if (error == true) {
            _tfCedulaP2.setBackground(Color.red);
        }
    }

    public void ErrorTelefonoP(boolean error) {
        if (error == true) {
            _tfTelefono.setBackground(Color.red);
        }
    }

    public void ErrorOcupacionP(boolean error) {
        if (error == true) {
            _tfOcupacion.setBackground(Color.red);
        }
    }

    public void ErrorDireccionP(boolean error) {
        if (error == true) {
            _areaMDireccion.setBackground(Color.red);
        }
    }

    public void ErrorMes(boolean error) {
        if (error == true) {
            _cbMes.setBackground(Color.red);
        } else {
            _cbMes.setBackground(Color.white);
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

    public void ErrorGenero(boolean error) {
        if (error == true) {
            _cbGenero.setBackground(Color.red);
        } else {
            _cbGenero.setBackground(Color.white);
        }
    }

    public void ErrorEstadoCivil(boolean error) {
        if (error == true) {
            _cbEstado.setBackground(Color.red);
        } else {
            _cbEstado.setBackground(Color.white);
        }
    }

    public void ErrorNombreApellido(boolean error) {
        if (error == true) {
            _tfNAR.setBackground(Color.red);
        }
    }

    public void ErrorTelefonoR(boolean error) {
        if (error == true) {
            _tfTelefonoR.setBackground(Color.red);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        _logo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        _logo2 = new javax.swing.JLabel();
        _lbNombre = new javax.swing.JLabel();
        _lbINFNombre = new javax.swing.JLabel();
        _lbApellido = new javax.swing.JLabel();
        _lbINFApellido = new javax.swing.JLabel();
        _lcCedula = new javax.swing.JLabel();
        _lbINFCedula = new javax.swing.JLabel();
        _lbTelefono = new javax.swing.JLabel();
        _lbINFTelefono = new javax.swing.JLabel();
        _lbCorreo = new javax.swing.JLabel();
        _lbINFCorreo = new javax.swing.JLabel();
        _lbFecha = new javax.swing.JLabel();
        _lbINFFecha = new javax.swing.JLabel();
        _lbEdad = new javax.swing.JLabel();
        _lbINFEdad = new javax.swing.JLabel();
        _lbEstado = new javax.swing.JLabel();
        _lbINFEstado = new javax.swing.JLabel();
        _lbGenero = new javax.swing.JLabel();
        _lbINFGenero = new javax.swing.JLabel();
        _lbDireccion = new javax.swing.JLabel();
        _lbNombreR = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _areaINFdireccion = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        _logo = new javax.swing.JLabel();
        _lbINFNombreR = new javax.swing.JLabel();
        _lbApellidoR = new javax.swing.JLabel();
        _lbINFApellidoR = new javax.swing.JLabel();
        _lbTelefonoR = new javax.swing.JLabel();
        _lbINFTelefonoR = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        _botonVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        _tfNAC = new javax.swing.JTextField();
        _btnMNombre = new javax.swing.JButton();
        _tfCedulaP1 = new javax.swing.JTextField();
        _btnMApellido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        _tfCedulaP2 = new javax.swing.JTextField();
        _btnMCorreo = new javax.swing.JButton();
        _btnMCedula = new javax.swing.JButton();
        _tfTelefono = new javax.swing.JTextField();
        _btnMTelefono = new javax.swing.JButton();
        _cbEstado = new javax.swing.JComboBox<>();
        _cbGenero = new javax.swing.JComboBox<>();
        _cbMes = new javax.swing.JComboBox<>();
        _cbDia = new javax.swing.JComboBox<>();
        _cbAno = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        _areaMDireccion = new javax.swing.JTextArea();
        _btnMDireccion = new javax.swing.JButton();
        _btnMFecha = new javax.swing.JButton();
        _btnMEstado = new javax.swing.JButton();
        _btnMGenero = new javax.swing.JButton();
        _logo3 = new javax.swing.JLabel();
        _logo4 = new javax.swing.JLabel();
        _logo5 = new javax.swing.JLabel();
        _logo6 = new javax.swing.JLabel();
        _logo7 = new javax.swing.JLabel();
        _logo8 = new javax.swing.JLabel();
        _logo9 = new javax.swing.JLabel();
        _logo10 = new javax.swing.JLabel();
        _logo11 = new javax.swing.JLabel();
        _logo12 = new javax.swing.JLabel();
        _logo13 = new javax.swing.JLabel();
        _tfOcupacion = new javax.swing.JTextField();
        _btnMOcupacion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        _tfNAR = new javax.swing.JTextField();
        _btnMNombreR = new javax.swing.JButton();
        _btnMApellidoR = new javax.swing.JButton();
        _tfTelefonoR = new javax.swing.JTextField();
        _btnMTelefonoR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(38, 166, 154));
        jPanel1.setPreferredSize(new java.awt.Dimension(1210, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/modificarPaciente.png"))); // NOI18N
        jPanel1.add(_logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 670, 70));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 10, 630));

        _logo2.setFont(new java.awt.Font("Metropolis Black", 1, 24)); // NOI18N
        _logo2.setForeground(new java.awt.Color(255, 255, 255));
        _logo2.setText("DATOS DEL PACIENTE");
        jPanel1.add(_logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 290, 30));

        _lbNombre.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbNombre.setForeground(new java.awt.Color(0, 255, 255));
        _lbNombre.setText("NOMBRE :");
        jPanel1.add(_lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        _lbINFNombre.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(_lbINFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 320, 20));

        _lbApellido.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbApellido.setForeground(new java.awt.Color(0, 255, 255));
        _lbApellido.setText("APELLIDO :");
        jPanel1.add(_lbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        _lbINFApellido.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFApellido.setForeground(new java.awt.Color(255, 255, 255));
        _lbINFApellido.setToolTipText("");
        jPanel1.add(_lbINFApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 330, 20));

        _lcCedula.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lcCedula.setForeground(new java.awt.Color(0, 255, 255));
        _lcCedula.setText("CÉDULA :");
        jPanel1.add(_lcCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        _lbINFCedula.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFCedula.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(_lbINFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 340, 20));

        _lbTelefono.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbTelefono.setForeground(new java.awt.Color(0, 255, 255));
        _lbTelefono.setText("TELÉFONO :");
        jPanel1.add(_lbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        _lbINFTelefono.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(_lbINFTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 320, 20));

        _lbCorreo.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbCorreo.setForeground(new java.awt.Color(0, 255, 255));
        _lbCorreo.setText("CORREO :");
        jPanel1.add(_lbCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        _lbINFCorreo.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(_lbINFCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 340, 20));

        _lbFecha.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbFecha.setForeground(new java.awt.Color(0, 255, 255));
        _lbFecha.setText("FECHA DE NACIMIENTO :");
        jPanel1.add(_lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        _lbINFFecha.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFFecha.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(_lbINFFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 200, 20));

        _lbEdad.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbEdad.setForeground(new java.awt.Color(0, 255, 255));
        _lbEdad.setText("EDAD :");
        _lbEdad.setToolTipText("");
        jPanel1.add(_lbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        _lbINFEdad.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFEdad.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(_lbINFEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 180, 20));

        _lbEstado.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbEstado.setForeground(new java.awt.Color(0, 255, 255));
        _lbEstado.setText("ESTADO CIVIL :");
        jPanel1.add(_lbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        _lbINFEstado.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFEstado.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(_lbINFEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 290, 20));

        _lbGenero.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbGenero.setForeground(new java.awt.Color(0, 255, 255));
        _lbGenero.setText("GÉNERO :");
        jPanel1.add(_lbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        _lbINFGenero.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFGenero.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(_lbINFGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 300, 20));

        _lbDireccion.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbDireccion.setForeground(new java.awt.Color(0, 255, 255));
        _lbDireccion.setText("DIRECCIÓN RESIDENCIAL :");
        jPanel1.add(_lbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        _lbNombreR.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbNombreR.setForeground(new java.awt.Color(0, 255, 255));
        _lbNombreR.setText("NOMBRE :");
        jPanel1.add(_lbNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        _areaINFdireccion.setEditable(false);
        _areaINFdireccion.setColumns(20);
        _areaINFdireccion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _areaINFdireccion.setRows(5);
        jScrollPane1.setViewportView(_areaINFdireccion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 210, 110));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 1200, 10));

        _logo.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _logo.setForeground(new java.awt.Color(255, 255, 255));
        _logo.setText("DATOS DEL RESPONSABLE");
        jPanel1.add(_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        _lbINFNombreR.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFNombreR.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(_lbINFNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, 330, 20));

        _lbApellidoR.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbApellidoR.setForeground(new java.awt.Color(0, 255, 255));
        _lbApellidoR.setText("APELLIDO :");
        jPanel1.add(_lbApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        _lbINFApellidoR.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFApellidoR.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(_lbINFApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, 320, 20));

        _lbTelefonoR.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbTelefonoR.setForeground(new java.awt.Color(0, 255, 255));
        _lbTelefonoR.setText("TELÉFONO :");
        jPanel1.add(_lbTelefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, -1, -1));

        _lbINFTelefonoR.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFTelefonoR.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(_lbINFTelefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 670, 320, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 82, 1220, 10));

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        jPanel1.add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, -1, 60));

        jPanel2.setBackground(new java.awt.Color(0, 137, 123));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _tfNAC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _tfNAC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfNAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _tfNACMouseClicked(evt);
            }
        });
        _tfNAC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfNACKeyTyped(evt);
            }
        });
        jPanel2.add(_tfNAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 330, 30));

        _btnMNombre.setBackground(new java.awt.Color(54, 203, 167));
        _btnMNombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMNombre.setForeground(new java.awt.Color(255, 255, 255));
        _btnMNombre.setText("M NOMBRE");
        _btnMNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _btnMNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(_btnMNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, -1));

        _tfCedulaP1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _tfCedulaP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfCedulaP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _tfCedulaP1MouseClicked(evt);
            }
        });
        _tfCedulaP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _tfCedulaP1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfCedulaP1KeyTyped(evt);
            }
        });
        jPanel2.add(_tfCedulaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 140, 30));

        _btnMApellido.setBackground(new java.awt.Color(54, 203, 167));
        _btnMApellido.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMApellido.setForeground(new java.awt.Color(255, 255, 255));
        _btnMApellido.setText("M APELLIDO");
        _btnMApellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _btnMApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(_btnMApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 110, -1));

        jLabel1.setFont(new java.awt.Font("Metropolis Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("-");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, 30));

        _tfCedulaP2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _tfCedulaP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfCedulaP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _tfCedulaP2MouseClicked(evt);
            }
        });
        _tfCedulaP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                _tfCedulaP2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfCedulaP2KeyTyped(evt);
            }
        });
        jPanel2.add(_tfCedulaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 40, 30));

        _btnMCorreo.setBackground(new java.awt.Color(54, 203, 167));
        _btnMCorreo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMCorreo.setForeground(new java.awt.Color(255, 255, 255));
        _btnMCorreo.setText("M CORREO");
        _btnMCorreo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _btnMCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(_btnMCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 110, -1));

        _btnMCedula.setBackground(new java.awt.Color(54, 203, 167));
        _btnMCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMCedula.setForeground(new java.awt.Color(255, 255, 255));
        _btnMCedula.setText("M CÉDULA");
        _btnMCedula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _btnMCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(_btnMCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 110, 30));

        _tfTelefono.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _tfTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _tfTelefonoMouseClicked(evt);
            }
        });
        _tfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfTelefonoKeyTyped(evt);
            }
        });
        jPanel2.add(_tfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 310, 30));

        _btnMTelefono.setBackground(new java.awt.Color(54, 203, 167));
        _btnMTelefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMTelefono.setForeground(new java.awt.Color(255, 255, 255));
        _btnMTelefono.setText("M TELÉFONO");
        _btnMTelefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _btnMTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(_btnMTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 170, 30));

        _cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casado", "Casada", "Soltero", "Soltera", "Otro." }));
        _cbEstado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbEstadoActionPerformed(evt);
            }
        });
        jPanel2.add(_cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 130, 30));

        _cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro." }));
        _cbGenero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbGeneroActionPerformed(evt);
            }
        });
        jPanel2.add(_cbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 140, 30));

        _cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        _cbMes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbMesActionPerformed(evt);
            }
        });
        jPanel2.add(_cbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 70, 30));

        _cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        _cbDia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbDiaActionPerformed(evt);
            }
        });
        jPanel2.add(_cbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 80, 30));

        _cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        _cbAno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbAnoActionPerformed(evt);
            }
        });
        jPanel2.add(_cbAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 80, 30));

        _areaMDireccion.setColumns(20);
        _areaMDireccion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _areaMDireccion.setRows(5);
        _areaMDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _areaMDireccionMouseClicked(evt);
            }
        });
        _areaMDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _areaMDireccionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(_areaMDireccion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 210, 100));

        _btnMDireccion.setBackground(new java.awt.Color(54, 203, 167));
        _btnMDireccion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMDireccion.setForeground(new java.awt.Color(255, 255, 255));
        _btnMDireccion.setText("M DIRECCIÓN");
        _btnMDireccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _btnMDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(_btnMDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 170, 30));

        _btnMFecha.setBackground(new java.awt.Color(54, 203, 167));
        _btnMFecha.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMFecha.setForeground(new java.awt.Color(255, 255, 255));
        _btnMFecha.setText("M FECHA ");
        _btnMFecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _btnMFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(_btnMFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 120, 30));

        _btnMEstado.setBackground(new java.awt.Color(54, 203, 167));
        _btnMEstado.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMEstado.setForeground(new java.awt.Color(255, 255, 255));
        _btnMEstado.setText("M ESTADO");
        _btnMEstado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        jPanel2.add(_btnMEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 170, 30));

        _btnMGenero.setBackground(new java.awt.Color(54, 203, 167));
        _btnMGenero.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMGenero.setForeground(new java.awt.Color(255, 255, 255));
        _btnMGenero.setText("M GENERO");
        _btnMGenero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        jPanel2.add(_btnMGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 170, 30));

        _logo3.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _logo3.setForeground(new java.awt.Color(0, 255, 255));
        _logo3.setText("MODIFICAR NOMBRE, APELLIDO Y CORREO");
        jPanel2.add(_logo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 30));

        _logo4.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _logo4.setForeground(new java.awt.Color(0, 255, 255));
        _logo4.setText("MODIFICAR CÉDULA");
        jPanel2.add(_logo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, 30));

        _logo5.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _logo5.setForeground(new java.awt.Color(0, 255, 255));
        _logo5.setText("MODIFICAR NÚMERO TELEFÓNICO");
        jPanel2.add(_logo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        _logo6.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _logo6.setForeground(new java.awt.Color(0, 255, 255));
        _logo6.setText("MODIFICAR FECHA DE NACIMIENTO");
        jPanel2.add(_logo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        _logo7.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _logo7.setForeground(new java.awt.Color(0, 255, 255));
        _logo7.setText("MODIFICAR ESTADO CIVIL");
        jPanel2.add(_logo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        _logo8.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _logo8.setForeground(new java.awt.Color(0, 255, 255));
        _logo8.setText("MODIFICAR GÉNERO");
        jPanel2.add(_logo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        _logo9.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _logo9.setForeground(new java.awt.Color(0, 255, 255));
        _logo9.setText("MODIFICAR DIRECCIÓN");
        jPanel2.add(_logo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        _logo10.setFont(new java.awt.Font("Metropolis Black", 1, 12)); // NOI18N
        _logo10.setForeground(new java.awt.Color(255, 255, 255));
        _logo10.setText("MES");
        jPanel2.add(_logo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        _logo11.setFont(new java.awt.Font("Metropolis Black", 1, 12)); // NOI18N
        _logo11.setForeground(new java.awt.Color(255, 255, 255));
        _logo11.setText("DÍA");
        jPanel2.add(_logo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        _logo12.setFont(new java.awt.Font("Metropolis Black", 1, 12)); // NOI18N
        _logo12.setForeground(new java.awt.Color(255, 255, 255));
        _logo12.setText("AÑO");
        jPanel2.add(_logo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        _logo13.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _logo13.setForeground(new java.awt.Color(0, 255, 255));
        _logo13.setText("MODIFICAR OCUPACIÓN");
        jPanel2.add(_logo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 220, -1));

        _tfOcupacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _tfOcupacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfOcupacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _tfOcupacionMouseClicked(evt);
            }
        });
        _tfOcupacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfOcupacionKeyTyped(evt);
            }
        });
        jPanel2.add(_tfOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 280, 30));

        _btnMOcupacion.setBackground(new java.awt.Color(54, 203, 167));
        _btnMOcupacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMOcupacion.setForeground(new java.awt.Color(255, 255, 255));
        _btnMOcupacion.setText("M OCUPACIÓN");
        _btnMOcupacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _btnMOcupacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(_btnMOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 150, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 93, 710, 470));

        jPanel3.setBackground(new java.awt.Color(0, 137, 123));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _tfNAR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _tfNAR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfNAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _tfNARMouseClicked(evt);
            }
        });
        _tfNAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfNARKeyTyped(evt);
            }
        });
        jPanel3.add(_tfNAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, 30));

        _btnMNombreR.setBackground(new java.awt.Color(54, 203, 167));
        _btnMNombreR.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMNombreR.setForeground(new java.awt.Color(255, 255, 255));
        _btnMNombreR.setText("M NOMBRE");
        _btnMNombreR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        jPanel3.add(_btnMNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 30));

        _btnMApellidoR.setBackground(new java.awt.Color(54, 203, 167));
        _btnMApellidoR.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMApellidoR.setForeground(new java.awt.Color(255, 255, 255));
        _btnMApellidoR.setText("M APELLIDO");
        _btnMApellidoR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _btnMApellidoR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(_btnMApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 140, 30));

        _tfTelefonoR.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        _tfTelefonoR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _tfTelefonoR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _tfTelefonoRMouseClicked(evt);
            }
        });
        _tfTelefonoR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                _tfTelefonoRKeyTyped(evt);
            }
        });
        jPanel3.add(_tfTelefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 250, 30));

        _btnMTelefonoR.setBackground(new java.awt.Color(54, 203, 167));
        _btnMTelefonoR.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _btnMTelefonoR.setForeground(new java.awt.Color(255, 255, 255));
        _btnMTelefonoR.setText("M TELÉFONO");
        _btnMTelefonoR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _btnMTelefonoR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(_btnMTelefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 130, 30));

        jLabel3.setFont(new java.awt.Font("Metropolis Black", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("MODIFICAR NOMBRE Y APELLIDO RESPONSABLE");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Metropolis Black", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("MODIFICAR TELÉFONO RESPONSABLE");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 580, 710, 110));

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

        setSize(new java.awt.Dimension(1210, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void _tfNACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__tfNACMouseClicked
        _tfNAC.setBackground(Color.white);
    }//GEN-LAST:event__tfNACMouseClicked

    private void _tfCedulaP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfCedulaP1KeyTyped
        _tfCedulaP1.setBackground(Color.white);
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        } else {
            if (_tfCedulaP1.getText().isEmpty() == false) {
                if (_contNumCedula1 >= 9) {
                    evt.consume();
                } else {
                    _contNumCedula1++;
                }
            } else {
                _contNumCedula1 = 1;
            }
        }
    }//GEN-LAST:event__tfCedulaP1KeyTyped

    private void _tfCedulaP1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__tfCedulaP1MouseClicked
        _tfCedulaP1.setBackground(Color.white);
    }//GEN-LAST:event__tfCedulaP1MouseClicked

    private void _tfCedulaP1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfCedulaP1KeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            _contNumCedula1--;
        }
    }//GEN-LAST:event__tfCedulaP1KeyReleased

    private void _tfCedulaP2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfCedulaP2KeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
            _contNumCedula2--;
        }
    }//GEN-LAST:event__tfCedulaP2KeyReleased

    private void _tfCedulaP2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfCedulaP2KeyTyped
        _tfCedulaP2.setBackground(Color.white);
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        } else {
            if (_tfCedulaP2.getText().isEmpty() == false) {
                if (_contNumCedula2 >= 1) {
                    evt.consume();
                } else {
                    _contNumCedula2++;
                }
            } else {
                _contNumCedula2 = 1;
            }
        }
    }//GEN-LAST:event__tfCedulaP2KeyTyped

    private void _tfCedulaP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__tfCedulaP2MouseClicked
        _tfCedulaP2.setBackground(Color.white);
    }//GEN-LAST:event__tfCedulaP2MouseClicked

    private void _tfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfTelefonoKeyTyped
        char c = evt.getKeyChar();
        _tfTelefono.setBackground(Color.white);
        if (c != '+') {
            if (c < '0' || c > '9') {
                evt.consume();
            }
        }
    }//GEN-LAST:event__tfTelefonoKeyTyped

    private void _tfTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__tfTelefonoMouseClicked
        _tfTelefono.setBackground(Color.white);
    }//GEN-LAST:event__tfTelefonoMouseClicked

    private void _areaMDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__areaMDireccionKeyTyped
        char c = evt.getKeyChar();
        _areaMDireccion.setBackground(Color.white);
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event__areaMDireccionKeyTyped

    private void _areaMDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__areaMDireccionMouseClicked
        _areaMDireccion.setBackground(Color.white);
    }//GEN-LAST:event__areaMDireccionMouseClicked

    private void _tfNACKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfNACKeyTyped
        _tfNAC.setBackground(Color.white);
    }//GEN-LAST:event__tfNACKeyTyped

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

    private void _cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbEstadoActionPerformed
        _cbEstado.setBackground(Color.white);
        _textoEstadoCivil = _cbEstado.getSelectedItem().toString();
    }//GEN-LAST:event__cbEstadoActionPerformed

    private void _cbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbGeneroActionPerformed
        _cbGenero.setBackground(Color.white);
        _textoGenero = _cbGenero.getSelectedItem().toString();
    }//GEN-LAST:event__cbGeneroActionPerformed

    private void _tfNARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfNARKeyTyped
        _tfNAR.setBackground(Color.white);
    }//GEN-LAST:event__tfNARKeyTyped

    private void _tfNARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__tfNARMouseClicked
        _tfNAR.setBackground(Color.white);
    }//GEN-LAST:event__tfNARMouseClicked

    private void _tfTelefonoRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfTelefonoRKeyTyped
        char c = evt.getKeyChar();
        _tfTelefonoR.setBackground(Color.white);
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event__tfTelefonoRKeyTyped

    private void _tfTelefonoRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__tfTelefonoRMouseClicked
        _tfTelefonoR.setBackground(Color.white);
    }//GEN-LAST:event__tfTelefonoRMouseClicked

    private void _tfOcupacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event__tfOcupacionKeyTyped
        char c = evt.getKeyChar();
        _tfOcupacion.setBackground(Color.white);
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
    }//GEN-LAST:event__tfOcupacionKeyTyped

    private void _tfOcupacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__tfOcupacionMouseClicked
        _tfOcupacion.setBackground(Color.white);
    }//GEN-LAST:event__tfOcupacionMouseClicked

    public void AddActionListener(ActionListener listener) {
        _btnMApellido.addActionListener(listener);
        _btnMApellidoR.addActionListener(listener);
        _btnMCedula.addActionListener(listener);
        _btnMCorreo.addActionListener(listener);
        _btnMDireccion.addActionListener(listener);
        _btnMEstado.addActionListener(listener);
        _btnMFecha.addActionListener(listener);
        _btnMGenero.addActionListener(listener);
        _btnMNombre.addActionListener(listener);
        _btnMNombreR.addActionListener(listener);
        _btnMTelefono.addActionListener(listener);
        _btnMTelefonoR.addActionListener(listener);
        _botonVolver.addActionListener(listener);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextArea _areaINFdireccion;
    javax.swing.JTextArea _areaMDireccion;
    javax.swing.JButton _botonVolver;
    javax.swing.JButton _btnMApellido;
    javax.swing.JButton _btnMApellidoR;
    javax.swing.JButton _btnMCedula;
    javax.swing.JButton _btnMCorreo;
    javax.swing.JButton _btnMDireccion;
    javax.swing.JButton _btnMEstado;
    javax.swing.JButton _btnMFecha;
    javax.swing.JButton _btnMGenero;
    javax.swing.JButton _btnMNombre;
    javax.swing.JButton _btnMNombreR;
    javax.swing.JButton _btnMOcupacion;
    javax.swing.JButton _btnMTelefono;
    javax.swing.JButton _btnMTelefonoR;
    javax.swing.JComboBox<String> _cbAno;
    javax.swing.JComboBox<String> _cbDia;
    javax.swing.JComboBox<String> _cbEstado;
    javax.swing.JComboBox<String> _cbGenero;
    javax.swing.JComboBox<String> _cbMes;
    javax.swing.JLabel _lbApellido;
    javax.swing.JLabel _lbApellidoR;
    javax.swing.JLabel _lbCorreo;
    javax.swing.JLabel _lbDireccion;
    javax.swing.JLabel _lbEdad;
    javax.swing.JLabel _lbEstado;
    javax.swing.JLabel _lbFecha;
    javax.swing.JLabel _lbGenero;
    javax.swing.JLabel _lbINFApellido;
    javax.swing.JLabel _lbINFApellidoR;
    javax.swing.JLabel _lbINFCedula;
    javax.swing.JLabel _lbINFCorreo;
    javax.swing.JLabel _lbINFEdad;
    javax.swing.JLabel _lbINFEstado;
    javax.swing.JLabel _lbINFFecha;
    javax.swing.JLabel _lbINFGenero;
    javax.swing.JLabel _lbINFNombre;
    javax.swing.JLabel _lbINFNombreR;
    javax.swing.JLabel _lbINFTelefono;
    javax.swing.JLabel _lbINFTelefonoR;
    javax.swing.JLabel _lbNombre;
    javax.swing.JLabel _lbNombreR;
    javax.swing.JLabel _lbTelefono;
    javax.swing.JLabel _lbTelefonoR;
    javax.swing.JLabel _lcCedula;
    javax.swing.JLabel _logo;
    javax.swing.JLabel _logo1;
    javax.swing.JLabel _logo10;
    javax.swing.JLabel _logo11;
    javax.swing.JLabel _logo12;
    javax.swing.JLabel _logo13;
    javax.swing.JLabel _logo2;
    javax.swing.JLabel _logo3;
    javax.swing.JLabel _logo4;
    javax.swing.JLabel _logo5;
    javax.swing.JLabel _logo6;
    javax.swing.JLabel _logo7;
    javax.swing.JLabel _logo8;
    javax.swing.JLabel _logo9;
    javax.swing.JTextField _tfCedulaP1;
    javax.swing.JTextField _tfCedulaP2;
    javax.swing.JTextField _tfNAC;
    javax.swing.JTextField _tfNAR;
    javax.swing.JTextField _tfOcupacion;
    javax.swing.JTextField _tfTelefono;
    javax.swing.JTextField _tfTelefonoR;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JSeparator jSeparator2;
    javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
    private int _contNumCedula2 = 0;
    private int _contNumCedula1 = 0;
    private String _textoCMes = "";
    private String _textoCDia = "";
    private String _textoCAno = "";
    private String _textoGenero = "";
    private String _textoEstadoCivil = "";

    public String getAreaMDireccion() {
        return _areaMDireccion.getText();
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public JButton getBtnMApellido() {
        return _btnMApellido;
    }

    public JButton getBtnMTelefonoR() {
        return _btnMTelefonoR;
    }

    public JButton getBtnMApellidoR() {
        return _btnMApellidoR;
    }

    public JButton getBtnMCedula() {
        return _btnMCedula;
    }

    public JButton getBtnMCorreo() {
        return _btnMCorreo;
    }

    public JButton getBtnMDireccion() {
        return _btnMDireccion;
    }

    public JButton getBtnMEstado() {
        return _btnMEstado;
    }

    public JButton getBtnMFecha() {
        return _btnMFecha;
    }

    public JButton getBtnMGenero() {
        return _btnMGenero;
    }

    public JButton getBtnMNombre() {
        return _btnMNombre;
    }

    public JButton getBtnMNombreR() {
        return _btnMNombreR;
    }

    public JButton getBtnMTelefono() {
        return _btnMTelefono;
    }

    public String getTfCedulaP1() {
        return _tfCedulaP1.getText();
    }

    public String getTfCedulaP2() {
        return _tfCedulaP2.getText();
    }

    public String getTfNAC() {
        return _tfNAC.getText();
    }

    public String getTfNAR() {
        return _tfNAR.getText();
    }

    public String getTfTelefono() {
        return _tfTelefono.getText();
    }

    public String getTfTelefonoR() {
        return _tfTelefonoR.getText();
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

}
