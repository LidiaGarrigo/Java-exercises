package Ejercicios;

/**
 *
 * @author lidiags
 */
public class Ejercicio20 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        try { // indicamos los casos que podrían dar error
            a = 0;
            b = 0;
            System.out.println(a / b);
        } catch (Exception e) { // indicamos el mensaje del error que queremos dar
            System.out.println("Error");
        } finally { // opcional
            System.out.println("Fin del programa.");
        }
    }

}
