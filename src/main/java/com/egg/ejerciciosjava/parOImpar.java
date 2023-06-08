package com.egg.ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class parOImpar {

    public static void main(String[] args) {
        int num = leerCantidad(1,9999999);
        confirma(esPar(num));
    }
    
    public static void confirma(boolean c) {
        if (c) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
    
    public static boolean esPar(int n) {
        boolean par = n%2==0;
        return par;
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
