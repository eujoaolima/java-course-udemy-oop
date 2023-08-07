package Aula08;

public class Construtor {
    private int idade;
    private String nome;
    private int num;

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void construtor() {
        System.out.println("Ola mundo");
        System.out.println("BATATA");
    }

    public void setValores(int n1, int n2) {
        this.num = n1 + n2;
    }

    public int getNum() {
        return num;
    }
}
