package Aula31.Utilities;

import Aula31.Entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() <= 100;
    }
}