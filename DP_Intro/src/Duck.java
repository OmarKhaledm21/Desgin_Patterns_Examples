public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public Duck(){}

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public abstract void display();

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All ducks float!");
    }
}
