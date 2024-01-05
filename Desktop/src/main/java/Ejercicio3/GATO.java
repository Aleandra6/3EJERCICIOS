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
public class GATO extends ANIMALES {
   

    public String ColorDePelo;   
    
    public GATO(){
        super();
        this.ColorDePelo = ingresarColorDePelo();
    }
    public String ingresarColorDePelo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el color de pelo del gato");
        return scanner.next ();
    }
    public void TreparArbol(){
        System.out.println( "esta trepando el arbol");
    }
    public void CazarRaton(){
        System.out.println( "esta cazando ratones");
    }
    @Override
    public void mostrarInformacion(){
    }    
} 


