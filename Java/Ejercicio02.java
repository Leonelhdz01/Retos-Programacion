/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
import java.util.Arrays;

public class Ejercicio02 {
    public static void main(String[] args) {


        //palabras a comparar (roma, amor, mora: si son anagranmas, ropa no es anagrama)
        String palabra1 = "ropa";
        String palabra2 = "ropa";

        //si son exactamente iguales NO es un anagrama
        if (palabra1.equals(palabra2)) {
            System.out.println("No es un anagrama");
        } else {

            //convertimos las palabras en arrays de letras
            char[] letras1 = palabra1.toCharArray();
            char[] letras2 = palabra2.toCharArray();


            //ordenamos las letras
            Arrays.sort(letras1);
            Arrays.sort(letras2);

            //comparamos los arrays
            if (Arrays.equals(letras1, letras2)) {
                System.out.println("Si es un anagrama");
            } else {
                System.out.println("No es un anagrama");
            }

        }
    }
}
