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
public class PINGUINO extends ZOO {
    

    public PINGUINO(){
        super();
        
    }
    public PINGUINO(String nombre, String edad){
        super(nombre, edad);
        
        
        
    }
     public void nadar(){
        JOptionPane.showMessageDialog(null, "nadando");
     }
     public void pezcar(){
         JOptionPane.showMessageDialog(null, "pezcando");
     }
}

   

    

 

