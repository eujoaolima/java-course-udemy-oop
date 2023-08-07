package Aula07;

public class Construtores {
    // Construtores

    /*
     * Construtores sao os responsaveis por iniciarem nossos objetos em qualquer
     * aplicacao.
     * Eles instanciam as classes e sao obrigatorios.
     * 
     * OBS: Interfaces nao possuem construtores
     */

    private int num;

    public void construtores() {
        System.out.println("Essa e uma mensagem do construtor");
    }

    public void construtores(int valor) {
        this.num = valor;
    }

    public void setConstrutores(int v1, int v2) {
        this.num = v1 + v2;
    }

    public int getNum() {
        return num;
    }


}
