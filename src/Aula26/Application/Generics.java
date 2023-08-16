package Aula26.Application;

import Aula26.Services.PrintService;
import Aula26.Services.PrintServiceString;

import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        // Generics

        // Exercício de fixação 1 (Reuso):

        /*
            Deseja-se fazer um programa que leia uma quantidade N,
            e depois N números inteiros. Ao final, imprima esses números
            de forma organizada conforme exemplo. Em seguida, informar qual
            foi o primeiro valor informado.

            Exemplo:

            Quantos números? 3
            10
            8
            23
            [10, 8, 23]
            Primeiro: 10
        */

        Scanner r = new Scanner(System.in);

        PrintService ps = new PrintService();

        PrintServiceString pss = new PrintServiceString();

        System.out.println("Quantos números?");
        int n = r.nextInt();

        for (int i = 0; i < n; i++) {
            int value = r.nextInt();
            ps.addValue(value);
        }

        ps.print();

        System.out.println("Primeiro número: " + ps.first());

        System.out.println("Quantas palavras?");
        int num = r.nextInt();

        for (int i = 0; i < num; i++) {
            String value = r.next();
            pss.addValue(value);
        }

        pss.print();
        System.out.println("Primeira palavra: " + pss.first());

        r.close();
    }
}
