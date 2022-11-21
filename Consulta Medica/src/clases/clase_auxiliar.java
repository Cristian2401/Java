/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Cristian
 */

public class clase_auxiliar {
    String rut;

    public clase_auxiliar(String rut) {
        this.rut = rut;
    }

    public clase_auxiliar() {
       
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    public boolean validacionRut(){
        Boolean lDevuelve = false;
        try {
         int Ult= this.rut.length();
         int Largo = this.rut.length() -3;
         int Constante = 2;
         int Suma = 0;
         int Digito = 0;
        
            
        
        for (int i= Largo; i >=0; i--){
             
             Suma= Suma + Integer.parseInt(this.rut.substring(i,i+1)) * Constante;
             Constante = Constante + 1 ;
             if (Constante == 8){
                 Constante =2; }
             }
        
         String Ultimo = this.rut.substring(Ult-1).toUpperCase();
         Digito =11 - (Suma % 11);
         if (Digito==10 && Ultimo.equals("K")){
             lDevuelve=true;
         }else{ 
            if(Digito == 11 && Ultimo.equals("0")){
               lDevuelve=true;    
            }else{    
               if (Digito == Integer.parseInt(Ultimo)){
                   lDevuelve=true;
                }
            }
         }
        } catch (NumberFormatException e) {
            
        }
         
 return lDevuelve;
    }
    
    public void limpiar_texto(JPanel panel){
        for(int i = 0; panel.getComponents().length > i; i++){
            if(panel.getComponents()[i] instanceof JTextField){
                ((JTextField)panel.getComponents()[i]).setText("");
            }
            else if(panel.getComponents()[i] instanceof JPasswordField){
                ((JPasswordField)panel.getComponents()[i]).setText("");
            }
        }
    }
    
    public void bloquear_text(JPanel panel){
        for(int i = 0; panel.getComponents().length > i; i++){
            if(panel.getComponents()[i] instanceof JTextField){
                ((JTextField)panel.getComponents()[i]).setEditable(false);
            }
            else if(panel.getComponents()[i] instanceof JPasswordField){
                ((JPasswordField)panel.getComponents()[i]).setEditable(false);
            }
        }
    }
     public void desbloquear_text(JPanel panel){
        for(int i = 0; panel.getComponents().length > i; i++){
            if(panel.getComponents()[i] instanceof JTextField){
                ((JTextField)panel.getComponents()[i]).setEditable(true);
            }
            else if(panel.getComponents()[i] instanceof JPasswordField){
                ((JPasswordField)panel.getComponents()[i]).setEditable(true);
            }
        }
    }
    
}

            
    