package com.egg.ejerciciosjava;

/**
 *
 * @author zero
 */
public class vector100 {
    public static void main(String[] args) {
        int centena[] = new int[100];
        
        for (int num = 0; num < centena.length; num++) {
            centena[num]=num+1;
        }
        mostrarVector(centena);
    }
    public static void mostrarVector(int[] v) {
        String aux="";
        for (int valor : v) {
            aux = valor + " " + aux;
        }
        System.out.println(aux);
    }
}
