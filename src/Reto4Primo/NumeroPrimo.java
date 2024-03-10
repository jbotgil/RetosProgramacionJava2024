package Reto4Primo;

import java.util.Scanner;

public class NumeroPrimo {

    /*
     * Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     *
     * @author jbotgil
     */

    public static boolean esPrimo(int num) {
        boolean esPrimo = true;
        //El 1 no es primo
        if (num==1){
            esPrimo = false;
        }

        // Empezamos en 2 ya que el 0 y el 1 no son primos
        for (int i = 2; i <= num / 2 && esPrimo; i++) {
            if (num % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
        }while (num <= 0);

        //Si el numero se puede dividir entre algo mas que 1 y el mismo no es primo
        System.out.println(esPrimo(num)?"Es primo":"No es primo");


        System.out.println("Numeros primos del 1 al 100:");
        for (int i = 1; i <= 100 ; i++) {
            if (esPrimo(i)){
                System.out.print(i+" ");
            }
        }
    }
}