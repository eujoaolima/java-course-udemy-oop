package Aula06;

public class Encapsulamento {
    public static void main(String[] args) {
        // Encapsulamento

        /*
         * O encapsulamento serve para evitar o acesso indevido a atributos e metodos.
         * 
         * Nos manipularemos os atributos e metodos de forma indireta utilizando os metodos acessores (Getters & Setters).
         * 
         * Em Java, temos dois tipos de encapsulamento:
         * - public: Visivel a todas as classes, sem restricoes.
         * - private: Nao pode ser acessado fora da classe.
         */

        // Gets & Sets

        // Get: Escrita de dados
        // Set: Leitura de dados

        Visibilidade visibilidade = new Visibilidade();
        // Pelo metodo public
        visibilidade.num = 10;
        // Pelo metodo private
        visibilidade.setIdade(19);
        System.out.println("O valor da idade e: " + visibilidade.getIdade());
    }
}
