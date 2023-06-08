/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.ejerciciosjava;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class operacionesNumero {

    public static void main(String[] args) {
        int num = leerCantidad(1,999999);
        int doble = num + num;
        int triple = doble + num;
        double raiz = sqrt(num);
        System.out.println("El doble: " + doble + "\nEl triple: " + triple
            +"\nSu raiz cuadrada: " + raiz );
    }
    
    public static void asiNo() {
        System.out.println("\nInvalido, intenta otra vez\n");
    }
    
    public static int leerCantidad(int min, int max) {
        Scanner leer = new Scanner(System.in);
        int x = 0;
        
        do {
            System.out.print("Introduce un numero entre "+min+" y "+max+" > ");
            x = leer.nextInt();
            if (x<min || x>max) {
                asiNo();
            }
        } while (x<min || x>max);
        return x;
    }
}
