package com.egg.ejerciciosjava;

/**
 *
 * @author zero
 */
public class encontrarSubmatriz {
    public static void main(String[] args) {
        int[][] M = {{1,26,36,47,5,6,72,81,95,10},{11,12,13,21,41,22,67,20,10,61},
            {56,78,87,90,9,90,17,12,87,67},{41,87,24,56,97,74,87,42,64,35},
            {32,76,79,1,36,5,67,96,12,11},{99,13,54,88,89,90,75,12,41,76},
            {67,78,87,45,14,22,26,42,56,78},{98,45,34,23,32,56,74,16,19,18},
            {24,67,97,46,87,13,67,89,93,24},{21,68,78,98,90,67,12,41,65,12}};
        int[][] P = {{36,5,67},{89,90,75},{14,22,26}};
        
        System.out.println("Matriz M");
        mostrarMatriz(M);
        System.out.println("\nMatriz P");
        mostrarMatriz(P);
        buscarSubmatriz(M,P);
        }
    
    public static void mostrarMatriz(int[][] m) {
        for (int[] fila:m) {
            String aux="";
            for (int columna: fila) {
                aux = aux + columna + " ";
            }
            System.out.println(aux);
    }}
    
    public static void buscarSubmatriz(int[][] m, int[][] p) {
        int q = p.length, l = m.length-q, u = q-1;
        boolean encontrado = true;
        String inicio = "";
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (m[i][j] == p[0][0]) {
                    int pI = 0;
                    do {
                        int pJ = 0;
                        do {
                            encontrado = m[i+pI][j+pJ] == p[pI][pJ];
                            if (encontrado && pJ == u && pI == u) {
/*  Solo en caso de que hasta el ultimo valor de P coincida, podremos asegurar
    que la submatriz completa se encuentra, y ahi asignamos el inicio de ella.*/
                                inicio = i+","+j;
                            }
                            pJ++;
                        } while (pJ < q);
                        pI++;
                    } while (pI < q);
                }
            }
        }
        if (inicio != "") {
            System.out.println("\nLa submatriz comienza en las coordenas: "+inicio);
        } else {
            System.out.println("\nNo se encontro");
        }
    }
}
