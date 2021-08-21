public interface FlyBehavior {
    public void fly();
}

class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I CAN FLY!");
    }
}

class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("CAN'T FLY!");
    }
}
