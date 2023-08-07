package Aula05;

public class Pessoa {
    public String nome;
    public String mensagem;
    int idade;

    public String msgPessoa() {
        String message = "Batata";
        this.mensagem = message;
        return mensagem;
    }
}
