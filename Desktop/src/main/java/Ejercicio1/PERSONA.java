/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aleja
 */
abstract public class PERSONA {
    public String nombre;
    public String edad;
    private String cedula;
    
    public PERSONA (){}
    
    public PERSONA (String nombre, String edad){
        this.nombre=nombre;
        this.edad=edad;
        
    }
    public String getcedula(){
        return cedula;
        
    }
    public void setcedula(String cedula){
        this.cedula=cedula;
      
    }
    public void dormir(){
        JOptionPane.showMessageDialog(null,"durmiendo");
    }
    public void comer(){
        JOptionPane.showMessageDialog(null, "comiendo");
    }
}
