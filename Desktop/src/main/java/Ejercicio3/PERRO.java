/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Aleja
 */
public class PERRO extends ANIMALES {
  


    public String Raza;   
    
    public PERRO(){
        super();
        this.Raza = ingresarRaza();
    }
    public String ingresarRaza(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la raza del perro");
        return scanner.next ();
    }
    public void Correr(){
        System.out.println( "esta corriendo");
    }
    public void Jugar(){
        System.out.println( "esta jugando");
    }
    @Override
    public void mostrarInformacion(){
    }    
} 
    

