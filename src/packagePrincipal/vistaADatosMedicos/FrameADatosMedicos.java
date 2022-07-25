package packagePrincipal.vistaADatosMedicos;

import java.awt.BorderLayout;
import javax.swing.UIManager;

public class FrameADatosMedicos extends javax.swing.JFrame {

    public FrameADatosMedicos() {
        initComponents();
        AgregarPanelADatosMedico();
    }
    
    /*HAY UN PROBLEMA CON ESTO Y ES QUE SI LO ACTIVO MODIFICA
    LOS LOOK AND FEELS DE TODO LO CUAL NO QUIERO*/
    public void AgregarEstiloJFileChooser() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameADatosMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameADatosMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameADatosMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameADatosMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
