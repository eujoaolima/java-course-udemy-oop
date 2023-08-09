package Aula06;

import java.util.Scanner;

public class Atividades02 {
    public static void main(String[] args) {
        /*
            Em um banco, para se cadastrar uma conta bancária, é necessário informar
            o número da conta, o nome do titular da conta e o valor de depósito inicial
            que o titular depositou ao abrir a conta. Este valor de depósito inicial,
            entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar
            no momento de abrir sua conta, o depósito inicial não será feito e o saldo da
            conta será, naturalmente, zero.

            Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca
            poderá ser alterado. Já o nome do titular pode ser alterado (pois uma pessoa pode
            mudar de nome por ocasião de casamento, por exemplo).

            Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um
            mecanismo para proteger isso. O saldo só aumenta por meio de depósitos, e só
            diminui por meio de saques. Para cada saque realizado, o banco cobra uma
            taxa de $ 5.00.
            Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para
            realizar o saque e/ou pagar a taxa.

            Você deve fazer um programa que realize o cadastro de uma conta, dando opção para
            que seja ou não informado o valor de depósito inicial. Em seguida, realizar um
            depósito e depois um saque, sempre mostrando os dados da conta após cada operação.
        */

        /*
            Resultado final esperado:

            Digite o número da conta: 4002
            Digite o nome do dono da conta: João Lima
            Há um depósito inicial (y/n)? y
            Digite o valor do depósito a ser feito: 500

            Dados da conta:

            Conta 4002, dono: João Lima, Saldo: $ 500.00

            Digite o valor do depósito a ser realizado: 200
            Dados da conta atualizados:
            Conta 4002, dono: João Lima, Saldo: $ 700.00

            Digite o valor de saque: 300
            Dados da conta atualizados:
            Conta 4002, dono: João Lima, Saldo: $ 395.00
        */

        Scanner r = new Scanner(System.in);
        ContaBancaria contaBancaria;

        System.out.println("Digite o número da conta: ");
        int numeroConta = r.nextInt();

        System.out.println("Digite o nome do dono da conta: ");
        String nome = r.next();

        System.out.println("Há um depósito inicial (y/n)? ");
        char res = r.next().charAt(0);
        if (res == 'y') {
            System.out.println("Digite um valor inicial: ");
            double depositoInicial = r.nextDouble();
            contaBancaria = new ContaBancaria(nome, depositoInicial, numeroConta);
        } else {
            contaBancaria = new ContaBancaria(nome, numeroConta);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(contaBancaria);

        System.out.println("Digite o valor do depósito a ser realizado:");
        double valorDeposito = r.nextDouble();
        contaBancaria.deposito(valorDeposito);

        System.out.println();
        System.out.println("Dados da conta atualizados:");
        System.out.println(contaBancaria);

        System.out.println();
        System.out.println("Digite o valor do saque a ser realizado:");
        double valorSaque = r.nextDouble();
        contaBancaria.saque(valorSaque);

        System.out.println();
        System.out.println("Dados da conta atualizados:");
        System.out.println(contaBancaria);

        r.close();
    }
}
