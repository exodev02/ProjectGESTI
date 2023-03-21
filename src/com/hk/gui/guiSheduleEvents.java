package com.hk.gui;

import java.awt.geom.RoundRectangle2D;

public class guiSheduleEvents extends javax.swing.JFrame {
    
    public guiSheduleEvents() {
        initComponents();
        init();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        lblEventosAgendados = new javax.swing.JLabel();
        scrpDatos = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ltxtNombreEvento = new com.hk.swing.LineTextField();
        cboSala = new com.hk.swing.CustomComboBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ltxtNombreDocente = new com.hk.swing.LineTextField();
        cboCarrera = new com.hk.swing.CustomComboBox();
        ltxtCantidadAlumnos = new com.hk.swing.LineTextField();
        chkRepetir = new com.hk.swing.CustomCheckBox();
        scrpObservaciones = new javax.swing.JScrollPane();
        txaObservaciones = new javax.swing.JTextArea();
        rbtnModificar = new com.hk.swing.RoundedButton();
        rbtnBuscar = new com.hk.swing.RoundedButton();
        rbtnEliminar = new com.hk.swing.RoundedButton();
        rbtnCerrar = new com.hk.swing.RoundedButton();
        pnlIdEvento = new com.hk.swing.RoundedPanel();
        lblIdEvento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblEventosAgendados.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        lblEventosAgendados.setForeground(new java.awt.Color(0, 0, 0));
        lblEventosAgendados.setText("Eventos Agendados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Sala", "Fecha", "Horario", "Docente", "Carrera", "Alumnos", "Observaciones"
            }
        ));
        scrpDatos.setViewportView(jTable1);

        ltxtNombreEvento.setLabelText("Nombre del Evento");

        cboSala.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SALA B", "SALA D", "SALA E", "SALA F" }));
        cboSala.setSelectedIndex(-1);
        cboSala.setLabelText("SELECCIONA UNA SALA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setPreferredSize(new java.awt.Dimension(95, 41));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ltxtNombreDocente.setLabelText("Nombre del Docente");

        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IGE", "II", "IA", "IEM", "IM", "IE", "ISC" }));
        cboCarrera.setSelectedIndex(-1);
        cboCarrera.setLabelText("SELECCIONA UNA CARRERA");

        ltxtCantidadAlumnos.setLabelText("# Alumnos");

        chkRepetir.setText("Repetir");

        txaObservaciones.setColumns(20);
        txaObservaciones.setRows(5);
        scrpObservaciones.setViewportView(txaObservaciones);

        rbtnModificar.setText("Modificar");
        rbtnModificar.setBorderColor(new java.awt.Color(51, 153, 255));
        rbtnModificar.setBorderPainted(false);
        rbtnModificar.setFocusPainted(false);
        rbtnModificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnModificar.setRadius(40);

        rbtnBuscar.setText("Buscar Por");
        rbtnBuscar.setBorderColor(new java.awt.Color(51, 153, 255));
        rbtnBuscar.setBorderPainted(false);
        rbtnBuscar.setFocusPainted(false);
        rbtnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnBuscar.setRadius(40);

        rbtnEliminar.setText("Eliminar");
        rbtnEliminar.setBorderColor(new java.awt.Color(51, 153, 255));
        rbtnEliminar.setBorderPainted(false);
        rbtnEliminar.setFocusPainted(false);
        rbtnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnEliminar.setRadius(40);

        rbtnCerrar.setText("Cerrar");
        rbtnCerrar.setBorderColor(new java.awt.Color(51, 153, 255));
        rbtnCerrar.setBorderPainted(false);
        rbtnCerrar.setFocusPainted(false);
        rbtnCerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnCerrar.setRadius(40);
        rbtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCerrarActionPerformed(evt);
            }
        });

        pnlIdEvento.setBackground(new java.awt.Color(204, 204, 204));
        pnlIdEvento.setRadius(30);

        lblIdEvento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIdEvento.setForeground(new java.awt.Color(51, 51, 51));
        lblIdEvento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        pnlIdEvento.add(lblIdEvento);
        lblIdEvento.setBounds(10, 0, 80, 30);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ltxtNombreEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEventosAgendados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ltxtNombreDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                        .addComponent(ltxtCantidadAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkRepetir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrpObservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(pnlIdEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(scrpDatos)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEventosAgendados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlIdEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ltxtNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ltxtNombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ltxtCantidadAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(chkRepetir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(scrpObservaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(rbtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(rbtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(rbtnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_rbtnCerrarActionPerformed

    public void init() {
        this.setLocationRelativeTo(null);
        this.setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        //this.getContentPane().setBackground(new Color(245, 245, 245));
    }
    
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
            java.util.logging.Logger.getLogger(guiSheduleEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiSheduleEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiSheduleEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiSheduleEvents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiSheduleEvents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.hk.swing.CustomComboBox cboCarrera;
    private com.hk.swing.CustomComboBox cboSala;
    private com.hk.swing.CustomCheckBox chkRepetir;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEventosAgendados;
    private javax.swing.JLabel lblIdEvento;
    private com.hk.swing.LineTextField ltxtCantidadAlumnos;
    private com.hk.swing.LineTextField ltxtNombreDocente;
    private com.hk.swing.LineTextField ltxtNombreEvento;
    private javax.swing.JPanel mainPanel;
    private com.hk.swing.RoundedPanel pnlIdEvento;
    private com.hk.swing.RoundedButton rbtnBuscar;
    private com.hk.swing.RoundedButton rbtnCerrar;
    private com.hk.swing.RoundedButton rbtnEliminar;
    private com.hk.swing.RoundedButton rbtnModificar;
    private javax.swing.JScrollPane scrpDatos;
    private javax.swing.JScrollPane scrpObservaciones;
    private javax.swing.JTextArea txaObservaciones;
    // End of variables declaration//GEN-END:variables
}
