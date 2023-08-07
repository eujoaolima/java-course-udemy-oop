package Aula04;


public class Atividade01 {
    public static void main(String[] args) {

        System.out.println("batata");

        ContaBancaria conta = new ContaBancaria();

        conta.nomeCliente = "Joao Lima";
        conta.numeroConta = 1234567;
        conta.saldo = 123;

        System.out.println("Nome: " + conta.nomeCliente);
        System.out.println("Numero da conta: " + conta.numeroConta);
        System.out.println("Saldo: " + conta.saldo);

        conta.depositarSaldo(100);

        System.out.println("Seu novo saldo eh: " + conta.saldo);

        conta.sacarSaldo(50);

        System.out.println("Seu novo saldo eh: " + conta.saldo);

        System.out.println("---------- Verificar saldo ----------");
        System.out.println(conta.verificarSaque(12));
    }
}
