package packagePrincipal.vistaMDatosmedico;

import java.awt.BorderLayout;

public class FrameMDatosMedicos extends javax.swing.JFrame {

    public FrameMDatosMedicos() {
        initComponents();
    }

    public void AgregarPanelMDatosMedicos() {
        _panelMDatosMedicos = new PanelMDatosMedicos();
        _panelMDatosMedicos.setSize(1200, 700);
        _panelContenedor.removeAll();
        _panelContenedor.add(_panelMDatosMedicos, BorderLayout.CENTER);
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

        _panelContenedor.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1200, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel _panelContenedor;
    // End of variables declaration//GEN-END:variables
    private PanelMDatosMedicos _panelMDatosMedicos;

    public PanelMDatosMedicos getPanelMDatosMedicos() {
        return _panelMDatosMedicos;
    }
    
    
}
