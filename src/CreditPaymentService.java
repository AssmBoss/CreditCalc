public class CreditPaymentService {
    public long calculate(long creditSum, double percentYear, int months) {
        double percentMonth = percentYear / 1200;
        double annyitetCoef = percentMonth + percentMonth / (Math.pow(percentMonth + 1, months) - 1);
        double annyitet = creditSum * annyitetCoef;
        return (long) annyitet;
    }
}
