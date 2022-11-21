
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Family
 */
public class consultas {

    private String id_consulta;
    private String rut_paciente;
    private String nombre_paciente;
    private String ape_paterno_paciente;
    private String ape_materno_paciente;
    private String fec_naciemiento_paciente;
    private String rut_profesional;
    private String nombre_profesional;
    private String ape_paterno_profesional;
    private String ape_materno_profesional;
    private String hora_cita;
    private String fecha_cita;
    private String direccion_participante;
    private String fono_paciente;
    private String fono2_paciente;
    private String tipo_hora_nombre;
    private String tipo_hora_id;
    private String hor_hora;
    private String hor_id;
    private Integer validador;
    //private Integer validador2;
    //private String contrasena;
    static PreparedStatement ps=null;
    static ResultSet rs=null;
    static Statement st=null;
    Connection con = null;
    clase_conexion cc = new clase_conexion();
    
    
    public consultas(String nombre, String id) {
        //if(this.validador2==1){
        this.rut_profesional=id;
        this.nombre_profesional=nombre;
        //}else if(this.validador2==2){
        this.tipo_hora_id=id;
        this.tipo_hora_nombre=nombre;
        this.hor_hora=nombre;
        this.hor_id=id;
       
        
       // }

    }
   
    
    public consultas() {

    }

    public String getId_consulta() {
        return id_consulta;
    }

