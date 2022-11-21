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
    private static Connection con=null;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String usuario = "root";
    private static final String contrasena = "faxo2401";
    private static final String url = "jdbc:mysql://localhost/consulta_medica";

    public clase_conexion() {
       
    }
    
    
    
    
    public static Connection conectar() {
        con = null;

        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, usuario, contrasena);
            //JOptionPane.showMessageDialog(null, "conectado");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    public static void cerrar() throws SQLException{
    if (con !=null){
    con.close();
    }
    }
}
