package exerciciosEstruturaRepetitivaWhile.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int selecao = 0;
        int alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("Digite a preferencia dos clientes:");

        while (selecao != 4) {
            if (selecao == 1) {
                alcool = alcool + 1;
            } else if (selecao == 2) {
                gasolina = gasolina + 1;
            } else if (selecao == 3) {
                diesel = diesel + 1;
            }

            selecao = sc.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}

/*Um posto de combustíveis deseja determinar qual dos seus produtos tem a preferência dos seus clientes. Escreva
 * um algoritmo para ler o tipo do combustível abastecido (codificado da seguinte forma: 1.Álcool, 2.Gasolina, 3.Diesel,
 * 4.Fim). Caso o utilizador informe um codigo invalido (fora da faixa de 1 a 4) deve ser solicitado um novo (até
 * que seja valido). O programa sera encerrado quando o codigo informado for o número 4. Deve ser escrito a
 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada categoria de combustível, conforme
 * exemplo.
 *
 * entrada: 8, 1, 7, 2, 2, 4
 * saida: MUITO OBRIGADO
 *        Álcool: 1
 *        Gasolina: 2
 *        Diesel: 0
 * */