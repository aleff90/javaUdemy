package exerciciosEstruturaRepetitivaWhile.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int senha;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite a senha: ");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida!");
            System.out.print("Digite a senha novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
/*Escreva um programa que repita a leitura de uma senha até que seja valida. Para cada leitura de senha
 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado, considere que a senha correta é o valor 2002.
 * exemplo:
 * entrada: 2200, saida: Senha Invalida
 * entrada: 1020, saida: Senha Invalida
 * entrada: 2022, saida: Senha Invalida
 * entrada: 2002, saida: Acesso Permitido*/