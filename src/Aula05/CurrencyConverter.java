package Aula05;

public class CurrencyConverter {
    public static final double DOLAR = 5;

    public static double realDolar(double valor) {
        return (valor / DOLAR) + (DOLAR * 0.06);
    }
}
