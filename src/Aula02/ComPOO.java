package Aula02;

import java.util.Scanner;

public class ComPOO {
        public static void main(String[] args) {
            Scanner r = new Scanner(System.in);

            Triangle x, y;
            x = new Triangle();
            y = new Triangle();

            System.out.println("Digite as dimensões do triângulo X:");
            x.a = r.nextDouble();
            x.b = r.nextDouble();
            x.c = r.nextDouble();

            System.out.println("------------------------------");

            System.out.println("Digite as dimensões do triângulo Y:");
            y.a = r.nextDouble();
            y.b = r.nextDouble();
            y.c = r.nextDouble();

            System.out.println("------------------------------");

            double area1 = x.area();
            double area2 = y.area();

            System.out.printf("Área do triângulo X: %.4f%n", area1);
            System.out.printf("Área do triângulo Y: %.4f%n", area2);

            if (area1 > area2) {
                System.out.println("O triângulo X é maior");
            } else {
                System.out.println("O triângulo Y é maior");
            }

            r.close();
        }
}
