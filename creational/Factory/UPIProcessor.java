public class UPIProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount + " via Instant Settlement Network.");
    }
}