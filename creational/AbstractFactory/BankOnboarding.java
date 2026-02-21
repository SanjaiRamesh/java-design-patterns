import java.util.Scanner;

public class BankOnboarding {
    SavingAccount savingAccount;
    CreditCard creditCard;

    public BankOnboarding(BankingFactory bankingFactory){
        this.savingAccount = bankingFactory.getAccount();
        this.creditCard = bankingFactory.getCard();
    }


    public static void main(String[] args) {

        String user = "Premium";
        BankOnboarding bankOnboarding;
        String confirm = "yes";
        Scanner scanner = new Scanner(System.in);

        while("yes".equalsIgnoreCase(confirm)){
            user = scanner.nextLine();
            if(user.equalsIgnoreCase("Premium")){
                bankOnboarding = new BankOnboarding(new PremiumFactory());
            } else {
                bankOnboarding = new BankOnboarding(new RetailFactory());
            }
            bankOnboarding.creditCard.getCreditCardDetails();
            bankOnboarding.savingAccount.getSavingAccountDetails();
            System.out.print("Want to contine Yes or no:");
            confirm = scanner.nextLine();

        }


    }
}
