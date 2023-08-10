package Aula16;

import Aula16.Entities.Product;
import Aula16.Entities.ImportedProduct;
import Aula16.Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Atividades {
    public static void main(String[] args) throws ParseException {
        // Atividades

        /*
            Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final,
            mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.

            Todos os produtos possuem nome e preço. Produtos importados possuem uma taxa de alfândega,
            e produtos usados possuem data de fabricação. Estes dados específicos devem ser
            acrescentados na etiqueta de preço conforme exemplo.

            Para produtos importados, a taxa de alfândega deve ser acrescentada ao preço final do produto.

            Product:
            - Name: String
            - Price: Double
            + priceTag() : String

            ImportedProduct:
            - customsFee: Double
            + priceTag() : String
            + totalPrice() : Double

            UsedProduct:
            - manufactureDate: Date
            + priceTag() : String



            Exemplo:

            Digite o número de produtos: 3
            Dados do produto #1:
                Comum, usado ou importado (c/u/i) : i
                Nome: TV
                Preço: 100.00
                Taxa da alfândega : 20.00

            Dados do produto #2:
                Comum, usado ou importado (c/u/i) : u
                Nome: Celular
                Preço: 1200.00
                Taxa da alfândega : 540.00

            Dados do produto #3:
                Comum, usado ou importado (c/u/i) : c
                Nome: Batata
                Preço: 10.00
                Taxa da alfândega : 5.00

            Manufacture date (dd/MM/yyyy): 10/08/2023

            ----- Etiqueta de preços -----

            TV: $ 1220.00 (Taxas: $ 20.00)
            Celular (usado): $ 1200.00 (Taxas: $ 540.00)
            Batata: $ 10.00 (Taxas: $ 5.00)

            ----- Data da manufatura -----
            Data da manufatura: 10/08/2023
        */

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Digite o número de produtos: ");
        int num = r.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Dados do produto #" + (i + 1) + ":");
            System.out.println("Comum, usado ou importado (c/u/i) : ");
            char type = r.next().charAt(0);

            if (type == 'c') {
                System.out.println("Nome: ");
                String name = r.next();
                System.out.println("Preço: ");
                double price = r.nextDouble();

                Product p = new Product(name, price);
                list.add(p);

            } else if (type == 'u') {
                System.out.println("Nome: ");
                String name = r.next();
                System.out.println("Preço: ");
                double price = r.nextDouble();
                System.out.println("Data da manufatura (dd/MM/yyyy): ");
                Date manufactureDate = sdf.parse(r.next());

                Product p = new UsedProduct(name, price, manufactureDate);
                list.add(p);

            } else if (type == 'i') {
                System.out.println("Nome: ");
                String name = r.next();
                System.out.println("Preço: ");
                double price = r.nextDouble();
                System.out.println("Taxa da alfândega : ");
                double customsFee = r.nextDouble();

                Product p = new ImportedProduct(name, price, customsFee);
                list.add(p);
            }

            System.out.println("--------------------------------");
        }

        System.out.println(" ");
        System.out.println("----- Etiqueta de preços -----");
        for (Product p : list) {
            System.out.println(p.getName() + " " + p.priceTag());

            if (p instanceof UsedProduct usedProduct) {
                System.out.println("  * Data da manufatura: " + sdf.format(usedProduct.getManufactureDate()));
            }
        }


        r.close();
    }
}
