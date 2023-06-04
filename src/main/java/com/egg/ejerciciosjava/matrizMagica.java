package com.egg.ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class matrizMagica {
    public static void main(String[] args) {
        int[][] matriz;
        int n= 3;
        
        matriz = new int[n][n];        
        llenarMatriz(matriz,n);
        mostrarMatriz(matriz);
        esMagica(matriz,n);
    }
    
    public static void asiNo() {
        System.out.println("\nInvalido, intenta otra vez\n");
    }
    
    public static int leerCantidad(int min, int max) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un numero entre "+min+" y "+max+" > ");
        int x = 0;
        do {
            x = leer.nextInt();
            if (x<min && x>max) {
                asiNo();
            }
        } while (x<min && x>max);
        return x;
    }
    
    public static void llenarMatriz(int[][] m, int n) {
        int lim = n*n;
        for (int i = 0; i < n; i++) {
            System.out.println("Fila "+i);
            for (int j = 0; j < n; j++) {
                System.out.println("Columna "+j);
                int v = leerCantidad(1, lim);
                m[i][j]=v;
        }}
    }
    
    public static void mostrarMatriz(int[][] m) {
        System.out.println("Los valores dentro de la matriz: ");
        for (int[] fila:m) {
            String aux="";
            for (int columna: fila) {
                aux = aux + columna + " ";
            }
            System.out.println(aux);
    }}
    
    public static int constanteMagica(int n){
        int cM = n*(n*n+1)/2;
        return cM;
    }
    
    public static void esMagica(int[][] m, int n) {
        int cM = constanteMagica(n), i = 0, sumaDiagonal= 0;
        boolean magica = true;
        
        do {
            int sumaFila = 0, sumaColumna = 0, j= 0;
            
            do {
                sumaFila+=m[i][j];
                sumaColumna+=m[j][i];
                if (i == j) {
                    sumaDiagonal+=m[i][j];
                }
                j++;
            } while (j < n);
            i++;
            if (sumaFila != cM || sumaColumna != cM) {
                magica = false;
            }
        } while (i < n && magica);
        
        if (sumaDiagonal != cM) {
            magica = false;
        }
        
        System.out.println("La constante Magica para esta matriz es: "+cM);
        if (magica) {
            System.out.println("Esta matriz es magica");
        } else {
            System.out.println("Esta matriz no es magica");
        }
    }
}