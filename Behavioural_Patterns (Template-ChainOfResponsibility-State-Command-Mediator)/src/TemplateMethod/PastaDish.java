package TemplateMethod;

public abstract class PastaDish {

    //This is the template method where steps are constant but compenents arent the same!
    final void makeRecipe() {
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }

    protected void drainAndPlate(){
        System.out.println("Draining and plating!");
    }

    protected void cookPasta(){
        System.out.println("Cooking pasta!");
    }

    abstract void addPasta();
    abstract void addSauce();
    abstract void addProtein();
    abstract void addGarnish();

    private void boilWater() {
        System.out.println("Boiling water!");
    }
}
