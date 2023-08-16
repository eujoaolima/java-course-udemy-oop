package Aula23;

import Aula23.Entities.CarRental;
import Aula23.Entities.Vehicle;
import Aula23.Services.BrazilTaxService;
import Aula23.Services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Interfaces {
    public static void main(String[] args) {
        // Interfaces

        // Exemplo prático:

        /*
            Uma locadora brasileira de carros cobra um valor por hora para locações de até 12 horas.
            Porém, se a duração da locação ultrapassar 12 horas, a locação será cobrada com base em
            um valor diário. Além do valor da locação, é acrescido no preço o valor do imposto conforme
            regras do país que, no caso do Brasil, é 20% para valores até 100.00, ou 15% para valores acima de 100.00.
            Faça um programa que leia os dados da locação (modelo do carro, instante inicial e final da locação),
            bem como o valor por hora e o valor diário de locação. O programa deve então gerar a nota de pagamento
            (contendo valor da locação, valor do imposto e valor total do pagamento) e informar os dados na tela.
            Veja os exemplos:

            -> Exemplo 1:
                Digite os dados de locação:
                Modelo do carro: Fusca
                Instante inicial: 15/06/2023 10:30
                Instante final: 15/06/2023 14:40
                Valor por hora: 10
                Valor diário de locação: 130
                ----- FATURA -----
                Valor inicial: 50
                Taxas: 10
                Valor final: 60

                Cálculos:
                    Duração: (Instante final) - (instante inicial) = 4:10 = 5 horas
                    Valor inicial: 5 * 10 = 50

                    Taxas: 50 * 20% = 50 * 0.2 = 10

             -> Exemplo 2:
                Digite os dados de locação:
                Modelo do carro: Fusca
                Instante inicial: 15/06/2023 10:30
                Instante final: 17/06/2023 11:40
                Valor por hora: 10
                Valor diário de locação: 130
                ----- FATURA -----
                Valor inicial: 390
                Taxas: 158.5
                Valor final: 448.5

                Cálculos:
                    Duração: (Instante final) - (instante inicial) = 2 dias + 1:10 = 3 dias
                    Valor inicial: 3 * 130 = 390

                    Taxas: 390 * 15% = 390 * 0.15 = 58.5
        */

        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Digite os dados de locação:");
        System.out.println("Modelo do carro: ");
        String modelo = r.nextLine();

        System.out.println("Instante inicial (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(r.nextLine(), fmt);

        System.out.println("Instante final (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(r.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(modelo));

        System.out.println("Valor por hora: ");
        double valorHora = r.nextDouble();
        System.out.println("Valor diário de locação: ");
        double valorDiaria = r.nextDouble();

        RentalService rentalService = new RentalService(valorHora, valorDiaria, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("----- FATURA -----");
        System.out.println("Valor inicial: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Taxas: " + cr.getInvoice().getTax());
        System.out.println("Valor final: " + cr.getInvoice().getTotalPayment());


        r.close();
    }
}
