package Aula29.Application;

import Aula29.Entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SETS {
    public static void main(String[] args) {
        // Exercício de fixação: Set


        /*
            Um site de internet registra um log de acessos dos usuários. um registro
            de log consiste no nome de usuário (apenas uma palavra) e o instante
            em que o usuário acessou o site no padrão ISO 8601, separados por espaço,
            conforme exemplo. Faça um programa que lea o log de acessos a partir de um arquivo,
            e daí informe quantos usuários distintos acessaram o site.

            Exemplo:
                Input file:
                    Amanda 25/06/2023T20:45:02Z
                    Robson 26/06/2023T20:45:02Z
                    José 27/06/2023T20:45:02Z
                    Guilherme 28/06/2023T20:45:02Z
                    Amanda 29/06/2023T20:45:02Z
                    Pedro 30/06/2023T20:45:02Z

                Execution:
                    Digite o caminho completo do arquivo: c:\temp\in.txt
                    Total de usuários: 6
        */

        Scanner r = new Scanner(System.in);

        System.out.println("Digite o caminho completo do arquivo: ");
        String path = r.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment));
                line = br.readLine();
            }
            System.out.println("Total de usuários: " + set.size());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        r.close();
    }
}
