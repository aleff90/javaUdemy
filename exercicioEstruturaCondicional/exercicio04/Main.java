package exercicioEstruturaCondicional.exercicio04;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.print("\nHora inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Hora final: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.print("O JOGO DUROU " + duracao + " HORAS");

        sc.close();

    }
}

/*Leia a hora inicial e hora final de um jogo. A seguir calcule a duração do jogo,
* sabendo que o mesmo pode começar em um dia e terminar no outro, tendo uma duração
* minima de 1 hora e maxima de 24 horas.
* entrada: 16 2, saida: O JOGO DUROU 10 HORA(S)
* entrada: 0 0, saida: O JOGO DUROU 24 HORA(S)
* entrada: 2 16, saida: O JOGO DUROU 14 HORA(S)*/