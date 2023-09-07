/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.testing_uas;
import com.formdev.flatlaf.FlatLightLaf;

import java.sql.Connection;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.crypto.Data;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author FA506
 */
public class UserPage extends javax.swing.JFrame {

    /**
     * Creates new form UserPage
     */
    public UserPage() {
        initComponents();
        setLocationRelativeTo(null);
        LoadKolom();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCari = new javax.swing.JTextField();
        jButtonCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKe1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableKe3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCari.setText("Cari");
        jButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariActionPerformed(evt);
            }
        });

        jTableKe1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No Order", "Nama Pemilik", "Tgl Masuk", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTableKe1);

        jTableKe3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Keluhan"
            }
        ));
        jScrollPane3.setViewportView(jTableKe3);

        jLabel1.setFont(new java.awt.Font("Alata", 3, 48)); // NOI18N
        jLabel1.setText("SEARCH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCari)
                .addGap(274, 274, 274))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCari))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DefaultTableModel model1 = new DefaultTableModel();
    DefaultTableModel model3 = new DefaultTableModel();
    private Connection con = Database.getConnection();
    private ArrayList<tablepertama> list1 = new ArrayList<>();
    private ArrayList<Tableketiga> list3 = new ArrayList<>();

    private void cellListener(){
        jTableKe1.setModel(model1);

        jTableKe1.getSelectionModel().addListSelectionListener(e -> {
            boolean isAdjusting = jTableKe1.getSelectedRow() != -1;

        });
    }

    private void LoadKolom(){
        model1.addColumn("No Order");
        model1.addColumn("Nama Pemilik");
        model1.addColumn("Tgl Masuk");
        model1.addColumn("Status");
        model1.addColumn("Nama Laptop");
        model1.addColumn("No Serial");
        jTableKe1.setModel(model1);
        model3.addColumn("Keluhan");
        jTableKe3.setModel(model3);

    }
    private void LoadTable1(){
        if(con !=null){
            System.out.println("Koneksi Berhasil 1");
            list1=new ArrayList<>();
            String sql="SELECT db.id_detail_barang,db.nomor_barang , c.nama, db.tgl_masuk, db.status , db.merk_laptop, db.serial_number  FROM detail_barang db JOIN customer c ON db.id_customer = c.id_customer WHERE db.nomor_barang = ?";
            try {
                PreparedStatement state=con.prepareStatement(sql);
                state.setString(1, jTextFieldCari.getText());
                ResultSet rs=state.executeQuery();
                //mengambil data hasil eksekusi query

                while(rs.next()){
                    this.id_detail_barang = rs.getInt(1);
                    String nomor_barang = rs.getString(2);
                    String nama = rs.getString(3);
                    String tgl_masuk = rs.getString(4);
                    String status = rs.getString(5);
                    String merk_laptop = rs.getString(6);
                    String serial_number = rs.getString(7);
                    tablepertama tp = new tablepertama(nomor_barang,nama,tgl_masuk,status,merk_laptop,serial_number);
                    list1.add(tp);     
                }
                state.close();
                rs.close();
                
            } catch (Exception e) {
                System.out.println("Error "+e.getMessage());
            }
        }
    }
    private int id_detail_barang;
    private void LoadTable3(){
        if(con !=null){
            System.out.println("Koneksi Berhasil 3");
            list3=new ArrayList<>();
            String sql="SELECT os.service_tambahan\n" + //
                    "FROM data_service AS os WHERE os.id_detail_barang = ?";
            try {
                PreparedStatement state=con.prepareStatement(sql);
                state.setInt(1, this.id_detail_barang);
                System.out.println("ps jalan, id_detail_barang : "+this.id_detail_barang);
                ResultSet rs=state.executeQuery();
                //mengambil data hasil eksekusi query
                while(rs.next()){
                    Tableketiga tk = new Tableketiga(
                            rs.getString(1)
                    );
                    list3.add(tk);
                }
                
            } catch (Exception e) {
                System.out.println("Error "+e.getMessage());
            }
        }
    }
    
    private void TampilTable1(){
        model1.getDataVector().removeAllElements();
        model1.fireTableDataChanged();
        try {
            for(int i=0; i<list1.size(); i++){
                Object[] obj = new Object[6];
                obj[0]=list1.get(i).getNo_order();
                obj[1]=list1.get(i).getNama_pemilik();
                obj[2]=list1.get(i).getTgl_masuk();
                obj[3]=list1.get(i).getStatus();
                obj[4]=list1.get(i).getNama_laptop();
                obj[5]=list1.get(i).getNo_serial();
                model1.addRow(obj);
            }
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        } 
    }
    private void TampilTable3(){
        model3.getDataVector().removeAllElements();
        model3.fireTableDataChanged();
        try {
            for(int i=0; i<list3.size(); i++){
                Object[] obj = new Object[1];
                obj[0]=list3.get(i).getKeluhan();
                model3.addRow(obj);
            }
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }


    private void jButtonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariActionPerformed
        // TODO add your handling code here:
        LoadTable1();
        LoadTable3();
        TampilTable1();
        TampilTable3();



    }//GEN-LAST:event_jButtonCariActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightLaf.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableKe1;
    private javax.swing.JTable jTableKe3;
    private javax.swing.JTextField jTextFieldCari;
    // End of variables declaration//GEN-END:variables
}

class tablepertama{
    private String no_order;
    private String nama_pemilik;
    private String tgl_masuk;
    private String status;
    private String nama_laptop;
    private String no_serial;

    tablepertama(String no_order, String nama_pemilik, String tgl_masuk, String status, String nama_laptop, String no_serial){
        this.no_order = String.valueOf(no_order);
        this.nama_pemilik = nama_pemilik;
        this.tgl_masuk = tgl_masuk;
        this.status = status;
        this.nama_laptop = nama_laptop;
        this.no_serial = no_serial;
    }

    public String getNo_order() {
        return this.no_order;
    }

    public void setNo_order(String no_order) {
        this.no_order = no_order;
    }

    public String getNama_pemilik() {
        return this.nama_pemilik;
    }

    public void setNama_pemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }

    public String getTgl_masuk() {
        return this.tgl_masuk;
    }

    public void setTgl_masuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNama_laptop() {
        return this.nama_laptop;
    }

    public void setNama_laptop(String nama_laptop) {
        this.nama_laptop = nama_laptop;
    }

    public String getNo_serial() {
        return this.no_serial;
    }

    public void setNo_serial(String no_serial) {
        this.no_serial = no_serial;
    }


}

class Tableketiga{
    private String keluhan;

    Tableketiga(String keluhan){
        this.keluhan = keluhan;
    }

    public String getKeluhan() {
        return this.keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
}


