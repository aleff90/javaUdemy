package exemploSwitchCase;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        int valor;
        String dia;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEntre com o valor: ");
        valor = sc.nextInt();

        switch (valor){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
/*Fazer um programa para ler um valor inteiro de 1 a 7 representando um
* dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
* Escrever na tela o dia da semana correspondente, conforme exemplos.
*
* entrada: 1, saida: Dia da semana: domingo
* entrada: 4, saida: Dia da semana: quarta
* entrada: 9, saida: Dia da semana: valor invalido*/