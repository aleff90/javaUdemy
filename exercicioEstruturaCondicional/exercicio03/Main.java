package exercicioEstruturaCondicional.exercicio03;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        int a, b;

        Scanner sc = new Scanner (System.in);

        System.out.print("\nEntre com o valor de A: ");
        a = sc.nextInt();
        System.out.print("Entre com o valor de B: ");
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("\nSao multiplos");
        } else {
            System.out.println("\nNao sao multiplos");
        }

        sc.close();
    }
}

/*leia 2 valores inteiros (A e B). Apos, o programa deve mostrar uma mensagem
* "Sao multiplos" ou "Nao sao multiplos", indicando se os valores são multiplos
* entre si. Atençao: os numeros devem ter a possibilidade de serem digitados em
* ordem crescente ou decrescente.
* entrada: 6 24, saída: Sao multiplos
* entrada: 6 25, saída: Nao sao multiplos
* entrada: 24 6, saída: Sao multiplos*/