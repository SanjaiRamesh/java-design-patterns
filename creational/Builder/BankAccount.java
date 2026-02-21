public class BankAccount {
    private final String accountNumber; // Required
    private final String ownerName;     // Required
    private final double balance;       // Optional
    private final double interestRate;  // Optional
    private final boolean isDormant;    // Optional

    private BankAccount(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.ownerName = builder.ownerName;
        this.balance = builder.balance;
        this.interestRate = builder.interestRate;
        this.isDormant = builder.isDormant;
    }

    @Override
    public String toString() {
        return "Account [" + accountNumber + "] for " + ownerName +
                " | Balance: $" + balance + " | Interest: " + interestRate + "%";
    }

    // 2. The Inner Builder Class
    public static class Builder {
        private String accountNumber;
        private String ownerName;
        private double balance = 0.0;      // Default value
        private double interestRate = 0.0; // Default value
        private boolean isDormant = false; // Default value

        public Builder(String accountNumber, String ownerName) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
        }

        public Builder setBalance(double balance) {
            this.balance = balance;
            return this; // Returns the builder itself for chaining
        }

        public Builder setInterestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder setDormant(boolean isDormant) {
            this.isDormant = isDormant;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}