package com.egg.ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class cuadradoN {

    public static void main(String[] args) {
        System.out.println("Dame una dimension");
        int n = leerCantidad(2,99);
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || i==n-1 || j==0 || j==n-1) {
                System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
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
