/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import java.sql.*;
import javax.swing.JOptionPane;





/**
 *
 * @author Family
 */
public class clase_conexion {
    public String url="jdbc:mysql://localhost/mauco_bd";
    public String user="root";
    public String pass="2401";
    
    public clase_conexion(){
    
    
    }
    
    public Connection conectar(){
    
    Connection link=null;
    
        try {
            //cargamos el driver Mysql
            Class.forName("com.mysql.jdbc.Driver");
            //creaos un enlace hacia la base de datos
            link=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    return link;
    }
    
    
    
    
    
}
