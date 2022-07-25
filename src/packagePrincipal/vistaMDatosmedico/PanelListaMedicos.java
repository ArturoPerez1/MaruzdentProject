package packagePrincipal.vistaMDatosmedico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import packagePrincipal.modelo.DatosMedicos;

public class PanelListaMedicos extends javax.swing.JPanel {

    public PanelListaMedicos() {
        initComponents();
    }

    public void LlenaComboBoxCedulas(ArrayList<DatosMedicos> registroMedicos) {
        _cbCedula.addItem(" ");
        for (int i = 0; i < registroMedicos.size(); i++) {
            _cbCedula.addItem(registroMedicos.get(i).getCedulaMedico());
        }
    }

    public void QuitarItems() {
        try {
            _cbCedula.removeAllItems();
        } catch (NullPointerException e) {

        }
    }

    public void ErrorCedula(boolean error) {
        if (error == true) {
            _cbCedula.setBackground(Color.red);
        } else {
            _cbCedula.setBackground(Color.white);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _botonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        _jtDatosMedicos = new javax.swing.JTable();
        _cbCedula = new javax.swing.JComboBox<>();
        _lbSeleccioneC = new javax.swing.JLabel();
        _botonBuscar = new javax.swing.JButton();
        _panelContendorModificadores = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        _labelSelecCError = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        _jtDatosMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE Y APELLIDO", "CÉDULA", "TELÉFONO", "ESPECIALIDAD"
            }
        ));
        _jtDatosMedicos.setFocusable(false);
        _jtDatosMedicos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        _jtDatosMedicos.setRowHeight(25);
        _jtDatosMedicos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(_jtDatosMedicos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1040, 240));

        _cbCedula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _cbCedulaMouseClicked(evt);
            }
        });
        _cbCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbCedulaActionPerformed(evt);
            }
        });
        add(_cbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 290, 50));

        _lbSeleccioneC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbSeleccioneC.setForeground(new java.awt.Color(153, 255, 255));
        _lbSeleccioneC.setText("SELECCIONE LA CÉDULA DEL MÉDICO");
        add(_lbSeleccioneC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 320, -1));

        _botonBuscar.setBackground(new java.awt.Color(54, 203, 167));
        _botonBuscar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        _botonBuscar.setText("BUSCAR");
        _botonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _botonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _botonBuscarMouseExited(evt);
            }
        });
        add(_botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 150, 50));

        _panelContendorModificadores.setBackground(new java.awt.Color(38, 166, 154));
        _panelContendorModificadores.setLayout(null);
        add(_panelContendorModificadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 740, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/modificarMedico.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        _labelSelecCError.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _labelSelecCError.setForeground(new java.awt.Color(255, 255, 255));
        _labelSelecCError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_labelSelecCError, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 310, 20));

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("LISTA DE MÉDICOS REGISTRADOS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 440, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void _cbCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulaActionPerformed
        _cbCedula.setBackground(Color.white);
        setLabelSelecCError1();
        _textoBuscarCedula = _cbCedula.getSelectedItem().toString();
    }//GEN-LAST:event__cbCedulaActionPerformed

    private void _botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonBuscarMouseEntered
        _botonBuscar.setBackground(new java.awt.Color(0, 191, 165));
    }//GEN-LAST:event__botonBuscarMouseEntered

    private void _botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__botonBuscarMouseExited
        _botonBuscar.setBackground(new java.awt.Color(54, 203, 167));
    }//GEN-LAST:event__botonBuscarMouseExited

    private void _cbCedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__cbCedulaMouseClicked
        _cbCedula.setBackground(Color.white);
    }//GEN-LAST:event__cbCedulaMouseClicked

    public void AddActionListener(ActionListener listener) {
        _botonBuscar.addActionListener(listener);
        _botonVolver.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonBuscar;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _cbCedula;
    javax.swing.JTable _jtDatosMedicos;
    javax.swing.JLabel _labelSelecCError;
    javax.swing.JLabel _lbSeleccioneC;
    javax.swing.JPanel _panelContendorModificadores;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private String _textoBuscarCedula = "";
    private ArrayList<DatosMedicos> _registrar;
    private DefaultTableModel _model;

    public void ObtenerTablaPersonalizada() {
        _jtDatosMedicos.getTableHeader().setBackground(new Color(2, 119, 189));
        _jtDatosMedicos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        _jtDatosMedicos.getTableHeader().setForeground(new Color(255, 255, 255));
        _jtDatosMedicos.setRowHeight(25);
    }

    public void LlenarTable(ArrayList<DatosMedicos> registrar) {
        _model = new DefaultTableModel();
        ObtenerTablaPersonalizada();
        _jtDatosMedicos.setEnabled(true);
        this._registrar = registrar;
        _model.addColumn("NOMBRE Y APELLIDO");
        _model.addColumn("CÉDULA");
        _model.addColumn("TELÉFONO");
        _model.addColumn("ESPECIALIDAD");

        _jtDatosMedicos.setModel(_model);

        _model.setRowCount(0);

        for (int i = 0; i < _registrar.size(); i++) {
            Object[] fila = {
                _registrar.get(i).getNombreMedico(),
                _registrar.get(i).getCedulaMedico(),
                _registrar.get(i).getNumeroTelefonico(),
                _registrar.get(i).getEspecialidad()};

            _model.addRow(fila);
        }

        _jtDatosMedicos.setEnabled(false);
    }

    public void LlenarTableParcial(ArrayList<DatosMedicos> registrar, int i) {
        _model = new DefaultTableModel();
        ObtenerTablaPersonalizada();
        _jtDatosMedicos.setEnabled(true);
        this._registrar = registrar;

        _model.addColumn("NOMBRE Y APELLIDO");
        _model.addColumn("CÉDULA");
        _model.addColumn("TELÉFONO");
        _model.addColumn("ESPECIALIDAD");

        _jtDatosMedicos.setModel(_model);

        _model.setRowCount(0);

        Object[] fila = {
            _registrar.get(i).getNombreMedico(),
            _registrar.get(i).getCedulaMedico(),
            _registrar.get(i).getNumeroTelefonico(),
            _registrar.get(i).getEspecialidad()};

        _model.addRow(fila);

        _jtDatosMedicos.setEnabled(false);

    }

    public void setLabelSelecCError() {
        this._labelSelecCError.setText("SELECCIONE UNA CÉDULA");
    }

    public void setLabelSelecCError1() {
        this._labelSelecCError.setText("");
    }

    public JButton getBotonBuscar() {
        return _botonBuscar;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public String getTextoBuscarCedula() {
        return _textoBuscarCedula;
    }

    public void setCbCedula() {
        this._cbCedula.setSelectedItem(" ");
    }

    public void setTextoBuscarCedula() {
        this._textoBuscarCedula = "";
    }

}
