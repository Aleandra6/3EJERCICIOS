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
abstract public class ZOO {
    public String nombre;
    public String edad;
    private String Nregistro;
    
    public ZOO(){}
    
    public ZOO(String nombre, String edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public String getNregistro(){
        return Nregistro;
       
    }
    public void setNregistro(String Nregistro){
        this.Nregistro=Nregistro;
        
    }
    public void comer(){
        JOptionPane.showMessageDialog(null, "comiendo");
    }
    public void dormir(){
        JOptionPane.showMessageDialog(null, "durmiendo");
    }
    
}
