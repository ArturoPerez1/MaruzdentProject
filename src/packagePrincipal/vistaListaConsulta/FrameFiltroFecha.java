package packagePrincipal.vistaListaConsulta;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;

public class FrameFiltroFecha extends javax.swing.JFrame {

    public FrameFiltroFecha() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        _jCalendar = new com.toedter.calendar.JDateChooser();
        _botonObtenerFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(38, 166, 154));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/seleccionarFecha.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 137, 123));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _jCalendar.setDateFormatString("dd/MM/yyyy");
        jPanel2.add(_jCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 360, 40));

        _botonObtenerFecha.setBackground(new java.awt.Color(54, 203, 167));
        _botonObtenerFecha.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _botonObtenerFecha.setForeground(new java.awt.Color(255, 255, 255));
        _botonObtenerFecha.setText("FILTRAR");
        _botonObtenerFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        _botonObtenerFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(_botonObtenerFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 230, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 440, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(568, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void AddActionListenener(ActionListener listener){
        _botonObtenerFecha.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonObtenerFecha;
    com.toedter.calendar.JDateChooser _jCalendar;
    javax.swing.JLabel jLabel1;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public JButton getBotonObtenerFecha() {
        return _botonObtenerFecha;
    }

   public String getFecha(){
       String fecha = ObtenerFechaConFormato();
       return fecha;
   }
    

}
