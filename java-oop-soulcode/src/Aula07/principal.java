package Aula07;

public class principal {
    public static void main(String[] args) {
        Construtores construtor01 = new Construtores();
        // Ao rodarmos o codigo, ja aparece no console a mensagem que setamos no nosso
        // construtor. Entao ele esta funcionando (Ja que a funcao do construtor e
        // iniciar um objeto)

        construtor01.setConstrutores(10, 5);

        System.out.println("Valor enviado para o construtor: " + construtor01.getNum()); 
    }
}
