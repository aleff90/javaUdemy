package exercicioEntradaSaidaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, area, metroQuadrado, preco;

        System.out.println("\n-Cálculo de área e preço por metro quadrado do terreno-");
        System.out.print("\nDigite a largura: ");
        largura = sc.nextDouble();
        System.out.print("Digite o comprimento: ");
        comprimento = sc.nextDouble();
        System.out.print("Digite o preço por metro quadrado: ");
        metroQuadrado = sc.nextDouble();

        area = largura * comprimento;
        preco = metroQuadrado * area;

        System.out.print("\nA área do terreno é de " + area + " metros quadrados");
        System.out.printf(", preço total $%.2f\n", preco);

        sc.close();

    }
}
