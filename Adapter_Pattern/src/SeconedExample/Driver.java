package SeconedExample;

public class Driver {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        duck.fly();
        duck.quack();

        System.out.println();
        duck = new TurkeyAdapter(turkey);

        duck.quack();
        duck.fly();


        turkeyAdapter.quack();

    }
}
