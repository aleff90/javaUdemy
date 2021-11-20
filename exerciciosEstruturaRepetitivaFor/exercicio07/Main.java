package exerciciosEstruturaRepetitivaFor.exercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, n, primeiro, segundo, terceiro;

        System.out.print("\ndigite um numero: ");
        n = sc.nextInt();


        for (i = 1; i <= n; i++) {

            primeiro = i;
            segundo = i * i;
            terceiro = i * i * i;
            System.out.printf("%d %d %d %n", primeiro, segundo, terceiro);

        }

        sc.close();

    }
}
/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
 * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
 * exemplo.
 *
 * Exemplo:
 * entrada: 5, saida: 1 1 1
 *                    2 4 8
 *                    3 9 27
 *                    4 16 64
 *                    5 25 125
 * */