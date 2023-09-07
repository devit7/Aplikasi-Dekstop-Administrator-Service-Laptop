/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testing_uas;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author FA506
 */
public class Database {

    public static Connection getConnection(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo_uas", "root", "");
            System.out.println("Connected");
            return con;
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return null;
    }
    
}
