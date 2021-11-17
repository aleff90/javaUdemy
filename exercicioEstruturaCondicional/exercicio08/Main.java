package exercicioEstruturaCondicional.exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double salario, imposto;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com o valor do salario: ");
        salario = sc.nextDouble();

        if (salario >= 0.00 && salario <= 2000.00) {
            imposto = 0.0;
        } else if (salario >= 2000.01 && salario <= 3000.00) {
            imposto = (salario - 2000.0) * 0.08;
        } else if (salario >= 3000.01 && salario <= 4500.00) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", imposto);
        }

        sc.close();
    }
}
/*Num país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar impostos, pois sabem
 * que nele não existem politicos corruptos e os recursos arrecadados são utilizados em beneficio da população, sem
 * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
 * Leia um valor com duas casas decimais, equivalente ao salario de uma pessoa de Lisarb. Em seguida, calcule e
 * mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo:
 *
 * Renda de R$ 0.00 a R$ 2000.00, Imposto de renda isento
 * Renda de R$ 2000.01 a R$ 3000.00, Imposto de renda 8%
 * Renda de R$ 3000.01 a R$ 4500.00, Imposto de renda 18%
 * Renda acima de R$ 4500.00, Imposto de renda 28%
 *
 * Lembre que, se o salario for R$ 3002.00, a taxa que inside é de 8% apenas sobre R$ 1000.00, pois a faixa de
 * salario que fica de R$ 0.00 até R$ 2000.00 é isenta de imposto de Renda. No exemplo fornecido (abaixo), a taxa é
 * de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
 * duas casas decimais.
 *
 * exemplos:
 * entrada: 3002.00, saida: R$ 80.36
 * entrada: 1701.02, saida: Isento
 * entrada: 4520.00, saida: R$ 355.60
 * */