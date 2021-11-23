package exemploFuncoesSyntax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);
        showResult(higher);

        int totalSoma = soma(a, b, c);
        showSoma(totalSoma);

        int totalSubtracao = subtracao(a, b, c);
        showSubtracao(totalSubtracao);

        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }

    //função para somar
    public static int soma(int f, int g, int h) {
        int total;
        total = f + g + h;
        return total;
    }

    //função para exibir soma
    public static void showSoma(int value) {
        System.out.println("Soma dos tres valores é " + value);
    }

    //função para subtrair
    public static int subtracao(int f, int g, int h) {
        int total;
        total = f - g - h;
        return total;
    }

    //função para exibir subtracao
    public static void showSubtracao(int value) {
        System.out.println("Subtracao dos tres valores é " + value);
    }
}