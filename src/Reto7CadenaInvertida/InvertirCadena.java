package Reto7CadenaInvertida;

public class InvertirCadena {

    /*
     * Crea un programa que invierta el orden de una cadena de texto
     * sin usar funciones propias del lenguaje que lo hagan de forma automática.
     * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
     *
     * @author jbotgil
     */

    public static void invertirCadena(String cadena){

        //Longitud de la cadena (cadena.lenght())
        //i = 28, cada iteracion resta 1
        for (int i = cadena.length(); i > 0 ; i--) {
            System.out.print(cadena.charAt(i-1));
        }
    }

    public static void main(String[] args) {

        String cadena = "Hay que invertir esta cadena";

        String cadena2 = "Hola mundo";

        invertirCadena(cadena);
        System.out.println();
        invertirCadena(cadena2);

    }
}