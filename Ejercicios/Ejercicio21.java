
package Ejercicios;

/**
 *
 * @author lidiags
 */
public class Ejercicio21 {
    public static void main(String[] args) {

        int[] array = new int[5];

        try { // indicamos los casos que podrían dar error
            array[5] = 1;
        } catch (Exception e) { // indicamos el mensaje del error que queremos dar
            System.out.println("Error");
        } finally { // opcional
            System.out.println("Fin del programa.");
        }
    }
}
