package exerciciosEstruturaSequencial.exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;
        double vlrUnitarioPeca1, vlrUnitarioPeca2, subTotal1, subTotal2, total;

        Scanner entrVal = new Scanner(System.in);

        System.out.println("\n-Calculo de valor a ser pago-");

        System.out.print("\nCodigo da peça 1: ");
        codigoPeca1 = entrVal.nextInt();

        System.out.print("Quantidade de peças 1: ");
        numeroPecas1 = entrVal.nextInt();

        System.out.print("Valor de cada peça 1: ");
        vlrUnitarioPeca1 = entrVal.nextDouble();

        System.out.print("Codigo da peça 2: ");
        codigoPeca2 = entrVal.nextInt();

        System.out.print("Quantidade de peças 2: ");
        numeroPecas2 = entrVal.nextInt();

        System.out.print("Valor de cada peça 2: ");
        vlrUnitarioPeca2 = entrVal.nextDouble();

        subTotal1 = numeroPecas1 * vlrUnitarioPeca1;
        subTotal2 = numeroPecas2 * vlrUnitarioPeca2;
        total = subTotal1 + subTotal2;

        System.out.printf("\nVALOR A PAGAR: R$ %.2f\n", total);

        entrVal.close();
    }
}