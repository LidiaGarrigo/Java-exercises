package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author lidiags
 */
public class Ejercicio1 {

    public static void main(String[] args) { // método main
        //
        // metodo_saludo(); //llamamos al método
        // }
        // //para funciones y métodos:
        // public static void metodo_saludo(){ //este método no recibe nada
        // System.out.println("¡Buenos días por la mañana!");

        metodo_dias(); // llamamos al método
    }

    // para funciones y métodos:
    public static void metodo_dias() { // este método no recibe nada
        try {
            Scanner teclado = new Scanner(System.in);
            String dayType;
            System.out.print("Dime un día de la semana en número: ");
            String dia = teclado.nextLine();
            teclado.close();

            switch (dia) {
                // multiples cases sin declaraciones break

                case "1":
                    dayType = "lunes.";
                    break;
                case "2":
                    dayType = "martes.";
                    break;
                case "3":
                    dayType = "miercoles.";
                    break;
                case "4":
                    dayType = "jueves.";
                    break;
                case "5":
                    dayType = "viernes.";
                    break;
                case "6":
                    dayType = "sábado.";
                    break;
                case "7":
                    dayType = "domingo.";
                    break;

                default:
                    dayType = "tipo de día inválido.";
            }

            System.out.println(dia + " es un " + dayType);
        }

        catch (Exception e) {
            System.out.println("Se ha producido un error.");
        }
    }
}
