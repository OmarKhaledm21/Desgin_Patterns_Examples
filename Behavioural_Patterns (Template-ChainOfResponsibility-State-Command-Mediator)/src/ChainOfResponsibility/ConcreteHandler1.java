package ChainOfResponsibility;

public class ConcreteHandler1 extends HandlerClass{
    @Override
    public int handleRequest(String req) {
        System.out.println("Cannot be Handled by 1");
        return 0;
    }
}
