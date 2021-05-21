public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1_000_000;
        int creditPeriod = 12;
        double lendingRate = 9.9;
        long monthlyPayment = service.calculate(creditSum, creditPeriod, lendingRate);
        System.out.println("Ваш ежемесячный платеж составит - " + monthlyPayment + " рублей.");
    }
}
