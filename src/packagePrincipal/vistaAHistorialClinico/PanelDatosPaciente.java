package packagePrincipal.vistaAHistorialClinico;

import java.util.ArrayList;
import packagePrincipal.modelo.DatosMedicos;
import packagePrincipal.modelo.DatosPaciente;

public class PanelDatosPaciente extends javax.swing.JPanel {

    public PanelDatosPaciente() {
        initComponents();
    }
    
    public void LlenarDatosPaciente(ArrayList<DatosPaciente> paciente, int i){
        _lbImagen.setIcon(new javax.swing.ImageIcon(paciente.get(i).getRutaImagen()));
        _lbINFNombreApellido.setText(paciente.get(i).getNombre() + " " + paciente.get(i).getApellidos());
        _lbINFEdad.setText(paciente.get(i).getEdad());
        _lbINFCedula.setText(paciente.get(i).getCedula());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _lbImagen = new javax.swing.JLabel();
        _labelNombreApellido = new javax.swing.JLabel();
        _lbINFNombreApellido = new javax.swing.JLabel();
        _labelEdad = new javax.swing.JLabel();
        _lbINFEdad = new javax.swing.JLabel();
        _labelCedula = new javax.swing.JLabel();
        _lbINFCedula = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 137, 123));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(_lbImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 150));

        _labelNombreApellido.setFont(new java.awt.Font("Metropolis Black", 1, 24)); // NOI18N
        _labelNombreApellido.setForeground(new java.awt.Color(153, 255, 255));
        _labelNombreApellido.setText("NOMBRE Y APELLIDO");
        add(_labelNombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        _lbINFNombreApellido.setFont(new java.awt.Font("Metropolis Black", 1, 14)); // NOI18N
        _lbINFNombreApellido.setForeground(new java.awt.Color(255, 255, 255));
        _lbINFNombreApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _lbINFNombreApellido.setToolTipText("");
        add(_lbINFNombreApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 270, 30));

        _labelEdad.setFont(new java.awt.Font("Metropolis Black", 1, 24)); // NOI18N
        _labelEdad.setForeground(new java.awt.Color(153, 255, 255));
        _labelEdad.setText("EDAD  ");
        add(_labelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        _lbINFEdad.setFont(new java.awt.Font("Metropolis Black", 1, 20)); // NOI18N
        _lbINFEdad.setForeground(new java.awt.Color(255, 255, 255));
        _lbINFEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbINFEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 120, 30));

        _labelCedula.setFont(new java.awt.Font("Metropolis Black", 1, 24)); // NOI18N
        _labelCedula.setForeground(new java.awt.Color(153, 255, 255));
        _labelCedula.setText("CÉDULA");
        add(_labelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        _lbINFCedula.setFont(new java.awt.Font("Metropolis Black", 1, 20)); // NOI18N
        _lbINFCedula.setForeground(new java.awt.Color(255, 255, 255));
        _lbINFCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(_lbINFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 240, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel _labelCedula;
    javax.swing.JLabel _labelEdad;
    javax.swing.JLabel _labelNombreApellido;
    javax.swing.JLabel _lbINFCedula;
    javax.swing.JLabel _lbINFEdad;
    javax.swing.JLabel _lbINFNombreApellido;
    javax.swing.JLabel _lbImagen;
    // End of variables declaration//GEN-END:variables
}
