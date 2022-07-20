package packagePrincipal.vistaListaPaciente;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class PanelPacienteDetallado extends javax.swing.JPanel {

    public PanelPacienteDetallado() {
        initComponents();
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
        _botonVerHistorial = new javax.swing.JButton();
        _lbEstadoCivil = new javax.swing.JLabel();
        _lbTEstadoCivil = new javax.swing.JLabel();
        _labelAviso = new javax.swing.JLabel();
        _labelAvisoComplemento = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 188, 156));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/datosPacienteDetallado.png"))); // NOI18N
        add(_labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        _botonVolver.setBackground(new java.awt.Color(26, 188, 156));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 60));

        _lbNombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbNombre.setForeground(new java.awt.Color(153, 255, 255));
        _lbNombre.setText("NOMBRE :");
        add(_lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        _lbApellido.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbApellido.setForeground(new java.awt.Color(153, 255, 255));
        _lbApellido.setText("APELLIDO :");
        add(_lbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        _lbCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbCedula.setForeground(new java.awt.Color(153, 255, 255));
        _lbCedula.setText("CÉDULA :");
        add(_lbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        _lbTelefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTelefono.setForeground(new java.awt.Color(153, 255, 255));
        _lbTelefono.setText("NÚMERO TELEFÓNICO :");
        add(_lbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        _lbCorreo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbCorreo.setForeground(new java.awt.Color(153, 255, 255));
        _lbCorreo.setText("CORREO ELETRÓNICO :");
        add(_lbCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        _lbOcupacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbOcupacion.setForeground(new java.awt.Color(153, 255, 255));
        _lbOcupacion.setText("OCUPACIÓN :");
        add(_lbOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        _lbGenero.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbGenero.setForeground(new java.awt.Color(153, 255, 255));
        _lbGenero.setText("GÉNERO :");
        add(_lbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        _lbEdad.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbEdad.setForeground(new java.awt.Color(153, 255, 255));
        _lbEdad.setText("EDAD :");
        add(_lbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        _lbFechaNacimiento.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbFechaNacimiento.setForeground(new java.awt.Color(153, 255, 255));
        _lbFechaNacimiento.setText("FECHA DE NACIEMIENTO :");
        add(_lbFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 200, -1));

        _lbDireccion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbDireccion.setForeground(new java.awt.Color(153, 255, 255));
        _lbDireccion.setText("DIRECCÓN RESIDENCIAL :");
        add(_lbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        _lbNombreR.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbNombreR.setForeground(new java.awt.Color(153, 255, 255));
        _lbNombreR.setText("NOMBRE DEL RESPONSABLE :");
        add(_lbNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        _lbApellidoR.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbApellidoR.setForeground(new java.awt.Color(153, 255, 255));
        _lbApellidoR.setText("APELLIDO DEL RESPONSABLE :");
        add(_lbApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        _lbTelefonoR.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTelefonoR.setForeground(new java.awt.Color(153, 255, 255));
        _lbTelefonoR.setText("NUMERO DEL RESPONSABLE :");
        add(_lbTelefonoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        _aDireccionResidencial.setColumns(20);
        _aDireccionResidencial.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aDireccionResidencial.setRows(5);
        _aDireccionResidencial.setToolTipText("");
        jScrollPane1.setViewportView(_aDireccionResidencial);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 210, 100));

        _lbTNombre.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTNombre.setForeground(new java.awt.Color(255, 255, 255));
        _lbTNombre.setToolTipText("");
        add(_lbTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 340, 20));

        _lbTApellido.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTApellido.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 360, 20));

        _lbTCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTCedula.setForeground(new java.awt.Color(255, 255, 255));
        _lbTCedula.setToolTipText("");
        add(_lbTCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 330, 20));

        _lbTTelefono.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTTelefono.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 290, 20));

        _lbTCorreo.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTCorreo.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 280, 20));

        _lbTOcupacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTOcupacion.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 310, 20));

        _lbTGenero.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTGenero.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 340, 20));

        _lbTEdad.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTEdad.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 390, 20));

        _lbTFechaNacimieto.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTFechaNacimieto.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTFechaNacimieto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 290, 20));

        _lbTNombreR.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTNombreR.setForeground(new java.awt.Color(255, 255, 255));
        _lbTNombreR.setToolTipText("");
        add(_lbTNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 260, 20));

        _lbTApellidoR.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTApellidoR.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTApellidoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 270, 20));

        _lbTNumeroR.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTNumeroR.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTNumeroR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 290, 20));

        _botonVerHistorial.setBackground(new java.awt.Color(54, 203, 167));
        _botonVerHistorial.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonVerHistorial.setForeground(new java.awt.Color(255, 255, 255));
        _botonVerHistorial.setText("VER HISTORIAL CLINICO");
        _botonVerHistorial.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonVerHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVerHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 270, 50));

        _lbEstadoCivil.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbEstadoCivil.setForeground(new java.awt.Color(153, 255, 255));
        _lbEstadoCivil.setText("ESTADO CIVIL :");
        add(_lbEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        _lbTEstadoCivil.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTEstadoCivil.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 350, 20));

        _labelAviso.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _labelAviso.setForeground(new java.awt.Color(255, 255, 255));
        _labelAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_labelAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 680, 30));

        _labelAvisoComplemento.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _labelAvisoComplemento.setForeground(new java.awt.Color(255, 255, 255));
        _labelAvisoComplemento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_labelAvisoComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, 600, 30));
    }// </editor-fold>//GEN-END:initComponents

    public void AddActionListener(ActionListener listener) {
        _botonVerHistorial.addActionListener(listener);
        _botonVolver.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextArea _aDireccionResidencial;
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
    javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JButton getBotonVerHistorial() {
        return _botonVerHistorial;
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
