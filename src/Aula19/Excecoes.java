package Aula19;

import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {

        System.out.println("Início do método 1");
        method2();
        System.out.println("Fim do metodo 1");
    }

    public static void method2() {

        System.out.println("Início do método 2");
        Scanner r = new Scanner(System.in);

        try {
            String[] vetor = r.nextLine().split(" ");
            int position = r.nextInt();

            System.out.println(vetor[position]);
        } catch (Exception err) {
            System.out.println(err.getMessage());
//            err.printStackTrace();
        }

        r.close();
        System.out.println("Fim do metodo 2");
    }
}
