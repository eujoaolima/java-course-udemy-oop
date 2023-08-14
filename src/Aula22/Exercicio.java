package Aula22;

import Aula22.Entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        // Exercício proposto

        /*
             Fazer um programa para ler o caminho de um arquivo .csv contendo
             os dados de itens vendidos. Cada item possui um nome, preço unitário
             e quantidade, separados por vírgula. Você deve gerar um novo aquivo chamado
             "summary.csv", localizado em uma subpasta chamada "out" a partir da pasta original
             do arquivo de origem, contendo apenas o nome e o valor total para aquele item (preço
             unitário x quantidade).

             Exemplo:
                * Source file:
                    TV LED, 1290.99, 1
                    Video Game Chair, 350.50, 3
                    Iphone X, 900.00, 2
                    Batata, 100, 1

                * Output file(out;summary.csv):
                    TV LED, 1290.99
                    Video Game Chair, 1051.50
                    Iphone X, 1800.00
                    Batata, 100
        */

        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Digite o caminho do arquivo:");
        String sourceFileStr = r.nextLine();
        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();
//        System.out.println(sourceFolderStr);

        boolean success = new File(sourceFolderStr + "\\out").mkdir();
        System.out.println(success);

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();
            while(itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                list.add(new Product(name, price, quantity));
                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Product p : list) {
                    bw.write(p.getName() + ", " + String.format("%.2f", p.total()));
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        r.close();

    }
}
