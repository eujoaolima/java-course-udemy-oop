package Aula25.Services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

    default double payment (double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("O número de meses não pode ser menor ou igual a zero");
        }

        return amount * Math.pow(1 + getInterestRate() / 100, months);
    }
}
