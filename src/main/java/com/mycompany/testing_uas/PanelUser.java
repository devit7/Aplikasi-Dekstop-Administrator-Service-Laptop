/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.testing_uas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;
import java.util.ArrayList;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RICKY
 */
public class PanelUser extends javax.swing.JPanel {

    /**
     * Creates new form PanelUser
     */
    public PanelUser() {
        initComponents();
        LoadKolom();
        jTableUwU.setModel(model);
        cellListener();
        LoadUser();
        Tampiluser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUwU = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jTextFieldCari1 = new javax.swing.JTextField();
        jButtonCari1 = new javax.swing.JButton();
        jButtonUpdate1 = new javax.swing.JButton();
        jButtonDelete1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(205, 127, 50));
        setMaximumSize(new java.awt.Dimension(833, 700));

        jTableUwU.setBackground(new java.awt.Color(239, 199, 194));
        jTableUwU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Password", "Nama", "Role"
            }
        ));
        jScrollPane1.setViewportView(jTableUwU);

        jPanel3.setBackground(new java.awt.Color(255, 229, 212));

        jButtonAdd.setText("Add +");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonCari1.setText("Cari");
        jButtonCari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCari1ActionPerformed(evt);
            }
        });

        jButtonUpdate1.setText("Update");
        jButtonUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdate1ActionPerformed(evt);
            }
        });

        jButtonDelete1.setText("Delete");
        jButtonDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButtonAdd)
                .addGap(18, 18, 18)
                .addComponent(jButtonUpdate1)
                .addGap(18, 18, 18)
                .addComponent(jButtonDelete1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(jTextFieldCari1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCari1)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jTextFieldCari1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCari1)
                    .addComponent(jButtonUpdate1)
                    .addComponent(jButtonDelete1))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA USER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(304, 304, 304))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents
    private DefaultTableModel model = new DefaultTableModel();
    private Connection con = Database.getConnection();
    private ArrayList<users> listUser = new ArrayList<>();
    private int id_user;
    public void DataDiterima(int id_user){
        this.id_user = id_user;
        System.out.println("this id user diterima " + this.id_user);
    }
    private void cellListener(){
        jTableUwU.setModel(model);
        jButtonUpdate1.setEnabled(false);
        jButtonDelete1.setEnabled(false);    
        jTableUwU.getSelectionModel().addListSelectionListener(e -> {
            boolean tombol = jTableUwU.getSelectedRow() != -1;
            jButtonUpdate1.setEnabled(tombol);
            jButtonDelete1.setEnabled(tombol);
        });
    }
    private void LoadKolom(){
        model.addColumn("ID User");
        model.addColumn("Username");
        model.addColumn("Password");
        model.addColumn("Nama");
        model.addColumn("Role");
    }
    private void LoadUser(){
        if(con != null){
            System.out.println("koneksi terhubung");
            listUser= new ArrayList<>();
            String sql = "select * from user";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    int id_user = rs.getInt(1);
                    String username = rs.getString(2);
                    String password = rs.getString(3);
                    String nama = rs.getString(4);
                    String role = rs.getString(5);
                    users u = new users(id_user, username, password, nama, role);
                    listUser.add(u);
                }
                rs.close();
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
    private void Tampiluser(){
        model.setRowCount(0);
        // isi baris
        for(users u : listUser){
            model.addRow(new Object[]{u.getId_user(), u.getUsername(), u.getPassword(), u.getNama(), u.getRole()});
        }
    }
    private void refresh(){
        LoadUser();
        Tampiluser();
    }

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        UserUpdate uu = new UserUpdate(null, true);
        uu.GantiNama(2);
        uu.setVisible(true);
        uu.pack();
        uu.setLocationRelativeTo(null);
        uu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        refresh();
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonCari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCari1ActionPerformed
        // TODO add your handling code here:
        //menganbil data dari textfield
        String cari = jTextFieldCari1.getText();
        //query
        String sql = "select * from user where username like ? OR password like ? OR nama like ? OR role like ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%"+cari+"%");
            ps.setString(2, "%"+cari+"%");
            ps.setString(3, "%"+cari+"%");
            ps.setString(4, "%"+cari+"%");
            ResultSet rs = ps.executeQuery();
            model.setRowCount(0);
            while(rs.next()){
                int id_user = rs.getInt(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                String nama = rs.getString(4);
                String role = rs.getString(5);
                model.addRow(new Object[]{id_user, username, password, nama, role});
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonCari1ActionPerformed

    private void jButtonUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdate1ActionPerformed
        // TODO add your handling code here:
        int baristerpilih = jTableUwU.getSelectedRow();
        int id_user = (int) model.getValueAt(baristerpilih, 0);
        String username = (String) model.getValueAt(baristerpilih, 1);
        String password = (String) model.getValueAt(baristerpilih, 2);
        String nama = (String) model.getValueAt(baristerpilih, 3);
        String role = (String) model.getValueAt(baristerpilih, 4);

        UserUpdate uu = new UserUpdate( null, true);
        uu.GantiNama(1);
        uu.DataDiTerima(id_user, username, password, nama, role);
        uu.setVisible(true);
        uu.pack();
        uu.setLocationRelativeTo(null);
        uu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        refresh();
    }//GEN-LAST:event_jButtonUpdate1ActionPerformed

    private void jButtonDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelete1ActionPerformed
        // TODO add your handling code here:
        int baristerpilih = jTableUwU.getSelectedRow();
        int id_user = (int) model.getValueAt(baristerpilih, 0);
        if(this.id_user==id_user){
            JOptionPane.showMessageDialog(this,"Tidak Bisa Menghapus Akun Yang sedang Login");
            return;
        }
        //konfirmasi hapus
        int confirm = javax.swing.JOptionPane.showConfirmDialog(null, "Yakin mau dihapus?", "Konfirmasi", javax.swing.JOptionPane.YES_NO_OPTION);
        if(confirm == javax.swing.JOptionPane.YES_OPTION){
            String sql = "delete from user where id_user = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id_user);
                ps.executeUpdate();
                ps.close();
                refresh();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Data gagal dihapus/terdapat data yang terkait");
            }
        }
    }//GEN-LAST:event_jButtonDelete1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCari1;
    private javax.swing.JButton jButtonDelete1;
    private javax.swing.JButton jButtonUpdate1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUwU;
    private javax.swing.JTextField jTextFieldCari1;
    // End of variables declaration//GEN-END:variables
}
class users{
    private int id_user;
    private String username;
    private String password;
    private String nama;
    private String role;

    public users(int id_user, String username, String password, String nama, String role) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.role = role;
    }

    public int getId_user() {
        return this.id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    

}
