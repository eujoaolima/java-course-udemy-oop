package Aula04;

import java.util.Scanner;

public class MembrosEstaticos {
    // Primeira forma: Colocar tudo em um único arquivo, sem POO

    // public static final double PI = 3.14159; // O "final" mostra que a variável pi é
    // uma constante, e não mudará mais de valor


    public static void main(String[] args) {
        /*
            Fazer um programa para ler um valor numérico qualquer,
            e daí mostrar quanto seria o valor de uma circunferência
            e do volume de uma esfera para um raio daquele valor.
            Informar também o valor de PI com duas casas decimais.

            Exemplo:
                Enter radius: 5.0
                Circumference: 18.84 -> C = 2*pi*r
                Volume: 113.04 -> Ve = 4*p*r³ / 3
                Pi value: 3.14
         */

        Scanner r = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Digite o raio: ");
        double radius = r.nextDouble();

//        double c = calc.circumference(radius);
//        double v = calc.volume(radius);

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("A circunferência é: %f", c);
        System.out.printf("O volume é: %f", v);
        System.out.printf("O valor de pi é: %f", Calculator.PI);

        r.close();
    }

//    public double circumference(double radius) {
//        return 2 * PI * radius;
//    }
//
//    public double volume(double radius) {
//        return (4 * PI * radius * radius * radius) / 3;
//    }

}
