package ChainOfResponsibility;

public abstract class HandlerClass {
    public abstract int handleRequest(String req);
    public void handler(String req){
        HandlerClass hc = new ConcreteHandler1();
        if(hc.handleRequest(req)==1){
            return;
        }else{
            hc = new ConcreteHandler2();
            hc.handleRequest(req);
        }
    }
}
