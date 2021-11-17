package exerciciosEstruturaSequencial.exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner valores = new Scanner(System.in);

        float a, b, c, areaTriRet, areaCircl, areaTrpz, areaQdr, areaRet;
        double pi = 3.14159;

        System.out.println("\n-Calculo de ponto flutuante com dupla precisão-");

        System.out.print("\nEntre com o valor de A: ");
        a = valores.nextFloat();

        System.out.print("Entre com o valor de B: ");
        b = valores.nextFloat();

        System.out.print("Entre com o valor de C: ");
        c = valores.nextFloat();

        areaTriRet = (a * c) / 2;
        areaCircl = (float) pi * (c * c);
        areaTrpz = ((a + b) * c) / 2;
        areaQdr = b * b;
        areaRet = a * b;

        System.out.printf("\nTRIANGULO: %.3f\n", areaTriRet);
        System.out.printf("CIRCULO: %.3f\n", areaCircl);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrpz);
        System.out.printf("QUADRADO: %.3f\n", areaQdr);
        System.out.printf("RETANGULO: %.3f\n", areaRet);

        valores.close();
    }
}
