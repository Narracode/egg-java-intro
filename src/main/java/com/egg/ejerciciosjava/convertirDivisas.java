package com.egg.ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class convertirDivisas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean logged = true;
        String menu = "*Divisas\nL- A libras\nU- A Dolares\nY- A Yenes\nS- Salir";
        
        System.out.print("¿Cuantos Euros traes? > ");
        double eur = leer.nextDouble();

        do {
            System.out.println("\n" + eur + " Euros");
            System.out.println(menu);
            System.out.print("Ingrese Opcion > ");
            String divisa = leer.next();
            divisa = divisa.toLowerCase();
            if (divisa.equals("s")) {
                logged = false;
            }
            convertir(eur,divisa);
        } while (logged);
    } 
    public static void convertir(double e, String d) {
        switch(d) {
            case "l":
                double lib = e * 0.86;
                System.out.println("Son " + lib + "Libras");
                break;
            case "u":
                double usd = e * 1.28611;
                System.out.println("Son " + usd + " Dolares");
                break;
            case "y":
                double yen = e * 129.852;
                System.out.println("Son " + yen + "Yenes");
                break;
            case "s":
                System.out.println("Bye");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
