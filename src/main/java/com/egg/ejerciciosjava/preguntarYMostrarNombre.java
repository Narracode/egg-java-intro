/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class preguntarYMostrarNombre {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Teclea tu nombre");
    String nombre = leer.nextLine();
    System.out.println("Tu nombre es \n" + nombre);
    }
}
