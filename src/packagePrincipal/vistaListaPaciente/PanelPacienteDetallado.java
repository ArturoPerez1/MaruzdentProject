package packagePrincipal.vistaListaPaciente;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import packagePrincipal.modelo.DatosPaciente;

public class PanelPacienteDetallado extends javax.swing.JPanel {

    public PanelPacienteDetallado() {
        initComponents();
    }

    public void VentanaModificarDatos(ArrayList<DatosPaciente> paciente, int i) {
        _frameModificar = new FrameModificarDatosPaciente();
        _frameModificar.LlenarDatosPaciente(paciente, i);
        _frameModificar.setVisible(true);
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
                _lbImagen.setIcon(new javax.swing.ImageIcon(jFChooser.getSelectedFile().toString()));
            } else {
                JOptionPane.showMessageDialog(null, "SOLO SON VÁLIDOS LOS ARCHIVOS CON \n EXTENSIÓN (.png ó .jpg)", "ERROR DE EXTENSIÓN", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _labelLogo = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        _lbNombre = new javax.swing.JLabel();
        _lbApellido = new javax.swing.JLabel();
        _lbCedula = new javax.swing.JLabel();
        _lbTelefono = new javax.swing.JLabel();
        _lbCorreo = new javax.swing.JLabel();
        _lbOcupacion = new javax.swing.JLabel();
        _lbGenero = new javax.swing.JLabel();
        _lbEdad = new javax.swing.JLabel();
        _lbFechaNacimiento = new javax.swing.JLabel();
        _lbDireccion = new javax.swing.JLabel();
        _lbNombreR = new javax.swing.JLabel();
        _lbApellidoR = new javax.swing.JLabel();
        _lbTelefonoR = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _aDireccionResidencial = new javax.swing.JTextArea();
        _lbTNombre = new javax.swing.JLabel();
        _lbTApellido = new javax.swing.JLabel();
        _lbTCedula = new javax.swing.JLabel();
        _lbTTelefono = new javax.swing.JLabel();
        _lbTCorreo = new javax.swing.JLabel();
        _lbTOcupacion = new javax.swing.JLabel();
        _lbTGenero = new javax.swing.JLabel();
        _lbTEdad = new javax.swing.JLabel();
        _lbTFechaNacimieto = new javax.swing.JLabel();
        _lbTNombreR = new javax.swing.JLabel();
        _lbTApellidoR = new javax.swing.JLabel();
        _lbTNumeroR = new javax.swing.JLabel();
        _lbEstadoCivil = new javax.swing.JLabel();
        _lbTEstadoCivil = new javax.swing.JLabel();
        _panelImagen = new javax.swing.JPanel();
        _lbImagen = new javax.swing.JLabel();
        _botonAgregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        _botonVerHistorial = new javax.swing.JButton();
        _botonModificar = new javax.swing.JButton();
        _labelAviso = new javax.swing.JLabel();
        _labelAvisoComplemento = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/datosDetallado.png"))); // NOI18N
        add(_labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 80));

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        _lbNombre.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbNombre.setForeground(new java.awt.Color(153, 255, 255));
        _lbNombre.setText("NOMBRE :");
        add(_lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        _lbApellido.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbApellido.setForeground(new java.awt.Color(153, 255, 255));
        _lbApellido.setText("APELLIDO :");
        add(_lbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        _lbCedula.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbCedula.setForeground(new java.awt.Color(153, 255, 255));
        _lbCedula.setText("CÉDULA :");
        add(_lbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        _lbTelefono.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbTelefono.setForeground(new java.awt.Color(153, 255, 255));
        _lbTelefono.setText("NÚMERO TELEFÓNICO :");
        add(_lbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        _lbCorreo.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbCorreo.setForeground(new java.awt.Color(153, 255, 255));
        _lbCorreo.setText("CORREO ELETRÓNICO :");
        add(_lbCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        _lbOcupacion.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbOcupacion.setForeground(new java.awt.Color(153, 255, 255));
        _lbOcupacion.setText("OCUPACIÓN :");
        add(_lbOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        _lbGenero.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbGenero.setForeground(new java.awt.Color(153, 255, 255));
        _lbGenero.setText("GÉNERO :");
        add(_lbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        _lbEdad.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbEdad.setForeground(new java.awt.Color(153, 255, 255));
        _lbEdad.setText("EDAD :");
        add(_lbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        _lbFechaNacimiento.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbFechaNacimiento.setForeground(new java.awt.Color(153, 255, 255));
        _lbFechaNacimiento.setText("FECHA DE NACIEMIENTO :");
        add(_lbFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 240, -1));

        _lbDireccion.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbDireccion.setForeground(new java.awt.Color(153, 255, 255));
        _lbDireccion.setText("DIRECCÓN RESIDENCIAL :");
        add(_lbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        _lbNombreR.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbNombreR.setForeground(new java.awt.Color(153, 255, 255));
        _lbNombreR.setText("NOMBRE DEL RESPONSABLE :");
        add(_lbNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, -1, -1));

        _lbApellidoR.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbApellidoR.setForeground(new java.awt.Color(153, 255, 255));
        _lbApellidoR.setText("APELLIDO DEL RESPONSABLE :");
        add(_lbApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, -1, -1));

        _lbTelefonoR.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbTelefonoR.setForeground(new java.awt.Color(153, 255, 255));
        _lbTelefonoR.setText("NUMERO DEL RESPONSABLE :");
        add(_lbTelefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        _aDireccionResidencial.setColumns(20);
        _aDireccionResidencial.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aDireccionResidencial.setRows(5);
        _aDireccionResidencial.setToolTipText("");
        jScrollPane1.setViewportView(_aDireccionResidencial);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 210, 100));

        _lbTNombre.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTNombre.setForeground(new java.awt.Color(255, 255, 255));
        _lbTNombre.setToolTipText("");
        add(_lbTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 340, 20));

        _lbTApellido.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTApellido.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 360, 20));

        _lbTCedula.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTCedula.setForeground(new java.awt.Color(255, 255, 255));
        _lbTCedula.setToolTipText("");
        add(_lbTCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 330, 20));

        _lbTTelefono.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTTelefono.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 350, 20));

