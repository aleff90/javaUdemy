package exerciciosEstruturaRepetitivaFor.exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat *= i;
        }

        System.out.println(fat);

        sc.close();

    }
}

/*Ler um valor N. Calcular e escrever o respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) *...* 1.
 * Lembrando que, por definição, fatorial de 0 é 1.
 *
 * Exemplos:
 * entrada: 4, saida: 24
 * entrada: 1, saida: 1
 * entrada: 5, saida: 120
 * entrada: 0, saida: 1
 * */