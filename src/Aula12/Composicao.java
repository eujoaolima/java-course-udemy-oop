package Aula12;

import Aula12.Entities.Department;
import Aula12.Entities.Enum.WorkerLevel;
import Aula12.Entities.HourContract;
import Aula12.Entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Composicao {
    public static void main(String[] args) throws ParseException {
        // Composição

        /*
            ATIVIDADE

            Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário).
            Depois, solicitar do usuário um mês e mostrar qual foi o salário do funcionário
            nesse mês, conforme exemplo.

            Um trabalhador possui:
                - Nome: String
                - Level: WorkerLevel
                - baseSalary: Double

                + addContract(contract: HourContract): void
                + removeContract(contract: HourContract): void
                + inconme(year: Integer, month: Integer): Double

                 -> Cada trabalhador possui 1 departamento (name: String)
                 -> Cada contrato é dividido em horas:
                       - date: Date
                       - valuePerHour: Double
                       - hours: Integer

                       + totalValue(): Double

            A senioridade é enumerada, e dividida em:
                - JUNIOR: int
                - MID_LEVEL: int
                - SENIOR: int

                -----------------------------------------------------------------

            Exemplo:
                Digite o nome do departamento: Desenvolvimento
                Digite os dados do funcionário:

                Nome: Batata
                Nível: MID_LEVEL
                Salário base: 1200.00
                Há quantos contratos para esse funcionário? 3

                Digite os dados do contrato #1:
                Data(DD/MM/yyyy): 20/08/2023
                Valor por hora: 50.00
                Duração (hours): 20

                Digite os dados do contrato #2:
                Data(DD/MM/yyyy): 13/06/2023
                Valor por hora: 30
                Duração (hours): 18

                Digite os dados do contrato #3:
                Data(DD/MM/yyyy): 25/08/2023
                Valor por hora: 80
                Duração (hours): 10

                Digite o mês e o ano para calcular a renda: 08/2023
                Nome: Batata
                Departamento: Desenvolvimento
                Renda de 08/2023: 3000.00
        */

        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite o nome do departamento: ");
        String departamento = r.next();

        System.out.println("Digite os dados do funcionário:");

        System.out.println("Nome: ");
        String nome = r.next();

        System.out.println("Nível: ");
        String nivel = r.next();

        System.out.println("Salário base: ");
        double salarioBase = r.nextDouble();
        Worker worker = new Worker(nome, WorkerLevel.valueOf(nivel), salarioBase, new Department(departamento));

        System.out.println("Há quantos contratos para esse funcionário? ");
        int num = r.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Digite os dados do contrato #" + (i + 1) + ":");

            System.out.println("Data(DD/MM/yyyy): ");
            Date contractDate = sdf.parse(r.next());

            System.out.println("Valor por hora: ");
            double valorPorHora = r.nextDouble();

            System.out.println("Duração (hours): ");
            int duracao = r.nextInt();

            worker.addContract(new HourContract(contractDate, valorPorHora, duracao));
        }

        System.out.println("Digite o mês e o ano para calcular a renda (MM/yyyy): ");
        String monthAndYear =r.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartamento().getName());
        System.out.println("Renda de " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)) + "$");


        r.close();
    }
}
