/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freepass.tampilan;
import freepass.control.Utama;
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
        jCalendar1 = new com.toedter.calendar.JCalendar();
        btnInputData2 = new komponenMakeOver.buttonMakeOver();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saygon FreePass App");
        setIconImages(null);
        setResizable(false);

        btnInputData.setForeground(new java.awt.Color(255, 255, 255));
        btnInputData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/male_user.png"))); // NOI18N
        btnInputData.setText("Presensi (Client)");
        btnInputData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputDataActionPerformed(evt);
            }
        });

        buttonMakeOver6.setForeground(new java.awt.Color(255, 255, 255));
        buttonMakeOver6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/yellow_mail.png"))); // NOI18N
        buttonMakeOver6.setText("Proses FreePass");
        buttonMakeOver6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMakeOver6ActionPerformed(evt);
            }
        });

        btnInputData2.setForeground(new java.awt.Color(255, 255, 255));
        btnInputData2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/male_user.png"))); // NOI18N
        btnInputData2.setText("Presensi (Admin)");
        btnInputData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputData2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/freepass/img/logo.png"))); // NOI18N

        javax.swing.GroupLayout panelmakeOver1Layout = new javax.swing.GroupLayout(panelmakeOver1);
        panelmakeOver1.setLayout(panelmakeOver1Layout);
        panelmakeOver1Layout.setHorizontalGroup(
            panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmakeOver1Layout.createSequentialGroup()
                .addGroup(panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelmakeOver1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInputData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonMakeOver6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInputData2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                    .addGroup(panelmakeOver1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelmakeOver1Layout.setVerticalGroup(
            panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmakeOver1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelmakeOver1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelmakeOver1Layout.createSequentialGroup()
                        .addComponent(btnInputData, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInputData2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonMakeOver6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmakeOver1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmakeOver1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputDataActionPerformed
        new Utama().tampilFrmAbsensiClient();
        this.setVisible(false);
    }//GEN-LAST:event_btnInputDataActionPerformed

    private void buttonMakeOver6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMakeOver6ActionPerformed
        new Utama().tampilProses();
    }//GEN-LAST:event_buttonMakeOver6ActionPerformed

    private void btnInputData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputData2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInputData2ActionPerformed

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
    private komponenMakeOver.buttonMakeOver btnInputData2;
    private komponenMakeOver.buttonMakeOver buttonMakeOver6;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel2;
    private komponenMakeOver.panelmakeOver panelmakeOver1;
    // End of variables declaration//GEN-END:variables
}
