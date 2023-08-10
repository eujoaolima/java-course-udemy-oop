package Aula18;

import Aula18.Entities.Company;
import Aula18.Entities.Individual;
import Aula18.Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Atividades02 {
    public static void main(String[] args) {
        /*
            ATIVIDADE 02

            Fazer um programa para ler os dados de N contribuintes (N ornecido pelo usuário),
            os quais podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do
            imposto pago por cada um, bem como o total de imposto arrecadado.

            Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de
            pessoa jurídica são nome, renda anual e número de funcionários. As regras para cálculo
            de imposto são as seguintes:

            Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas
            com renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde,
            50% destes gastos são abatidos no imposto.

            Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica:
            (50000 * 25%) - (2000 * 50%) = 11500.00

            Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
            funcionários, ela paga 14% de imposto.

            Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
            400000 * 14% = 56000.00

            UML:

            _TaxPayer_:
                - name: String
                - anualIncome: Double
                + _tax()_: Double

            Individual:
                - healthExpenditures(): Double

            Company:
                - numberOfEmployees: int


            Exemplo:


            Digite o número de pagantes: 3

            Dados do pagante #1:
                CLT ou PJ (c/p)? c
                Nome: Batata
                Renda anual: 5000.00
                Gastos com saúde: 2000.00

             Dados do pagante #2:
                CLT ou PJ (c/p)? p
                Nome: Potato
                Renda anual: 400000.00
                Número de funcionários: 25

             Dados do pagante #3:
                CLT ou PJ (c/p)? c
                Nome: Patata
                Renda anual: 120000.00
                Gastos com saúde: 1000.00


            Pagar taxas:
                Batata: $ 11500.00
                Potato: $ 56000.00
                Patata: $ 29500.00

            TOTAL DE IMPOSTOS: $ 97000.00
        */

        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList();

        System.out.println("Digite o número de pagantes: ");
        int num = r.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Dados do pagante #" + (i + 1) + ":");
            System.out.println("CLT ou PJ (c/p)? ");
            char c = r.next().charAt(0);
            if (c == 'c') {
                System.out.println("Nome: ");
                String name = r.next();
                System.out.println("Renda anual: ");
                double anualIncome = r.nextDouble();
                System.out.println("Gastos com saúde: ");
                double healthExpenditures = r.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (c == 'p') {
                System.out.println("Nome: ");
                String name = r.next();
                System.out.println("Renda anual: ");
                double anualIncome = r.nextDouble();
                System.out.println("Número de funcionários: ");
                int numberOfEmployees = r.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println("Pagar taxas: ");
        for (TaxPayer taxPayer : list) {
            System.out.println(taxPayer.getName() + ": $" + taxPayer.tax());
        }
    }
}
