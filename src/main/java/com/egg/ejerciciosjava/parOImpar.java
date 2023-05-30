package com.egg.ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class parOImpar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Escribe un numero entero > ");
        int num = leer.nextInt();
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
}
