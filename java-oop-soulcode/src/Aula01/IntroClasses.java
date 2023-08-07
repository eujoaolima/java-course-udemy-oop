package Aula01;

public class IntroClasses {
    public static void main(String[] args) {
        // POO

        /*
         * A POO auxilia na resolucao de problemas, na interpretacao de codigo de outros
         * devs e na organizacao de codigos.
         * 
         * Projeto a ser utilizado para os exemplos:
         * 
         * Um zoologico rpecisa criar um sistema em que seja possivel cadastrar os dados
         * dos animais.
         * 
         * Generalizar (O que e comum entre os animais) -> Animais (Nome, identificacao,
         * idade e especie) -> Colaborador (Nome, telefone, idade, departamento)
         */

        // Objetos
        /*
         * Agora que criamos as classes, precisamos criar um objeto para chamar estas
         * classes.
         * 
         * Para criar um objeto, a estrutura e a seguinte:
         */

        // Toda vez que coloca-se o "new", quer dizer que voce esta instanciando uma
        // nova classe.

        // new Animal();
        // new Colaborador();

        Animal animal = new Animal(); // Agora que criamos um objeto, nos podemos chamar as variaveis da classe Animal
        // atraves do mesmo da seguinte forma:

        animal.nome = "Kyra";
        System.out.println(animal.nome);
        animal.especie = "Cachorro";
        animal.idade = 3;
        animal.identificador = 0001;

        System.out.println("-------------------------");

        System.out.println(
            "Idade: " + animal.idade + ", Especie: " + animal.especie + 
            ", Identificador: " + animal.identificador
        );

        // Agora vamos criar um novo objeto e repetir o mesmo processo

        System.out.println("-------------------------");

        Animal novoAnimal = new Animal();

        novoAnimal.nome = "Shrek";
        novoAnimal.especie = "Gato";
        novoAnimal.identificador = 0002;
        novoAnimal.idade = 5;

        System.out.println(novoAnimal.nome);

    }
}