/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ajani
 */
public class eAsalariado extends empleado{
   private int porcentaje; 

    public eAsalariado(int porcentaje, int ID, String nombre, String apellido, String anoNacimiento, String anoIngreso) {
        super(ID, nombre, apellido, anoNacimiento, anoIngreso);
        this.porcentaje = porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    

}
