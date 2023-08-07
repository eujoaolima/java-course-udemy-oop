package Aula02;

import java.util.Scanner;

import Aula01.Animal;

public class Atributos {
    public static void main(String[] args) {
        // Atributos

        /*
         * Atributos sao diversos valores que damos a um objeto, como nome, idade, endereco...
         */

        Animal newAnimal = new Animal();
        Scanner r = new Scanner(System.in);

        System.out.println("Digite o nome do animal: ");
        newAnimal.nome = r.nextLine();
        System.out.println("Nome: " + newAnimal.nome);

        System.out.println("Digite a idade do animal: ");
        newAnimal.idade = r.nextInt();
        System.out.println("Idade: " + newAnimal.idade);

        System.out.println("Digite a identificacao do animal: ");
        newAnimal.identificador = r.nextInt();
        System.out.println("Identificacao: " + newAnimal.identificador);

        System.out.println("Digite a especie do animal: ");
        newAnimal.especie = r.next();
        System.out.println("Especie: " + newAnimal.especie);

        newAnimal.modificaIdade(10);
        System.out.println("A nova idade do animal" + " " + newAnimal.nome + " eh " + newAnimal.idade);

        System.out.println("A idade do animal eh maior que 50? " + newAnimal.verificaIdade(newAnimal.idade) );
    }
}
