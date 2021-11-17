package exemploEntradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        /*String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);*/

        //char x;
        //x = sc.next().charAt(0);
        //System.out.println("Voce digitou: " + x);

        //double x;
        //x = sc.nextDouble();
        //System.out.printf("Voce digitou: %.2f\n", x);

        //double x;
        //x = sc.nextDouble();
        //System.out.println("Voce digitou: " + x);

        //int x;
        //x = sc.nextInt();
        //System.out.println("Voce digitou: " + x);

        //String x;
        //x = sc.next();
        //System.out.println("Voce digitou: " + x);

        sc.close();

    }
}
