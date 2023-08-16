package Aula34.Application;

import Aula34.Entities.Product;
import Aula34.model.Services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Functions {
    public static void main(String[] args) {
        // Funções que recebem funções como parâmetro
        // Exercício de fixação

        /*
            Faça um programa que, a partir de uma lista de
            produtos,calcule a soma dos preços somente dos
            produtos cujo nome começa com "T".
        */

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900));
        list.add(new Product("Mouse", 50));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p ->
            p.getName().charAt(0) == 'M'
        );

        System.out.println("soma: " + String.format("%.2f", sum));
    }
}
