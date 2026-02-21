public class BankingApp {
    public static void main(String[] args) {
        // Imagine this input comes from a UI dropdown selection
        String selectedMethod = "UPI";

        PaymentProcessor processor = PaymentFactory.getPaymentMethod(selectedMethod);
        processor.processPayment(250.00);
    }
}