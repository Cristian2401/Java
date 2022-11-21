/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Family
 */
public class clase_horario {
    String id;
    String horar_hora;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHorar_hora() {
        return horar_hora;
    }

    public void setHorar_hora(String horar_hora) {
        this.horar_hora = horar_hora;
    }

    @Override
    public String toString() {
        return horar_hora;
    }

    public clase_horario(String id, String horar_hora) {
        this.id = id;
        this.horar_hora = horar_hora;
    }
    
}