        _lbTCorreo.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTCorreo.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 360, 20));

        _lbTOcupacion.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTOcupacion.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 360, 20));

        _lbTGenero.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTGenero.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 340, 20));

        _lbTEdad.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTEdad.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 280, 20));

        _lbTFechaNacimieto.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTFechaNacimieto.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTFechaNacimieto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 290, 20));

        _lbTNombreR.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTNombreR.setForeground(new java.awt.Color(255, 255, 255));
        _lbTNombreR.setToolTipText("");
        add(_lbTNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 340, 20));

        _lbTApellidoR.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTApellidoR.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 320, 20));

        _lbTNumeroR.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTNumeroR.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTNumeroR, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, 340, 20));

        _lbEstadoCivil.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbEstadoCivil.setForeground(new java.awt.Color(153, 255, 255));
        _lbEstadoCivil.setText("ESTADO CIVIL :");
        add(_lbEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, -1, -1));

        _lbTEstadoCivil.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbTEstadoCivil.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 350, 20));

        _panelImagen.setBackground(new java.awt.Color(0, 121, 107));
        _panelImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        _panelImagen.add(_lbImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 150));

        _botonAgregar.setBackground(new java.awt.Color(54, 203, 167));
        _botonAgregar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        _botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/File-Explorer-fluent-icon.png"))); // NOI18N
        _botonAgregar.setText("AGREGAR FOTO");
        _botonAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _botonAgregarActionPerformed(evt);
            }
        });
        _panelImagen.add(_botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 210, 40));

        add(_panelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 390, 180));

        jPanel1.setBackground(new java.awt.Color(0, 137, 123));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonVerHistorial.setBackground(new java.awt.Color(54, 203, 167));
        _botonVerHistorial.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonVerHistorial.setForeground(new java.awt.Color(255, 255, 255));
        _botonVerHistorial.setText("VER HISTORIAL CLINICO");
        _botonVerHistorial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonVerHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(_botonVerHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 270, 50));

        _botonModificar.setBackground(new java.awt.Color(54, 203, 167));
        _botonModificar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonModificar.setForeground(new java.awt.Color(255, 255, 255));
        _botonModificar.setText("MODIFICAR DATOS");
        _botonModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(_botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 270, 50));

        _labelAviso.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _labelAviso.setForeground(new java.awt.Color(255, 255, 255));
        _labelAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(_labelAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 480, 30));

        _labelAvisoComplemento.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _labelAvisoComplemento.setForeground(new java.awt.Color(255, 255, 255));
        _labelAvisoComplemento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(_labelAvisoComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 480, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 10, 210));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 330, 10));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 10, 210));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 490, 330));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 350, -1, 350));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 348, 510, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void _botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__botonAgregarActionPerformed
        AgregarJFileChooser();
    }//GEN-LAST:event__botonAgregarActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonVerHistorial.addActionListener(listener);
        _botonVolver.addActionListener(listener);
        _botonModificar.addActionListener(listener);    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextArea _aDireccionResidencial;
    javax.swing.JButton _botonAgregar;
    javax.swing.JButton _botonModificar;
    javax.swing.JButton _botonVerHistorial;
    javax.swing.JButton _botonVolver;
    javax.swing.JLabel _labelAviso;
    javax.swing.JLabel _labelAvisoComplemento;
    javax.swing.JLabel _labelLogo;
    javax.swing.JLabel _lbApellido;
    javax.swing.JLabel _lbApellidoR;
    javax.swing.JLabel _lbCedula;
    javax.swing.JLabel _lbCorreo;
    javax.swing.JLabel _lbDireccion;
    javax.swing.JLabel _lbEdad;
    javax.swing.JLabel _lbEstadoCivil;
    javax.swing.JLabel _lbFechaNacimiento;
    javax.swing.JLabel _lbGenero;
    javax.swing.JLabel _lbImagen;
    javax.swing.JLabel _lbNombre;
    javax.swing.JLabel _lbNombreR;
    javax.swing.JLabel _lbOcupacion;
    javax.swing.JLabel _lbTApellido;
    javax.swing.JLabel _lbTApellidoR;
    javax.swing.JLabel _lbTCedula;
    javax.swing.JLabel _lbTCorreo;
    javax.swing.JLabel _lbTEdad;
    javax.swing.JLabel _lbTEstadoCivil;
    javax.swing.JLabel _lbTFechaNacimieto;
    javax.swing.JLabel _lbTGenero;
    javax.swing.JLabel _lbTNombre;
    javax.swing.JLabel _lbTNombreR;
    javax.swing.JLabel _lbTNumeroR;
    javax.swing.JLabel _lbTOcupacion;
    javax.swing.JLabel _lbTTelefono;
    javax.swing.JLabel _lbTelefono;
    javax.swing.JLabel _lbTelefonoR;
    javax.swing.JPanel _panelImagen;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JSeparator jSeparator2;
    javax.swing.JSeparator jSeparator3;
    javax.swing.JSeparator jSeparator4;
    javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
    private FrameModificarDatosPaciente _frameModificar;

    public FrameModificarDatosPaciente getFrameModificar() {
        return _frameModificar;
    }

    public JButton getBotonModificar() {
        return _botonModificar;
    }

    public JButton getBotonVerHistorial() {
        return _botonVerHistorial;
    }

    public String getLbImagen() {
        return _lbImagen.getIcon().toString();
    }

    public void setLbImagen(String ruta) {
        this._lbImagen.setIcon(new javax.swing.ImageIcon(ruta));
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public void setaDireccionResidencial(String aDireccionResidencial) {
        this._aDireccionResidencial.setText(aDireccionResidencial);
    }

    public void setLbTApellido(String lbTApellido) {
        this._lbTApellido.setText(lbTApellido);
    }

    public void setLbTApellidoR(String lbTApellidoR) {
        this._lbTApellidoR.setText(lbTApellidoR);
    }

    public void setLbTCedula(String lbTCedula) {
        this._lbTCedula.setText(lbTCedula);
    }

    public void setLbTCorreo(String lbTCorreo) {
        this._lbTCorreo.setText(lbTCorreo);
    }

    public void setLbTEdad(String lbTEdad) {
        this._lbTEdad.setText(lbTEdad);
    }

    public void setLbTFechaNacimieto(String lbTFechaNacimieto) {
        this._lbTFechaNacimieto.setText(lbTFechaNacimieto);
    }

    public void setLbTGenero(String lbTGenero) {
        this._lbTGenero.setText(lbTGenero);
    }

    public void setLbTNombre(String lbTNombre) {
        this._lbTNombre.setText(lbTNombre);
    }

    public void setLbTNombreR(String lbTNombreR) {
        this._lbTNombreR.setText(lbTNombreR);
    }

    public void setLbTNumeroR(String lbTNumeroR) {
        this._lbTNumeroR.setText(lbTNumeroR);
    }

    public void setLbTOcupacion(String lbTOcupacion) {
        this._lbTOcupacion.setText(lbTOcupacion);
    }

    public void setLbTTelefono(String lbTTelefono) {
        this._lbTTelefono.setText(lbTTelefono);
    }

    public void setLbTEstadoCivil(String lbTEstadoCivil) {
        this._lbTEstadoCivil.setText(lbTEstadoCivil);
    }

    public void AvisoAgregarHistorial(String cedula) {
        this._labelAviso.setText("ASOCIE UN HISTORIAL CLINICO ANTES A LA CÉDULA " + cedula);
        this._labelAvisoComplemento.setText("PARA PODER ACCEDER A ESTE APARTADO");
    }

    public void SetAvisoAgregarHistorial() {
        this._labelAviso.setText("");
        this._labelAvisoComplemento.setText("");
    }
}
