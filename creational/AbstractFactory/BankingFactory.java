public interface BankingFactory {
    CreditCard getCard();
    SavingAccount getAccount();
}

class RetailFactory implements BankingFactory {
    @Override
    public CreditCard getCard() {
        return new RetailCard();
    }

    @Override
    public SavingAccount getAccount() {
        return new RetailAccount();
    }
}

class PremiumFactory implements BankingFactory {
    @Override
    public CreditCard getCard() {
        return new PremiumCard();
    }

    @Override
    public SavingAccount getAccount() {
        return new PremiumAccount();
    }
}