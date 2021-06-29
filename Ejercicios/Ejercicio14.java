package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio14 {

    public static void main(String[] args) { // método main

        metodo(); // llamamos al método
    }

    // para funciones y métodos:
    public static void metodo() {

        int numero;
        Scanner teclado = new Scanner(System.in); // activamos Scanner
        System.out.println("Introduce un número del 1 al 10: ");
        numero = teclado.nextInt(); // almacenamos el número introducido
        teclado.close();

        if (numero <= 10) {

            String cadena = "abcdefghij";

            if (numero == 1) {
                System.out.println(cadena.substring(0, 1)); // muestra por pantalla el numero en letras
            }
            if (numero == 2) {
                System.out.println(cadena.substring(0, 2)); // muestra por pantalla el numero en letras
            }
            if (numero == 3) {
                System.out.println(cadena.substring(0, 3)); // muestra por pantalla el numero en letras
            }
            if (numero == 4) {
                System.out.println(cadena.substring(0, 4)); // muestra por pantalla el numero en letras
            }
            if (numero == 5) {
                System.out.println(cadena.substring(0, 5)); // muestra por pantalla el numero en letras
            }
            if (numero == 6) {
                System.out.println(cadena.substring(0, 6)); // muestra por pantalla el numero en letras
            }
            if (numero == 7) {
                System.out.println(cadena.substring(0, 7)); // muestra por pantalla el numero en letras
            }
            if (numero == 8) {
                System.out.println(cadena.substring(0, 8)); // muestra por pantalla el numero en letras
            }
            if (numero == 9) {
                System.out.println(cadena.substring(0, 9)); // muestra por pantalla el numero en letras
            }
            if (numero == 10) {
                System.out.println(cadena.substring(0, 10)); // muestra por pantalla el numero en letras
            }

            else if (numero <= 0) {
                System.out.println("Has indicado 0 o un número negativo.");
            }
        }

        else {
            System.out.println("No has escogido un número del 1 al 10.");
        }

    }
}
