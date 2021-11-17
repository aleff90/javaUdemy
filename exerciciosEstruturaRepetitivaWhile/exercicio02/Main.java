package exerciciosEstruturaRepetitivaWhile.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o valor de X: ");
        x = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }

            System.out.print("\nDigite o valor de X: ");
            x = sc.nextInt();
            System.out.print("Digite o valor de Y: ");
            y = sc.nextInt();

        }
        System.out.println(" ");
        sc.close();
    }
}
/*Escreva um programa para ler as coordenadas (X, Y) de uma quantidade indeterminada de pontos no sistema
 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
 * menos uma das duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 * exemplo
 * entrada: 2 2, saida: primeiro
 * entrada: 3 -2, saida: quarto
 * entrada: -8 -1, saida: terceiro
 * entrada: -7 1, saida: segundo
 * entrada: 0 2, saida: */