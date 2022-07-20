package packagePrincipal.vistaListaConsulta;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import packagePrincipal.modelo.DatosConsulta;
import packagePrincipal.modelo.HistorialClinico;

public class PanelListaConsulta extends javax.swing.JPanel {

    public PanelListaConsulta() {
        initComponents();
    }

    public void LlenarCedula(ArrayList<DatosConsulta> registroConsulta) {
        _cbCedulas.addItem(" ");
        for (int i = 0; i < registroConsulta.size(); i++) {
            _cbCedulas.addItem(registroConsulta.get(i).getCedulaPaciente());
        }
    }

    public void ErrorEstadoConsulta(boolean error) {
        if (error == true) {
            _cbEstadoConsulta.setBackground(Color.red);
        } else {
            _cbEstadoConsulta.setBackground(Color.white);
        }
    }

    public void ErrorEstadoCedula(boolean error) {
        if (error == true) {
            _cbCedulas.setBackground(Color.red);
        } else {
            _cbCedulas.setBackground(Color.white);
        }
    }

    public void AgregarBotonCancelar() {
        _botonCancelar = new PanelBotonCancelar();
        _botonCancelar.setSize(330, 60);
        _panelContenedor1.removeAll();
        _panelContenedor1.add(_botonCancelar, BorderLayout.CENTER);
        _panelContenedor1.revalidate();
        _panelContenedor1.repaint();
    }

    public void QuitarBotonCancelar() {
        _panelContenedor1.removeAll();
        _panelContenedor1.revalidate();
        _panelContenedor1.repaint();
    }

    public void LlenarTableConsultas(ArrayList<DatosConsulta> registroConsulta, ArrayList<HistorialClinico> registroClinico) {
        _model = new DefaultTableModel();
        int cont = 0;
        this._registroConsulta = registroConsulta;
        String cedulaAux;

        _model.addColumn("NOMBRE PACIENTE");
        _model.addColumn("CÉDULA PACIENTE");
        _model.addColumn("NOMBRE MÉDICO");
        _model.addColumn("ESTADO CONSULTA");
        _model.addColumn("RAZÓN CONSULTA");

        _jTConsultasRegistradas.setModel(_model);
        _model.setRowCount(0);

        for (DatosConsulta consulta : registroConsulta) {
            System.out.println("Nombre = " + consulta.getNombrePaciente());
            Object[] fila = {
                consulta.getNombrePaciente(),
                consulta.getCedulaPaciente(),
                consulta.getMedicoAsociado().getNombreMedico(),
                consulta.getEstadoConsulta()};

            _model.addRow(fila);
        }

        for(HistorialClinico historial : registroClinico){
            for(DatosConsulta consulta : registroConsulta){
                System.out.println("Nombre Razon = " + consulta.getNombrePaciente());
                cedulaAux = consulta.getCedulaPaciente();
                if(historial.getCedulaAsociada().equals(cedulaAux)){
                    _jTConsultasRegistradas.setValueAt(historial.getRazonConsulta(),cont, 4);
                }
            }
            cont++;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _labelLogo = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        _lbConsultasHoy = new javax.swing.JLabel();
        _lbFecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _jTConsultasRegistradas = new javax.swing.JTable();
        _lbEstadoConsulta = new javax.swing.JLabel();
        _botonMConsulta = new javax.swing.JButton();
        _cbEstadoConsulta = new javax.swing.JComboBox<>();
        _botonEliminarRegistro = new javax.swing.JButton();
        _lbEliminarRegistro = new javax.swing.JLabel();
        _lbCedulas = new javax.swing.JLabel();
        _cbCedulas = new javax.swing.JComboBox<>();
        _lbConsulta = new javax.swing.JLabel();
        _lbAvisoError = new javax.swing.JLabel();
        _lbConfirmacion = new javax.swing.JLabel();
        _lbConfirmacionC = new javax.swing.JLabel();
        _panelContenedor1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(26, 188, 156));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/listaConsultas.png"))); // NOI18N
        add(_labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        _botonVolver.setBackground(new java.awt.Color(54, 203, 167));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 60));

