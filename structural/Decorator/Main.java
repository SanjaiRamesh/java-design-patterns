//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        BankAccount bankAccount = new SavingAccount();

        bankAccount = new FraudDecorator(bankAccount);
        bankAccount = new InsuranceDecorator(bankAccount);
        System.out.println(bankAccount.getDescription());
    }
}
interface BankAccount{
    String getDescription();
}

class SavingAccount implements BankAccount{
    @Override
    public String getDescription() {
        return "Saving";
    }
}

abstract class BankAccountDecorator  implements BankAccount{
    BankAccount bankAccount;
    public BankAccountDecorator(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public String getDescription() {
        return bankAccount.getDescription();
    }
}
class FraudDecorator extends BankAccountDecorator{
    public FraudDecorator(BankAccount bankAccount) {
        super(bankAccount);
    }
    public String getDescription() {
        return super.getDescription()+" fraud Detection";
    }
}

class InsuranceDecorator extends BankAccountDecorator{
    public InsuranceDecorator(BankAccount bankAccount) {
        super(bankAccount);
    }
    public String getDescription() {
        return super.getDescription()+" insurance Detection";
    }
}