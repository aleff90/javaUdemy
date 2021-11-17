package exercicioEstruturaCondicional.exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Locale.setDefault(Locale.US);

        int item, quantidade;
        double total;

        Scanner sc = new Scanner(System.in);

        System.out.println("\n-Tabela de preços-");
        System.out.println("1 -> Cachorro Quente - R$4.00");
        System.out.println("2 -> X-Salada - R$4.50");
        System.out.println("3 -> X-Bacon - R$5.00");
        System.out.println("4 -> Torrada Simples - R$2.00");
        System.out.println("5 -> Refrigerante - R$1.50");

        System.out.print("\nDigite o codigo do item desejado: ");
        item = sc.nextInt();

        if (item == 1){
            System.out.print("Entre com a quantidade desejada: ");
            quantidade = sc.nextInt();
            total = 4.00 * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (item == 2){
            System.out.print("Entre com a quantidade desejada: ");
            quantidade = sc.nextInt();
            total = 4.50 * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (item == 3){
            System.out.print("Entre com a quantidade desejada: ");
            quantidade = sc.nextInt();
            total = 5.00 * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (item == 4){
            System.out.print("Entre com a quantidade desejada: ");
            quantidade = sc.nextInt();
            total = 2.00 * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (item == 5){
            System.out.print("Entre com a quantidade desejada: ");
            quantidade = sc.nextInt();
            total = 1.50 * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        }
        else {
            System.out.println("Item não encontrado!");
        }

        sc.close();

    }
}

/*Com base na tabela abaixo, escreva um programa que leia o codigo de um item e a quantidade deste item.
* A seguir, calcule e mostre o valor a pagar.
* codigo, especificação, preço
* 1, Cachorro Quente, R$4.00
* 2, X-Salada, R$4.50
* 3, X-Bacon, R$5.00
* 4, Torrada simples, R$2.00
* 5, Refrigerante, R$1.50
* entrada-> 3 2, saida-> Total: R$ 10.00
* entrada-> 2 3, saida-> Total: R$ 13.50*/