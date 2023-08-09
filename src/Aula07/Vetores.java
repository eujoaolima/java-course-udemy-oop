package Aula07;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        // Vetores

        /*
            Atividade: Fazer um programa para ler um número inteiro N e a altura de N
            pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
            altura média dessas pessoas.

            Exemplo:
                Input      |     Output
                3          |     AVERAGE HEIGHT = 1.69
                1.72       |
                1.56       |
                1.80       |
        */

        Scanner r = new Scanner(System.in);

        int num = r.nextInt();

        // Declarando o vetor

        double[] vetor = new double [num];

        // Adicionando valores aos elementos do vetor

        for(int i = 0; i < num; i++) {
            vetor[i] = r.nextDouble();
        }

        double soma = 0;
        for(int i = 0; i < num; i++) {
            soma+=vetor[i];
        }

        double media = soma / num;

        System.out.printf("A média das alturas é: %.2f", media);


        r.close();
    }
}
