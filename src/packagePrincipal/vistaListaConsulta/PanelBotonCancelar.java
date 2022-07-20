package packagePrincipal.vistaListaConsulta;

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class PanelBotonCancelar extends javax.swing.JPanel {

    public PanelBotonCancelar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _botonCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(26, 188, 156));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _botonCancelar.setBackground(new java.awt.Color(54, 203, 167));
        _botonCancelar.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        _botonCancelar.setText("CANCELAR");
        _botonCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        add(_botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 210, 40));
    }// </editor-fold>//GEN-END:initComponents

    public void AddActionListener(ActionListener listener){
        _botonCancelar.addActionListener(listener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton _botonCancelar;
    // End of variables declaration//GEN-END:variables

    public JButton getBotonCancelar() {
        return _botonCancelar;
    }
    

}
