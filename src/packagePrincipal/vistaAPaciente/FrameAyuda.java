package packagePrincipal.vistaAPaciente;

public class FrameAyuda extends javax.swing.JFrame {

    public FrameAyuda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _panel = new javax.swing.JPanel();
        _labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        _panel.setBackground(new java.awt.Color(38, 166, 154));
        _panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _labelTitulo.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        _labelTitulo.setText("OBSERVACIONES IMPORTANTES");
        _panel.add(_labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("EN ESTE APARTADO  DEL PROGRAMA PODRÁS REGISTRAR LOS DATOS \nPERSONALES DE UN PACIENTE.\n\nCOSAS IMPORTANTES:\n\n1. SI EL PACIENTE ES MAYOR DE EDAD NO ES NECESARIO ADJUNTARLE UN REPERESENTANTE \nAL MISMO, POR TANTO SE PUEDE OBVIAR DICHAS CASILLAS.\n\n2. DE TENER UN ERROR AL COLOCAR LA FECHA DE NACIMIENTO Y COLOCÓ UNA DE UN \nMENOR DE EDAD CUANDO NO ES ASÍ, SOLAMENTE TIENE QUE MODIFICAR LA EDAD \nY PRESIONAR REGISTRAR, OBVIANDO LOS CUADROS EN ROJO DEL RESPONSABLE.\n\n3. LOS CÓDIGOS DE TELÉFONOS SON LOS PERTENECIENTES AL ECUADOR POR TANTO \nCUALQUIER OTRO TIPO DE CÓDIGO NO PODRÁ SER UTILIZADO.\n\n4. EL MODELO DE CORREOS PUEDE SER CUALQUIERA SIEMPRE Y\n CUANDO CUMPLA CON EL MODELO DE UN CORREO ELECTRÓNICO.\n\n5. LAS IMÁGENES(FOTOS) TIENEN QUE SER DE 150*150 PÍXELES NI MÁS NI MENOS, PARA EDITAR\nDICHAS FOTOS AL ESTÁNDAR PEDIDO PUEDE USAR EL EDITOR DE PAINT EN WINDOWS\nO CUALQUIER OTRO EDITOR.\n\n6. LAS IMÁGENES(FOTOS) QUE SERÁN CARGADAS AL REGISTRO TIENEN QUE TENER COMO EXTENSIÓN \n.png o .jpg OBLIGATORIAMENTE.\n\n7. LOS CÓDIGOS TELEFÓNICOS PERMITITDOS SON (+59399 Y +59398) Y \nTAMBIÉN ESTÁ EL CASO DE QUE EL NÚMERO NO SEA CON CÓDIGO EN ESTE CASO USAMOS (099 Ó 098).\n\n8. EL ESTÁNDAR DE LAS CÉDULAS ES (LOS DOS PRIMEROS DÍGITOS SON EL CÓDIGO DE PROVINCIA, LOS OTROS\n7 SON DÍGITOS Y EL DÉCIMO ES EL CÓDIGO VERIFICADOR).\n\n8. CUALQUIER OTRA PREGUNTA CONTACTE AL PROGRAMADOR ENCARGADO.");
        jScrollPane1.setViewportView(jTextArea1);

        _panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 720, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(780, 583));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAyuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel _labelTitulo;
    javax.swing.JPanel _panel;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
