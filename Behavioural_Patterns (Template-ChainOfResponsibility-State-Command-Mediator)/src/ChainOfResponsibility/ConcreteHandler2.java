package ChainOfResponsibility;

public class ConcreteHandler2  extends HandlerClass{
    @Override
    public int handleRequest(String req) {
        System.out.println("Handled by 2");
        return 1;
    }
}
