/*
Why use Prototype in Banking?
Performance: Fetching complex financial product configurations (interest grids, penalty rules, legal text) from a DB is slow. Cloning an in-memory object is nearly instantaneous.
Safety: It allows the bank to keep a "Master Template" that remains untouched, while customers get their own individual copies to work with.
Reduced Subclassing: You don't need SeniorCitizenFDClass, JuniorFDClass, etc. You just have one FixedDepositAccount class and create various instances (prototypes) of it.

 */
public class BankingSystem {
    public static void main(String[] args) {
        AccountRegistry registry = new AccountRegistry();

        // Customer A wants a Senior Citizen FD
        FixedDepositAccount customerA_FD = (FixedDepositAccount) registry.getPrototype("SENIOR_CITIZEN_FD");
        customerA_FD.displayAccountInfo("John Doe", 50000);

        // Customer B wants the same product - NO database hit this time!
        FixedDepositAccount customerB_FD = (FixedDepositAccount) registry.getPrototype("SENIOR_CITIZEN_FD");
        customerB_FD.displayAccountInfo("Jane Smith", 120000);
    }
}