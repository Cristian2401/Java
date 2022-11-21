/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.*;
import java.util.ArrayList;

public class clase_conexion {
    Connection con=null;  
    private static  String driver="com.mysql.jdbc.Driver";
    private static  String user="root";
    private static  String contraseña="2401";
    private static  String url="jdbc:mysql://127.0.0.1/mauco_bd";


public clase_conexion() {
    
    System.out.println("pase por aqui u.u");
    
    }
    
  

    public Connection conectar() {
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(this.url,this.user,this.contraseña);
            if(con!=null){
            System.out.println("Conexion establecida..");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error connectar "+ e);
        }
       return con; 
    }
    
    public void desconectar(){
    con =null;
    if(con== null){
    System.out.println("Conexion terminada...");
            
    }
    }
    
   

    
}
