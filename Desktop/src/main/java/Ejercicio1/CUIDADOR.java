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
public class CUIDADOR extends PERSONA {
    public String ID;
    
    public CUIDADOR(){
        super();
        this.ID("");
        
        
    }
    public CUIDADOR (String nombre, String edad, String ID){
        super(nombre, edad);
        this.ID=ID;
        
    }
    public void ALIMENTARANIMALES(){
        JOptionPane.showMessageDialog(null, "alimentado animalitos");
    }

    private void ID(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
