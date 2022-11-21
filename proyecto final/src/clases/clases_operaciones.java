/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import formularios.form_agendamiento;

/**
 *
 * @author Family
 */
import formularios.*;


public class clases_operaciones {
form_opciones form_opciones =new form_opciones() ; 
form_agregar_eliminar_modificar form_agregar_eliminar_modificar =new form_agregar_eliminar_modificar();
form_agendamiento form_agendamiento =new form_agendamiento();
String tipo_menu = "";

    public String getTipo_menu() {
        return tipo_menu;
    }

    public void setTipo_menu(String tipo_menu) {
        this.tipo_menu = tipo_menu;
    }

 public void llenado_form_opciones(){
 form_opciones.setTipo_menu(tipo_menu);
 if (tipo_menu.equals("agendamientos")){
    form_opciones.jLabel1.setText("Agendamientos");
    form_opciones.jButton1.setText("Agregar");
     form_opciones.jButton2.setText("Eliminar");
     form_opciones.jButton3.setText("Modificar");

    form_opciones.setVisible(true);

 }
 
 if(tipo_menu.equals("horarios")){
   form_opciones.jLabel1.setText("Horarios");
    form_opciones.jButton1.setText("Agregar");
     form_opciones.jButton2.setText("Eliminar");
     form_opciones.jButton3.setText("Modificar");
    form_opciones.setVisible(true);      
 }   
  if(tipo_menu.equals("permisos")){
   form_opciones.jLabel1.setText("Permisos");
form_opciones.jButton1.setText("Agregar");
     form_opciones.jButton2.setText("Eliminar");
     form_opciones.jButton3.setText("Modificar");
 form_opciones.setVisible(true);          
         
         }
 if(tipo_menu.equals("personal")){
   form_opciones.jLabel1.setText("Personal");
form_opciones.jButton1.setText("Agregar");
     form_opciones.jButton2.setText("Eliminar");
     form_opciones.jButton3.setText("Modificar");
 form_opciones.setVisible(true);          
         
         }
 }
 
 
 public void abrir_agregar_agendamiento(){
        
     if(tipo_menu.equals("agendamientos")){
     form_agendamiento.setTipo_accion("agrergar");
     form_agendamiento.setVisible(true);
     } 
     if(tipo_menu.equals("permisos")){
        form_agregar_eliminar_modificar.setVisible(true);
     } 
     if(tipo_menu.equals("horarios")){        
     form_agregar_eliminar_modificar.setVisible(true);
     } 
     if(tipo_menu.equals("personal")){         
     form_agregar_eliminar_modificar.setVisible(true);
     }
    }
     public void abrir_eliminar(){
     if(tipo_menu.equals("agendamientos")){
     form_agendamiento.setVisible(true);
     } if(tipo_menu.equals("permisos")){
     form_agregar_eliminar_modificar.setVisible(true);
     } if(tipo_menu.equals("horarios")){
     form_agregar_eliminar_modificar.setVisible(true);
     } if(tipo_menu.equals("personal")){
     form_agregar_eliminar_modificar.setVisible(true);
     } 
     }
     public void abrir_modificar(){
     if(tipo_menu.equals("agendamientos")){
     form_agendamiento.setVisible(true);
     } if(tipo_menu.equals("permisos")){
     form_agregar_eliminar_modificar.setVisible(true);
     } if(tipo_menu.equals("horarios")){
     form_agregar_eliminar_modificar.setVisible(true);
     } if(tipo_menu.equals("personal")){
     form_agregar_eliminar_modificar.setVisible(true);
     }   
    }
     
 
 }
    

