/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newspaper.agency.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Anant
 */
public class Connects {
    
     java.sql.Connection conn=null;
 public static java.sql.Connection Connectnams()
 {
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         
        java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/nams","root","sanket");
       // JOptionPane.showMessageDialog(null,"connected to database");
        return conn;
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null,e);
         return null;
     }
 }
}
