package exerciciosEstruturaSequencial.exercicio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c, d, dif;

        Scanner vlrIntr = new Scanner(System.in);

        System.out.println("\n-Calculo de diferença-");

        System.out.print("\nEntre com o valor de A: ");
        a = vlrIntr.nextInt();
        System.out.print("Entre com o valor de B: ");
        b = vlrIntr.nextInt();
        System.out.print("Entre com o valor de C: ");
        c = vlrIntr.nextInt();
        System.out.print("Entre com o valor de D: ");
        d = vlrIntr.nextInt();

        dif = ((a * b) - (c * d));

        System.out.println("\nDIFERENCA = " + dif);

        vlrIntr.close();
    }
}