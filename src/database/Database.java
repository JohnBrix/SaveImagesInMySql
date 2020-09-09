/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Database {
     java.sql.Connection con = null;
    public static java.sql.Connection getConnection(){
       
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
           
            java.sql.Connection  con = DriverManager.getConnection("jdbc:mysql://localhost/myimg", "root", "");
            
            return con;
           
            
        }catch(Exception e) {
            
           JOptionPane.showMessageDialog(null, "Not Connected!");
            return null;
        }
}
}
