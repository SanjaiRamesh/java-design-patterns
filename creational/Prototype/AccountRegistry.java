import java.util.HashMap;
import java.util.Map;

public class AccountRegistry {
    private Map<String, AccountPrototype> prototypes = new HashMap<>();

    public AccountRegistry() {
        // Pre-load the "Master" templates once during system startup
        prototypes.put("SENIOR_CITIZEN_FD", new FixedDepositAccount("Senior High-Yield", 7.5));
        prototypes.put("REGULAR_FD", new FixedDepositAccount("Standard Saver", 5.0));
    }

    public AccountPrototype getPrototype(String type) {
        return prototypes.get(type).clone();
    }
}