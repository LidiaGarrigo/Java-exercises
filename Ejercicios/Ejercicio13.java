package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio13 {

    public static void main(String[] args) { // método main

        char cadena = funcion_cadena();
        // declaramos la variable que almacena la función

        System.out.println("La primera letra de la cadena es: " + cadena);
        // mostramos por pantalla el contenido de la variable
    }

    // para funciones y metodos:
    public static char funcion_cadena() { // función que pide una cadena y devuelve la primera letra
        String cadena;
        Scanner teclado = new Scanner(System.in); // activamos Scanner
        System.out.println("Dame una cadena: "); // pedimos una cadena
        cadena = teclado.nextLine(); // almacenamos lo escrito por teclado en la variable
        teclado.close();
        char letra = cadena.charAt(0);
        return letra; // devuelve la primera letra de la cadena
    }

}
