package packagePrincipal.vistaMDatosmedico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import packagePrincipal.modelo.DatosMedicos;

public class PanelMDatosMedicos extends javax.swing.JPanel {

    public PanelMDatosMedicos() {
        initComponents();
    }

    public void AgregarPanelModificadore() {
        _panelModificadores = new PanelModificadores();
        _panelModificadores.setSize(510, 260);
        _panelContendorModificadores.removeAll();
        _panelContendorModificadores.add(_panelModificadores, BorderLayout.CENTER);
        _panelContendorModificadores.revalidate();
        _panelContendorModificadores.repaint();
    }

    public void QuitarPanelModificadore() {
        _panelContendorModificadores.removeAll();
        _panelContendorModificadores.revalidate();
        _panelContendorModificadores.repaint();
    }

    public void LlenaComboBoxCedulas(ArrayList<DatosMedicos> registroMedicos) {
        _cbCedula.addItem(" ");
        for (int i = 0; i < registroMedicos.size(); i++) {
            _cbCedula.addItem(registroMedicos.get(i).getCedulaMedico());
        }
    }

    public void LlenaComboBoxCedulas1(ArrayList<DatosMedicos> registroMedicos) {
        try {
            _cbCedula.removeAllItems();
        } catch (NullPointerException e) {
            _cbCedula.addItem(" ");
        }
        for (int i = 0; i < registroMedicos.size(); i++) {
            _cbCedula.addItem(registroMedicos.get(i).getCedulaMedico());
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

        _lbLogo = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        _jtDatosMedicos = new javax.swing.JTable();
        _cbCedula = new javax.swing.JComboBox<>();
        _lbSeleccioneC = new javax.swing.JLabel();
        _botonBuscar = new javax.swing.JButton();
        _panelContendorModificadores = new javax.swing.JPanel();

        setBackground(new java.awt.Color(26, 188, 156));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/modificarDatosM.png"))); // NOI18N
        add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        _botonVolver.setBackground(new java.awt.Color(54, 203, 167));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        _botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 60));

        _jtDatosMedicos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        _jtDatosMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                " NOMBRE Y APELLIDO", "CÉDULA", "TELÉFONO", "ESPECIALIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        _jtDatosMedicos.setEnabled(false);
        _jtDatosMedicos.setGridColor(new java.awt.Color(0, 102, 255));
        jScrollPane1.setViewportView(_jtDatosMedicos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 780, 270));

        _cbCedula.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbCedulaActionPerformed(evt);
            }
        });
        add(_cbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 290, 50));

        _lbSeleccioneC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbSeleccioneC.setForeground(new java.awt.Color(153, 255, 255));
        _lbSeleccioneC.setText("SELECCIONE LA CÉDULA DEL MÉDICO");
        add(_lbSeleccioneC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 320, -1));

        _botonBuscar.setBackground(new java.awt.Color(54, 203, 167));
        _botonBuscar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        _botonBuscar.setText("BUSCAR");
        _botonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        add(_botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 150, 50));

        _panelContendorModificadores.setBackground(new java.awt.Color(26, 188, 156));
        _panelContendorModificadores.setLayout(null);
        add(_panelContendorModificadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 510, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void _cbCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulaActionPerformed
        QuitarPanelModificadore();
        _cbCedula.setBackground(Color.white);
        _textoBuscarCedula = _cbCedula.getSelectedItem().toString();
    }//GEN-LAST:event__cbCedulaActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonBuscar.addActionListener(listener);
        _botonVolver.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonBuscar;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _cbCedula;
    javax.swing.JTable _jtDatosMedicos;
    javax.swing.JLabel _lbLogo;
    javax.swing.JLabel _lbSeleccioneC;
    javax.swing.JPanel _panelContendorModificadores;
    javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private PanelModificadores _panelModificadores;
    private String _textoBuscarCedula = "";
    private ArrayList<DatosMedicos> _registrar;
    private DefaultTableModel _model;

    public void LlenarTable(ArrayList<DatosMedicos> registrar) {
        _model = new DefaultTableModel();
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

    }

    public JButton getBotonBuscar() {
        return _botonBuscar;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public PanelModificadores getPanelModificadores() {
        return _panelModificadores;
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
