package SeconedExample;

public class WildTurkey implements Turkey {
    @Override
    public void goble() {
        System.out.println("Goble goble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying short distance");
    }
}
