package packagePrincipal.vistaListaPaciente;

import java.awt.Color;
import java.awt.Font;
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

    public void ObtenerTablaPersonalizada() {
        _jtListaPacientes.getTableHeader().setBackground(new Color(2, 119, 189));
        _jtListaPacientes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        _jtListaPacientes.getTableHeader().setForeground(new Color(255, 255, 255));
        _jtListaPacientes.setRowHeight(25);
    }

    public void LlenarTablaPacientes(ArrayList<DatosPaciente> registroPaciente) {
        _model = new DefaultTableModel();
        ObtenerTablaPersonalizada();
        _jtListaPacientes.setEnabled(true);
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

        _jtListaPacientes.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _lbLogo = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        _lbListaPaciente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _jtListaPacientes = new javax.swing.JTable();
        _lbInformacion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        _lbCedula = new javax.swing.JLabel();
        _cbCedula = new javax.swing.JComboBox<>();
        _botonVerInformacion = new javax.swing.JButton();
        _lbErrorCedula = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/listaDePacientes.png"))); // NOI18N
        add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 760, -1));

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        _lbListaPaciente.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        _lbListaPaciente.setForeground(new java.awt.Color(153, 255, 255));
        _lbListaPaciente.setText("LISTA DE PACIENTES REGISTRADOS");
        add(_lbListaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

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
        _jtListaPacientes.setFocusable(false);
        _jtListaPacientes.setIntercellSpacing(new java.awt.Dimension(0, 0));
        _jtListaPacientes.setRowHeight(25);
        _jtListaPacientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(_jtListaPacientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 860, 200));

        _lbInformacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        _lbInformacion.setForeground(new java.awt.Color(153, 255, 255));
        _lbInformacion.setText("VER INFORMACIÓN DETALLADA ");
        add(_lbInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, 230));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 510, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, 20, 230));

        jPanel1.setBackground(new java.awt.Color(0, 137, 123));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbCedula.setForeground(new java.awt.Color(255, 255, 255));
        _lbCedula.setText("SELECCIONE LA CÉDULA DEL PACIENTE");
        jPanel1.add(_lbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        _cbCedula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(_cbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 290, 40));

        _botonVerInformacion.setBackground(new java.awt.Color(54, 203, 167));
        _botonVerInformacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonVerInformacion.setForeground(new java.awt.Color(255, 255, 255));
        _botonVerInformacion.setText("VER INFORMACIÓN");
        _botonVerInformacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        jPanel1.add(_botonVerInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 210, 40));

        _lbErrorCedula.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbErrorCedula.setForeground(new java.awt.Color(255, 255, 255));
        _lbErrorCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(_lbErrorCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 360, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 490, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void _cbCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulaActionPerformed
        _cbCedula.setBackground(Color.white);
        setLbErrorCedula1();
        _textoCedula = _cbCedula.getSelectedItem().toString();
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
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JSeparator jSeparator1;
    javax.swing.JSeparator jSeparator2;
    javax.swing.JSeparator jSeparator3;
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
