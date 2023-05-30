/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.egg.ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class centigradosAFarenheit {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduzca temperatura en Grados Centigrados: >");
        int cent = leer.nextInt();
        int farh = aFarenheit(cent);
        System.out.println(cent + " grados Centigrados equivale a " + farh + " grados Farenheit");
    }
    public static int aFarenheit(int c) {
        int f = 32 + (9*c/5);
        return f;
    }
}
