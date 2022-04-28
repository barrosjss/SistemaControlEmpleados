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
public class eComision extends empleado {
    private int salarioMin;
    private int numClientes;
    private int montoClientes;

    public eComision(int salarioMin, int numClientes, int montoClientes, int ID, String nombre, String apellido, String anoNacimiento, String anoIngreso) {
        super(ID, nombre, apellido, anoNacimiento, anoIngreso);
        this.salarioMin = salarioMin;
        this.numClientes = numClientes;
        this.montoClientes = montoClientes;
    }

    public int getSalarioMin() {
        return salarioMin;
    }

    public void setSalarioMin(int salarioMin) {
        this.salarioMin = salarioMin;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    public int getMontoClientes() {
        return montoClientes;
    }

    public void setMontoClientes(int montoClientes) {
        this.montoClientes = montoClientes;
    }
    
    
}
