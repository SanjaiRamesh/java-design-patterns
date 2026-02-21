public class PaymentFactory {
    // The Factory Method
    public static PaymentProcessor getPaymentMethod(String type) {
        if (type == null) return null;

        return switch (type.toUpperCase()) {
            case "CREDIT_CARD" -> new CreditCardProcessor();
            case "UPI" -> new UPIProcessor();
            case "CRYPTO" -> new CryptoProcessor();
            default -> throw new IllegalArgumentException("Unknown payment method: " + type);
        };
    }
}