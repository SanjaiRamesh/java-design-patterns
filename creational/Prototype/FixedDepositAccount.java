import java.util.ArrayList;
import java.util.List;

public class FixedDepositAccount implements AccountPrototype {
    private String productName;
    private double interestRate;
    private List<String> termsAndConditions;

    public FixedDepositAccount(String productName, double interestRate) {
        this.productName = productName;
        this.interestRate = interestRate;
        // Simulate an expensive database operation to fetch long T&Cs
        this.termsAndConditions = loadTermsFromDatabase();
    }

    private List<String> loadTermsFromDatabase() {
        System.out.println(">>> Fetching 50+ legal terms from Database for: " + productName);
        return new ArrayList<>(List.of("Lock-in period 5 years", "Tax-exempt under Sec 80C"));
    }

    @Override
    public AccountPrototype clone() {
        // We create a new instance by copying existing values
        FixedDepositAccount clone = new FixedDepositAccount(this.productName, this.interestRate);
        clone.termsAndConditions = new ArrayList<>(this.termsAndConditions); // Deep copy
        return clone;
    }

    public void displayAccountInfo(String customerName, double amount) {
        System.out.println("Account for: " + customerName + " | Product: " + productName +
                " | Rate: " + interestRate + "% | Amount: $" + amount);
    }
}