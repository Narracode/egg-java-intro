package com.egg.ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class digitosVector {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la dimension del vector > ");
        int n = leer.nextInt();
        int[] vector=new int[n];
        
        vector = rellenarVector(vector,n);
        mostrarVector(vector);
        contarDigitosVector(vector);
    }
    
    public static void contarDigitosVector(int v[]) {
        int d1 = 0, d2 = 0 , d3 = 0, d4 = 0 , d5 = 0;

        for (int cantidad : v) {
            int digitos = contarDigitos(cantidad);
            switch(digitos) {
                case 1:
                    d1++;
                break;
                case 2:
                    d2++;
                break;
                case 3:
                    d3++;
                break;
                case 4:
                    d4++;
                break;
                case 5:
                    d5++;
                break;
            }
        }
        System.out.println("En el vector se encuentran:\n"
            + d1 + " Numeros de 1 digito\n" + d2 + " Numeros de 2 digitos\n"
            + d3 + " Numeros de 3 digitos\n" + d4 + " Numeros de 4 digitos\n"
            + d5 + " Numeros de 5 digitos\n");
    }
    
    public static int[] rellenarVector(int v[], int k) {
        for (int i=0; i < k; i++) {
            v[i]= (int) ((Math.random()*10)
                *(Math.random()*10)*(Math.random()*10)
                *(Math.random()*10)*(Math.random()*10));
        }
        return v;
    }
    
    public static int contarDigitos(int n) {
        int dig = 1;
        if(n > 9) {
            do {
            n = n/10;
            dig++;
            } while (n > 9);
        }
        return dig;
    }
    
    public static void mostrarVector(int[] v) {
        System.out.println("Los valores dentro del Vector: ");
        String aux="";
        for (int valor : v) {
            aux = aux + valor + " ";
        }
        System.out.println(aux);
    }
}