        _lbConsultasHoy.setFont(new java.awt.Font("Metropolis Black", 1, 36)); // NOI18N
        _lbConsultasHoy.setForeground(new java.awt.Color(153, 255, 255));
        _lbConsultasHoy.setText("CONSULTAS DE HOY: ");
        add(_lbConsultasHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 410, 40));

        _lbFecha.setFont(new java.awt.Font("Metropolis Black", 1, 36)); // NOI18N
        _lbFecha.setForeground(new java.awt.Color(153, 255, 255));
        add(_lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 290, 40));

        _jTConsultasRegistradas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        _jTConsultasRegistradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE PACIENTE", "CÉDULA PACIENTE", "NOMBRE MÉDICO", "RAZÓN CONSULTA", "ESTADO CONSULTA"
            }
        ));
        jScrollPane1.setViewportView(_jTConsultasRegistradas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 880, 150));

        _lbEstadoConsulta.setFont(new java.awt.Font("Metropolis Black", 1, 16)); // NOI18N
        _lbEstadoConsulta.setForeground(new java.awt.Color(153, 255, 255));
        _lbEstadoConsulta.setText("MODIFICAR ESTADO CONSULTA");
        add(_lbEstadoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        _botonMConsulta.setBackground(new java.awt.Color(54, 203, 167));
        _botonMConsulta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _botonMConsulta.setForeground(new java.awt.Color(255, 255, 255));
        _botonMConsulta.setText("MODIFICAR");
        _botonMConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        add(_botonMConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 120, 30));

        _cbEstadoConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Creada", "No Creada", "Suspendida", "Terminada", " " }));
        _cbEstadoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbEstadoConsultaActionPerformed(evt);
            }
        });
        add(_cbEstadoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 200, 40));

        _botonEliminarRegistro.setBackground(new java.awt.Color(54, 203, 167));
        _botonEliminarRegistro.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonEliminarRegistro.setForeground(new java.awt.Color(255, 255, 255));
        _botonEliminarRegistro.setText("ELIMINAR REGISTRO");
        _botonEliminarRegistro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        add(_botonEliminarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 240, 40));

        _lbEliminarRegistro.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbEliminarRegistro.setForeground(new java.awt.Color(153, 255, 255));
        _lbEliminarRegistro.setText("ELIMINAR REGISTRO DE CONSULTAS");
        add(_lbEliminarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 330, 30));

        _lbCedulas.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbCedulas.setForeground(new java.awt.Color(255, 255, 255));
        _lbCedulas.setText("CÉDULA PACIENTE");
        add(_lbCedulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, -1, -1));

        _cbCedulas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _cbCedulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbCedulasActionPerformed(evt);
            }
        });
        add(_cbCedulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 200, 40));

        _lbConsulta.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbConsulta.setForeground(new java.awt.Color(255, 255, 255));
        _lbConsulta.setText("ESTADO DE CONSULTA");
        add(_lbConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        _lbAvisoError.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        _lbAvisoError.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbAvisoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 520, 30));

        _lbConfirmacion.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 22)); // NOI18N
        _lbConfirmacion.setForeground(new java.awt.Color(255, 255, 255));
        _lbConfirmacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(_lbConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 390, 40));

        _lbConfirmacionC.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 22)); // NOI18N
        _lbConfirmacionC.setForeground(new java.awt.Color(255, 255, 255));
        _lbConfirmacionC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbConfirmacionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 300, 40));

        _panelContenedor1.setBackground(new java.awt.Color(26, 188, 156));
        _panelContenedor1.setLayout(null);
        add(_panelContenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, 330, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void _cbEstadoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbEstadoConsultaActionPerformed
        _cbEstadoConsulta.setBackground(Color.white);
        setLabelAviso2_2();
        setLabelAviso3_3();
        _textoEstadoConsulta = _cbEstadoConsulta.getSelectedItem().toString();
    }//GEN-LAST:event__cbEstadoConsultaActionPerformed

    private void _cbCedulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbCedulasActionPerformed
        _cbCedulas.setBackground(Color.white);
        setLabelAviso1_1();
        setLabelAviso3_3();
        _textoCedula = _cbCedulas.getSelectedItem().toString();
    }//GEN-LAST:event__cbCedulasActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonEliminarRegistro.addActionListener(listener);
        _botonMConsulta.addActionListener(listener);
        _botonVolver.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonEliminarRegistro;
    javax.swing.JButton _botonMConsulta;
    javax.swing.JButton _botonVolver;
    javax.swing.JComboBox<String> _cbCedulas;
    javax.swing.JComboBox<String> _cbEstadoConsulta;
    javax.swing.JTable _jTConsultasRegistradas;
    javax.swing.JLabel _labelLogo;
    javax.swing.JLabel _lbAvisoError;
    javax.swing.JLabel _lbCedulas;
    javax.swing.JLabel _lbConfirmacion;
    javax.swing.JLabel _lbConfirmacionC;
    javax.swing.JLabel _lbConsulta;
    javax.swing.JLabel _lbConsultasHoy;
    javax.swing.JLabel _lbEliminarRegistro;
    javax.swing.JLabel _lbEstadoConsulta;
    javax.swing.JLabel _lbFecha;
    javax.swing.JPanel _panelContenedor1;
    javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private String _textoEstadoConsulta = "";
    private String _textoCedula = "";
    private ArrayList<DatosConsulta> _registroConsulta;
    private DefaultTableModel _model;
    private PanelBotonCancelar _botonCancelar;

    public JButton getBotonEliminarRegistro() {
        return _botonEliminarRegistro;
    }

    public JButton getBotonMConsulta() {
        return _botonMConsulta;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public String getTextoCedula() {
        return _textoCedula;
    }

    public void setTextoCedula() {
        this._textoCedula = "";
    }

    public void setCbEstadoConsulta() {
        this._cbEstadoConsulta.setSelectedItem(" ");
    }

    public void setCbCedulas() {
        this._cbCedulas.setSelectedItem(" ");
    }

    public void setLbFecha(String fecha) {
        this._lbFecha.setText(fecha);
    }

    public void setTextoEstadoConsulta() {
        this._textoEstadoConsulta = "";
    }

    public String getTextoEstadoConsulta() {
        return _textoEstadoConsulta;
    }

    public void setLabelAviso1() {
        this._lbAvisoError.setText("SELECCIONES UNA CÉDULA PARA PODER MODIFICAR");
    }

    public PanelBotonCancelar getBotonCancelar() {
        return _botonCancelar;
    }

    public void setLabelAviso1_1() {
        this._lbAvisoError.setText("");
    }

    public void setLabelAviso2() {
        this._lbAvisoError.setText("SELECCIONES UN ESTADO PARA PODER MODIFICAR");
    }

    public void setLabelAviso2_2() {
        this._lbAvisoError.setText("");
    }

    public void setLabelAviso3() {
        this._lbAvisoError.setText("SELECCIONES UNA CÉDULA Y ESTADO PARA PODER MODIFICAR");
    }

    public void setLabelAviso3_3() {
        this._lbAvisoError.setText("");
    }

    public void setLbConfirmacion() {
        this._lbConfirmacion.setText("PRESIONES NUEVAMENTE");
        this._lbConfirmacionC.setText("PARA CONFIRMAR");
    }

    public void setLbConfirmacion1() {
        this._lbConfirmacion.setText("");
        this._lbConfirmacionC.setText("");
    }

}
