package Aula27.Application;

import Aula27.Entities.Product;
import Aula27.Services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericosDelimitados {
    public static void main(String[] args) {
        // Genéricos delimitados

        /*
            Situação problema:

            Uma empresa de consultoria deseja avalar a performance de produtos,
            funcionários, dentre outras coisas. Um dos cálculos que ela precisa é encontrar
            o maior dentre um conjunto de elementos. Faça um programa que leia um conjunto de
            produtos a partir de um arquivo, conforme exemplo, e depois mostre o mais caro deles.

            Exemplo:

            Computador, 3000
            Celular, 2000
            Tablet, 1500

            O mais caro:
            Computador, 3000
        */

        List<Product> list = new ArrayList<>();

        String path = "C:\\temp\\in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line!= null) {
                String[] fields = line.split(" ");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Max:" + x);
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
