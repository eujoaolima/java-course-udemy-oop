package Aula04;

public class ContaBancaria {
    String nomeCliente;
    int numeroConta;
    int saldo;

    public void depositarSaldo(int valor) {
        int novoSaldo = this.saldo + valor;
        this.saldo = novoSaldo;
    }

    public void sacarSaldo(int valor) {
        int novoSaldo = this.saldo - valor;
        this.saldo = novoSaldo;
    }

    public boolean verificarSaque(int valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            return true;
        }
    }

    public void verificarSaldo() {
        System.out.println("Seu saldo eh de: " + this.saldo);
    }
}

