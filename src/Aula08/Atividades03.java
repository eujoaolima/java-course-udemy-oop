package Aula08;

import java.util.Locale;
import java.util.Scanner;

public class Atividades03 {
    public static void main(String[] args) {
        // Atividades 03

        /*
            Fazer um programa para ler nome, idade e altura de N pessoas,
            conforme exemplo. Depois, mostrar na tela a altura média das
            alturas das pessoas, e mostrar tambpem a porcentagem de pessoas
            com menos de 16 anos, bem como os nomes dessas pessoas caso houver.

            Exemplo:

            Quantas pessoas serão digitadas: 5

            Dados da 1ª Pessoa:
            Nome: Batata
            Idade: 12
            Altura: 1.80

            Dados da 2ª Pessoa:
            Nome: Potato
            Idade: 21
            Altura: 1.70

            Dados da 3ª Pessoa:
            Nome: French Fries
            Idade: 15
            Altura: 1.72

            Dados da 4ª Pessoa:
            Nome: Batata palha
            Idade: 14
            Altura: 1.65

            Dados da 5ª Pessoa:
            Nome: Batata assada
            Idade: 41
            Altura: 1.94

            A Média da altura das pessoas é: X.YZ
            60% das pessoas possuem menos de 16 anos
            Nomes: Batata, French Fries, Batata palha

        */
        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas? ");
        int num = r.nextInt();

        String[] nomes = new String[num];
        int[] idades = new int[num];
        double[] alturas = new double[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa: ");
//            nomes[i] += nomes.length;
//            idades[i] += idades.length;
//            alturas[i] += alturas.length;

            System.out.println("Nome: ");
            nomes[i] = r.next();
            System.out.println("Idade: ");
            idades[i] = r.nextInt();
            System.out.println("Altura: ");
            alturas[i] = r.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < alturas.length; i++) {
            soma = soma + alturas[i];
        }

        double media = soma / alturas.length;

        System.out.printf("Média das alturas: %.2f", media);

        int contagem = 0;
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 16) {
                contagem = contagem + 1;
            }
        }

        double porcentagem = contagem * 100 / num;
        System.out.println();
        System.out.println(porcentagem + "% das pessoas possuem menos de 16 anos");

        System.out.println("Pessoas que possuem menos de 16 anos:");

        for (int i = 0; i < num; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        r.close();
    }
}
