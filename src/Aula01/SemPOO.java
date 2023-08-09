package Aula01;

import java.util.Scanner;

public class SemPOO {
    public static void main(String[] args) {
        double xA;
        double xB;
        double xC;
        double yA;
        double yB;
        double yC;

        Scanner r = new Scanner(System.in);

        System.out.println("Digite as dimensões do triângulo X:");
        xA = r.nextDouble();
        System.out.println("xA: " + xA);
        xB = r.nextDouble();
        System.out.println("xB: " + xB);
        xC = r.nextDouble();
        System.out.println("xC: " + xC);

        System.out.println("------------------------------");

        System.out.println("Digite as dimensões do triângulo Y:");
        yA = r.nextDouble();
        System.out.println("yA: " + yA);
        yB = r.nextDouble();
        System.out.println("yB: " + yB);
        yC = r.nextDouble();
        System.out.println("yC: " + yC);

        System.out.println("------------------------------");

        double p1 = (xA + xB + xC) / 2;
        double p2 = (yA + yB + yC) / 2;
        
        double area1 = Math.sqrt(p1*(p1-xA)*(p1-xB)*(p1-xC));
        double area2 = Math.sqrt(p2*(p2-yA)*(p2-yB)*(p2-yC));

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
