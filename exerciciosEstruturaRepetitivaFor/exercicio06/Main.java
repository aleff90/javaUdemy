package exerciciosEstruturaRepetitivaFor.exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }

        sc.close();
    }
}
/*Ler um numero inteiro N e calcular todos os seus divisores.
 *
 * Exemplo:
 * entrada: 6, saida: 1
 *                    2
 *                    3
 *                    6
 * */