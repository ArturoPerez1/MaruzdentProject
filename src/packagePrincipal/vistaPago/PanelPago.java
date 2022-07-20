package packagePrincipal.vistaPago;

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

    public void LlenaTablaPagos(ArrayList<CuentaPaciente> registroCuenta, ArrayList<DatosPaciente> registroPaciente) {
        _model = new DefaultTableModel();
        this._registroCuenta = registroCuenta;
        String cedulaAux;
        String nombre = "";

        _model.addColumn("NOMBRE PACIENTE");
        _model.addColumn("CÉDULA PACIENTE");
        _model.addColumn("PAGO CONSUlTA$");
        _model.addColumn("PAGO TRATAMIENTO$");

        _jtableListaDepago.setModel(_model);
        _model.setRowCount(0);

        for (DatosPaciente paciente : registroPaciente) {
            for (CuentaPaciente cuenta : registroCuenta) {
                cedulaAux = cuenta.getCedulaAsociada();
                if (paciente.getCedula().equals(cedulaAux)) {
                    nombre = paciente.getNombre();
                }
            }
        }

        for (CuentaPaciente cuenta : registroCuenta) {
            Object[] fila = {
                nombre,
                cuenta.getCedulaAsociada(),
                cuenta.getCostoConsulta(),
                cuenta.getCostoTotalTratamiento()};

            _model.addRow(fila);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _lbLogo = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        _jtableListaDepago = new javax.swing.JTable();
        _lbListaPagos = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 188, 156));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/inventarioPagos.png"))); // NOI18N
        add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        _botonVolver.setBackground(new java.awt.Color(26, 188, 156));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 60));

        _jtableListaDepago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE PACIENTE", "CÉDULA", "PAGO CONSULTA", "PAGO TRATAMIENTO"
            }
        ));
        jScrollPane1.setViewportView(_jtableListaDepago);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 860, 190));

        _lbListaPagos.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 48)); // NOI18N
        _lbListaPagos.setForeground(new java.awt.Color(153, 255, 255));
        _lbListaPagos.setText("LISTA DE PAGOS POR PACIENTE :");
        add(_lbListaPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void AddActionListener(ActionListener listener) {
        _botonVolver.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonVolver;
    javax.swing.JTable _jtableListaDepago;
    javax.swing.JLabel _lbListaPagos;
    javax.swing.JLabel _lbLogo;
    javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private ArrayList<CuentaPaciente> _registroCuenta;
    private ArrayList<DatosPaciente> _registroPaciente;
    private DefaultTableModel _model;

    public JButton getBotonVolver() {
        return _botonVolver;
    }

}
