/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import javax.swing.JOptionPane;

public class PRINCIPAL {

    public static void main(String[] args) {
        String opcionIngresada = null;

        do {
            try {
                opcionIngresada = JOptionPane.showInputDialog("Ingresar la opción que desea \n\n1. CUIDADOR\n2. VISITANTE");

                switch (Integer.parseInt(opcionIngresada)) {
                    case 1:
                        CUIDADOR cuidador = new CUIDADOR();
                        cuidador.nombre = obtenerInput("Ingresar el nombre del cuidador");
                        cuidador.edad = obtenerInput("Ingresa la edad del cuidador");
                        cuidador.ID = obtenerInput("Ingresa el ID del cuidador");
                        mostrarDatos(cuidador);
                        break;

                    case 2:
                        VISITANTE visitante = new VISITANTE();
                        visitante.nombre = obtenerInput("Ingresar el nombre del visitante");
                        visitante.edad = obtenerInput("Ingresa la edad del visitante");
                        visitante.NCARNET = obtenerInput("Ingresa el número de carnet del visitante");
                        mostrarDatos(visitante);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Ingresa una opción correcta: 1 o 2");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresa una opción correcta: 1 o 2");
            }
        } while (opcionIngresada != null);
    }

    private static String obtenerInput(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    private static <T> void mostrarDatos(T objeto) {
        JOptionPane.showMessageDialog(null, "Los datos son:\n\n" + objeto.toString());
    }

    static class CUIDADOR {
        public String nombre;
        public String edad;
        private String ID;

        @Override
        public String toString() {
            return nombre + "\n" + edad + "\n" + ID;
        }
    }

    static class VISITANTE {
        public String nombre;
        public String edad;
        private String NCARNET;

        @Override
        public String toString() {
            return nombre + "\n" + edad + "\n" + NCARNET;
        }
    }
}

        
   

