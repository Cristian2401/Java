/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Family
 */
public class clase_consultas {
    clase_conexion cc;
    clase_horario ch;
    clase_personal cp;
    clase_agendamiento ca;
        String ulid="";
        Connection c;
        String rst_r="";
        /*String rut_participante="";
        String Rut_perso="";
        String id_fecha="";
        
        String nombre_perso="";
        
        String fecha="";
        

    public String getRut_participante() {
        return rut_participante;
    }

    public void setRut_participante(String rut) {
        this.rut_participante = rut;
    }

    public String getRut_perso() {
        return Rut_perso;
    }

    public void setRut_perso(String Rut_perso) {
        this.Rut_perso = Rut_perso;
    }

    public String getId_fecha() {
        return id_fecha;
    }

    public void setId_fecha(String id_fecha) {
        this.id_fecha = id_fecha;
    }

    public String getNombre_perso() {
        return nombre_perso;
    }

    public void setNombre_perso(String nombre_perso) {
        this.nombre_perso = nombre_perso;
    }

   

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    */
     public String getRst_r() {
        return rst_r;
    }

    public void setRst_r(String rst_r) {
        this.rst_r = rst_r;
    }
    public void grabar_agendamiento() throws SQLException{
    
         try {
             c= cc.conectar();
            PreparedStatement ps= c.prepareStatement("INSERT INTO agendamientos (agend_rut_participante, agend_fecha) VALUES ('"+ca.getRut_participante()+"','"+ca.getAgend_id()+"')");
             
             ps.executeUpdate();
             
              c.close();
              
              JOptionPane.showMessageDialog(null, "Agenda Agregada");
        } catch (SQLException e) {
            System.out.println(e);
        }
    
    
    }
    
    public void ultimo_agendamiento() throws SQLException{
        try{ 
            c= cc.conectar();
            Statement st= c.createStatement();
            ResultSet rst= st.executeQuery("SELECT *  FROM  agendamientos ORDER BY  agend_id DESC LIMIT 1");
            while (rst.next()) {                
                this.ulid=rst.getString("agend_id");
            
            }
            c.close();
     } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void grabar_agendamiento_perso() throws SQLException{
    
        try{
            c= cc.conectar();
            PreparedStatement ps= c.prepareStatement("INSERT INTO personal_agendamientos (perso_id, agend_id) VALUES ('"+ch.getId()+"','"+ulid+"')");
            ps.executeUpdate();
            c.close();
             } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void grabar_agendamiento_horar() throws SQLException{
    try{
        c= cc.conectar();
        PreparedStatement ps= c.prepareStatement("INSERT INTO horarios_agendamientos (id, agend_id) VALUES ('"+ch.getId()+"','"+ulid+"')");
            ps.executeUpdate();
            c.close();
     } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void buscar_agenda(){
    
    try{ 
            c= cc.conectar();
            Statement st= c.createStatement();
            //System.out.println(rut_participante);
            ResultSet rst= st.executeQuery("SELECT a.agend_fecha, o.horar_hora "
                    + "FROM  agendamientos a, horarios_agendamientos h, personal_agendamientos p, horarios o, personal pe "
                    + "WHERE a.agend_rut_participante='"+ca.getRut_participante()+"' AND h.agend_id=a.agend_id AND p.agend_id=a.agend_id AND o.id=h.id AND pe.perso_id=p.perso_id");
            
            while (rst.next()) {                
                ca.setAgend_fecha(rst.getString("agend_fecha"));
                //System.out.println(id_fecha);
                ch.setHorar_hora(rst.getString("horar_hora"));
                
                //this.nombre_perso=rst.getString("perso_nombre");
                //System.out.println(nombre_perso);
                this.rst_r="si";
            }
            c.close();
     } catch (SQLException e) {
            System.out.println(e);
        }
    
    }
    public void actualizar_agendamiento() throws SQLException{
    try{
        c= cc.conectar();
        //System.out.println(this.id_fecha);
        //System.out.println(ch.getId());
        //System.out.println(this.Rut_perso);
        //System.out.println(this.rut_participante);
        
        PreparedStatement ps= c.prepareStatement("UPDATE agendamientos a, horarios_agendamientos h, personal_agendamientos p "
                + "SET a.agend_fecha='"+ca.getAgend_fecha()+"', h.id='"+ch.getId()+"', p.perso_id='"+cp.getPerso_id()+"' "
                + "WHERE a.agend_rut_participante='"+ca.getRut_participante()+"' AND h.agend_id=a.agend_id AND p.agend_id=a.agend_id");
            ps.executeUpdate();
            c.close();
     } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public void eliminar_agendamiento() throws SQLException{
    try{
        c= cc.conectar();
        //System.out.println(this.id_fecha);
        //System.out.println(ch.getId());
        //System.out.println(this.Rut_perso);
        //System.out.println(this.rut_participante);
        
        PreparedStatement ps= c.prepareStatement("DELETE a, h, p FROM agendamientos a, horarios_agendamientos  h, personal_agendamientos  p "
                + "WHERE a.agend_rut_participante='"+ca.getRut_participante()+"' AND h.agend_id=a.agend_id AND p.agend_id=a.agend_id");
            ps.executeUpdate();
            c.close();
     } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
