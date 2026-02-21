public class BankingSystem {
    public static void main(String[] args) {
        // Creating a basic savings account
        BankAccount savings = new BankAccount.Builder("SAV-123", "Alice")
                .setBalance(1500.00)
                .setInterestRate(2.5)
                .build();

        // Creating a dormant account with just the basics
        BankAccount oldAccount = new BankAccount.Builder("OLD-999", "Bob")
                .setDormant(true)
                .build();

        System.out.println(savings);
        System.out.println(oldAccount);
    }
}