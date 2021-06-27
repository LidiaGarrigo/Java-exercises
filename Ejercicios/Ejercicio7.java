package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String alumnos[] = { "Jordi", "Cristina", "Judit", "Marc", "Júlia" };
        int notas[] = { 4, 6, 9, 7, 8 };

        System.out.print("Introduce un nombre: ");
        String nombre = teclado.nextLine();
        teclado.close();

        if (nombre.equals(alumnos[0])) {
            System.out.println("La nota de " + alumnos[0] + " es un: " + notas[0]);
        } else if (nombre.equals(alumnos[1])) {
            System.out.println("La nota de " + alumnos[1] + " es un: " + notas[1]);
        } else if (nombre.equals(alumnos[2])) {
            System.out.println("La nota de " + alumnos[2] + " es un: " + notas[2]);
        } else if (nombre.equals(alumnos[3])) {
            System.out.println("La nota de " + alumnos[3] + " es un: " + notas[3]);
        } else if (nombre.equals(alumnos[4])) {
            System.out.println("La nota de " + alumnos[4] + " es un: " + notas[4]);
        } else {
            System.out.println("El nombre introducido no se encuentra en la lista.");
        }
    }

}
