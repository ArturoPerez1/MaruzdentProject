package packagePrincipal.vistaADatosMedicos;

import java.awt.BorderLayout;

public class FrameADatosMedicos extends javax.swing.JFrame {

    public FrameADatosMedicos() {
        initComponents();
        AgregarPanelADatosMedico();
    }

    public void AgregarPanelADatosMedico() {
        _panelADatosMedico = new PanelADatosMedico();
        _panelADatosMedico.setSize(1000, 700);
        _panelContendor.removeAll();
        _panelContendor.add(_panelADatosMedico, BorderLayout.CENTER);
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
            .addComponent(_panelContendor, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_panelContendor, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1000, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel _panelContendor;
    // End of variables declaration//GEN-END:variables
    private PanelADatosMedico _panelADatosMedico;

    public PanelADatosMedico getPanelADatosMedico() {
        return _panelADatosMedico;
    }

}
