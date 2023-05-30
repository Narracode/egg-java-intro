package com.egg.ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author zero
 */
public class empiezaA {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Favor de ingresar una frase");
        String frase = leer.nextLine();
        String inicio = frase.substring(0,1);
        confirma(inicio.equals("A"));
    }
    
    public static void confirma(boolean c) {
        if (c) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
