public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
        mallard.setQuackBehavior(new Squeak());
        mallard.performQuack();
    }
}

