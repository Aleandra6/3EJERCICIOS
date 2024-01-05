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
public class VISITANTE extends PERSONA{
    public String NCARNET;
    
    public VISITANTE (){
        super();
        this.NCARNET ("");
        
        
    }
    public VISITANTE (String nombre, String edad, String NCARNET){
        super(nombre, edad);
        this.NCARNET=NCARNET;
    }
    
    public void COMPRAR (){
        JOptionPane.showMessageDialog(null, "comprando");
    }

    private void NCARNET(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
