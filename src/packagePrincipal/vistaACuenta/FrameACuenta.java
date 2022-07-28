package packagePrincipal.vistaACuenta;

import java.awt.BorderLayout;

public class FrameACuenta extends javax.swing.JFrame {

    public FrameACuenta() {
        initComponents();
    }

    public void AgregarVentanaACuenta() {
        _panelACuenta = new PanelListaPacienteCuenta();
        _panelACuenta.setSize(1200, 700);
        _panelContendor.removeAll();
        _panelContendor.add(_panelACuenta, BorderLayout.CENTER);
        _panelContendor.revalidate();
        _panelContendor.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _panelContendor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        _panelContendor.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_panelContendor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_panelContendor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1200, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel _panelContendor;
    // End of variables declaration//GEN-END:variables
    PanelListaPacienteCuenta _panelACuenta;

    public PanelListaPacienteCuenta getPanelACuenta() {
        return _panelACuenta;
    }

}
