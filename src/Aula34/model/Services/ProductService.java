package Aula34.model.Services;

import Aula34.Entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> product) {
        double soma = 0;
        for (Product p : list) {
            if (product.test(p)) {
                soma += p.getPrice();
            }
        }
        return soma;
    }
}
