package exerciciosEstruturaRepetitivaFor.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, i, in = 0, out = 0;

        System.out.print("\nDigite o valor de N: ");
        n = sc.nextInt();

        for (i = 0; i <= 4; i++) {
            if (n >= 10 && n <= 20) {
                in++;
            } else {
                out++;
            }
            System.out.print("Digite outro valor para N: ");
            n = sc.nextInt();
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
/*Leia um valor inteiro N. Este valor sera a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo e "out" para fora do intervalo).
 *
 * exemplo:
 * entrada: 5, 14, 123, 10, -25, 32
 * saida: 2 in, 3 out
 * */