package Aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    // Exercício de fixação

    /*
        Fazer um programa para ler um número inteiro N e depois os dados(id, nome e salário)
        de N funcionários. Não deve haver repetição de ID.

        Em seguida, efetuar o aumento de X por cento no salário de um determinado
        funcionário. Para isso, o programa deve ler um ID e o valor X. Se o ID informado
        não existir, mostrar uma fmensagem e abortar a operação. Ao final, mostrar a listagem
         atualizada dos funcionários, conforme exemplos.

        Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário
         possa ser mudado livremente. Um salário só pode ser aumenado com base em uma
         operação de aumento por porcentagem dada.

        Exemplo:

        Quantos empregados serão registrados? 3

        Funcionário #1:
        ID: 100
        Nome: Batata
        Salário: 1000.00

        Funcionário #2:
        ID: 101
        Nome: Batatinha
        Salário: 4312.00

        Funcionário #3:
        ID: 102
        Nome: Batatão
        Salário: 2314.00

        Digite o ID do funcionário que terá seu salário aumentado: 100
        Digite a porcentagem: 10.0

        Lista de empregados:

        100, Batata, 1100
        101, Batatinha, 4312
        102, Batatão, 2314
    */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);

        List<Empregados> empregadosList = new ArrayList<>();

        System.out.println("Quantos funcionários serão empregados? ");
        int num = r.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println();
            System.out.println("Funcionário #" + (i+1));

            System.out.print("ID: ");
            Integer id = r.nextInt();
            while (hasId(empregadosList, id)) {
                System.out.println("ID já em uso, tente novamente");
            }

            System.out.print("Nome: ");
            String nome = r.next();

            System.out.print("Salário: ");
            Double salario = r.nextDouble();

            Empregados empregado = new Empregados(id, nome, salario);
            empregadosList.add(empregado);
        }

        System.out.println("Digite o ID do funcionário que receberá um aumento salarial: ");
        int idSalario = r.nextInt();
        Integer posicao = position(empregadosList, idSalario);
        if (posicao == null) {
            System.out.println("ID inválido, digite novamente");
        } else {
            System.out.println("Digite a porcentagem do aumento: ");
            double porcentagem = r.nextDouble();
            empregadosList.get(posicao).aumentarSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionários:");
        for (Empregados funcionario : empregadosList) {
            System.out.println(funcionario);
        }

        r.close();
    }

    static Integer position(List<Empregados> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    static boolean hasId(List<Empregados> lista, int id) {
        Empregados funcionario = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionario != null;
    }
}
