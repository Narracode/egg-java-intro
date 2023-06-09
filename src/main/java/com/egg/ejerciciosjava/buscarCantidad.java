package com.egg.ejerciciosjava;
import java.util.Scanner;

public class buscarCantidad {
    public static void main(String[] args) {
        int[] vector;
        
        System.out.println("Dimension del vector");
        vector = new int[leerCantidad(1,50)];
        llenarVector(vector);
        mostrarVector(vector);
        System.out.println("Numero a buscar");
        buscarNumero(vector, leerCantidad(0,10));
    }
    
    public static void mostrarVector(int[] v) {
        String aux="";
        for (int valor : v) {
            aux = aux + valor + " ";
        }
        System.out.println(aux);
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
    
    public static void llenarVector(int[] v) {
        for (int i=0;i < v.length ;i++) {
            v[i]= (int)(Math.random()*10);
        }
    }
    
    public static void buscarNumero(int[] v, int tgt) {
        int cuenta = 0;
        for (int i=0;i < v.length; i++) {
            if(v[i]==tgt) {
                System.out.println("El numero " + tgt + " se encuentra en la posicion: " + i);
                cuenta++;
            }
        }
        if(cuenta>0) {
            System.out.println("Existen " + cuenta + " coincidencias");
        } else {
            System.out.println("No hay coincidencias");
        }
    }
}