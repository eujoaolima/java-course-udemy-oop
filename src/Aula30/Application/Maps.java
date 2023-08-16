package Aula30.Application;

import java.io.*;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) throws ParseException {
        // Maps

        // Exercício de fixação

        /*
            Na contagem de votos de uma eleição, são gerados vários registros de
            votação contendo o nome do candidato e a quantidade de votos (formato .csv)
            que ele obteve em uma urna de votação. Você deve fazer um programa para ler
            os registros de votação a partir de um arquivo, e daí gerar um relatório
            consolidado com os totais de cada candidato.

            Exemplo:

            Input file example:
                João, 15
                Pedro, 22
                Bob, 21
                João, 18
                Pedro, 17
                Bob, 15
                João, 31
                Pedro, 19
                Bob, 18

             Execution:
                Digite o caminho completo do arquivo: c:\temp\in.txt
                João: 64
                Pedro: 58
                Bob: 54
        */

        Scanner r = new Scanner(System.in);

        Map<String, Integer> cookies = new LinkedHashMap<>();

        System.out.println("Digite o caminho completo do arquivo: ");
        String path = r.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while(line != null) {
                String[] values = line.split(",");
                String name = values[0].trim();;
                int votes = Integer.parseInt(values[1].trim());

                if (cookies.containsKey(name)) {
                    int votesSoFar = cookies.get(name);
                    cookies.put(name, votes + votesSoFar);
                } else {
                    cookies.put(name, votes);
                }
                line = br.readLine();
            }

            for(String k : cookies.keySet()) {
                System.out.println(k + ": " + cookies.get(k));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        };

        r.close();

    }
}
