/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freepass.UI;
import freepass.dialog.addKaryawan;
import freepass.Utama;
/**
 *
 * @author nufail
 */
public class MenuUtama extends javax.swing.JFrame {

    public MenuUtama() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelmakeOver1 = new komponenMakeOver.panelmakeOver();
        btnInputData = new komponenMakeOver.buttonMakeOver();
        buttonMakeOver6 = new komponenMakeOver.buttonMakeOver();
        jLabel1 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        buttonMakeOver3 = new komponenMakeOver.buttonMakeOver();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama");
        setResizable(false);

        btnInputData.setForeground(new java.awt.Color(255, 255, 255));
        btnInputData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/male_user.png"))); // NOI18N
        btnInputData.setText("Input Data Karyawan");
        btnInputData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputDataActionPerformed(evt);
            }
        });

        buttonMakeOver6.setForeground(new java.awt.Color(255, 255, 255));
        buttonMakeOver6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/red_heart.png"))); // NOI18N
        buttonMakeOver6.setText("Proses FreePass");
        buttonMakeOver6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMakeOver6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SAYGON FREEPASS APP");

        buttonMakeOver3.setForeground(new java.awt.Color(255, 255, 255));
        buttonMakeOver3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/freepass/img/exit.png"))); // NOI18N
        buttonMakeOver3.setText("Keluar (Logout)");
        buttonMakeOver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMakeOver3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelmakeOver1Layout = new javax.swing.GroupLayout(panelmakeOver1);
        panelmakeOver1.setLayout(panelmakeOver1Layout);
        panelmakeOver1Layout.setHorizontalGroup(
            panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmakeOver1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelmakeOver1Layout.createSequentialGroup()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonMakeOver3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInputData, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(buttonMakeOver6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        panelmakeOver1Layout.setVerticalGroup(
            panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmakeOver1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelmakeOver1Layout.createSequentialGroup()
                        .addComponent(btnInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonMakeOver6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonMakeOver3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmakeOver1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmakeOver1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputDataActionPerformed
        new addKaryawan(new javax.swing.JFrame(), true).setVisible(true);
    }//GEN-LAST:event_btnInputDataActionPerformed

    private void buttonMakeOver6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMakeOver6ActionPerformed
        new Utama().tampilProses();
    }//GEN-LAST:event_buttonMakeOver6ActionPerformed

    private void buttonMakeOver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMakeOver3ActionPerformed
        this.dispose();
        new Utama().tampilMenuLogin();
    }//GEN-LAST:event_buttonMakeOver3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private komponenMakeOver.buttonMakeOver btnInputData;
    private komponenMakeOver.buttonMakeOver buttonMakeOver3;
    private komponenMakeOver.buttonMakeOver buttonMakeOver6;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private komponenMakeOver.panelmakeOver panelmakeOver1;
    // End of variables declaration//GEN-END:variables
}
