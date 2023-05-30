package com.egg.ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class largo8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa una frase > ");
        String frase = leer.nextLine();
        
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        }
    }
}
