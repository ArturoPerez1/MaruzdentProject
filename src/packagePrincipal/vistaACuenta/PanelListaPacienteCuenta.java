package packagePrincipal.vistaACuenta;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import packagePrincipal.modelo.DatosPaciente;
import packagePrincipal.modelo.HistorialClinico;

public class PanelListaPacienteCuenta extends javax.swing.JPanel {

    public PanelListaPacienteCuenta() {
        initComponents();
    }

    public void AgregarVentanaDeAdjuntarCuenta(ArrayList<DatosPaciente> paciente, int i, ArrayList<HistorialClinico> historial, int j) {
        _frameAgregarCuenta = new FrameAgregarCuenta();
        _frameAgregarCuenta.LlenarDatosPaciente(_registrarPaciente, i, historial, j);
    }

    public void LlenaComboBoxCedulas(ArrayList<DatosPaciente> _registroPaciente) {
        _cbCedulaAsociada.addItem(" ");
        for (int i = 0; i < _registroPaciente.size(); i++) {
            _cbCedulaAsociada.addItem(_registroPaciente.get(i).getCedula());
        }
    }

    public void ObtenerTablaPacientePersonalizada() {
        _tableDatosPaciente.getTableHeader().setBackground(new Color(2, 119, 189));
        _tableDatosPaciente.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        _tableDatosPaciente.getTableHeader().setForeground(new Color(255, 255, 255));
        _tableDatosPaciente.setRowHeight(25);
    }

    public void LlenarTablaGeneralPaciente(ArrayList<DatosPaciente> registroPaciente) {
        _model = new DefaultTableModel();
        ObtenerTablaPacientePersonalizada();
        _tableDatosPaciente.setEnabled(true);
        this._registrarPaciente = registroPaciente;

        _model.addColumn("NOMBRE Y APELLIDO");
        _model.addColumn("CÉDULA");
        _model.addColumn("TELÉFONO");
        _model.addColumn("CORREO");

        _tableDatosPaciente.setModel(_model);

        _model.setRowCount(0);

        for (DatosPaciente paciente : registroPaciente) {
            Object[] fila = {
                paciente.getNombre() + " " + paciente.getApellidos(),
                paciente.getCedula(),
                paciente.getNumeroTelefonico(),
                paciente.getCorreoElectronico()};

            _model.addRow(fila);
        }

        _tableDatosPaciente.setEnabled(false);

    }

    public void ErrorCedulaAsociada(boolean error) {
        if (error = true) {
            _cbCedulaAsociada.setBackground(Color.red);
        } else {
            _cbCedulaAsociada.setBackground(Color.white);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _lbCCedulaAsociada = new javax.swing.JLabel();
        _cbCedulaAsociada = new javax.swing.JComboBox<>();
        _botonRegistrar = new javax.swing.JButton();
        _botonVolver = new javax.swing.JButton();
        _labelCedulaRepetida = new javax.swing.JLabel();
        _logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _tableDatosPaciente = new javax.swing.JTable();
        _botonAgregarCuenta = new javax.swing.JButton();

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbCCedulaAsociada.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbCCedulaAsociada.setForeground(new java.awt.Color(153, 255, 255));
        _lbCCedulaAsociada.setText("CÉDULA PACIENTE ASOCIADO");
        add(_lbCCedulaAsociada, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 320, -1));

        _cbCedulaAsociada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbCedulaAsociada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbCedulaAsociadaActionPerformed(evt);
            }
        });
        add(_cbCedulaAsociada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 390, 50));

        _botonRegistrar.setBackground(new java.awt.Color(54, 203, 167));
        _botonRegistrar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        _botonRegistrar.setText("REGISTRAR CUENTA");
        _botonRegistrar.setToolTipText("");
        _botonRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 630, 280, 50));

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        _labelCedulaRepetida.setFont(new java.awt.Font("Metropolis Black", 1, 10)); // NOI18N
        _labelCedulaRepetida.setForeground(new java.awt.Color(255, 255, 255));
        add(_labelCedulaRepetida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 560, 30));

        _logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/agregarCuenta.png"))); // NOI18N
        add(_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        _tableDatosPaciente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _tableDatosPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE Y APELLIDO", "CÉDULA", "TELÉFONO", "CORREO"
            }
        ));
        _tableDatosPaciente.setFocusable(false);
        _tableDatosPaciente.setIntercellSpacing(new java.awt.Dimension(0, 0));
        _tableDatosPaciente.setRowHeight(25);
        _tableDatosPaciente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(_tableDatosPaciente);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 1000, 350));

        _botonAgregarCuenta.setBackground(new java.awt.Color(54, 203, 167));
        _botonAgregarCuenta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonAgregarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        _botonAgregarCuenta.setText("AGREGAR CUENTA PACIENTE");
        _botonAgregarCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonAgregarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonAgregarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 280, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void _cbCedulaAsociadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulaAsociadaActionPerformed
        _cbCedulaAsociada.setBackground(Color.white);
        setLabelErrorCedula1();
        _textoCedula = _cbCedulaAsociada.getSelectedItem().toString();
    }//GEN-LAST:event__cbCedulaAsociadaActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonRegistrar.addActionListener(listener);
        _botonVolver.addActionListener(listener);
        _botonAgregarCuenta.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonAgregarCuenta;
    javax.swing.JButton _botonRegistrar;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _cbCedulaAsociada;
    javax.swing.JLabel _labelCedulaRepetida;
    javax.swing.JLabel _lbCCedulaAsociada;
    javax.swing.JLabel _logo;
    javax.swing.JTable _tableDatosPaciente;
    javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private String _textoCedula = "";
    private FrameAgregarCuenta _frameAgregarCuenta;
    private ArrayList<DatosPaciente> _registrarPaciente;
    private DefaultTableModel _model;

    public JButton getBotonRegistrar() {
        return _botonRegistrar;
    }

    public FrameAgregarCuenta getFrameAgregarCuenta() {
        return _frameAgregarCuenta;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public JButton getBotonAgregarCuenta() {
        return _botonAgregarCuenta;
    }

    public String getTextoCedula() {
        return _textoCedula;
    }

    public void setCbCedulaAsociada() {
        this._cbCedulaAsociada.setSelectedItem(" ");
    }

    public void setTextoCedula() {
        this._textoCedula = "";
    }

    public void setLabelErrorCedula() {
        this._labelCedulaRepetida.setText("ESTA CÉDULA YA ESTÁ ASOCIADA A LA CUENTRA DE UN PACIENTE");
    }

    public void setLabelErrorCedula2() {
        this._labelCedulaRepetida.setText("SELECCIONE UNA CÉDULA");
    }

    public void setLabelErrorCedula1() {
        this._labelCedulaRepetida.setText("");
    }
}
