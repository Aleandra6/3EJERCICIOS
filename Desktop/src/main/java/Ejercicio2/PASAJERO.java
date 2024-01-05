/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Aleja
 */
  import java.util.Scanner;

public class PASAJERO extends PERSONA {
  


    public int id;    
    public PASAJERO(){
        super();
        this.id = ingresarId();
    }
    public int ingresarId(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID del pasajero");
        return scanner.nextInt();
    }
    public void pedirTaxi(){
        System.out.println( "esta pidiendo un taxi");
    }
    public void cancelarTaxi(){
        System.out.println( "cancelo el taxi");
    }
    @Override
    public void mostrarInformacion(){
    }    
} 

