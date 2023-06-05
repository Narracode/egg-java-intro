package com.egg.ejerciciosjava;

/**
 *
 * @author zero
 */
public class matrizAntisimetrica {

    public static void main(String[] args) {
        int[][] matrizA = {{0,-2,4},{2,0,2},{-4,-2,0}};
        int[][] matrizB = {{0,2,-4},{-2,0,-2},{4,2,0}};
        
        System.out.println("Matriz A");
        mostrarMatriz(matrizA);
        System.out.println("matriz B");
        mostrarMatriz(matrizB);
        esAntisimetrica(matrizA,matrizB);
    }

    public static void esAntisimetrica(int[][] mA, int[][] mB) {
        /* Este metodo comprueba que cada valor en la matriz a comparar es el
        negativo de la matriz original */
        int i = 0, n = mA.length;
        boolean antiSim = true;
        do {
            int j=0;
            do {
                /* Estos loops sirven para iterar en cada valor de las matrices,
                estableciendo si es su negativo y saliendo del loop si no se
                cumple la condicion */
                antiSim = -1*mA[i][j] == mB[i][j];
                j++;
            } while (antiSim && j<n);
            i++;
        } while (antiSim && i<n);
        if (antiSim) {
            System.out.println("Es antisimetrica");
        } else {
            System.out.println("No es antisimetrica");
        }}
    
    public static void mostrarMatriz(int[][] m) {
        for (int[] fila:m) {
            String aux="";
            for (int columna: fila) {
                aux = aux + columna + " ";
            }
            System.out.println(aux);
        }}}