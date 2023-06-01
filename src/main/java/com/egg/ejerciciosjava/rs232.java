package com.egg.ejerciciosjava;
import java.util.Scanner;

/**
 *
 * @author zero
 */
public class rs232 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean logged = true;
        int bien=0;
        int mal=0;
        do {
            System.out.print("Esperando mensaje > ");
            String msg = leer.next();
            if (msg.substring(0, 1).equals("X") && msg.substring(4,5).equals("O")) {
                bien ++;
            } else {
                mal ++;
            }
            if (msg.equals("&&&&&")) {
                logged = false;
            }
        } while (logged);
        System.out.println("Lecturas Correctas" + bien + "Incorrectas" + mal);
    }
}
