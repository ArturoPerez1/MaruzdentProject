package packagePrincipal.vistaPago;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import packagePrincipal.modelo.CuentaPaciente;
import packagePrincipal.modelo.DatosPaciente;
import packagePrincipal.vistaListaConsulta.FrameFiltroCedula;

public class PanelPago extends javax.swing.JPanel {

    public PanelPago() {
        initComponents();
    }

    public class AgregarListenerFiltros implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _frameFiltroCedula.getBotonObtenerCedula()) {
                    _cedulaFiltrada = _frameFiltroCedula.getCedula();
                    LlenarTablaCedulaFiltrada();
                }

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public void ObtenerCedulaCuentaEliminar(ActionListener listener) {
        _frameFiltroCedula = new FrameFiltroCedula();
        _frameFiltroCedula.setVisible(true);
        _frameFiltroCedula.LlenaComboBoxCedulasCuenta(_registroCuenta);
        _frameFiltroCedula.AddActionListener(listener);
    }

    public int ObtenerIndicePorCedula(String cedulaFiltrada) {
        int posicion = 0;
        for (int i = 0; i < _registroCuenta.size(); i++) {
            if (_registroCuenta.get(i).getCedulaAsociada().equals(cedulaFiltrada)) {
                posicion = i;
                break;
            }
        }

        return posicion;
    }

    public void EliminarCuenta(String cedulaFiltrada) {
        int posicion = ObtenerIndicePorCedula(cedulaFiltrada);
        String nombre = "";
        _posicion = posicion;
        _frameEliminarCuenta = new FrameEliminarCuenta();
        _frameEliminarCuenta.setVisible(true);
        for (DatosPaciente paciente : _registroPaciente) {
            if (paciente.getCedula().equals(_registroCuenta.get(posicion).getCedulaAsociada())) {
                nombre = paciente.getNombre()+" "+paciente.getApellidos();
                break;
            }
        }
        _frameEliminarCuenta.LlenarTablaEliminarCuenta(nombre, _registroCuenta.get(posicion).getCedulaAsociada(), _registroCuenta.get(posicion).getCostoTratamiento());
    }

    public void ObtenerCitasCedulaFiltrada() {
        _posiciones = new ArrayList<>();
        for (int i = 0; i < _registroCuenta.size(); i++) {
            if (_registroCuenta.get(i).getCedulaAsociada().equals(_cedulaFiltrada)) {
                _posiciones.add(i);
                break;
            }
        }
    }

    public void ObtenerArrays(ArrayList<CuentaPaciente> registroCuenta, ArrayList<DatosPaciente> registroPaciente) {
        _registroCuenta = registroCuenta;
        _registroPaciente = registroPaciente;
    }

    public void FiltrarPorCedula() {
        _frameFiltroCedula = new FrameFiltroCedula();
        _frameFiltroCedula.setVisible(true);
        _frameFiltroCedula.LlenaComboBoxCedulasCuenta(_registroCuenta);
        _frameFiltroCedula.AddActionListener(new AgregarListenerFiltros());
    }

    public void ObtenerTablaPersonalizada() {
        _jtableListaDepago.getTableHeader().setBackground(new Color(2, 119, 189));
        _jtableListaDepago.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        _jtableListaDepago.getTableHeader().setForeground(new Color(255, 255, 255));
        _jtableListaDepago.setRowHeight(25);
    }

    public void LlenarTablaCedulaFiltrada() {
        ObtenerCitasCedulaFiltrada();
        if (_posiciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ESTE USUARIO NO TIENE UNA CUENTA ASOCIADA", "CUENTAS REGISTRADAS", JOptionPane.INFORMATION_MESSAGE);
        } else {
            _frameFiltroCedula.dispose();
            _model = new DefaultTableModel();
            ObtenerTablaPersonalizada();
            _jtableListaDepago.setEnabled(true);
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
            for (DatosPaciente paciente : _registroPaciente) {
                for (int i = 0; i < _posiciones.size(); i++) {
                    cedulaAux = _registroCuenta.get(_posiciones.get(i)).getCedulaAsociada();
                    if (paciente.getCedula().equals(cedulaAux)) {
                        if (_registroCuenta.get(_posiciones.get(i)).getTipoTratamiento().equals("TRATAMIENTO ÚNICO")) {
                            Object[] fila = {
                                paciente.getNombre() +" "+ paciente.getApellidos(),
                                _registroCuenta.get(_posiciones.get(i)).getCedulaAsociada(),
                                "NO APLICA TRATAMIENTO ÜNICO",
                                _registroCuenta.get(_posiciones.get(i)).getTipoTratamiento(),
                                _registroCuenta.get(_posiciones.get(i)).getCostoTratamiento()
                            };

                            _model.addRow(fila);
                        } else {
                            Object[] fila = {
                                paciente.getNombre() +" "+ paciente.getApellidos(),
                                _registroCuenta.get(_posiciones.get(i)).getCedulaAsociada(),
                                _registroCuenta.get(_posiciones.get(i)).getPresupuestoPaciente(),
                                _registroCuenta.get(_posiciones.get(i)).getTipoTratamiento(),
                                _registroCuenta.get(_posiciones.get(i)).getCostoTratamiento()
                            };

                            _model.addRow(fila);
                        }
                    }
                }
                _jtableListaDepago.setEnabled(false);
            }
        }
    }

    public void LlenaTablaPagos(ArrayList<CuentaPaciente> registroCuenta, ArrayList<DatosPaciente> registroPaciente) {
        _model = new DefaultTableModel();
        ObtenerTablaPersonalizada();
        _jtableListaDepago.setEnabled(true);
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
                    if (cuenta.getTipoTratamiento().equals("TRATAMIENTO ÚNICO")) {
                        Object[] fila = {
                            paciente.getNombre() +" "+ paciente.getApellidos(),
                            cuenta.getCedulaAsociada(),
                            "NO APLICA TRATAMIENTO ÜNICO",
                            cuenta.getTipoTratamiento(),
                            cuenta.getCostoTratamiento()
                        };

                        _model.addRow(fila);
                    } else {
                        Object[] fila = {
                            paciente.getNombre() +" "+ paciente.getApellidos(),
                            cuenta.getCedulaAsociada(),
                            cuenta.getPresupuestoPaciente(),
                            cuenta.getTipoTratamiento(),
                            cuenta.getCostoTratamiento()
                        };

                        _model.addRow(fila);
                    }
                }
            }

            cont++;
        }

        _jtableListaDepago.setEnabled(false);
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
        _botonFCedula = new javax.swing.JButton();
        _botonMostrarCuntas = new javax.swing.JButton();
        _botonEliminarCuenta = new javax.swing.JButton();

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

        _botonFCedula.setBackground(new java.awt.Color(54, 203, 167));
        _botonFCedula.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _botonFCedula.setForeground(new java.awt.Color(255, 255, 255));
        _botonFCedula.setText("FILTRAR POR CÉDULA");
        _botonFCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        _botonFCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonFCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _botonFCedulaActionPerformed(evt);
            }
        });
        add(_botonFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 230, 40));

        _botonMostrarCuntas.setBackground(new java.awt.Color(54, 203, 167));
        _botonMostrarCuntas.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _botonMostrarCuntas.setForeground(new java.awt.Color(255, 255, 255));
        _botonMostrarCuntas.setText("MOSTRAR TODAS LAS CUENTAS");
        _botonMostrarCuntas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        _botonMostrarCuntas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _botonMostrarCuntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _botonMostrarCuntasActionPerformed(evt);
            }
        });
        add(_botonMostrarCuntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 250, 40));

        _botonEliminarCuenta.setBackground(new java.awt.Color(54, 203, 167));
        _botonEliminarCuenta.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _botonEliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        _botonEliminarCuenta.setText("ELIMINAR CUENTA ");
        _botonEliminarCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        _botonEliminarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonEliminarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 200, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void _botonFCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__botonFCedulaActionPerformed
        FiltrarPorCedula();
    }//GEN-LAST:event__botonFCedulaActionPerformed

    private void _botonMostrarCuntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__botonMostrarCuntasActionPerformed
        LlenaTablaPagos(_registroCuenta, _registroPaciente);
    }//GEN-LAST:event__botonMostrarCuntasActionPerformed

    public void AddActionListener(ActionListener listener) {
        _botonVolver.addActionListener(listener);
        _botonEliminarCuenta.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonEliminarCuenta;
    javax.swing.JButton _botonFCedula;
    javax.swing.JButton _botonMostrarCuntas;
    javax.swing.JButton _botonVolver;
    javax.swing.JTable _jtableListaDepago;
    javax.swing.JLabel _lbLogo;
    javax.swing.JLabel jLabel1;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Integer> _posiciones;
    private ArrayList<CuentaPaciente> _registroCuenta;
    private ArrayList<DatosPaciente> _registroPaciente;
    private DefaultTableModel _model;
    private FrameFiltroCedula _frameFiltroCedula;
    private String _cedulaFiltrada;
    private FrameEliminarCuenta _frameEliminarCuenta;
    private int _posicion;

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public JButton getBotonEliminarCuenta() {
        return _botonEliminarCuenta;
    }

    public FrameFiltroCedula getFrameFiltroCedula() {
        return _frameFiltroCedula;
    }

    public FrameEliminarCuenta getFrameEliminarCuenta() {
        return _frameEliminarCuenta;
    }

    public int getPosicion() {
        return _posicion;
    }

}
