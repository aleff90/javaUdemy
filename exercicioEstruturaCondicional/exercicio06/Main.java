package exercicioEstruturaCondicional.exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);

        double vlr;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite um valor: ");
        vlr = sc.nextDouble();

        if (vlr < 0 || vlr > 100){
            System.out.print("Fora do intervalo");
        }
        else if (vlr <= 25){
            System.out.print("Intervalo [0,25]");
        }
        else if (vlr <= 50){
            System.out.print("Intervalo (25,50]");
        }
        else if (vlr <= 75){
            System.out.print("Intervalo (50,75]");
        }
        else if (vlr <= 100){
            System.out.print("Intervalo (75,100]");
        }
        sc.close();
    }
}
/*Faça um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
* seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente
* se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem "Fora do intervalo"
* exemplos:
* entrada: 25.01, saida: Intervalo (25,50]
* entrada: 25.00, saida: Intervalo [0,25]
* entrada: 100.0, saida: Intervalo (75,100]
* entrada: -25.02, saida: Fora de intervalo
* */