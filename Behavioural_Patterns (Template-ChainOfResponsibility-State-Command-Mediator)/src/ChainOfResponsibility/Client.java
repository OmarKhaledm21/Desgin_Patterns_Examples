package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        HandlerClass clientReq = new ConcreteHandler1();
        clientReq.handler("OMAR");
    }
}
