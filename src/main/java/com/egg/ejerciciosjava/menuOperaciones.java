package com.egg.ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class menuOperaciones {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String menu = "\nMENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir";
                
        System.out.println("Cantidad A");
        int numA = leerCantidad(1,9999999);
        System.out.println("Cantidad B");
        int numB = leerCantidad(1,9999999);
        int opcion;
        
        do {
            System.out.println(menu);
            System.out.print("Elija opcion: >");
            opcion = leer.nextInt();
            switch(opcion) {
                case 1:
                    mostrarAB(numA,numB);
                    sumar(numA, numB);
                break;
                case 2:
                    mostrarAB(numA,numB);
                    restar(numA, numB);
                break;
                case 3:
                    mostrarAB(numA,numB);
                    multiplicar(numA, numB); 
                case 4:
                    mostrarAB(numA,numB);
                    dividir(numA, numB);
                break;
                case 5:
                    System.out.println("Desea Salir? S/N");
                    String meVoy = leer.next();
                    if (meVoy.equalsIgnoreCase("s")){
                        System.out.println("Bye");
                    } else {
                        opcion = 0;
                }
                break;
                default:
                    System.out.println("Opcion Invalida");
            }
        } while (opcion != 5);
    }
    
    public static void sumar(int a, int b) {
        int suma = a + b;
        System.out.println("Suma= " + suma);
    }
    
    public static void restar(int a, int b) {
        int suma = a - b;
        System.out.println("Resta= " + suma);
    }
    
    public static void multiplicar(int a, int b) {
        int producto = a * b;
        System.out.println("Producto= " + producto);
    }
    
    public static void dividir(int a, int b) {
        double cociente = a / b;
        System.out.println("Cociente= " + cociente);
    }
    public static void mostrarAB(int a, int b) {
        System.out.println("A = "+a+"  B = "+b);
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