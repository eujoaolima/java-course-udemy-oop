package Aula01;

public class Animal {
    public String nome;
    public int identificador;
    public int idade;
    public String especie;

    // Metodo void: ele faz todas as alteracoes do bloco de comando, mas nao retorna nenhum parametro
    public void modificaIdade(int novaIdade) {
        // O this esta referindo ao Java que ele nao esta retornando uma simples variavel, e sim um atributo com um valor ja definido dentro dele.
        this.idade = novaIdade;
    }

    // Metodo com retorno
    public boolean verificaIdade(int idade) {
        if (this.idade > 50) {
            return true;
        } else {
            return false;
        }
    }
}
