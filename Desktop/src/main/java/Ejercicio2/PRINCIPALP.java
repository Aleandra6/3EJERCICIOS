/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Aleja
 */
public class PRINCIPALP {
    public static void main(String[] args){
        PASAJERO cliente = new PASAJERO ();
        System.out.println("Nombre del pasajero:"+ cliente.nombre);
        System.out.println("Edad del pasajero:"+ cliente.edad);
        System.out.println("Cedula del pasajero:"+ cliente.getCedula());
        
        CHOFER taxista = new CHOFER ();
        System.out.println("Nombre del chofer:"+ taxista.nombre);
        System.out.println("Edad del chofer:"+ taxista.edad);
        System.out.println("Cedula del chofer:"+ taxista.getCedula());

    } 
}
    

