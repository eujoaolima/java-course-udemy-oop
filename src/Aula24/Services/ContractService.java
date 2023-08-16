package Aula24.Services;

import Aula24.Entities.Contract;
import Aula24.Entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double basicQuote = contract.getTotalValue() / months;
        for (int i = 1; i < months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuote, i);
            double fee = onlinePaymentService.paymentFee(basicQuote + interest);
            double quote = basicQuote + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quote));
        }
    }
}
