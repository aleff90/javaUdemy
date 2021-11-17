package exerciciosEstruturaSequencial.exercicio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner soma = new Scanner(System.in);

        int a, b, total;

        System.out.print("\nDigite a primeira entrada: ");
        a = soma.nextInt();
        System.out.print("Digite a segunda entrada: ");
        b = soma.nextInt();

        total = a + b;

        System.out.print("SOMA = " + total);

        soma.close();
    }
}
