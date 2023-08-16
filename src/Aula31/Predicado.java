package Aula31;

import Aula31.Entities.Product;
import Aula31.Utilities.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        // Predicate

        // Exercício de fixação

        /*
            Faça um programa que, a partir de uma lista de
            produtos, remova da lista somente aqueles cujo
            preço mínimo seja 100.
        */

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900));
        list.add(new Product("Mouse", 50));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Predicate<Product> pred = p -> p.getPrice() <= 100;

        // list.removeIf(x -> x.getPrice() <= 100);
        // list.removeIf(new ProductPredicate());
        // list.removeIf(Product::staticProductPredicate);
        // list.removeIf(Product::nonStaticProductPredicate);
        // list.removeIf(pred);

        double min = 100;

        list.removeIf(p -> p.getPrice() <= min);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
