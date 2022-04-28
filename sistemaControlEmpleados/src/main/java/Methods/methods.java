/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

import Model.empleado;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jesusbarros
 */
public class methods {
    Vector vPrincipal = new Vector();
    
    protected int totalSueldo = 0;
    protected int extra = 0;
    
    public void guardar(empleado unaPersona) {
        vPrincipal.addElement(unaPersona);
    }
    
    // Almacenamos localmente la informacion
    public void guardarArchivo(empleado persona) {
        try {
            FileWriter fw = new FileWriter("Personas.text",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.print(persona.getID());
            pw.print("|"+persona.getNombre());
            pw.print("|"+persona.getApellido());
            pw.print("|"+persona.getAnoNacimiento());
            pw.println("|"+persona.getAnoIngreso());
            pw.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public DefaultTableModel listaPersonas(){
        Vector cabeceras = new Vector();
        
        cabeceras.addElement("ID");
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Apellido");
        cabeceras.addElement("Año de nacimiento");
        cabeceras.addElement("Año de ingreso");
        
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
        
        try {
            FileReader fr = new FileReader("Personas.text");
            BufferedReader br = new BufferedReader(fr);
            String d;
            
            while(null != (d=br.readLine())) {
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens()) {
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }
    
}
