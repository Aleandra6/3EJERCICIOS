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

public  abstract class  ANIMALES {
   
    public String nombre;
    private int edad;
    
    
    public ANIMALES (){
        this.nombre=ingresarNombre();
        
    }
    
    public String ingresarNombre (){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresar el nombre:");
        return scanner.nextLine();
    }
        
    
    
    
    private int ingresarEdad(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingresar su cedula:");
        return scanner.nextInt();    
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int edad){
        this.edad=edad;
        
    }
    private void hacersonido(){
        System.out.println( "haciendosonido");
    }
    public abstract void mostrarInformacion(); 
        
}

