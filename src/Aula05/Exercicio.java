package Aula05;

import java.util.Scanner;

public class Exercicio {
    /*
        Faça um programa para ler a cotação do dólar, e depois um valor em dólares
        a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai
        pagar pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF
        sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável
        pelos cálculos.

        Exemplo:
            Qual a cotação do dólar? 3.10
            Quantos dólares você irá comprar? 200
            Quantia a ser paga em reais: 657.20
    */


    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        CurrencyConverter m = new CurrencyConverter();

        System.out.println("Quantos dólares você irá comprar? ");
        double moeda = r.nextDouble();
        double valorReal = CurrencyConverter.realDolar(moeda);

        System.out.printf("Valor em reais: %f", moeda);
        System.out.printf("A cotação do dólar é: %f", CurrencyConverter.DOLAR);
        System.out.printf("Você terá U$ %f", valorReal);
    }

}
