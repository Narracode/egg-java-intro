package com.egg.ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class menuOperaciones {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String menu = "*MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir";
                
        System.out.print("Ingrese cantidad A > ");
        int numA = leer.nextInt();
        System.out.print("Ingrese cantidad B > ");
        int numB = leer.nextInt();
        int opcion;
        
        do {
            System.out.println(menu);
            System.out.print("Elija opcion: >");
            opcion = leer.nextInt();
            switch(opcion) {
                case 1:
                    sumar(numA, numB);
                break;
                case 2:
                    restar(numA, numB);
                break;
                case 3:
                    multiplicar(numA, numB); 
                case 4:
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
        System.out.println("Suma= \n" + suma);
    }
    
    public static void restar(int a, int b) {
        int suma = a - b;
        System.out.println("Resta= \n" + suma);
    }
    
    public static void multiplicar(int a, int b) {
        int producto = a * b;
        System.out.println("Producto= \n" + producto);
    }
    
    public static void dividir(int a, int b) {
        double cociente = a / b;
        System.out.println("Cociente= \n" + cociente);
    }
}

