package exerciciosEstruturaRepetitivaFor.exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int totalPar, i, primeiroNumero, segundoNumero;
        double resultado;

        System.out.print("\nTotal de pares de números: ");
        totalPar = sc.nextInt();

        for (i = 1; i <= totalPar; i++) {
            System.out.print("Entre com o primeiro numero a ser dividido: ");
            primeiroNumero = sc.nextInt();
            System.out.print("Entre com o segundo numero a ser dividido: ");
            segundoNumero = sc.nextInt();

            if (segundoNumero == 0) {
                System.out.println("Divisão impossível");
            } else {
                resultado = (double) primeiroNumero / segundoNumero;
                System.out.println(resultado);
            }
        }
        sc.close();
    }
}
/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisão impossível".
 *
 * Exemplo:
 * entrada: 3       saida:
 *          3, -2          -1.5
 *          -8, 0          divisão impossível
 *          0, 8           0.0
 * */