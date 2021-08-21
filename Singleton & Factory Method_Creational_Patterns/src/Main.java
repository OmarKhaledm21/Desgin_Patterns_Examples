
public class Main {
    public static void main(String[] args) {
        ExampleSingleton es = ExampleSingleton.getInstance();
        es.setSetting("Example Setting");
        es.getSetting();
        System.out.println();
    }
}
