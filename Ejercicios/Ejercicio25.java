package Ejercicios;

import java.io.*; //importamos todas las librerias
import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio25 {

    public static void main(String[] args) {

        try {

            // declaramos las variables que vamos a usar
            String nombre, apellidos, edad, genero;
            // a pesar de EDAD ser un número (int) se puede usar String

            // declaramos el fichero, el cual estará en el directorio del proyecto
            File fichero = new File("personas.txt");

            // abrimos el flujo de escritura a ese fichero
            BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero));

            // activamos el Scaner para introducir datos por teclado.
            Scanner teclado = new Scanner(System.in);

            // creamos un array de datos para almacenar más de una persona
            String datos[] = new String[8];
            int i = 0;

            while (i < 4) { // con el bucle, pedimos los mismos datos 4 veces

                System.out.print("Dime el nombre de una persona: "); // pedimos por pantalla
                nombre = teclado.nextLine(); // almacenamos el resultado en la variable
                escritor.write(nombre);// escribe lo introducido por teclado
                escritor.newLine();// escribe un salto de linea

                System.out.print("Dime sus apellidos: "); // pedimos por pantalla
                apellidos = teclado.nextLine(); // almacenamos el resultado en la variable
                escritor.write(apellidos);// escribe lo introducido por teclado
                escritor.newLine();// escribe un salto de linea

                System.out.print("Dime su edad: "); // pedimos por pantalla
                edad = teclado.nextLine(); // almacenamos el resultado en la variable
                escritor.write(edad);// escribe lo introducido por teclado
                escritor.newLine();// escribe un salto de linea

                System.out.print("Introduce su género: "); // pedimos por pantalla
                genero = teclado.nextLine(); // almacenamos el resultado en la variable
                teclado.close();
                escritor.write(genero);// escribe lo introducido por teclado
                escritor.newLine();// escribe un salto de linea
                datos[i] = nombre; // almacenamos los datos en el array
                i++; // y cuando se han introducido 4 nombres, sale del bucle
            }

            escritor.close();
            System.out.println("El fichero ha sido guardado con éxito.");

        }

        catch (IOException e) {

            System.out.println("Error en la escritura del fichero.");
        }

    }
}
