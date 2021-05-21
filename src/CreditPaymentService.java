public class CreditPaymentService {
    public long calculate (int  creditSum, int creditPeriod, double lendingRate){

//        double P = lendingRate / 100 / 12; // Месячная процентная ставка
//        long creditSumInKopecks = (long) S;
//        double i = (double) lendingRate;
//        short creditPeriod = (short) n;

        double monthlyPayment = creditSum * (lendingRate + lendingRate/(Math.pow(1 + lendingRate, creditPeriod) - 1)); // Предположительная формула аннуитета

        return (long) monthlyPayment;
    }
}


