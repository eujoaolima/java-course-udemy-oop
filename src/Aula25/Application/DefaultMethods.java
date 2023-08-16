package Aula25.Application;

import Aula25.Services.BrazilInterestService;
import Aula25.Services.InterestService;
import Aula25.Services.USAInterestService;

import java.util.Locale;
import java.util.Scanner;

public class DefaultMethods {
    public static void main(String[] args) {
        // Default Methods

        // Atividade de exemplo:

        /*
             Faça um programa que leia uma quantia e a duração em meses de um empréstimo, conforme
             regras de juros do Brasil. A regra de cálculo de juros do Brasil é juros comporto padrão de
             2% a.m.

             Veja o exemplo:

             ---- PT-br -----
             Quantia: 200.00
             Meses: 3
             Pagamento após 3 meses:
             212.24

             ----- US -----
             Quantia: 200.00
             Meses: 3
             Pagamento após 3 meses:
             206.06

        */

        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);

        System.out.println("Quantia: ");
        double quantia = r.nextDouble();
        System.out.println("Meses: ");
        int meses = r.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(quantia, meses);

        InterestService USis = new USAInterestService(1.0);
        double paymentUS = USis.payment(quantia, meses);

        System.out.println("Pagamento após " + meses + " meses no Brasil: " + String.format("%.2f", payment));
        System.out.println("Pagamento após " + meses + " meses nos EUA: " + String.format("%.2f", paymentUS));

        r.close();
    }
}
