/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Aleja
 */
public class PRINCIPALA {

    public static void main(String[] args){
        GATO gato = new GATO ();
        System.out.println("Nombre del gato:"+ gato.nombre);
        System.out.println("Edad del gato:"+ gato.getedad());
        System.out.println("Nombre del gato:"+ gato.ColorDePelo);
        
        PERRO perro = new PERRO ();
        System.out.println("Nombre del chofer:"+ perro.nombre);
        System.out.println("Edad del chofer:"+ perro.Raza);
        System.out.println("Cedula del chofer:"+ perro.getedad());

    } 
}
        

