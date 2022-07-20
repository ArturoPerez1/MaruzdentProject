package packagePrincipal.vistaListaPaciente;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import packagePrincipal.modelo.DatosPaciente;

public class PanelListaPaciente extends javax.swing.JPanel {

    public PanelListaPaciente() {
        initComponents();
    }

    public void ErrorCedula(boolean error) {
        if (error == true) {
            _cbCedula.setBackground(Color.red);
        } else {
            _cbCedula.setBackground(Color.white);
        }
    }

    public void LlenarCedula(ArrayList<DatosPaciente> registroPaciente) {
        _cbCedula.addItem(" ");

        for (DatosPaciente paciente : registroPaciente) {
            _cbCedula.addItem(paciente.getCedula());
        }
    }

    public void LlenarTablaPacientes(ArrayList<DatosPaciente> registroPaciente) {
        _model = new DefaultTableModel();
        this._registroPaciente = registroPaciente;

        _model.addColumn("NOMBRE PACIENTE");
        _model.addColumn("APELLIDO PACIENTE");
        _model.addColumn("CÉDULA PACIENTE");
        _model.addColumn("CORREO PACIENTE");

        _jtListaPacientes.setModel(_model);
        _model.setRowCount(0);

        for (DatosPaciente paciente : registroPaciente) {
            Object[] fila = {
                paciente.getNombre(),
                paciente.getApellidos(),
                paciente.getCedula(),
                paciente.getCorreoElectronico()};

            _model.addRow(fila);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _lbLogo = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        _lbListaPaciente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _jtListaPacientes = new javax.swing.JTable();
        _botonVerInformacion = new javax.swing.JButton();
        _cbCedula = new javax.swing.JComboBox<>();
        _lbInformacion = new javax.swing.JLabel();
        _lbCedula = new javax.swing.JLabel();
        _lbErrorCedula = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 188, 156));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/listaPaciente.png"))); // NOI18N
        add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        _botonVolver.setBackground(new java.awt.Color(26, 188, 156));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 60));

        _lbListaPaciente.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        _lbListaPaciente.setForeground(new java.awt.Color(153, 255, 255));
        _lbListaPaciente.setText("LISTA DE PACIENTES REGISTRADOS");
        add(_lbListaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        _jtListaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE PACIENTE", "APELLIDO", "CÉDULA", "CORREO"
            }
        ));
        jScrollPane1.setViewportView(_jtListaPacientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 860, 160));

        _botonVerInformacion.setBackground(new java.awt.Color(54, 203, 167));
        _botonVerInformacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonVerInformacion.setForeground(new java.awt.Color(255, 255, 255));
        _botonVerInformacion.setText("VER INFORMACIÓN");
        _botonVerInformacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        add(_botonVerInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 210, 40));

        _cbCedula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbCedulaActionPerformed(evt);
            }
        });
        add(_cbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 290, 40));

        _lbInformacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        _lbInformacion.setForeground(new java.awt.Color(153, 255, 255));
        _lbInformacion.setText("VER INFORMACIÓN DETALLADA ");
        add(_lbInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, 40));

        _lbCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbCedula.setForeground(new java.awt.Color(255, 255, 255));
        _lbCedula.setText("SELECCIONES LA CÉDULA DEL PACIENTE");
        add(_lbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        _lbErrorCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbErrorCedula.setForeground(new java.awt.Color(255, 255, 255));
        _lbErrorCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbErrorCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 360, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void _cbCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulaActionPerformed
        _cbCedula.setBackground(Color.white);
        setLbErrorCedula1();
        _textoCedula = _cbCedula.getSelectedItem().toString();
        System.out.println("este es el contenido = " + _textoCedula);
    }//GEN-LAST:event__cbCedulaActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonVerInformacion.addActionListener(listener);
        _botonVolver.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonVerInformacion;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _cbCedula;
    javax.swing.JTable _jtListaPacientes;
    javax.swing.JLabel _lbCedula;
    javax.swing.JLabel _lbErrorCedula;
    javax.swing.JLabel _lbInformacion;
    javax.swing.JLabel _lbListaPaciente;
    javax.swing.JLabel _lbLogo;
    javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private ArrayList<DatosPaciente> _registroPaciente;
    private DefaultTableModel _model;
    private String _textoCedula = "";

    public JButton getBotonVerInformacion() {
        return _botonVerInformacion;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public String getTextoCedula() {
        return _textoCedula;
    }

    public void setCbCedula() {
        this._cbCedula.setSelectedItem(" ");
    }

    public void setLbErrorCedula() {
        this._lbErrorCedula.setText("SELECCIONE UNA CÉDULA ");
    }

    public void setLbErrorCedula1() {
        this._lbErrorCedula.setText("");
    }

    public void setTextoCedula() {
        this._textoCedula = "";
    }

}
