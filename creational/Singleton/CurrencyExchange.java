public class CurrencyExchange {

    public static CurrencyExchange currencyExchange;

    private CurrencyExchange() {

    }

    public void exchageRate() {
        System.out.println("21.2");
    }

    public static CurrencyExchange getInstance() {

        if (currencyExchange == null) {
            synchronized (CurrencyExchange.class) {
                if (currencyExchange == null) {
                    currencyExchange = new CurrencyExchange();
                }
            }
        }
        return currencyExchange;
    }

    public static void main(String[] args) {
        CurrencyExchange currencyExchange = CurrencyExchange.getInstance();
        currencyExchange.exchageRate();
    }

}
