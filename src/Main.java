public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long creditBody = 1_000_000;
        double percent = 9.99;
        int time = 12;
        long payment = service.calculate(creditBody, percent, time);
        System.out.println(payment);

        creditBody = 1_000_000;
        percent = 9.99;
        time = 24;
        payment = service.calculate(creditBody, percent, time);
        System.out.println(payment);

        creditBody = 1_000_000;
        percent = 9.99;
        time = 36;
        payment = service.calculate(creditBody, percent, time);
        System.out.println(payment);
    }
}
