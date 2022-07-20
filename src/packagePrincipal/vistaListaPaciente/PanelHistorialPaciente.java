package packagePrincipal.vistaListaPaciente;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class PanelHistorialPaciente extends javax.swing.JPanel {

    public PanelHistorialPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        _lbLogo = new javax.swing.JLabel();
        _botonVolver = new javax.swing.JButton();
        _lbRazonConsulta = new javax.swing.JLabel();
        _lbEnfermedadActual = new javax.swing.JLabel();
        _lbAntecedentesP = new javax.swing.JLabel();
        _lbAnteFamiliares = new javax.swing.JLabel();
        _lbAntePatologicos = new javax.swing.JLabel();
        _lbAnteFarmacologicos = new javax.swing.JLabel();
        _lbfechaConsulta = new javax.swing.JLabel();
        _lbExamenF = new javax.swing.JLabel();
        _lbTipoConsulta = new javax.swing.JLabel();
        _lbDiagnostico = new javax.swing.JLabel();
        _lbPlanTratamiento = new javax.swing.JLabel();
        _lbTRazonConsulta = new javax.swing.JLabel();
        _lbTTipoConsulta = new javax.swing.JLabel();
        _lbTFecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _aEnfermedadActual = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        _aExamenFisico = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        _aDiagnostico = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        _aAnteFamiliares = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        _aAntePatalogico = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        _aAnteFarmacologicos = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        _aAntePersonales = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        _aPlanTratamiento = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(26, 188, 156));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/historialDetalladoPaciente.png"))); // NOI18N
        add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        _botonVolver.setBackground(new java.awt.Color(26, 188, 156));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 70, 60));

        _lbRazonConsulta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbRazonConsulta.setForeground(new java.awt.Color(153, 255, 255));
        _lbRazonConsulta.setText("RAZÓN CONSULTA :");
        add(_lbRazonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, 20));

        _lbEnfermedadActual.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbEnfermedadActual.setForeground(new java.awt.Color(153, 255, 255));
        _lbEnfermedadActual.setText("ENFERMEDAD ACTUAL :");
        add(_lbEnfermedadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        _lbAntecedentesP.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbAntecedentesP.setForeground(new java.awt.Color(153, 255, 255));
        _lbAntecedentesP.setText("ANTECEDENTES PERSONALES :");
        add(_lbAntecedentesP, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, -1, -1));

        _lbAnteFamiliares.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbAnteFamiliares.setForeground(new java.awt.Color(153, 255, 255));
        _lbAnteFamiliares.setText("ANTECEDENTES FAMILIARES :");
        add(_lbAnteFamiliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        _lbAntePatologicos.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbAntePatologicos.setForeground(new java.awt.Color(153, 255, 255));
        _lbAntePatologicos.setText("ANTECEDENTES PATOLÓGICOS :");
        add(_lbAntePatologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        _lbAnteFarmacologicos.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbAnteFarmacologicos.setForeground(new java.awt.Color(153, 255, 255));
        _lbAnteFarmacologicos.setText("ANTECEDENTES FARMACOLÓGICOS :");
        add(_lbAnteFarmacologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 280, -1));

        _lbfechaConsulta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbfechaConsulta.setForeground(new java.awt.Color(153, 255, 255));
        _lbfechaConsulta.setText("FECHA ÚLTIMA CONSULTA :");
        add(_lbfechaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        _lbExamenF.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbExamenF.setForeground(new java.awt.Color(153, 255, 255));
        _lbExamenF.setText("EXAMEN FÍSICO :");
        add(_lbExamenF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        _lbTipoConsulta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTipoConsulta.setForeground(new java.awt.Color(153, 255, 255));
        _lbTipoConsulta.setText("TIPO DE CONSULTA :");
        add(_lbTipoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        _lbDiagnostico.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbDiagnostico.setForeground(new java.awt.Color(153, 255, 255));
        _lbDiagnostico.setText("DIAGNÓSTICO :");
        add(_lbDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        _lbPlanTratamiento.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbPlanTratamiento.setForeground(new java.awt.Color(153, 255, 255));
        _lbPlanTratamiento.setText("PLAN DE TRATAMEINTO :");
        add(_lbPlanTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, -1, -1));

        _lbTRazonConsulta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTRazonConsulta.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTRazonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 180, 20));

        _lbTTipoConsulta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTTipoConsulta.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTTipoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 180, 20));

        _lbTFecha.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        _lbTFecha.setForeground(new java.awt.Color(255, 255, 255));
        add(_lbTFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, 20));

        _aEnfermedadActual.setColumns(20);
        _aEnfermedadActual.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aEnfermedadActual.setRows(5);
        jScrollPane1.setViewportView(_aEnfermedadActual);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 230, 80));

        _aExamenFisico.setColumns(20);
        _aExamenFisico.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        _aExamenFisico.setRows(5);
        _aExamenFisico.setPreferredSize(new java.awt.Dimension(204, 69));
        jScrollPane2.setViewportView(_aExamenFisico);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 230, -1));

        _aDiagnostico.setColumns(20);
        _aDiagnostico.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aDiagnostico.setRows(5);
        jScrollPane3.setViewportView(_aDiagnostico);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 230, -1));

        _aAnteFamiliares.setColumns(20);
        _aAnteFamiliares.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aAnteFamiliares.setRows(5);
        jScrollPane4.setViewportView(_aAnteFamiliares);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 240, -1));

        _aAntePatalogico.setColumns(20);
        _aAntePatalogico.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aAntePatalogico.setRows(5);
        jScrollPane5.setViewportView(_aAntePatalogico);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 240, -1));

        _aAnteFarmacologicos.setColumns(20);
        _aAnteFarmacologicos.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aAnteFarmacologicos.setRows(5);
        jScrollPane6.setViewportView(_aAnteFarmacologicos);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 240, -1));

        _aAntePersonales.setColumns(20);
        _aAntePersonales.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aAntePersonales.setRows(5);
        jScrollPane7.setViewportView(_aAntePersonales);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 240, -1));

        _aPlanTratamiento.setColumns(20);
        _aPlanTratamiento.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aPlanTratamiento.setRows(5);
        jScrollPane8.setViewportView(_aPlanTratamiento);

        add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 550, 250, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    public void AddActionListener(ActionListener listener){
        _botonVolver.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextArea _aAnteFamiliares;
    javax.swing.JTextArea _aAnteFarmacologicos;
    javax.swing.JTextArea _aAntePatalogico;
    javax.swing.JTextArea _aAntePersonales;
    javax.swing.JTextArea _aDiagnostico;
    javax.swing.JTextArea _aEnfermedadActual;
    javax.swing.JTextArea _aExamenFisico;
    javax.swing.JTextArea _aPlanTratamiento;
    javax.swing.JButton _botonVolver;
    javax.swing.JLabel _lbAnteFamiliares;
    javax.swing.JLabel _lbAnteFarmacologicos;
    javax.swing.JLabel _lbAntePatologicos;
    javax.swing.JLabel _lbAntecedentesP;
    javax.swing.JLabel _lbDiagnostico;
    javax.swing.JLabel _lbEnfermedadActual;
    javax.swing.JLabel _lbExamenF;
    javax.swing.JLabel _lbLogo;
    javax.swing.JLabel _lbPlanTratamiento;
    javax.swing.JLabel _lbRazonConsulta;
    javax.swing.JLabel _lbTFecha;
    javax.swing.JLabel _lbTRazonConsulta;
    javax.swing.JLabel _lbTTipoConsulta;
    javax.swing.JLabel _lbTipoConsulta;
    javax.swing.JLabel _lbfechaConsulta;
    javax.swing.JLabel jLabel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JScrollPane jScrollPane3;
    javax.swing.JScrollPane jScrollPane4;
    javax.swing.JScrollPane jScrollPane5;
    javax.swing.JScrollPane jScrollPane6;
    javax.swing.JScrollPane jScrollPane7;
    javax.swing.JScrollPane jScrollPane8;
    // End of variables declaration//GEN-END:variables

    public JButton getBotonVolver() {
        return _botonVolver;
    }

    public void setaAnteFamiliares(String aAnteFamiliares) {
        this._aAnteFamiliares.setText(aAnteFamiliares);
    }

    public void setaAnteFarmacologicos(String aAnteFarmacologicos) {
        this._aAnteFarmacologicos.setText(aAnteFarmacologicos);
    }

    public void setaAntePatalogico(String aAntePatalogico) {
        this._aAntePatalogico.setText(aAntePatalogico);
    }

    public void setaAntePersonales(String aAntePersonales) {
        this._aAntePersonales.setText(aAntePersonales);
    }

    public void setaDiagnostico(String aDiagnostico) {
        this._aDiagnostico.setText(aDiagnostico);
    }

    public void setaEnfermedadActual(String aEnfermedadActual) {
        this._aEnfermedadActual.setText(aEnfermedadActual);
    }

    public void setaExamenFisico(String aExamenFisico) {
        this._aExamenFisico.setText(aExamenFisico);
    }

    public void setaPlanTratamiento(String aPlanTratamiento) {
        this._aPlanTratamiento.setText(aPlanTratamiento);
    }

    public void setLbTFecha(String lbTFecha) {
        this._lbTFecha.setText(lbTFecha);
    }

    public void setLbTRazonConsulta(String lbTRazonConsulta) {
        this._lbTRazonConsulta.setText(lbTRazonConsulta);
    }

    public void setLbTTipoConsulta(String lbTTipoConsulta) {
        this._lbTTipoConsulta.setText(lbTTipoConsulta);
    }
    
    

}
