package Aula32.Application;

import Aula32.Entities.Product;
import Aula32.Util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
        // Consumer

        // Exercício de fixação

        /*
            Faça um programa que, a partir de uma lista de
            produtos, aumente o preço dos produtos em 10%.
        */

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900));
        list.add(new Product("Mouse", 50));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);

//        double factor = 1.1;
//        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);

        // list.forEach(new PriceUpdate());
        // list.forEach(Product::staticProductConsumer);
        // list.forEach(Product::nonStaticProductConsumer);
        // list.forEach(cons);

        list.forEach(System.out::println);
    }
}
