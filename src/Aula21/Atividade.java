package Aula21;

import Aula21.Entities.Account;
import Aula21.Exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        // Atividade

        /*
            Fazer um programa para ler os dados de uma conta bancária e
            depois realizar um saque nesta conta bancária, mostrando o novo saldo.
            Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor
            do saque for superior ao limite de saque da conta. Implemente a conta
            bancária conforme projeto abaixo:


            Account:
                - number: Integer
                - holder: String
                - balance: Double
                - withdrawLimit: Double
                + deposit(amount: Double): void
                + withdraw(amount: Double): void

            Exemplo:
                Digite os dados da conta
                Número da conta: 8021
                Dono da conta: Bob Brown
                Saldo inicial: 500.00
                Limite de saque: 300.00

                Digite o valor do saque: 100.00
                Novo saldo: 400.00


                Digite os dados da conta
                Número da conta: 8021
                Dono da conta: Bob Brown
                Saldo inicial: 500.00
                Limite de saque: 300.00

                Digite o valor do saque: 400.00
                Erro: A quantia excede o limite de saque

        */

        Locale.setDefault(Locale.US);
        Scanner r = new Scanner(System.in);


        System.out.println("Digite os dados da conta");
        System.out.println("Número da conta: ");
        int number = r.nextInt();
        System.out.println("Dono da conta: ");
        r.nextLine();
        String holder = r.nextLine();
        System.out.println("Saldo inicial: ");
        double balance = r.nextDouble();
        System.out.println("Limite de saque: ");
        double withdrawLimit = r.nextDouble();
        try {
            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.println("Digite o valor do saque: ");
            double amount = r.nextDouble();
            acc.withdraw(amount);

            System.out.println("Novo saldo: " + acc.getBalance());
        } catch (BusinessException err) {
            System.out.println("Erro: " + err.getMessage());
        }

        r.close();
    }
}
