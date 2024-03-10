package Reto3Fibonacci;

public class Fibonacci {

    /*
     * Escribe un programa que imprima los 50 primeros números de la sucesión
     * de Fibonacci empezando en 0.
     * - La serie Fibonacci se compone por una sucesión de números en
     *   la que el siguiente siempre es la suma de los dos anteriores.
     *   0, 1, 1, 2, 3, 5, 8, 13...
     *
     * @author jbotgil
     */

    public static void main(String[] args) {
        //Utiliazamos el tipo long ya que vamos a trabajar con cantidades de numeros grandes
        long numeroPrevio = 0;
        long siguienteNumero = 1;

        System.out.println("50 primeros numeros de la sucesion de Fibonacci: ");
        for (int i = 0; i < 50; ++i) {
            System.out.print(numeroPrevio + " ");

            long sum = numeroPrevio + siguienteNumero;
            numeroPrevio = siguienteNumero;
            siguienteNumero = sum;
        }
    }
}