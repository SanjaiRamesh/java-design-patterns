import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String confirm = "YES";
                Scanner scanner =  new Scanner(System.in);
//        while("YES".equalsIgnoreCase(confirm)){
//            Order order = new Order();
//            System.out.print("Enter notificationType \n1: Email \n2.SMS\nplease input 1 or 2 : ");
//            String name = scanner.nextLine();
//            switch (name){
//                case "1":
//                    order.setNotification(new EmailNotification());
//                    break;
//                case "2":
//                    order.setNotification(new SMSNotification());
//
//            }
//            order.notification.sendNotification();
//
//            System.out.print("Want to place another order YES or No:");
//            confirm = scanner.nextLine();
//
//        }

        String name =  scanner.nextLine();

        FXRateStrategy fxRateStrategy = FxResolver.resolve(name.toUpperCase());
        System.out.println(fxRateStrategy.getFXRate());
        name =  scanner.nextLine();

        fxRateStrategy = FxResolver.resolve(name.toUpperCase());
        System.out.println(fxRateStrategy.getFXRate());

    }
}