public class CreditPaymentService {
    public long calculate (int  creditSum, int creditPeriod, double lendingRate){

        double P = lendingRate / 100 / 12; // Месячная процентная ставка
        double monthlyPayment = creditSum * (P + P/(Math.pow(1 + P, creditPeriod) - 1)); // Предположительная формула аннуитета

        return (long) monthlyPayment;
    }
}


