package Aula04;

public class Calculator {
    // Segunda forma: Criando a classe Calculator, trazendo
    // todos os cálculos para cá e utilizando POO para realizar os cálculos
    public static final double PI = 3.14159; // O "final" mostra que a variável pi é
    // uma constante, e não mudará mais de valor

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static double volume(double radius) {
        return (4 * PI * radius * radius * radius) / 3;
    }
}
