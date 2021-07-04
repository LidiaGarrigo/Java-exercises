package Ejercicios;

import java.io.*; //importamos todas las librerias

/**
 *
 * @author lidiags
 */
public class Ejercicio26 {

    public static void main(String[] args) {

        try { // codigo susceptible a tener un error

            String datos[] = new String[100]; // usaremos este array para guardar los datos

            // declaramos el fichero, el cual estará en el directorio del proyecto
            File fichero = new File("/Users/lidiags/NetBeansProjects/UF3Ejercicio2/personas.txt");

            // abrimos el flujo de lectura a ese fichero
            BufferedReader lector = new BufferedReader(new FileReader(fichero));

            String linea1, linea2, linea3, linea4; // declaramos las variables
            int i = 0;

            System.out.println("El fichero contiene los nombres siguientes: ");

            // el programa leera línea a lína hasta que no haya nada(null)
            while ((linea1 = lector.readLine()) != null) {
                linea2 = lector.readLine();
                linea3 = lector.readLine();
                linea4 = lector.readLine();
                datos[i] = linea1; // almacenamos en un array la linea1
                i++; // incrementamos la i

                System.out.println(linea1);// mostramos por pantalla el nombre de las persona
            }
            lector.close();// cerramos el flujo de lectura

        } catch (IOException e) {

            System.out.println("Error en la lectura del fichero.");
        }
    }

}
