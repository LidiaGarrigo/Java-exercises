package Ejercicios;

/**
 *
 * @author lidiags
 */
import java.util.StringTokenizer;
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        String cadena = "La constancia es la clave del éxito.";
        StringTokenizer palabras = new StringTokenizer(cadena);
        System.out.println("Frase: " + cadena);
        System.out.println ("El número de palabras de la frase es de: " + palabras.countTokens() + " palabras.");
    }
}