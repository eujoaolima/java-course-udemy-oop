package Aula16.Entities;

import java.util.Date;

public class ImportedProduct extends Product {
    private Double customFees;

    public ImportedProduct(Double customFees) {
        this.customFees = customFees;
    }

    public ImportedProduct(String name, Double price, Double customFees) {
        super(name, price);
        this.customFees = customFees;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + " (Taxas: $" + customFees + ")";
    }

    public Double totalPrice() {
        return super.getPrice() + customFees;
    }
}
