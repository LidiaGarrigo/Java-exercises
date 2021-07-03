package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio22 {
    public static void main(String[] args) {

        int resultado = funcion_control(); // almacenamos la función en la variable
        System.out.println("El número introducido es: " + resultado);
    }

    // para métodos y funciones:

    public static int funcion_control() {

        // Activamos Scanner para poder leer por teclado
        Scanner teclado = new Scanner(System.in);

        int numero; // declaramos la variable tipo número entero
        System.out.print("Escriba un número: ");

        while (teclado.hasNextInt() == false) { // lee lo que se introduce por teclado
            System.out.println("No has introducido un número.");
            teclado.next(); // vaciamos lo introducido
            System.out.print("Por favor, escriba un número: ");
        }
        numero = teclado.nextInt();// guardamos lo introducido por teclado
        teclado.close();
        return numero; // devuelve al programa principal el int
    }
}
