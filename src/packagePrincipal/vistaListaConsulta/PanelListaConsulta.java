package packagePrincipal.vistaListaConsulta;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import packagePrincipal.modelo.DatosConsulta;
import packagePrincipal.modelo.HistorialClinico;

public class PanelListaConsulta extends javax.swing.JPanel {

    public PanelListaConsulta() {
        initComponents();
    }

    public void ObtenerArrays(ArrayList<DatosConsulta> listaCita, ArrayList<HistorialClinico> historial) {
        _listaCita = listaCita;
        _historial = historial;
    }

    public class AgregarListenerFiltroFecha implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _frameFiltrarFecha.getBotonObtenerFecha()) {

                    _fechaFiltrada = _frameFiltrarFecha.getFecha();
                    if (_fechaFiltrada.equals("")) {
                        JOptionPane.showMessageDialog(null, "NO HAY CITA PROGRAMADA PARA ESTE DÍA", "CITAS PROGRAMADA", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        LlenarTablaFechaFiltrada();
                    }
                }

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public class AgregarListenerFiltroCedula implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
                if (evento.getSource() == _frameFiltrarCedula.getBotonObtenerCedula()) {
                    _cedulaFiltrada = _frameFiltrarCedula.getCedula();
                    if (_cedulaFiltrada.isEmpty() == false) {
                        LlenarTablaCedulaFiltrada();
                    } else {
                        JOptionPane.showMessageDialog(null, "SELECCIONE UNA CÉDULA", "SELECCIÓN CÉDULA", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            } catch (Error e) {
                System.out.println("Error = " + e);
            }
        }

    }

    public int ObtenerIndicePorCedula(String cedulaFiltrada) {
        int posicion = 0;
        for (int i = 0; i < _listaCita.size(); i++) {
            if (_listaCita.get(i).getCedulaPaciente().equals(cedulaFiltrada)) {
                posicion = i;
                break;
            }
        }

        return posicion;
    }

    public void ObtenerCedulaEliminarCita(ActionListener listener) {
        _frameFiltrarCedula = new FrameFiltroCedula();
        _frameFiltrarCedula.setVisible(true);
        _frameFiltrarCedula.LlenaComboBoxCedulas(_listaCita);
        _frameFiltrarCedula.AddActionListener(listener);
    }

    public void PopUpEliminarCita(String cedulaFiltrada) {
        int posicion = ObtenerIndicePorCedula(cedulaFiltrada);
        _frameEliminarCita = new FrameEliminarCita();
        _frameEliminarCita.LlenarTabla(_listaCita, posicion);
        _frameEliminarCita.setVisible(true);
        _posionCitaEliminada = posicion;
    }

    public void PopUpFiltrarFecha() {
        _frameFiltrarFecha = new FrameFiltroFecha();
        _frameFiltrarFecha.setVisible(true);
        _frameFiltrarFecha.AddActionListenener(new AgregarListenerFiltroFecha());
    }

    public void PopUpFiltrarCedula() {
        _frameFiltrarCedula = new FrameFiltroCedula();
        _frameFiltrarCedula.setVisible(true);
        _frameFiltrarCedula.LlenaComboBoxCedulas(_listaCita);
        _frameFiltrarCedula.AddActionListener(new AgregarListenerFiltroCedula());
    }

    public void ObtenerCitasFechaFiltrada() {
        _posiciones = new ArrayList<>();
        for (int i = 0; i < _listaCita.size(); i++) {
            if (_listaCita.get(i).getFechaCita().equals(_fechaFiltrada)) {
                _posiciones.add(i);
            }
        }
    }

    public void ObtenerCitasDeHoy() {
        _posiciones = new ArrayList<>();
        for (int i = 0; i < _listaCita.size(); i++) {
            if (_listaCita.get(i).getFechaCita().equals(_fechaActual)) {
                _posiciones.add(i);
            }
        }
    }

    public void ObtenerCitasCedulaFiltrada() {
        _posiciones = new ArrayList<>();
        for (int i = 0; i < _listaCita.size(); i++) {
            if (_listaCita.get(i).getCedulaPaciente().equals(_cedulaFiltrada)) {
                _posiciones.add(i);
                break;
            }
        }
    }

    public void LlenarTablaCitasDeHoy() {
        ObtenerCitasDeHoy();
        if (_posiciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY CITA PROGRAMADA PARA ESTE DÍA", "CITAS PROGRAMADA", JOptionPane.INFORMATION_MESSAGE);
        } else {
            _model = new DefaultTableModel();
            ObtenerTablaPersonalizada();
            _jTConsultasRegistradas.setEnabled(true);
            int cont = 0;
            String cedulaAux = "";

            _model.addColumn("NOMBRE PACIENTE");
            _model.addColumn("CÉDULA PACIENTE");
            _model.addColumn("NOMBRE MÉDICO");
            _model.addColumn("CÉDULA MÉDICO");
            _model.addColumn("FECHA CITA");
            _model.addColumn("HORA CITA");
            _model.addColumn("RAZÓN CONSULTA");

            _jTConsultasRegistradas.setModel(_model);
            _model.setRowCount(0);

            for (int i = 0; i < _posiciones.size(); i++) {
                Object[] fila = {
                    _listaCita.get(_posiciones.get(i)).getNombrePaciente(),
                    _listaCita.get(_posiciones.get(i)).getCedulaPaciente(),
                    _listaCita.get(_posiciones.get(i)).getMedicoAsociado().getNombreMedico(),
                    _listaCita.get(_posiciones.get(i)).getMedicoAsociado().getCedulaMedico(),
                    _listaCita.get(_posiciones.get(i)).getFechaCita(),
                    _listaCita.get(_posiciones.get(i)).getHoraCita()};

                _model.addRow(fila);
            }

            for (int i = 0; i < _posiciones.size(); i++) {
                for (HistorialClinico historial : _historial) {
                    cedulaAux = _listaCita.get(_posiciones.get(i)).getCedulaPaciente();
                    if (historial.getCedulaAsociada().equals(cedulaAux)) {
                        if (historial.getRazonConsulta().equals(" ") && _listaCita.size() == 1) {
                            _jTConsultasRegistradas.setValueAt("RAZÓN DE CITA", cont, 6);
                        } else {
                            if (historial.getRazonConsulta().equals(" ") && _listaCita.size() > 1) {
                                _jTConsultasRegistradas.setValueAt("RAZÓN DE CITA", cont, 6);
                            } else {
                                _jTConsultasRegistradas.setValueAt(historial.getRazonConsulta(), cont, 6);
                            }
                        }
                    }
                }
                cont++;
            }

            _jTConsultasRegistradas.setEnabled(false);
        }

    }

    public void LlenarTablaCedulaFiltrada() {
        ObtenerCitasCedulaFiltrada();
        if (_posiciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ESTA CEDULA NO TIENE CITA PROGRAMADA", "CITAS PROGRAMADA", JOptionPane.INFORMATION_MESSAGE);
        } else {
            _frameFiltrarCedula.dispose();
            _model = new DefaultTableModel();
            ObtenerTablaPersonalizada();
            _jTConsultasRegistradas.setEnabled(true);
            int cont = 0;
            String cedulaAux = "";

            _model.addColumn("NOMBRE PACIENTE");
            _model.addColumn("CÉDULA PACIENTE");
            _model.addColumn("NOMBRE MÉDICO");
            _model.addColumn("CÉDULA MÉDICO");
            _model.addColumn("FECHA CITA");
            _model.addColumn("HORA CITA");
            _model.addColumn("RAZÓN CONSULTA");

            _jTConsultasRegistradas.setModel(_model);
            _model.setRowCount(0);

            for (int i = 0; i < _posiciones.size(); i++) {
                Object[] fila = {
                    _listaCita.get(_posiciones.get(i)).getNombrePaciente(),
                    _listaCita.get(_posiciones.get(i)).getCedulaPaciente(),
                    _listaCita.get(_posiciones.get(i)).getMedicoAsociado().getNombreMedico(),
                    _listaCita.get(_posiciones.get(i)).getMedicoAsociado().getCedulaMedico(),
                    _listaCita.get(_posiciones.get(i)).getFechaCita(),
                    _listaCita.get(_posiciones.get(i)).getHoraCita()};

                _model.addRow(fila);
            }

            for (int i = 0; i < _posiciones.size(); i++) {
                for (HistorialClinico historial : _historial) {
                    cedulaAux = _listaCita.get(_posiciones.get(i)).getCedulaPaciente();
                    if (historial.getCedulaAsociada().equals(cedulaAux)) {
                        if (historial.getRazonConsulta().equals(" ") && _listaCita.size() == 1) {
                            _jTConsultasRegistradas.setValueAt("RAZÓN DE CITA", cont, 6);
                        } else {
                            if (historial.getRazonConsulta().equals(" ") && _listaCita.size() > 1) {
                                _jTConsultasRegistradas.setValueAt("RAZÓN DE CITA", cont, 6);
                            } else {
                                _jTConsultasRegistradas.setValueAt(historial.getRazonConsulta(), cont, 6);
                            }
                        }
                    }
                }
                cont++;
            }

            _jTConsultasRegistradas.setEnabled(false);
        }

    }

    public void LlenarTablaFechaFiltrada() {
        ObtenerCitasFechaFiltrada();
        if (_posiciones.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY CITA PROGRAMADA PARA ESTE DÍA", "CITAS PROGRAMADA", JOptionPane.INFORMATION_MESSAGE);
        } else {
            _frameFiltrarFecha.dispose();
            _model = new DefaultTableModel();
            ObtenerTablaPersonalizada();
            _jTConsultasRegistradas.setEnabled(true);
            int cont = 0;
            String cedulaAux = "";

            _model.addColumn("NOMBRE PACIENTE");
            _model.addColumn("CÉDULA PACIENTE");
            _model.addColumn("NOMBRE MÉDICO");
            _model.addColumn("CÉDULA MÉDICO");
            _model.addColumn("FECHA CITA");
            _model.addColumn("HORA CITA");
            _model.addColumn("RAZÓN CONSULTA");

            _jTConsultasRegistradas.setModel(_model);
            _model.setRowCount(0);

            for (int i = 0; i < _posiciones.size(); i++) {
                Object[] fila = {
                    _listaCita.get(_posiciones.get(i)).getNombrePaciente(),
                    _listaCita.get(_posiciones.get(i)).getCedulaPaciente(),
                    _listaCita.get(_posiciones.get(i)).getMedicoAsociado().getNombreMedico(),
                    _listaCita.get(_posiciones.get(i)).getMedicoAsociado().getCedulaMedico(),
                    _listaCita.get(_posiciones.get(i)).getFechaCita(),
                    _listaCita.get(_posiciones.get(i)).getHoraCita()};

                _model.addRow(fila);
            }

            for (int i = 0; i < _posiciones.size(); i++) {
                for (HistorialClinico historial : _historial) {
                    cedulaAux = _listaCita.get(_posiciones.get(i)).getCedulaPaciente();
                    if (historial.getCedulaAsociada().equals(cedulaAux)) {
                        if (historial.getRazonConsulta().equals(" ") && _listaCita.size() == 1) {
                            _jTConsultasRegistradas.setValueAt("RAZÓN DE CITA", 0, 6);
                        } else {
                            if (historial.getRazonConsulta().equals(" ") && _listaCita.size() > 1) {
                                _jTConsultasRegistradas.setValueAt("RAZÓN DE CITA", cont, 6);
                            } else {
                                _jTConsultasRegistradas.setValueAt(historial.getRazonConsulta(), cont, 6);
                            }
                        }
                    }
                }
                cont++;
            }

            _jTConsultasRegistradas.setEnabled(false);
        }

    }

    public void ObtenerTablaPersonalizada() {
        _jTConsultasRegistradas.getTableHeader().setBackground(new Color(2, 119, 189));
        _jTConsultasRegistradas.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        _jTConsultasRegistradas.getTableHeader().setForeground(new Color(255, 255, 255));
        _jTConsultasRegistradas.setRowHeight(25);
    }

    public void LlenarTableConsultas(ArrayList<DatosConsulta> registroConsulta, ArrayList<HistorialClinico> registroClinico) {
        _model = new DefaultTableModel();
        int cont = 0;
        ObtenerTablaPersonalizada();
        _jTConsultasRegistradas.setEnabled(true);
        this._listaCita = registroConsulta;
        String cedulaAux;

        _model.addColumn("NOMBRE PACIENTE");
        _model.addColumn("CÉDULA PACIENTE");
        _model.addColumn("NOMBRE MÉDICO");
        _model.addColumn("CÉDULA MÉDICO");
        _model.addColumn("FECHA CITA");
        _model.addColumn("HORA CITA");
        _model.addColumn("RAZÓN CONSULTA");

        _jTConsultasRegistradas.setModel(_model);
        _model.setRowCount(0);

        for (DatosConsulta consulta : registroConsulta) {
            Object[] fila = {
                consulta.getNombrePaciente(),
                consulta.getCedulaPaciente(),
                consulta.getMedicoAsociado().getNombreMedico(),
                consulta.getMedicoAsociado().getCedulaMedico(),
                consulta.getFechaCita(),
                consulta.getHoraCita()};

            _model.addRow(fila);
        }

        for (HistorialClinico historial : registroClinico) {
            for (DatosConsulta consulta : registroConsulta) {
                cedulaAux = consulta.getCedulaPaciente();
                if (historial.getCedulaAsociada().equals(cedulaAux)) {
                    if (historial.getRazonConsulta().equals(" ") && registroConsulta.size() == 1) {
                        _jTConsultasRegistradas.setValueAt("RAZÓN DE CITA", 0, 6);
                    } else {
                        if (historial.getRazonConsulta().equals(" ") && registroConsulta.size() > 1) {
                            _jTConsultasRegistradas.setValueAt("RAZÓN DE CITA", cont, 6);
                        } else {
                            _jTConsultasRegistradas.setValueAt(historial.getRazonConsulta(), cont, 6);
                        }
                    }
                }
            }
            cont++;
        }

        _jTConsultasRegistradas.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _botonVolver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _jTConsultasRegistradas = new javax.swing.JTable();
        _labelLogo = new javax.swing.JLabel();
        _botonFFecha = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        _botonFCedula = new javax.swing.JButton();
        _botonFHoy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        _botonFTodasCitas = new javax.swing.JButton();
        _botonEliminarCita = new javax.swing.JButton();

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        _botonVolver.setBorder(null);
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        jPanel1.setBackground(new java.awt.Color(0, 137, 123));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _jTConsultasRegistradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE PACIENTE", "CÉDULA PACIENTE", "NOMBRE MÉDICO", "CÉDULA MÉDICO", "FECHA CITA", "HORA CITA", "RAZÓN CONSULTA"
            }
        ));
        _jTConsultasRegistradas.setFocusable(false);
        _jTConsultasRegistradas.setIntercellSpacing(new java.awt.Dimension(0, 0));
        _jTConsultasRegistradas.setRowHeight(25);
        _jTConsultasRegistradas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(_jTConsultasRegistradas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1150, 300));

        _labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/listaDeCitas.png"))); // NOI18N
        jPanel1.add(_labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 80));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1170, 430));

        _botonFFecha.setBackground(new java.awt.Color(54, 203, 167));
        _botonFFecha.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _botonFFecha.setForeground(new java.awt.Color(255, 255, 255));
        _botonFFecha.setText("FILTRAR POR FECHA");
        _botonFFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        _botonFFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonFFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1200, -1));

        _botonFCedula.setBackground(new java.awt.Color(54, 203, 167));
        _botonFCedula.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _botonFCedula.setForeground(new java.awt.Color(255, 255, 255));
        _botonFCedula.setText("FILTRAR POR CÉDULA");
        _botonFCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        _botonFCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 230, 40));

        _botonFHoy.setBackground(new java.awt.Color(54, 203, 167));
        _botonFHoy.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _botonFHoy.setForeground(new java.awt.Color(255, 255, 255));
        _botonFHoy.setText("CITAS DE HOY");
        _botonFHoy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        _botonFHoy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(_botonFHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 230, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/filtros.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        _botonFTodasCitas.setBackground(new java.awt.Color(54, 203, 167));
        _botonFTodasCitas.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _botonFTodasCitas.setForeground(new java.awt.Color(255, 255, 255));
        _botonFTodasCitas.setText("TODAS LAS CITAS");
        _botonFTodasCitas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        add(_botonFTodasCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 230, 40));

        _botonEliminarCita.setBackground(new java.awt.Color(54, 203, 167));
        _botonEliminarCita.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _botonEliminarCita.setForeground(new java.awt.Color(255, 255, 255));
        _botonEliminarCita.setText("ELIMINAR CITA");
        _botonEliminarCita.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        add(_botonEliminarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 230, 40));
    }// </editor-fold>//GEN-END:initComponents

    public void AddActionListener(ActionListener listener) {
        _botonFFecha.addActionListener(listener);
        _botonVolver.addActionListener(listener);
        _botonFCedula.addActionListener(listener);
        _botonFHoy.addActionListener(listener);
        _botonFTodasCitas.addActionListener(listener);
        _botonEliminarCita.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonEliminarCita;
    javax.swing.JButton _botonFCedula;
    javax.swing.JButton _botonFFecha;
    javax.swing.JButton _botonFHoy;
    javax.swing.JButton _botonFTodasCitas;
    javax.swing.JButton _botonVolver;
    javax.swing.JTable _jTConsultasRegistradas;
    javax.swing.JLabel _labelLogo;
    javax.swing.JLabel jLabel1;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    private ArrayList<DatosConsulta> _listaCita;
    private String _cedulaFiltrada;
    private FrameFiltroCedula _frameFiltrarCedula;
    private ArrayList<HistorialClinico> _historial;
    private DefaultTableModel _model;
    private FrameFiltroFecha _frameFiltrarFecha;
    private String _fechaFiltrada = "";
    private ArrayList<Integer> _posiciones;
    private String _fechaActual;
    private FrameEliminarCita _frameEliminarCita;
    private int _posionCitaEliminada;
    private boolean _ventanaCreada;

    public FrameFiltroCedula getFrameFiltrarCedula() {
        return _frameFiltrarCedula;
    }

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public boolean isVentanaCreada() {
        return _ventanaCreada;
    }

    public FrameEliminarCita getFrameEliminarCita() {
        return _frameEliminarCita;
    }

    public JButton getBotonEliminarCita() {
        return _botonEliminarCita;
    }

    public int getPosionCitaEliminada() {
        return _posionCitaEliminada;
    }

    public JButton getBotonFFecha() {
        return _botonFFecha;
    }

    public JButton getBotonFCedula() {
        return _botonFCedula;
    }

    public JButton getBotonFHoy() {
        return _botonFHoy;
    }

    public JButton getBotonFTodasCitas() {
        return _botonFTodasCitas;
    }

    public void setFechaActual(String _fechaActual) {
        this._fechaActual = _fechaActual;
    }

}
