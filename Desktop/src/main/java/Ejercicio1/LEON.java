/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aleja
 */
public class LEON extends ZOO {
     public String vacuna;
     
     public LEON (){
         super();
         this.vacuna("");
         
     }
     public LEON (String nombre, String edad, String vacuna){
         super(nombre,edad);
         this.vacuna=vacuna;
     }
    
     public void rugir(){
         JOptionPane.showMessageDialog(null, "rugiendo");
     }
     public void cazar(){
         JOptionPane.showMessageDialog(null, "cazando");
     }

    private void vacuna(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
