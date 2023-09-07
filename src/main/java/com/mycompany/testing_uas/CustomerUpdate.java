/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.testing_uas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author FA506
 */
public class CustomerUpdate extends javax.swing.JDialog {

    /**
     * Creates new form CustomerUpdate
     */
    public CustomerUpdate(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelGanti = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldAlamat = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelGanti.setText("UPDATE CUSTOMERS");

        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonClose.setText("CLOSE");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("Phone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNama, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jTextFieldAlamat)
                    .addComponent(jTextFieldPhone))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabelGanti)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButtonUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonClose)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelGanti)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Connection con = Database.getConnection();
    //penyimbahan hasil dari page sebelumnya
    private int id_cus_save;

    public void DataDiTerima(int id_customer, String nama, String alamat, String phone) {
        jTextFieldNama.setText(nama);
        jTextFieldAlamat.setText(alamat);
        jTextFieldPhone.setText(phone);
        //simpan data ke variabel global
        this.id_cus_save = id_customer;
    }
    public void GantiNama(int ganti){
        if(ganti==1){
            jLabelGanti.setText("UPDATE CUSTOMERS");
            jButtonUpdate.setText("UPDATE");
        }else if(ganti==2){
            jButtonUpdate.setText("INSERT");
            jLabelGanti.setText("INSERT CUSTOMERS");
        }else{
            System.out.println("Tidak ada aksi");
        }
    }
    
    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        if(jButtonUpdate.getText().equals("UPDATE")){
             if(con!=null){
                System.out.println("sudah terkoneksi");
                try{
                    String sql = "UPDATE customer SET nama = ?, alamat = ?, phone = ? WHERE id_customer = ?";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, jTextFieldNama.getText());
                    ps.setString(2, jTextFieldAlamat.getText());
                    ps.setString(3, jTextFieldPhone.getText());
                    ps.setInt(4, id_cus_save);
                    //jika inputan kosong
                    if(jTextFieldNama.getText().equals("") || jTextFieldAlamat.getText().equals("") || jTextFieldPhone.getText().equals("")){
                        JOptionPane.showMessageDialog(this, "Data tidak boleh kosong");
                        return;
                    }else{
                        int hasil=ps.executeUpdate();
                    if(hasil==1){
                        System.out.println("Data berhasil diubah");
                        JOptionPane.showMessageDialog(this, "Data berhasil diubah");
                        this.dispose();
                    }else{
                        System.out.println("Data gagal diubah");
                    }
                        System.out.println("Data tidak kosong");
                    }
                    ps.close();
                    
                }catch(Exception ex){
                    ex.printStackTrace();
                    System.out.println("Data gagal diubah");
                }
            }
            System.out.println("sudah anda pencet");
        }else if(jButtonUpdate.getText().equals("INSERT")){
            if(con!=null){
                System.out.println("sudah terkoneksi");
                try{
                    String sql = "INSERT INTO customer (nama, alamat, phone) VALUES (?, ?, ?)";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, jTextFieldNama.getText());
                    ps.setString(2, jTextFieldAlamat.getText());
                    ps.setString(3, jTextFieldPhone.getText());
                    //jika inputan kosong
                    if(jTextFieldNama.getText().equals("") || jTextFieldAlamat.getText().equals("") || jTextFieldPhone.getText().equals("")){
                        JOptionPane.showMessageDialog(this, "Data tidak boleh kosong");
                        return;
                    }else{
                        int hasil=ps.executeUpdate();
                        if(hasil==1){
                            System.out.println("Data berhasil ditambahkan");
                            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
                            this.dispose();
                        }else{
                            System.out.println("Data gagal ditambahkan");
                        }
                        System.out.println("Data tidak kosong");
                    }
                    ps.close();

                }catch(Exception ex){
                    ex.printStackTrace();
                    System.out.println("Data gagal ditambahkan");
                }
            }else{
                System.out.println("Tidak ada koneksi");
            }
        }else{
            System.out.println("Tidak ada aksi");
        }

       

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
        //close this form
        this.dispose();
    }//GEN-LAST:event_jButtonCloseActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerUpdate dialog = new CustomerUpdate(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelGanti;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAlamat;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}