package Aula03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = r.nextLine();

        System.out.print("Price: ");
        product.price = Double.parseDouble(r.nextLine());

        System.out.print("Quantity in stock: ");
        product.quantity = Integer.parseInt(r.nextLine());

        System.out.println("------------------------");
        System.out.println("Product data: " + product);

        System.out.println("------------------------");
        System.out.println("Enter the number of products that will be added in stock: ");

        int quantity = r.nextInt();
        product.addProducts(quantity);

        System.out.println("------------------------");
        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products that will be removed from stock: ");

        quantity = r.nextInt();
        product.removeProducts(quantity);

        System.out.println("------------------------");
        System.out.println("Updated data: " + product);
    }
}
