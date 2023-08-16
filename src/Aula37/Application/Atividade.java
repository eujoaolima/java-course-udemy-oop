package Aula37.Application;

import Aula37.Entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Atividade {
    public static void main(String[] args) {
        // Atividade - Filter, sorted, map, reduce

        /*
            Fazer um programa para ler um conjunto de produtos a partir de um
            arquivo em formato .csv (suponha que exista pelo menos um produto).
            Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
            nomes, em ordem decrescente, dos produtos que possuem preço
            inferior ao preço médio.

            Exemplo:

            Input file:
                Tv,900.00
                Mouse,50.00
                Tablet,350.50
                HD Case,80.90
                Computer,850.00
                Monitor,290.00

            Execution:
                Enter full file path: c:\temp\in.txt
                Average price: 420.23
                Tablet
                Mouse
                Monitor
                HD Case

        */

        Locale.setDefault(Locale.US);

        Scanner r = new Scanner(System.in);
        System.out.println("Enter full file path: ");
        String path = r.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream().map(Product::getPrice).reduce(0.0, Double::sum) / list.size();
            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = Comparator.comparing(String::toUpperCase);

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(Product::getName)
                    .sorted(comp.reversed())
                    .toList();

            names.forEach(System.out::println);


        } catch (IOException e) {
           System.out.println("Error: " + e.getMessage());
        }

        r.close();
    }
}