    public String getRut_paciente() {
        return rut_paciente;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public String getApe_paterno_paciente() {
        return ape_paterno_paciente;
    }

    public String getApe_materno_paciente() {
        return ape_materno_paciente;
    }

    public String getFec_naciemiento_paciente() {
        return fec_naciemiento_paciente;
    }

    public String getRut_profesional() {
        return rut_profesional;
    }

    public String getNombre_profesional() {
        return nombre_profesional;
    }

    public String getApe_paterno_profesional() {
        return ape_paterno_profesional;
    }

    public String getApe_materno_profesional() {
        return ape_materno_profesional;
    }

    public String getHora_cita() {
        return hora_cita;
    }

    public String getFecha_cita() {
        return fecha_cita;
    }

    public Integer getValidador() {
        return validador;
    }

    public String getDireccion_participante() {
        return direccion_participante;
    }

    public String getTipo_hora_nombre() {
        return tipo_hora_nombre;
    }

    public String getHor_hora() {
        return hor_hora;
    }

    public void setHor_hora(String hor_hora) {
        this.hor_hora = hor_hora;
    }

    public String getHor_id() {
        return hor_id;
    }

    public void setHor_id(String hor_id) {
        this.hor_id = hor_id;
    }

    public void setTipo_hora_nombre(String tipo_hora_nombre) {
        this.tipo_hora_nombre = tipo_hora_nombre;
    }

    public String getTipo_hora_id() {
        return tipo_hora_id;
    }

    public void setTipo_hora_id(String tipo_hora_id) {
        this.tipo_hora_id = tipo_hora_id;
    }

    public void setDireccion_participante(String direccion_participante) {
        this.direccion_participante = direccion_participante;
    }

    public String getFono_paciente() {
        return fono_paciente;
    }

    public void setFono_paciente(String fono_paciente) {
        this.fono_paciente = fono_paciente;
    }

    public String getFono2_paciente() {
        return fono2_paciente;
    }

    public void setFono2_paciente(String fono2_paciente) {
        this.fono2_paciente = fono2_paciente;
    }
    

    public void setId_consulta(String id_consulta) {
        this.id_consulta = id_consulta;
    }

    public void setRut_paciente(String rut_paciente) {
        this.rut_paciente = rut_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public void setApe_paterno_paciente(String ape_paterno_paciente) {
        this.ape_paterno_paciente = ape_paterno_paciente;
    }

    public void setApe_materno_paciente(String ape_materno_paciente) {
        this.ape_materno_paciente = ape_materno_paciente;
    }

    public void setFec_naciemiento_paciente(String fec_naciemiento_paciente) {
        this.fec_naciemiento_paciente = fec_naciemiento_paciente;
    }

    public void setRut_profesional(String rut_profesional) {
        this.rut_profesional = rut_profesional;
    }

    public void setNombre_profesional(String nombre_profesional) {
        this.nombre_profesional = nombre_profesional;
    }

    public void setApe_paterno_profesional(String ape_paterno_profesional) {
        this.ape_paterno_profesional = ape_paterno_profesional;
    }

    public void setApe_materno_profesional(String ape_materno_profesional) {
        this.ape_materno_profesional = ape_materno_profesional;
    }

    public void setHora_cita(String hora_cita) {
        this.hora_cita = hora_cita;
    }

    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public void setValidador(Integer validador) {
        this.validador = validador;
    }
    
    
    public void limpiar(){
    id_consulta=null;
    rut_paciente=null;
    nombre_paciente=null;
    ape_paterno_paciente=null;
    ape_materno_paciente=null;
    fec_naciemiento_paciente=null;
    rut_profesional=null;
    nombre_profesional=null;
    ape_paterno_profesional=null;
    ape_materno_profesional=null;
    hora_cita=null;
    fecha_cita=null;
    validador=null;
    ps=null;
    rs=null;
    st=null;
    
    
    }

    public Connection ver_cita() {
        limpiar();
        try {
            con = cc.conectar();

            ps = con.prepareStatement("SELECT c.cit_id, c.cit_pac_rut, pa.pac_nombre, pa.pac_ape_paterno,"
                    + " pa.pac_ape_materno, pa.pac_fec_nacimiento, c.cit_pro_rut, pr.pro_nombre, pr.pro_ape_paterno, pr.pro_ape_materno,"
                    + "c.cit_fecha, c.cit_hora \n"
                    + "FROM citaciones as c, pacientes as pa, profesionales as pr\n"
                    + "WHERE c.cit_id = '1' AND c.cit_pac_rut=pa.pac_rut AND c.cit_pro_rut=pr.pro_rut");
            rs = ps.executeQuery();

            if (rs.next()) {
                id_consulta = rs.getString("c.cit_id");
                rut_paciente = rs.getString("c.cit_pac_rut");
                nombre_paciente = rs.getString("pa.pac_nombre");
                ape_paterno_paciente = rs.getString("pa.pac_ape_paterno");
                ape_materno_paciente = rs.getString("pa.pac_ape_materno");
                fec_naciemiento_paciente = rs.getString("pa.pac_fec_nacimiento");
                rut_profesional = rs.getString("c.cit_pro_rut");
                nombre_profesional = rs.getString("pr.pro_nombre");
                ape_paterno_profesional = rs.getString("pr.pro_ape_paterno");
                ape_materno_profesional = rs.getString("pr.pro_ape_materno");
                hora_cita = rs.getString("c.cit_fecha");
                fecha_cita = rs.getString("c.cit_hora");

            } else {

                JOptionPane.showMessageDialog(null, rs.getString("sin respuesta"));
            }

            cc.cerrar();

        } catch (SQLException e) {

            System.out.println(e);
        }
        return con;
    }

     public Connection buscar_paciente(String rut_paciente) {
         limpiar();
        try {
            con = cc.conectar();

            ps = con.prepareStatement("SELECT pac_nombre, pac_ape_paterno, pac_ape_materno, "
                    + "pac_fec_nacimiento, pac_direccion, pac_fono, pac_fono2 "
                    + "FROM pacientes "
                    + "WHERE pac_rut = '" + rut_paciente + "'");
            rs = ps.executeQuery();

            if (rs.next()) {
                this.validador = 1;
                this.nombre_paciente = rs.getString("pac_nombre");
                this.ape_paterno_paciente = rs.getString("pac_ape_paterno");
                this.ape_materno_paciente = rs.getString("pac_ape_materno");
                this.direccion_participante = rs.getString("pac_direccion");
                this.fec_naciemiento_paciente = rs.getString("pac_fec_nacimiento");
                this.fono_paciente = rs.getString("pac_fono");
                this.fono2_paciente = rs.getString("pac_fono2");
               
            } else {
                this.validador =2;
                
            }

            cc.cerrar();

        } catch (SQLException e) {

            System.out.println(e);
        }
        return con;
    }
   
          public DefaultComboBoxModel obtener_horarios(){
     
     DefaultComboBoxModel lista_pro=new DefaultComboBoxModel();
     lista_pro.addElement("Seleccione");
     con = cc.conectar();
         try {
              ps = con.prepareStatement("Select hor_hora from horarios");
            rs = ps.executeQuery(); 
             while (rs.next()) {                 
                 lista_pro.addElement(rs.getString("hor_hora"));
             }
             con.close();
            rs.close();
         } catch (SQLException e) {
             System.out.println(e.getMessage());
         }
        return lista_pro;
             
     }

   
      public Connection guardar_paciente(String rut_paciente,
              String nombre, String ape_paterno, String ape_materno,
              String direccion, String fec_nacimiento, String fono, String fono2) {
        try {
            con = cc.conectar();
            st= con.createStatement();
            st.executeUpdate("INSERT INTO `pacientes` "
                    + "(`pac_rut`, `pac_nombre`, `pac_ape_paterno`, `pac_ape_materno`, "
                    + "`pac_fec_nacimiento`, `pac_fono`, `pac_fono2`, `pac_direccion`) "
                    + "VALUES ('"+rut_paciente+"', '"+nombre+"', '"+ape_paterno+"', '"+ape_materno+"', "
                    + "'"+fec_nacimiento+"', '"+fono+"', '"+fono2+"', '"+direccion+"');");
            JOptionPane.showMessageDialog(null, "Paciente Agregado","Guardado",
                    JOptionPane.INFORMATION_MESSAGE);
            cc.cerrar();

        } catch (SQLException e) {

            System.out.println(e);
        }
        return con;
    }
      
      public Connection guardar_cita(String cit_pac_rut,
              String cit_pro_rut, String cit_hor_id, String cit_fecha,
              String cit_tip_id) {
        try {
            con = cc.conectar();
            st= con.createStatement();
            st.executeUpdate("INSERT INTO `citaciones` "
                    + "(`cit_pac_rut`, `cit_pro_rut`, `cit_hor_id`, `cit_fecha`,`cit_procedimientos`, `cit_medicamentos`) "
                    + "VALUES ('"+cit_pac_rut+"', '"+cit_pro_rut+"', '"+cit_hor_id+"', '"+cit_fecha+"', '', '')");
            
            JOptionPane.showMessageDialog(null, "Cita Agendada");
            cc.cerrar();

        } catch (SQLException e) {

            System.out.println(e);
        }
        return con;
    }
     
    public Connection login(String usuario, String contrasena) {
        limpiar();
        try {
            con = cc.conectar();

            ps = con.prepareStatement("SELECT l.log_usuario, l.log_contrasena, p.pro_nombre, p.pro_ape_paterno, p.pro_ape_materno "
                    + "FROM login as l, profesionales as p "
                    + "WHERE l.log_usuario ='" + usuario + "' and l.log_contrasena='" + contrasena + "' and l.log_pro_rut=p.pro_rut");
            rs = ps.executeQuery();

            if (rs.next()) {
                validador = 1;
                this.nombre_profesional = rs.getString("p.pro_nombre");
                this.ape_paterno_profesional = rs.getString("p.pro_ape_paterno");
                this.ape_materno_profesional = rs.getString("p.pro_ape_materno");
                
                
            }

            cc.cerrar();

        } catch (SQLException e) {

            System.out.println(e);
        }
        return con;
    }

    public ResultSet buscar_cita(String buscador) {
        limpiar();
        try {
            
            con = cc.conectar();
            st= con.createStatement();
            rs = st.executeQuery("SELECT * "
                    + "FROM citaciones "
                    + "WHERE cit_pac_rut='"+buscador+"'");
            
           
        } catch (SQLException e) {

            System.out.println(e);
        }
        
        return rs;
    }
    public void obtener_profesionales(JComboBox<consultas> comboprofesionales){
     con = cc.conectar();
         try {
            
              ps = con.prepareStatement("Select pro_nombre, pro_rut from profesionales");
            rs = ps.executeQuery(); 
             while (rs.next()) {                 
                comboprofesionales.addItem(
                        new consultas(
                                rs.getString("pro_nombre"),
                                rs.getString("pro_rut")
                                
                        )
                );
             }
             con.close();
            rs.close();
         } catch (SQLException e) {
             System.out.println(e.getMessage());
         }
       
             
     }
    
     public void obtener_tipo_hora(JComboBox<consultas> combotipohora){
     con = cc.conectar();
         try {
             
              ps = con.prepareStatement("Select tip_cit_nombre, tip_cit_id from tipo_citacion");
            rs = ps.executeQuery(); 
             while (rs.next()) {                 
                combotipohora.addItem(
                        new consultas(
                                
                                rs.getString("tip_cit_nombre"),
                                rs.getString("tip_cit_id")
                        )
                );
             }
             con.close();
            rs.close();
         } catch (SQLException e) {
             System.out.println(e.getMessage());
         }
       
             
     }
    
     public void obtener_horadisponible(JComboBox<consultas> combohoradisponible){
    System.out.println(this.fecha_cita);
    
     con = cc.conectar();
         try {
             
              ps = con.prepareStatement("SELECT horarios.hor_hora, horarios.hor_id " +
                                        "FROM horarios " +
                                        "WHERE horarios.hor_id " +
                                        "NOT IN (" +
                                        "SELECT citaciones.cit_hor_id " +
                                        "FROM citaciones, horarios " +
                                        "WHERE citaciones.cit_fecha='"+this.fecha_cita+"' "+
                                        "AND citaciones.cit_pro_rut='"+this.rut_profesional+"' "+
                                        "AND horarios.hor_tip_cit_id='"+this.tipo_hora_id+"' "+
                                        "AND horarios.hor_id=citaciones.cit_hor_id) " +
                                        "AND horarios.hor_tip_cit_id='"+this.tipo_hora_id+"'");
            rs = ps.executeQuery(); 
             while (rs.next()) {                 
                combohoradisponible.addItem(
                       new consultas(
                                
                                rs.getString("hor_hora"),
                                rs.getString("hor_id")
                        )
                );
             }
             con.close();
            rs.close();
         } catch (SQLException e) {
             System.out.println(e.getMessage());
         }
       
             
     }
     
    
    @Override
    public String toString(){
    return tipo_hora_nombre;    
    }
    
    public String toStringhora(){
        
    return tipo_hora_nombre;
    
    }
}
