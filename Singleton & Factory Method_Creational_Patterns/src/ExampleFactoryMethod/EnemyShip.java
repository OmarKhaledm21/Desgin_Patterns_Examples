package ExampleFactoryMethod;

public abstract class EnemyShip {
    private double amtDamage;
    private String name;

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void followHeroShip(){
        System.out.println(getName()+" is following hero ship");
    }

    public void displayEnemyShip(){
        System.out.println(getName()+" is on the screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName()+" attacks and does "+getAmtDamage());
    }
}
