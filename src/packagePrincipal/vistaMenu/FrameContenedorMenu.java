package packagePrincipal.vistaMenu;

import java.awt.BorderLayout;

public class FrameContenedorMenu extends javax.swing.JFrame {

    public FrameContenedorMenu() {
        initComponents();
    }

    public void AgregarVentanaContenedorMenu() {
        _panelMenu = new PanelMenuCompleto();
        _panelMenu.setSize(900, 700);
        _panelContenedor.removeAll();
        _panelContenedor.add(_panelMenu, BorderLayout.CENTER);
        _panelContenedor.revalidate();
        _panelContenedor.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _panelContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        _panelContenedor.setPreferredSize(new java.awt.Dimension(900, 700));
        _panelContenedor.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(900, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel _panelContenedor;
    // End of variables declaration//GEN-END:variables
    private PanelMenuCompleto _panelMenu;

    public PanelMenuCompleto getPanelMenu() {
        return _panelMenu;
    }

}
