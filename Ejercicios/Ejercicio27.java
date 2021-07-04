
package Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lidiags
 */
public class Ejercicio27 {

    public static void main(String[] args) {

        try { // codigo susceptible a tener un error

            String datos[] = new String[100]; // usaremos este array para guardar los datos

            // declaramos el fichero, el cual estará en el directorio del proyecto
            File fichero = new File("/Users/lidiags/NetBeansProjects/UF3Ejercicio2/personas.txt");

            // abrimos el flujo de lectura a ese fichero
            BufferedReader lector = new BufferedReader(new FileReader(fichero));

            String linea1, linea2, linea3, linea4; // declaramos las variables
            int i = 0;

            System.out.println("Los hombres del fichero son: ");

            // el programa leera línea a lína hasta que no haya nada(null)
            while ((linea1 = lector.readLine()) != null) {
                linea2 = lector.readLine();
                linea3 = lector.readLine();
                linea4 = lector.readLine();
                if (linea4.equals("Masculino"))
                    datos[i] = linea1 + " " + linea2 + " con " + linea3 + " años."; // almacenamos en un array la lineas
                i++; // incrementamos la i
            }

            lector.close();// cerramos el flujo de lectura

            for (int j = 0; j < datos.length; j++) {
                if (datos[j] != null)
                    System.out.println(datos[j]);// mostramos por pantalla los datos
            }
        } catch (IOException e) {

            System.out.println("Error en la lectura del fichero.");
        }

    }

}
