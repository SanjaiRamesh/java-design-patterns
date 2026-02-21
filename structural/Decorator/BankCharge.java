public interface BankCharge {
    void pay(double amount);
}

interface BankA {
    void payInCents(int amount);
}
class BankChargeAdapter implements BankCharge {
    BankA bankA;

    public BankChargeAdapter(BankA bankA) {
        this.bankA = bankA;
    }
    public void pay(double amount) {
        int amount = (int) amount *100;
        bankA.payInCents(amount);
    }
}