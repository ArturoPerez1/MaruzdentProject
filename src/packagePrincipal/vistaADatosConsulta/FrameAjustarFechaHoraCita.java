package packagePrincipal.vistaADatosConsulta;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;

public class FrameAjustarFechaHoraCita extends javax.swing.JFrame {

    public FrameAjustarFechaHoraCita() {
        initComponents();
    }

    public String ObtenerFechaConFormato() {
        String fecha = "";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
             fecha = formato.format(_jCalendar.getDate());
        } catch (NullPointerException e) {
        }

        return fecha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        _panelFecha = new javax.swing.JPanel();
        _lbLogo1 = new javax.swing.JLabel();
        _jCalendar = new com.toedter.calendar.JDateChooser();
        _panelHora = new javax.swing.JPanel();
        _lbLogo2 = new javax.swing.JLabel();
        _lbLogo3 = new javax.swing.JLabel();
        _lbLogo4 = new javax.swing.JLabel();
        _cbHora = new javax.swing.JComboBox<>();
        _cbMinutos = new javax.swing.JComboBox<>();
        _lbLogo7 = new javax.swing.JLabel();
        _cbTurno = new javax.swing.JComboBox<>();
        _lbLogo = new javax.swing.JLabel();
        _botonAjustar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 166, 154));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _panelFecha.setBackground(new java.awt.Color(0, 121, 107));
        _panelFecha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbLogo1.setFont(new java.awt.Font("Metropolis Black", 1, 24)); // NOI18N
        _lbLogo1.setForeground(new java.awt.Color(153, 255, 255));
        _lbLogo1.setText("SELECCIONAR FECHA DE LA CITA");
        _panelFecha.add(_lbLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        _jCalendar.setDateFormatString("dd/MM/yyyy");
        _panelFecha.add(_jCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 350, 40));

        jPanel1.add(_panelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 480, 140));

        _panelHora.setBackground(new java.awt.Color(0, 121, 107));
        _panelHora.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbLogo2.setFont(new java.awt.Font("Metropolis Black", 1, 24)); // NOI18N
        _lbLogo2.setForeground(new java.awt.Color(153, 255, 255));
        _lbLogo2.setText("SELECCIONAR HORA DE LA CITA");
        _panelHora.add(_lbLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        _lbLogo3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbLogo3.setForeground(new java.awt.Color(255, 255, 255));
        _lbLogo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lbLogo3.setText("HORA");
        _panelHora.add(_lbLogo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        _lbLogo4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbLogo4.setForeground(new java.awt.Color(255, 255, 255));
        _lbLogo4.setText("MINUTOS");
        _panelHora.add(_lbLogo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        _cbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "00" }));
        _cbHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbHoraActionPerformed(evt);
            }
        });
        _panelHora.add(_cbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 30));

        _cbMinutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        _cbMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbMinutosActionPerformed(evt);
            }
        });
        _panelHora.add(_cbMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 110, 30));

        _lbLogo7.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        _lbLogo7.setForeground(new java.awt.Color(255, 255, 255));
        _lbLogo7.setText("AM/PM");
        _panelHora.add(_lbLogo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        _cbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        _cbTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _cbTurnoActionPerformed(evt);
            }
        });
        _panelHora.add(_cbTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 70, 30));

        jPanel1.add(_panelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 470, 120));

        _lbLogo.setFont(new java.awt.Font("Metropolis Black", 1, 24)); // NOI18N
        _lbLogo.setForeground(new java.awt.Color(255, 255, 255));
        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/ajustaFechaYHora.png"))); // NOI18N
        jPanel1.add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 650, -1));

        _botonAjustar.setBackground(new java.awt.Color(54, 203, 167));
        _botonAjustar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonAjustar.setForeground(new java.awt.Color(255, 255, 255));
        _botonAjustar.setText("AJUSTAR ");
        _botonAjustar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        _botonAjustar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(_botonAjustar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 310, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(668, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void _cbHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbHoraActionPerformed
        _hora = _cbHora.getSelectedItem().toString();
    }//GEN-LAST:event__cbHoraActionPerformed

    private void _cbMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbMinutosActionPerformed
        _minutos = _cbMinutos.getSelectedItem().toString();
    }//GEN-LAST:event__cbMinutosActionPerformed

    private void _cbTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__cbTurnoActionPerformed
        _turno = _cbTurno.getSelectedItem().toString();
    }//GEN-LAST:event__cbTurnoActionPerformed

    public void AddActionListener(ActionListener listener){
        _botonAjustar.addActionListener(listener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonAjustar;
    javax.swing.JComboBox<String> _cbHora;
    javax.swing.JComboBox<String> _cbMinutos;
    javax.swing.JComboBox<String> _cbTurno;
    com.toedter.calendar.JDateChooser _jCalendar;
    javax.swing.JLabel _lbLogo;
    javax.swing.JLabel _lbLogo1;
    javax.swing.JLabel _lbLogo2;
    javax.swing.JLabel _lbLogo3;
    javax.swing.JLabel _lbLogo4;
    javax.swing.JLabel _lbLogo7;
    javax.swing.JPanel _panelFecha;
    javax.swing.JPanel _panelHora;
    javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private String _hora;
    private String _minutos;
    private String _turno;

    public String getHora() {
        return _hora;
    }

    public String getTurno() {
        return _turno;
    }

    public String getMinutos() {
        return _minutos;
    }

    public String getFecha() {
        String fecha = ObtenerFechaConFormato();
        return fecha;
    }

    public JButton getBotonAjustar() {
        return _botonAjustar;
    }

    
}
