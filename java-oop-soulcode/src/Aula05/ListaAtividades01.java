package Aula05;

import java.util.Scanner;

import Aula01.Animal;
import Aula01.Colaborador;

public class ListaAtividades01 {

    /*

    ATIVIDADES

    1.) Crie um código em java que tenha uma classe chamada Animal, a classe deve conter alguns atributos já inicializados que devem ser mostrados na classe principal onde será instanciado o objeto.

    2.) Crie uma classe com o nome de pessoa e outra com o nome de colaborador, após crie os dois objetos na classe principal.

    3.) Crie a classe pessoa que contenha um metodo chamado "msgPessoa" a classe deve mostrar a mensagem "Olá usuario", na main voce deve criar o objeto pessoa e chamar o metodo "msgPessoa"

    4.) Crie uma classe com nome PESSOA,  a classe deve conter um atributo nome e outro chamado idade, o mesmo deve ser instanciado na classe principal e solicitar para o usuário digitar seu nome e idade.
    
    */

    public static void main(String[] args) {

        String linha = "--------------------";

        // Exercicio 1
        Animal animal = new Animal();

        animal.nome = "Marcelo";
        animal.especie = "Cachorro";
        animal.identificador = 123123;
        animal.idade = 20;

        System.out.println(linha);

        // Exercicio 2

        Colaborador colab = new Colaborador();

        colab.nome = "Jurandir";
        colab.idade = 25;
        colab.identificador = 456123;
        colab.departamento = "Limpeza";
        colab.telefone = 1497785641;

        System.out.println(colab.nome);

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Guiguiba";

        System.out.println(pessoa.nome);

        System.out.println(linha);

        // Exercicio 3

        System.out.println(pessoa.msgPessoa());

        System.out.println(linha);

        // Exercicio 4

        Scanner r = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        pessoa.nome = r.next();

        System.out.println("Digite sua idade: ");
        pessoa.idade = r.nextInt();


        System.out.println("Seu nome eh: " + pessoa.nome + " e voce tem " + pessoa.idade + " anos!");
    }
}
