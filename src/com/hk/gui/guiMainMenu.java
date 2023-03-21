package com.hk.gui;

import java.awt.Dimension;

public class guiMainMenu extends javax.swing.JFrame {
    
    public guiMainMenu() {
        initComponents();
        init();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        roundedPanel1 = new com.hk.swing.RoundedPanel();
        clock1 = new com.hk.swing.Clock();
        rbtnCerrar = new com.hk.swing.RoundedButton();
        rbtnNuevoEvento = new com.hk.swing.RoundedButton();
        rbtnEditarEvento = new com.hk.swing.RoundedButton();
        rbtnRegistroEvento = new com.hk.swing.RoundedButton();
        roundedPanel2 = new com.hk.swing.RoundedPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        statusConnection1 = new com.hk.swing.StatusConnection();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Control de Salas");

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

        roundedPanel1.setBackground(new java.awt.Color(204, 204, 204));
        roundedPanel1.setRadius(40);

        clock1.setForeground(new java.awt.Color(51, 51, 51));
        clock1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clock1.setFont(new java.awt.Font("Corbel", 0, 32)); // NOI18N
        roundedPanel1.add(clock1);
        clock1.setBounds(20, 0, 130, 40);

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

        rbtnNuevoEvento.setText("Nuevo Evento");
        rbtnNuevoEvento.setBorderColor(new java.awt.Color(51, 153, 255));
        rbtnNuevoEvento.setBorderPainted(false);
        rbtnNuevoEvento.setFocusPainted(false);
        rbtnNuevoEvento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnNuevoEvento.setRadius(40);
        rbtnNuevoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNuevoEventoActionPerformed(evt);
            }
        });

        rbtnEditarEvento.setText("Agenda de Eventos");
        rbtnEditarEvento.setBorderColor(new java.awt.Color(51, 153, 255));
        rbtnEditarEvento.setBorderPainted(false);
        rbtnEditarEvento.setFocusPainted(false);
        rbtnEditarEvento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnEditarEvento.setRadius(40);
        rbtnEditarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEditarEventoActionPerformed(evt);
            }
        });

        rbtnRegistroEvento.setText("Registro de Eventos");
        rbtnRegistroEvento.setBorderColor(new java.awt.Color(51, 153, 255));
        rbtnRegistroEvento.setBorderPainted(false);
        rbtnRegistroEvento.setFocusPainted(false);
        rbtnRegistroEvento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnRegistroEvento.setRadius(40);
        rbtnRegistroEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRegistroEventoActionPerformed(evt);
            }
        });

        roundedPanel2.setBackground(new java.awt.Color(204, 204, 204));
        roundedPanel2.setRadius(40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SALA B", "SALA D", "SALA E", "SALA F"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("SALA B");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("SALA D");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("SALA E");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("SALA F");
        }

        roundedPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 1060, 640);

        javax.swing.GroupLayout statusConnection1Layout = new javax.swing.GroupLayout(statusConnection1);
        statusConnection1.setLayout(statusConnection1Layout);
        statusConnection1Layout.setHorizontalGroup(
            statusConnection1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        statusConnection1Layout.setVerticalGroup(
            statusConnection1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rbtnNuevoEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rbtnEditarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnRegistroEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGap(0, 1039, Short.MAX_VALUE)
                        .addComponent(statusConnection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusConnection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(rbtnNuevoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnEditarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnRegistroEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, Short.MAX_VALUE)
                        .addComponent(rbtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnNuevoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNuevoEventoActionPerformed
        guiNewEvent frame = new guiNewEvent();
        frame.setVisible(true);
    }//GEN-LAST:event_rbtnNuevoEventoActionPerformed

    private void rbtnEditarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEditarEventoActionPerformed
        guiSheduleEvents frame = new guiSheduleEvents();
        frame.setVisible(true);
    }//GEN-LAST:event_rbtnEditarEventoActionPerformed

    private void rbtnRegistroEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRegistroEventoActionPerformed
        guiEventLog frame = new guiEventLog();
        frame.setVisible(true);
    }//GEN-LAST:event_rbtnRegistroEventoActionPerformed

    private void rbtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rbtnCerrarActionPerformed
    
    private void init() {
        this.setSize(new Dimension(1280, 720));
        MainPanel.setSize(new Dimension(1280, 720));
        this.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(guiMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private com.hk.swing.Clock clock1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.hk.swing.RoundedButton rbtnCerrar;
    private com.hk.swing.RoundedButton rbtnEditarEvento;
    private com.hk.swing.RoundedButton rbtnNuevoEvento;
    private com.hk.swing.RoundedButton rbtnRegistroEvento;
    private com.hk.swing.RoundedPanel roundedPanel1;
    private com.hk.swing.RoundedPanel roundedPanel2;
    private com.hk.swing.StatusConnection statusConnection1;
    // End of variables declaration//GEN-END:variables
}
