/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.egg.ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author zero
 */
public class sumaDosNumeros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa dos numeros enteros por favor");
        int numA = leer.nextInt();
        int numB = leer.nextInt();
        
        int suma = numA + numB;
        
        System.out.println("La suma es: " + suma);
    }
}
