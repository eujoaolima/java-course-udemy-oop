package Aula26.Application;

import Aula26.Services.PrintService;
import Aula26.Services.PrintService2;
import Aula26.Services.PrintServiceString;

import java.util.Scanner;

public class GenericsEx2 {
    // Exercício de fixação 2: type safety & performance

    /*
        Deseja-se fazer um programa que leia uma quantidade N,
        e depois N nomees de pessoas. Ao final, imprima esses
        números de forma organizada conforme exemplo. Em seguida,
        informar qual foi o primeiro valor informado.

        Exemplo:

        Quantos números:
        3
        1
        2
        3
        [1, 2, 3]
        Primeiro valor: 1

    */

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        PrintService2<Integer> ps = new PrintService2<>();

        System.out.println("Quantos números?");
        int n = r.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = r.nextInt();
            ps.addValue(value);
        }

        ps.print();

        Integer x = ps.first();
        System.out.println("Primeiro número: " + x);

        r.close();
    }
}
