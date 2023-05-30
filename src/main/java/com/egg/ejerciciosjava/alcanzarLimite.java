package com.egg.ejerciciosjava;

import java.util.Scanner;
/**
 *
 * @author zero
 */
public class alcanzarLimite {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Asigna una cantidad limite");
        int lim = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingresa un entero");
            int num = leer.nextInt();
            suma = suma + num;
        } while (suma < lim);
        System.out.println("Lo lograste");
    }
}
