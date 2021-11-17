package exerciciosEstruturaSequencial.exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner clcfuncionario = new Scanner(System.in);

        int nmrFuncionario, hrsTrabalhadas;
        double vlrHora, salario;

        System.out.println("\n-Calculo de salario do funcionario-");

        System.out.print("\nNumero do funcionario: ");
        nmrFuncionario = clcfuncionario.nextInt();

        System.out.print("Horas trabalhadas: ");
        hrsTrabalhadas = clcfuncionario.nextInt();

        System.out.print("Valor por hora trabalhada: ");
        vlrHora = clcfuncionario.nextDouble();

        salario = hrsTrabalhadas * vlrHora;

        System.out.println("\nNUMBER = " + nmrFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        clcfuncionario.close();
    }
}
