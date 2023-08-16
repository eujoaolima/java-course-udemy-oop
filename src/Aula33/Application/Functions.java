package Aula33.Application;

import Aula33.Entities.Product;
import Aula33.Util.NovaLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Functions {
    public static void main(String[] args) {
        // Functions

        // Exercício de fixação

        /*
            Faça um programa que, a partir de uma lista de
            produtos, gere uma nova lista contendo os nomes
            dos produtos em caixa alta.
        */

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900));
        list.add(new Product("Mouse", 50));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Function<Product, String> func = p -> p.getName().toUpperCase();

        // List<String> batata = list.stream().map(new NovaLista()).collect(Collectors.toList());
        // List<String> batata = list.stream().map(Product::staticProductFunction).toList();
        // List<String> batata = list.stream().map(Product::nonStaticProductFunction).toList();
        // List<String> batata = list.stream().map(func).toList();
        List<String> batata = list.stream().map(p -> p.getName().toUpperCase()).toList();
        batata.forEach(System.out::println);
    }
}
