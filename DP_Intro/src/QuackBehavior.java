public interface QuackBehavior {
    public void quack();
}

class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Real quack");
    }
}

class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Suqeak Squeak");
    }
}

class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Can't Quack!");
    }
}
