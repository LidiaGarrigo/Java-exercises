package Ejercicios;

import java.io.*; //importamos todas las librerias
import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        // envolvemos el programa susceptible a dar error con try catch
        try {
            // activamos el Scanner para escribir por teclado
            Scanner teclado = new Scanner(System.in);
            // solicitamos las rutas de los ficheros
            System.out.print("¿Donde está el fichero con el que quieres trabajar?: ");
            String ubicacion = teclado.nextLine();
            teclado.close();
            // abrimos el fichero con la clase File y le damos el nombre fichero
            File fichero = new File(ubicacion);

            String infoFichero = "***INFORMACIÓN***\nNombre: " + fichero.getName() + "\nRuta: " + fichero.getPath()
                    + "\nRuta absoluta: " + fichero.getAbsolutePath();
            // creamos una cadena a la que se le va concatenando el resultado obtenido

            if (fichero.canRead()) {
                infoFichero += "\nSe puede leer.";
            } else {
                infoFichero += "\nNo se puede leer.";
            }
            if (fichero.canWrite()) {
                infoFichero += "\nTiene permisos de escritura.";
            } else {
                infoFichero += "\nNo tiene permisos de escritura.";
            }
            infoFichero += "\nEl tamaño del archivo: " + fichero.length() + " bytes.";

            if (fichero.isDirectory()) {
                infoFichero += "\nEs un directorio.";
            } else {
                infoFichero += "\nEs un fichero.";
                infoFichero += "\nEl nombre del padre: " + fichero.getParent();
            }
            // imprimimos una cadena por pantalla con todo el contenido obtenido
            System.out.println(infoFichero);
        } catch (Exception e) {
            System.out.println("Error en la lectura del fichero.");
        }
    }

}
