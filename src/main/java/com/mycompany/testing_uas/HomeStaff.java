/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.testing_uas;

import java.awt.Color;
import java.sql.Connection;

import com.formdev.flatlaf.FlatLightLaf;
import com.mycompany.testing_uas.LOGIN;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
/**
 *
 * @author FA506
 */
public class HomeStaff extends javax.swing.JFrame {

    /**
     * Creates new form HomeStaff
     */
    public HomeStaff() {
        initComponents();
        //set panel
        jPanelMain.setLayout(new CardLayout());
        //set panel
        showDasboard();

        // mouse listener change color
        jPanelButoonDasboard.setBackground(new Color(0,0,102));
        jPanelButoonDasboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelButoonDasboard.setBackground(new Color(153,153,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButoonDasboard.setBackground(new Color(0,0,102));
            }
        });
        jPanelButtonCustomer.setBackground(new Color(0,0,102));
        jPanelButtonCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelButtonCustomer.setBackground(new Color(153,153,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonCustomer.setBackground(new Color(0,0,102));
            }
        });
        jPanelButtonService.setBackground(new Color(0,0,102));
        jPanelButtonService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelButtonService.setBackground(new Color(153,153,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonService.setBackground(new Color(0,0,102));
            }
        });

        jPanelButtonTransaksi.setBackground(new Color(0,0,102));
        jPanelButtonTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelButtonTransaksi.setBackground(new Color(153,153,255));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonTransaksi.setBackground(new Color(0,0,102));
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanelButoonDasboard = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanelButtonCustomer = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanelButtonService = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanelButtonTransaksi = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanelHsLogout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();
        jLabelRole = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(0, 0, 102));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("TopService");

        jPanelButoonDasboard.setBackground(new java.awt.Color(0, 0, 102));
        jPanelButoonDasboard.setForeground(new java.awt.Color(153, 153, 255));
        jPanelButoonDasboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButoonDasboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelButoonDasboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButoonDasboardMouseExited(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(153, 153, 255));
        jLabel12.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 255));
        jLabel12.setText("Dasboard");

        javax.swing.GroupLayout jPanelButoonDasboardLayout = new javax.swing.GroupLayout(jPanelButoonDasboard);
        jPanelButoonDasboard.setLayout(jPanelButoonDasboardLayout);
        jPanelButoonDasboardLayout.setHorizontalGroup(
            jPanelButoonDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButoonDasboardLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel12)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanelButoonDasboardLayout.setVerticalGroup(
            jPanelButoonDasboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButoonDasboardLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelButtonCustomer.setBackground(new java.awt.Color(0, 0, 102));
        jPanelButtonCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonCustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelButtonCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonCustomerMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 255));
        jLabel13.setText("Customer");

        javax.swing.GroupLayout jPanelButtonCustomerLayout = new javax.swing.GroupLayout(jPanelButtonCustomer);
        jPanelButtonCustomer.setLayout(jPanelButtonCustomerLayout);
        jPanelButtonCustomerLayout.setHorizontalGroup(
            jPanelButtonCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonCustomerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelButtonCustomerLayout.setVerticalGroup(
            jPanelButtonCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonCustomerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel13)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelButtonService.setBackground(new java.awt.Color(0, 0, 102));
        jPanelButtonService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonServiceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelButtonServiceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonServiceMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 255));
        jLabel15.setText("Service");

        javax.swing.GroupLayout jPanelButtonServiceLayout = new javax.swing.GroupLayout(jPanelButtonService);
        jPanelButtonService.setLayout(jPanelButtonServiceLayout);
        jPanelButtonServiceLayout.setHorizontalGroup(
            jPanelButtonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonServiceLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelButtonServiceLayout.setVerticalGroup(
            jPanelButtonServiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonServiceLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel15)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelButtonTransaksi.setBackground(new java.awt.Color(0, 0, 102));
        jPanelButtonTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelButtonTransaksiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelButtonTransaksiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelButtonTransaksiMouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 255));
        jLabel16.setText("Transaksi");

        javax.swing.GroupLayout jPanelButtonTransaksiLayout = new javax.swing.GroupLayout(jPanelButtonTransaksi);
        jPanelButtonTransaksi.setLayout(jPanelButtonTransaksiLayout);
        jPanelButtonTransaksiLayout.setHorizontalGroup(
            jPanelButtonTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonTransaksiLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelButtonTransaksiLayout.setVerticalGroup(
            jPanelButtonTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonTransaksiLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel16)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelHsLogout.setBackground(new java.awt.Color(0, 0, 102));
        jPanelHsLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelHsLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelHsLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelHsLogoutMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Alata", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Logout -");

        javax.swing.GroupLayout jPanelHsLogoutLayout = new javax.swing.GroupLayout(jPanelHsLogout);
        jPanelHsLogout.setLayout(jPanelHsLogoutLayout);
        jPanelHsLogoutLayout.setHorizontalGroup(
            jPanelHsLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHsLogoutLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelHsLogoutLayout.setVerticalGroup(
            jPanelHsLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHsLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hallo");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Role");

        jLabelNama.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNama.setText("jLabel3");

        jLabelRole.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRole.setText("jLabel3");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelButtonCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelButoonDasboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelButtonService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelButtonTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel11))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanelHsLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelRole, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelRole))
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addGap(90, 90, 90)
                .addComponent(jPanelButoonDasboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelButtonCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelButtonService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelButtonTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jPanelHsLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Connection con = Database.getConnection();

    private int id_user;
    private String nama, role;
    public void DataDiTerima(int id_user, String nama, String role){
        this.id_user = id_user;
        this.nama = nama;
        this.role = role;
        System.out.println("Data diterima di HomeStaff");
        System.out.println("id_user : "+id_user);
        System.out.println("nama : "+nama);
        System.out.println("role : "+role);
        jLabelNama.setText(nama);
        jLabelRole.setText(role);

        
        System.out.println("Data diterima di HomeStaff");
        System.out.println("id_user : "+id_user);
        System.out.println("nama : "+nama);
        System.out.println("role : "+role);
        
    }
    private void showDasboard(){
        System.out.println("Panel Dashboard");
        jPanelMain.removeAll();
        jPanelMain.add(new PanelHome());
        jPanelMain.revalidate();
        jPanelMain.repaint();
    }
    private void jPanelButtonTransaksiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonTransaksiMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelButtonTransaksiMouseExited

    private void jPanelButtonTransaksiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonTransaksiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelButtonTransaksiMouseEntered

    private void jPanelButtonTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonTransaksiMouseClicked
        jPanelMain.removeAll();
        jPanelMain.add(new PanelTransaksiMain());
        jPanelMain.revalidate();
        jPanelMain.repaint();
    }//GEN-LAST:event_jPanelButtonTransaksiMouseClicked

    private void jPanelButtonServiceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonServiceMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelButtonServiceMouseExited

    private void jPanelButtonServiceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonServiceMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelButtonServiceMouseEntered

    private void jPanelButtonServiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonServiceMouseClicked
        jPanelMain.removeAll();
        jPanelMain.add(new PanelOrderService());
        jPanelMain.revalidate();
        jPanelMain.repaint();
    }//GEN-LAST:event_jPanelButtonServiceMouseClicked

    private void jPanelButtonCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCustomerMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelButtonCustomerMouseExited

    private void jPanelButtonCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCustomerMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelButtonCustomerMouseEntered

    private void jPanelButtonCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButtonCustomerMouseClicked
        // TODO add your handling code here:
        // Ganti panel di sebelah kanan dengan panel "PanelTest"
        System.out.println("Panel Customer");
        jPanelMain.removeAll();
        jPanelMain.add(new PanelCustomer());
        jPanelMain.revalidate();
        jPanelMain.repaint();
    }//GEN-LAST:event_jPanelButtonCustomerMouseClicked

    private void jPanelButoonDasboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButoonDasboardMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelButoonDasboardMouseExited

    private void jPanelButoonDasboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButoonDasboardMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelButoonDasboardMouseEntered

    private void jPanelButoonDasboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelButoonDasboardMouseClicked
        // TODO add your handling code here:
        // Ganti panel di sebelah kanan dengan panel main
        showDasboard();
    }//GEN-LAST:event_jPanelButoonDasboardMouseClicked

    private void jPanelHsLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHsLogoutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelHsLogoutMouseEntered

    private void jPanelHsLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHsLogoutMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelHsLogoutMouseExited

    private void jPanelHsLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHsLogoutMouseClicked
        // TODO add your handling code here:
        //keluar ke login
        new LOGIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelHsLogoutMouseClicked
        // Method untuk menampilkan DashboardPanel
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelRole;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelButoonDasboard;
    private javax.swing.JPanel jPanelButtonCustomer;
    private javax.swing.JPanel jPanelButtonService;
    private javax.swing.JPanel jPanelButtonTransaksi;
    private javax.swing.JPanel jPanelHsLogout;
    private javax.swing.JPanel jPanelMain;
    // End of variables declaration//GEN-END:variables
}
