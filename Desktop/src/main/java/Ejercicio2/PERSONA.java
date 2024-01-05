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

public  abstract class  PERSONA {
   
    public String nombre;
    public int edad;
    private int cedula;
    
    public PERSONA (){
        this.nombre=ingresarNombre();
        this.edad= ingresarEdad();
        this.cedula = ingresarCedula();
    }
    
    public String ingresarNombre (){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresar su nombre:");
        return scanner.nextLine();
    }
        
    public int ingresarEdad(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresar su edad:");
        return scanner.nextInt();
    }
    
    
    private int ingresarCedula(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingresar su cedula:");
        return scanner.nextInt();    
    }
    public int getCedula(){
        return cedula;
    }
    public void setCedula(int cedula){
        this.cedula=cedula;
        
    }
    
    public abstract void mostrarInformacion(); 
        
}
