package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio28 {

    public static void main(String[] args) {
        // envolvemos el programa susceptible a dar error con try catch
        try {
            // activamos el Scanner para escribir por teclado
            Scanner teclado = new Scanner(System.in);
            // solicitamos las rutas de los ficheros
            System.out.print("Dame la ruta del fichero1: ");
            String f1 = teclado.nextLine();
            System.out.print("Dame la ruta del fichero2: ");
            String f2 = teclado.nextLine();
            System.out.print("Dame la ruta del fichero3: ");
            String f3 = teclado.nextLine();
            teclado.close();

            // declaramos los ficheros los cuales están en el directorio de nuestro proyecto
            File fichero1 = new File(f1);
            File fichero2 = new File(f2);
            File fichero3 = new File(f3);

            // abrimos el flujo de lectura a ese fichero
            BufferedReader lector1 = new BufferedReader(new FileReader(fichero1));
            BufferedReader lector2 = new BufferedReader(new FileReader(fichero2));

            // abrimos el flujo de escritura a ese fichero
            BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero3));

            String linea;
            // el programa leera linea a linea hasta que no haya nada (null)
            while ((linea = lector1.readLine()) != null) {
                escritor.write(linea);
                escritor.newLine();
            }
            while ((linea = lector2.readLine()) != null) {
                escritor.write(linea);
                escritor.newLine();
            }
            lector1.close(); // cerramos el flujo de lectura
            lector2.close();
            escritor.close();
            System.out.println("¡El " + f3 + " se ha creado con éxito!");
        }

        catch (Exception e) {
            System.out.println("Error en la lectura del fichero.");
        }
    }

}
