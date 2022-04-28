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
public class empleado {
    private int ID;
    private String nombre, apellido, anoNacimiento, anoIngreso;

    public empleado(int ID, String nombre, String apellido, String anoNacimiento, String anoIngreso) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anoNacimiento = anoNacimiento;
        this.anoIngreso = anoIngreso;
    }

    public empleado() {
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(String anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public String getAnoIngreso() {
        return anoIngreso;
    }

    public void setAnoIngreso(String anoIngreso) {
        this.anoIngreso = anoIngreso;
    }
    
}
