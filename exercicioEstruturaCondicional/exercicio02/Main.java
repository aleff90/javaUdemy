package exercicioEstruturaCondicional.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntrada: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("\nPAR");
        } else {
            System.out.println("\nIMPAR");
        }

        sc.close();
    }
}

/*codigo para ler um numero e dizer se este numero é par ou impar
* entrada: 12, saída: PAR
* entrada: -27, saída: IMPAR
* entrada: 0, saída: PAR*/