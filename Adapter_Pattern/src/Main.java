public class Main {
    public static void main(String[] args) {
        CoffeMachineInterface client = new CoffeTouchscreenAdapter();

        client.chooseFirstSelection();

        client.chooseSecondSelection();
    }
}
