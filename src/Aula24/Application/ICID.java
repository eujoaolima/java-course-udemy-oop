package Aula24.Application;

import Aula24.Entities.Contract;
import Aula24.Entities.Installment;
import Aula24.Services.ContractService;
import Aula24.Services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ICID {
    public static void main(String[] args) {
        // Inversão de controle e injeção de dependências

        // Exercício de fixação

        /*
            Uma empresa deseja automatizar o processamento de seus contratos. O processamento de um
            contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
            número de meses desejado.

            A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
            OS serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
            por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
            juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.

            Faça um programa que leia os dados de um contrato (número do contrato, data do contrato,
            e valor total do contrato). Em seguida, o programa deve ler o número de meses para
            parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
            sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois
            meses após o contrato e assim por diante. Mostre os dados das parcelas na tela.

            Exemplo:
                Digite os dados do contrato:
                Número do contrato: 12345
                Data do contrato: 01/01/2020
                Valor total do contrato: R$ 600
                Digite o número de meses para parcelamento do contrato: 3
                Data da primeira parcela: 01/02/2020 - R$ 206.04
                Data da segunda parcela: 01/03/2020 - R$ 208.08
                Data da terceira parcela: 01/04/2020 - R$ 210.12

                Cálculos (1% juros simples mensal + 2% taxa de pagamento):
                    Parcela #1:
                        200 + 1% = 202
                        202 + 2% = 206.04

                    Parcela #2:
                        200 + 1% * 2 = 204
                        204 + 2% = 208.08

                    Parcela #3:
                        200 + 1% * 3 = 206
                        206 + 2% = 210.12
        */

        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite os dados do contrato:");
        System.out.print("Número do contrato: ");
        int contrato = r.nextInt();

        System.out.print("Data do contrato (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(r.next(), fmt);

        System.out.print("Valor total do contrato: R$ ");
        double valorTotal = r.nextDouble();

        Contract contract = new Contract(contrato, date, valorTotal);

        System.out.print("Digite o número de meses para parcelamento do contrato: ");
        int num = r.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, num);

        System.out.println("Parcelas: ");
        for (Installment inst : contract.getInstallments()) {
            System.out.println(inst);
        }
        r.close();
    }
}
