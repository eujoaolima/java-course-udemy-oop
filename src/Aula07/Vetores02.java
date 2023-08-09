package Aula07;

import java.util.Scanner;

public class Vetores02 {
    /*
        Atividade 02:

        Fazer um programa para ler um número inteiro N e os
        dados (nome e preço) de N produtos. Armazene os N produtos
        em um vetor. Em seguida, mostrar o preço médio dos produtos.

        Exemplo:
                Input      |     Output
                3          |     AVERAGE HEIGHT = 700
                TV         |
                900        |
                Air Fryer  |
                400        |
                Stove      |
                800        |

    */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int num = r.nextInt();
        Produto[] vetor = new Produto[num];

        for (int i = 0; i < vetor.length; i++) {
            r.next();
            String nome = r.nextLine();
            double preco = r.nextDouble();

            vetor[i] = new Produto(nome, preco);
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPreco();
        }

        double media = soma / vetor.length;
        System.out.printf("A média dos preços é de: %.2f", media);

        r.close();
    }
}
