package packagePrincipal.vistaPago;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import packagePrincipal.modelo.CuentaPaciente;
import packagePrincipal.modelo.DatosPaciente;

public class PanelPago extends javax.swing.JPanel {

    public PanelPago() {
        initComponents();
    }

    public void ObtenerTablaPersonalizada() {
        _jtableListaDepago.getTableHeader().setBackground(new Color(2, 119, 189));
        _jtableListaDepago.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        _jtableListaDepago.getTableHeader().setForeground(new Color(255, 255, 255));
        _jtableListaDepago.setRowHeight(25);
    }

    public void LlenaTablaPagos(ArrayList<CuentaPaciente> registroCuenta, ArrayList<DatosPaciente> registroPaciente) {
        _model = new DefaultTableModel();
        ObtenerTablaPersonalizada();
        this._registroCuenta = registroCuenta;
        String cedulaAux;
        String nombre = "";
        int cont = 0;

        _model.addColumn("NOMBRE PACIENTE");
        _model.addColumn("CÉDULA PACIENTE");
        _model.addColumn("PRESUPUESTO PACIENTE");
        _model.addColumn("TIPO DE TRATAMIENTO");
        _model.addColumn("COSTO TOTAL TRATAMIENTO");

        _jtableListaDepago.setModel(_model);
        _model.setRowCount(0);

        //LLENAR FILA DE NOMBRES 
        for (DatosPaciente paciente : registroPaciente) {
            for (CuentaPaciente cuenta : registroCuenta) {
                cedulaAux = cuenta.getCedulaAsociada();
                if (paciente.getCedula().equals(cedulaAux)) {
                    _jtableListaDepago.setValueAt(paciente.getNombre(), cont, 0);
                }
            }

            cont++;
        }

        for (CuentaPaciente cuenta : registroCuenta) {
            if (cuenta.getTipoTratamiento().equals("TRATAMIENTO ÚNICO")) {
                Object[] fila = {
                    cuenta.getCedulaAsociada(),
                    "NO APLICA TRATAMIENTO ÜNICO",
                    cuenta.getTipoTratamiento(),
                    cuenta.getCostoTratamiento()
                };

                _model.addRow(fila);
            } else {
                Object[] fila = {
                    cuenta.getCedulaAsociada(),
                    cuenta.getPresupuestoPaciente(),
                    cuenta.getTipoTratamiento(),
                    cuenta.getCostoTratamiento()
                };

                _model.addRow(fila);
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _botonVolver = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _jtableListaDepago = new javax.swing.JTable();
        _lbLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1200, -1));

        jPanel1.setBackground(new java.awt.Color(0, 137, 123));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _jtableListaDepago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE PACIENTE", "CÉDULA", "PRESUPUESTO PACIENTE", "TIPO DE TRATAMIENTO", "COSTO DEL TRATAMEINTO ($)"
            }
        ));
        _jtableListaDepago.setFocusable(false);
        _jtableListaDepago.setIntercellSpacing(new java.awt.Dimension(0, 0));
        _jtableListaDepago.setRowHeight(25);
        _jtableListaDepago.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(_jtableListaDepago);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1090, 240));

        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/listaDeCuentas.png"))); // NOI18N
        jPanel1.add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 1150, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/filtros.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        jButton1.setText("jButton1");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jButton2.setText("jButton2");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jButton3.setText("jButton3");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        jButton4.setText("jButton4");
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void AddActionListener(ActionListener listener) {
        _botonVolver.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonVolver;
    javax.swing.JTable _jtableListaDepago;
    javax.swing.JLabel _lbLogo;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JButton jButton4;
    javax.swing.JLabel jLabel1;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    private ArrayList<CuentaPaciente> _registroCuenta;
    private ArrayList<DatosPaciente> _registroPaciente;
    private DefaultTableModel _model;

    public JButton getBotonVolver() {
        return _botonVolver;
    }

}
