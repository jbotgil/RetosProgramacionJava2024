package Reto8ContandoPalabras;

public class ContandoPalabras {

    /*
     * Crea un programa que cuente cuantas veces se repite cada palabra
     * y que muestre el recuento final de todas ellas.
     * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
     * - No se pueden utilizar funciones propias del lenguaje que
     *   lo resuelvan automáticamente.
     *
     * @author jbotgil
     */

    public static void cuentaPalabras(String cadena) {
        String cadenaMinusculas = cadena.toLowerCase();

        //Separamos todas las palabras de la cadena asumiendo que cada separación es un espacio en blanco
        String[] palabras = cadenaMinusculas.split(" ");

        //Contamos la frecuencia de cada palabra
        for (int i = 0; i < palabras.length; i++) {
            //Solo contamos la frecuencia si no se ha contado previamente
            if (palabras[i] != null) {
                int frecuencia = 1;
                for (int j = i + 1; j < palabras.length; j++) {
                    if (palabras[i].equals(palabras[j])) {
                        frecuencia++;
                        //Marcamos la palabra como contada para evitar contarla de nuevo
                        palabras[j] = null;
                    }
                }
                if (frecuencia > 1){
                    //Le restamos 1 a frecuencia para que no cuente la primera vez que se detecta la primera palabra
                    frecuencia -= 1;
                    System.out.println("La palabra \""+palabras[i] + "\" se repite: " + frecuencia);
                }
            }
        }
    }


    public static void main(String[] args) {
        String cadena = "Esto esto es es una cadena con con repeticiones esto Cadena es es prueba esto";

        cuentaPalabras(cadena);

    }
}