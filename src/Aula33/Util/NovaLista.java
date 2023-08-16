package Aula33.Util;

import Aula33.Entities.Product;

import java.util.function.Function;

public class NovaLista implements Function<Product, String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
