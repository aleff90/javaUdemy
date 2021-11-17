package exercicioEstruturaCondicional.exercicio07;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double x, y;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o valor de x: ");
        x = sc.nextDouble();
        System.out.print("Digite o valor de y: ");
        y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante Q1");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante Q3");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante Q2");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante Q4");
        }
        sc.close();
    }
}
/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
 * de um ponto num plano. A seguir, determine qual o quadrante, ao qual pertence o
 * ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
 * Se o ponto estiver na origem, escreva a mensagem "Origem".
 * Se o ponto estiver sobre um dos eixos escreva "Eixo X" ou "Eixo Y", conforme for a situação.
 * exemplos:
 * entrada: 4.5, -2.2, saida: Q4
 * entrada: 0.1, 0.1, saida: Q1
 * entrada: 0.0, 0.0, saida: Origem
 * */