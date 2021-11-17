package exercicioEstruturaCondicional.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite um numero: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("\nNEGATIVO");
        } else {
            System.out.println("\nNAO NEGATIVO");
        }

        sc.close();
    }
}

/*codigo que leia um numero inteiro e dizer se este numero é negativo ou nao
* exemplo:
* entrada -10, saída NEGATIVO
* entrada 8, saída NAO NEGATIVO
* entrada 0, saída NAO NEGATIVO*/