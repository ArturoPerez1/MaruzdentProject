package packagePrincipal.vistaListaPaciente;

import java.awt.event.ActionListener;
import javax.swing.JButton;

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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        _aAnteFamiliares = new javax.swing.JTextArea();
        _lbAnteFamiliares = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        _aAntePatalogico = new javax.swing.JTextArea();
        _lbAntePatologicos = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        _aAnteFarmacologicos = new javax.swing.JTextArea();
        _lbAnteFarmacologicos = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        _aAntePersonales = new javax.swing.JTextArea();
        _lbAntecedentesP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        _aPlanTratamiento = new javax.swing.JTextArea();
        _lbPlanTratamiento = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        _aDiagnostico = new javax.swing.JTextArea();
        _lbDiagnostico = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        _aExamenFisico = new javax.swing.JTextArea();
        _lbExamenF = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        _lbRazonConsulta = new javax.swing.JLabel();
        _lbTipoConsulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        _aEnfermedadActual = new javax.swing.JTextArea();
        _lbEnfermedadActual = new javax.swing.JLabel();
        _lbTRazonConsulta = new javax.swing.JLabel();
        _lbTTipoConsulta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(38, 166, 154));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/historialPaciente.png"))); // NOI18N
        add(_lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 850, 80));

        _botonVolver.setBackground(new java.awt.Color(77, 182, 172));
        _botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packagePrincipal/assets/imagenes/volver.png"))); // NOI18N
        add(_botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 60));

        jPanel1.setBackground(new java.awt.Color(0, 137, 123));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _aAnteFamiliares.setColumns(20);
        _aAnteFamiliares.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aAnteFamiliares.setRows(5);
        jScrollPane4.setViewportView(_aAnteFamiliares);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 240, -1));

        _lbAnteFamiliares.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbAnteFamiliares.setForeground(new java.awt.Color(153, 255, 255));
        _lbAnteFamiliares.setText("ANTECEDENTES FAMILIARES ");
        jPanel1.add(_lbAnteFamiliares, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 270, -1));

        _aAntePatalogico.setColumns(20);
        _aAntePatalogico.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aAntePatalogico.setRows(5);
        jScrollPane5.setViewportView(_aAntePatalogico);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 240, -1));

        _lbAntePatologicos.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbAntePatologicos.setForeground(new java.awt.Color(153, 255, 255));
        _lbAntePatologicos.setText("ANTECEDENTES PATOLÓGICOS ");
        jPanel1.add(_lbAntePatologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        _aAnteFarmacologicos.setColumns(20);
        _aAnteFarmacologicos.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aAnteFarmacologicos.setRows(5);
        jScrollPane6.setViewportView(_aAnteFarmacologicos);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 240, -1));

        _lbAnteFarmacologicos.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbAnteFarmacologicos.setForeground(new java.awt.Color(153, 255, 255));
        _lbAnteFarmacologicos.setText("ANTECEDENTES FARMACOLÓGICOS ");
        jPanel1.add(_lbAnteFarmacologicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 340, -1));

        _aAntePersonales.setColumns(20);
        _aAntePersonales.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aAntePersonales.setRows(5);
        jScrollPane7.setViewportView(_aAntePersonales);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 240, -1));

        _lbAntecedentesP.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbAntecedentesP.setForeground(new java.awt.Color(153, 255, 255));
        _lbAntecedentesP.setText("ANTECEDENTES PERSONALES ");
        jPanel1.add(_lbAntecedentesP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 660, 320));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ANTECEDENTES DEL PACIENTE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 390, 20));

        jPanel2.setBackground(new java.awt.Color(0, 137, 123));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _aPlanTratamiento.setColumns(20);
        _aPlanTratamiento.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aPlanTratamiento.setRows(5);
        jScrollPane8.setViewportView(_aPlanTratamiento);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 90));

        _lbPlanTratamiento.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbPlanTratamiento.setForeground(new java.awt.Color(153, 255, 255));
        _lbPlanTratamiento.setText("PLAN DE TRATAMEINTO :");
        jPanel2.add(_lbPlanTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        _aDiagnostico.setColumns(20);
        _aDiagnostico.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aDiagnostico.setRows(5);
        jScrollPane3.setViewportView(_aDiagnostico);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 230, 90));

        _lbDiagnostico.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbDiagnostico.setForeground(new java.awt.Color(153, 255, 255));
        _lbDiagnostico.setText("DIAGNÓSTICO :");
        jPanel2.add(_lbDiagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        _aExamenFisico.setColumns(20);
        _aExamenFisico.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        _aExamenFisico.setRows(5);
        _aExamenFisico.setPreferredSize(new java.awt.Dimension(204, 69));
        jScrollPane2.setViewportView(_aExamenFisico);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 230, 90));

        _lbExamenF.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbExamenF.setForeground(new java.awt.Color(153, 255, 255));
        _lbExamenF.setText("EXAMEN FÍSICO :");
        jPanel2.add(_lbExamenF, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 1100, 200));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATOS OBTENIDOS DE LA REVISIÓN MÉDICA");
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 570, 40));

        jPanel3.setBackground(new java.awt.Color(0, 137, 123));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _lbRazonConsulta.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbRazonConsulta.setForeground(new java.awt.Color(153, 255, 255));
        _lbRazonConsulta.setText("RAZÓN CONSULTA :");
        jPanel3.add(_lbRazonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 20));

        _lbTipoConsulta.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbTipoConsulta.setForeground(new java.awt.Color(153, 255, 255));
        _lbTipoConsulta.setText("TIPO DE CONSULTA :");
        jPanel3.add(_lbTipoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        _aEnfermedadActual.setColumns(20);
        _aEnfermedadActual.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        _aEnfermedadActual.setRows(5);
        jScrollPane1.setViewportView(_aEnfermedadActual);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 230, 90));

        _lbEnfermedadActual.setFont(new java.awt.Font("Metropolis Black", 1, 18)); // NOI18N
        _lbEnfermedadActual.setForeground(new java.awt.Color(153, 255, 255));
        _lbEnfermedadActual.setText("ENFERMEDAD ACTUAL :");
        jPanel3.add(_lbEnfermedadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        _lbTRazonConsulta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbTRazonConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(_lbTRazonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 280, 20));

        _lbTTipoConsulta.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        _lbTTipoConsulta.setForeground(new java.awt.Color(255, 255, 255));
        _lbTTipoConsulta.setToolTipText("");
        jPanel3.add(_lbTTipoConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 270, 40));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 500, 320));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DATOS RELEVANTE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 98, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    public void AddActionListener(ActionListener listener) {
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
    javax.swing.JLabel _lbTRazonConsulta;
    javax.swing.JLabel _lbTTipoConsulta;
    javax.swing.JLabel _lbTipoConsulta;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
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

    public void setLbTRazonConsulta(String lbTRazonConsulta) {
        this._lbTRazonConsulta.setText(lbTRazonConsulta);
    }

    public void setLbTTipoConsulta(String lbTTipoConsulta) {
        this._lbTTipoConsulta.setText(lbTTipoConsulta);
    }

}
