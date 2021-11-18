package exerciciosEstruturaRepetitivaFor.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int i, cTotal;
        double mp1 = 0, mp2 = 0, mp3 = 0, v1, v2, v3, v4, v5, v6, v7, v8, v9, p1 = 2, p2 = 3, p3 = 5;

        System.out.print("\nQuantos conjuntos no total: ");
        cTotal = sc.nextInt();

        System.out.println("Digite os valores do primeiro conjunto: ");
        v1 = sc.nextDouble();
        v2 = sc.nextDouble();
        v3 = sc.nextDouble();

        System.out.println("Digite os valores do segundo conjunto: ");
        v4 = sc.nextDouble();
        v5 = sc.nextDouble();
        v6 = sc.nextDouble();

        System.out.println("Digite os valores do terceiro conjunto: ");
        v7 = sc.nextDouble();
        v8 = sc.nextDouble();
        v9 = sc.nextDouble();

        for (i = 1; i <= cTotal; i++) {
            if (i == 1) {
                mp1 = ((v1 * p1 + v2 * p2 + v3 * p3) / (p1 + p2 + p3));
            } else if (i == 2) {
                mp2 = ((v4 * p1 + v5 * p2 + v6 * p3) / (p1 + p2 + p3));
            } else if (i == 3) {
                mp3 = ((v7 * p1 + v8 * p2 + v9 * p3) / (p1 + p2 + p3));
            }
        }

        System.out.printf("\n%.1f\n", mp1);
        System.out.printf("%.1f\n", mp2);
        System.out.printf("%.1f\n", mp3);

        sc.close();
    }
}
/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
 * peso 5.
 *
 * Exemplo:
 * entrada: 3
 *          6.5 4.3 6.2
 *          5.1 4.2 8.1
 *          8.0 9.0 10.0
 * saida: 5.7
 *        6.3
 *        9.3
 *
 * -------------------------------------------
 *
 * Mp = ((6.5x2)+(4.3x3)+(6.2x5)/(2+3+5))
 * Mp = ((13)+(12.9)+(31)/(10))
 * Mp = (56.9/10)
 * Mp = 5.7
 *
 * Mp = ((5.1x2)+(4.2x3)+(8.1x5)/(2+3+5))
 * Mp = ((10.2)+(12.6)+(40.5)/(10))
 * Mp = (63.3/10)
 * Mp = 6.3
 *
 * Mp = ((8.0x2)+(9.0x3)+(10.0x5)/(2+3+5))
 * Mp = ((16)+(27)+(50)/(10))
 * Mp = (93/10)
 * Mp = 9.3
 * */