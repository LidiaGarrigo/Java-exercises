package Ejercicios;

/**
 *
 * @author lidiags
 */
public class Ejercicio10 {
    public static void main(String[] args) {

        int dorsal = 0;
        int tiempo = 700;
        int mujer = 1;
        int hombre = 0;
        
        //Matriz de [10][4];
        int[][] matriz = {
            {3457, 1, 51, 52},
            {3467, 1, 32, 41},
            {3568, 0, 14, 39},
            {3570, 0, 12, 63},
            {3571, 1, 45, 38},
            {3572, 0, 17, 46},
            {3573, 0, 12, 59},
            {3574, 0, 30, 42},
            {3575, 1, 24, 77},
            {3576, 0, 57, 48}
        };
        
        for (int x = 0; x < matriz.length; x++) {
            if (matriz[x][1] == hombre && matriz[x][3] < tiempo) {
                tiempo = matriz [x][3];
                dorsal = matriz [x][0];
            } }

        System.out.println("El ganador de la cursa es el dorsal "+dorsal+" con un tiempo de: "+tiempo+" minutos.");
        
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][1] == mujer && matriz[i][3] < tiempo) {
                tiempo = matriz [i][3];
                dorsal = matriz [i][0]; 
            } }
        
        System.out.println("La ganadora de la cursa es el dorsal "+dorsal+" con un tiempo de: "+tiempo+" minutos.");
        
    }
}

