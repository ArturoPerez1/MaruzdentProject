package packagePrincipal.vistaPago;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class FrameEliminarCuenta extends javax.swing.JFrame {

    public FrameEliminarCuenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _tablaEliminarCuenta = new javax.swing.JTable();
        _botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 166, 154));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/ELIMINARcUENTA.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _tablaEliminarCuenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE PACIENTE", "CÉDULA", "COSTO TRATAMIENTO ($)"
            }
        ));
        _tablaEliminarCuenta.setFocusable(false);
        _tablaEliminarCuenta.setIntercellSpacing(new java.awt.Dimension(0, 0));
        _tablaEliminarCuenta.setRowHeight(25);
        _tablaEliminarCuenta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(_tablaEliminarCuenta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 250));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 790, 270));

        _botonEliminar.setBackground(new java.awt.Color(54, 203, 167));
        _botonEliminar.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        _botonEliminar.setText("ELIMINAR CUENTA");
        _botonEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        _botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(_botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 340, 50));

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

        setSize(new java.awt.Dimension(968, 497));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void ObtenerTablaPersonalizada() {
        _tablaEliminarCuenta.getTableHeader().setBackground(new Color(2, 119, 189));
        _tablaEliminarCuenta.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        _tablaEliminarCuenta.getTableHeader().setForeground(new Color(255, 255, 255));
        _tablaEliminarCuenta.setRowHeight(25);
    }

    public void LlenarTablaEliminarCuenta(String nombre, String cedula, String costo) {
        _model = new DefaultTableModel();
        ObtenerTablaPersonalizada();
        _tablaEliminarCuenta.setEnabled(true);

        _model.addColumn("NOMBRE PACIENTE");
        _model.addColumn("CÉDULA ");
        _model.addColumn("COSTO TRATAMIENTO");

        _tablaEliminarCuenta.setModel(_model);
        _model.setRowCount(0);

        Object[] fila = {
            nombre,
            cedula,
            costo};
        _model.addRow(fila);

        _tablaEliminarCuenta.setEnabled(false);
    }

    public void AddActionListener(ActionListener listener) {
        _botonEliminar.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonEliminar;
    javax.swing.JTable _tablaEliminarCuenta;
    javax.swing.JLabel jLabel1;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel _model;

    public JButton getBotonEliminar() {
        return _botonEliminar;
    }

}
