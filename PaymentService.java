public class PaymentService {
    public double calculate(int sum, double percentage, int term) {
       double percentRate = percentage /12/100;
       double index = (percentRate * Math.pow((1 + percentRate), term))/(Math.pow((1 + percentRate), term) -1);
       int payment = (int) (sum * index);

        return payment;
    }
}
