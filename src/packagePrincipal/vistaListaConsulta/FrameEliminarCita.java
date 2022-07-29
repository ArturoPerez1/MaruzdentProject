package packagePrincipal.vistaListaConsulta;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import packagePrincipal.modelo.DatosConsulta;

public class FrameEliminarCita extends javax.swing.JFrame {

    public FrameEliminarCita() {
        initComponents();
    }

    public void ObtenerTablaPersonalizada() {
        _tablaEliminarCita.getTableHeader().setBackground(new Color(2, 119, 189));
        _tablaEliminarCita.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        _tablaEliminarCita.getTableHeader().setForeground(new Color(255, 255, 255));
        _tablaEliminarCita.setRowHeight(25);
    }

    public void LlenarTabla(ArrayList<DatosConsulta> listaCita, int i) {
        _model = new DefaultTableModel();
        ObtenerTablaPersonalizada();
        _tablaEliminarCita.setEnabled(true);
        this._listaCita = listaCita;

        _model.addColumn("NOMBRE PACIENTE");
        _model.addColumn("CÉDULA PACIENTE");
        _model.addColumn("FECHA CITA");

        _tablaEliminarCita.setModel(_model);
        _model.setRowCount(0);

        Object[] fila = {
            _listaCita.get(i).getNombrePaciente(),
            _listaCita.get(i).getCedulaPaciente(),
            _listaCita.get(i).getFechaCita()

        };
        _model.addRow(fila);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _tablaEliminarCita = new javax.swing.JTable();
        _botonEliminar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 166, 154));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/eliminarCita.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _tablaEliminarCita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE PACIENTE", "CÉDULA PACIENTE", "FECHA DE LA CITA"
            }
        ));
        _tablaEliminarCita.setFocusable(false);
        _tablaEliminarCita.setIntercellSpacing(new java.awt.Dimension(0, 0));
        _tablaEliminarCita.setRowHeight(25);
        _tablaEliminarCita.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(_tablaEliminarCita);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 200));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 830, 220));

        _botonEliminar.setBackground(new java.awt.Color(54, 203, 167));
        _botonEliminar.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        _botonEliminar.setText("CONFIRMAR ELIMINACIÓN");
        _botonEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        _botonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(_botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 330, 60));

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

    public void AddActionListener(ActionListener listener) {
        _botonEliminar.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonEliminar;
    javax.swing.JTable _tablaEliminarCita;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel3;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private ArrayList<DatosConsulta> _listaCita;
    private DefaultTableModel _model;

    public JButton getBotonEliminar() {
        return _botonEliminar;
    }

}
