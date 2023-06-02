package com.egg.ejerciciosjava;
import java.util.Scanner;

public class buscarCantidad {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector;
        System.out.print("Ingrese la dimension del vector > ");
        int n = leer.nextInt();
        vector=new int[n];
        int k = n-1;
        int cuenta = 0;
        
        for (int i=0;i < k;i++) {
            vector[i]= (int)(Math.random()*10);
        }
        
        System.out.print("Ingresa un numero a buscar > ");
        int tgt = leer.nextInt();
        
        mostrarVector(vector);
        for (int i=0;i < k; i++) {
            if(vector[i]==tgt) {
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
    
    public static void mostrarVector(int[] v) {
        String aux="";
        for (int valor : v) {
            aux = aux + valor + " ";
        }
        System.out.println(aux);
    }
}
