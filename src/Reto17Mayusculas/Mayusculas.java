package Reto17Mayusculas;

public class Mayusculas {

    /*
     * Crea una función que reciba un String de cualquier tipo y se encargue de
     * poner en mayúscula la primera letra de cada palabra.
     * - No se pueden utilizar operaciones del lenguaje que
     *   lo resuelvan directamente.
     *
     * @author jbotgil
     */

    public static void mayusculas(String cadena) {

        //Separamos las palabras y las metemos dentro de un array
        String[] palabras = cadena.split(" ");

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty()) {
                //Obtenemos la primera letra y la convertimos a mayúscula
                String primeraLetraMayuscula = palabras[i].substring(0, 1).toUpperCase();
                //Concatenamos la primera letra mayúscula con el resto de la palabra
                String palabraConMayuscula = primeraLetraMayuscula + palabras[i].substring(1);
                resultado.append(palabraConMayuscula).append(" ");
            }
        }
        System.out.println(resultado);
    }

    public static void main(String[] args) {

        String cadena = "Esto es una cadena de prueba";
        String cadena2 = "hola mundo";

        mayusculas(cadena);
        mayusculas(cadena2);

    }
}