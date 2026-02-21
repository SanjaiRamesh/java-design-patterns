public class FxResolver {

    public static FXRateStrategy resolve(String type) {
        switch (type){
            case "P2P":
                return new P2PRate();
            default:
            return new AgentRate();
    }
    }
}
