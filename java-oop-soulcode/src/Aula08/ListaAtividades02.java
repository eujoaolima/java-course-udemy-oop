package Aula08;

public class ListaAtividades02 {
    public static void main(String[] args) {

        /*
    
        ATIVIDADES 02
        
        1.) Crie uma classe que contenha atributos encapsulados, os mesmos devem ser chamados na classe main, para isso você deve criar os gets e sets.
    
        2.) Crie uma classe em que o construtor tenha a mensagem ("Ola Mundo") , mostre a mensagem na classe principal
    
        3.) Desenvolva uma classe que contenha 2(dois) construtores, o primeiro deve mostrar uma mensagem que você desejar e a outra deve receber dois parâmetros (int n1 e int n2) faça o cálculo e retorne o resultado para o usuário.
    
        */
    
        // Exercicio 1
        Construtor bobConstrutor = new Construtor();
    
        bobConstrutor.setNome("Bob, o bobo");
        bobConstrutor.setIdade(18);

        System.out.println("Meu nome eh " + bobConstrutor.getNome() + ", e eu tenho " + bobConstrutor.getIdade() + " anos");

        // Exercicio 2

        bobConstrutor.construtor();

        // Exercicio 3

        bobConstrutor.setValores(10, 10);
        System.out.println("O resultado eh: " + bobConstrutor.getNum());

    }




}
