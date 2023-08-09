package Aula06;

public class ContaBancaria {
    private String nome;
    private double saldo;
    private int numeroConta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public ContaBancaria(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
    }

    public ContaBancaria(String nome, double depositoInicial, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        deposito(depositoInicial);
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo -= valor + 5;
    }

    public String toString() {
        return "Conta: " + numeroConta + ", Nome: " + nome + ", Saldo: $" + String.format("%.2f", saldo);
    }
 }


