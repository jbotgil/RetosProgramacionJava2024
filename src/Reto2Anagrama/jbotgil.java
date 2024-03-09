package Reto2Anagrama;

import java.util.Scanner;

public class jbotgil {

    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     *
     * @author jbotgil
     */

    public static boolean anagrama(String palabra1, String palabra2){
        //Convertimos las palabras a minusculas y eliminamos los espacios
        palabra1 = palabra1.replaceAll("\\s", "").toLowerCase();
        palabra2 = palabra2.replaceAll("\\s", "").toLowerCase();

        //Primeros verificamos las longitudes de las dos palabras
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        //Si dos palabras son iguales ya sabemos que no es un anagrama y devolvemos false
        if (palabra1.equals(palabra2)){
            return false;
        }

        //Hacer 2 bucles que compare el charAt de 1 de la palabra 1 con cada una de las letras de la segunda palabra
        for (int i = 0; i < palabra1.length(); i++) {
            boolean encontrado = false;
            for (int j = 0; j < palabra2.length(); j++) {
                if (palabra1.charAt(i) == palabra2.charAt(j) && !encontrado) {
                    encontrado = true; // Se ha encontrado una coincidencia
                }
            }
            // Si no se encontró una coincidencia para la letra de palabra1, no es un anagrama
            if (!encontrado) {
                return false;
            }
        }

        //Si no se ha devuelto false en ningún momento, las palabras son anagramas
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la palabra inicial: ");
        String palabra1 = sc.nextLine();
        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = sc.nextLine();

        System.out.println(anagrama(palabra1,palabra2)?"Es una anagrama":"No es un anagrama");

    }
}