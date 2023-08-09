package Aula09;

import java.util.*;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        // Listas

        // Lista de números inteiros
        List<Integer> list; // Uma lista não aceita tipos primitivos,
        // então escrever o código List<int> list; está incorreto.

        // Lista de String
        List<String> lista_string = new ArrayList<>();

        // Adicionar elementos à lista
        lista_string.add("Batata A");
        lista_string.add("Batata B");
        lista_string.add("Batata C");
        lista_string.add("Batata D");
        lista_string.add("Batata E");

        // Ler a lista
        for (String x : lista_string) {
            System.out.println(x);
        }

        System.out.println();

        // Adicionar itens em uma lista em uma posição específica
        lista_string.add(5, "Batata F");
        lista_string.add(2, "Batata Z");

        for (String x : lista_string) {
            System.out.println(x);
        }

        System.out.println();

        // Medir o tamanho da lista
        System.out.println(lista_string.size());

        for (String x : lista_string) {
            System.out.println(x);
        }

        System.out.println();

        // Remover um elemento da lista
        lista_string.remove(1); // É possível remover um elemento escrevendo seu conteúdo

        for (String x : lista_string) {
            System.out.println(x);
        }

        System.out.println();

        // Remover itens com algo em comum em uma lista
        lista_string.removeIf(x -> x.charAt(0) == 'B');

        for (String x : lista_string) {
            System.out.println(x);
        }

        System.out.println();

        // IndexOf

        lista_string.add("Batata A");
        lista_string.add("Batata B");
        lista_string.add("Batata C");
        lista_string.add("Batata D");
        lista_string.add("Batata E");

        System.out.println("Index of Batata D: " + lista_string.indexOf("Batata D"));

        for (String x : lista_string) {
            System.out.println(x);
        }

        System.out.println();

        // Filtrar lista com todos os elementos que possuem algum elemento em comum
        List<String> resultado = lista_string.stream().filter(x -> x.charAt(7) == 'E').toList();

        for (String x : resultado) {
            System.out.println(x);
        }

        System.out.println();

        // Como encontrar um item da lista que contenha o predicado descrito
        String nome = lista_string.stream().filter(x ->x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println(nome);
    }
}
