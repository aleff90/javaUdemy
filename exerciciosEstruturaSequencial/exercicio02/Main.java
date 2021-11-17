package exerciciosEstruturaSequencial.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner raioEntrd = new Scanner(System.in);

        double area, raioCalc, pi = 3.14159;

        System.out.println("\n-Calculo de área circular-");
        System.out.print("\nDigite o raio do círculo para calcular a área: ");
        raioCalc = raioEntrd.nextDouble();

        area = pi * (raioCalc * raioCalc);

        System.out.printf("A = %.4f\n", area);

        raioEntrd.close();
    }
}
