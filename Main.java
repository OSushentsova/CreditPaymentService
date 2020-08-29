public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        int sum = 1_000_000;
        double percentRate = 9.99;
        int term = 36;
        int payment = (int) service.calculate(sum, percentRate, term);
        System.out.println(payment);
    }
}
