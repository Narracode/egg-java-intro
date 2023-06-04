package com.egg.ejerciciosjava;

/**
 *
 * @author zero
 */
public class matrizTraspuesta {
    public static void main(String[] args) {
        int n = 4;
        int[][] matriz = new int[n][n];

        
        rellenarMatriz(matriz,n,n);
        System.out.println("Matriz A (original)");
        mostrarMatriz(matriz);
        System.out.println("\nMatriz B (traspuesta)");
        transponMatriz(matriz,n,n);
    }
    
    public static void mostrarMatriz(int[][] m) {
        //System.out.println("Los valores dentro de la matriz: ");
        for (int[] fila:m) {
            String aux="";
            for (int columna: fila) {
                aux = aux + columna + " ";
            }
            System.out.println(aux);
        }
    }
    
    public static int[][] rellenarMatriz(int m[][], int kN, int kM) {
        for (int i=0; i < kN; i++) {
            for (int j = 0; j < kM; j++) {
                m[i][j]= (int) ((Math.random()*10)*(Math.random()*10)
                    *(Math.random()*10)*(Math.random()*10));
            }
        }
        return m;
    }
    
    public static void transponMatriz(int[][] m, int kN, int kM) {
        for (int i=0; i < kN; i++) {
            String aux = "";
            for (int j = 0; j < kM; j++) {
                aux= aux + m[j][i] + " ";
            }
            System.out.println(aux);
        }
    }    
}
