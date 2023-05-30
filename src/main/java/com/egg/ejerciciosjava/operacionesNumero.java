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
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Teclea un numero entero > ");
        int num = leer.nextInt();
        int doble = num + num;
        int triple = doble + num;
        double raiz = sqrt(num);
        System.out.println("El doble: " + doble + "\n el triple: " + triple);
        System.out.println("Su raiz cuadrada" + raiz );
    }
    
}
