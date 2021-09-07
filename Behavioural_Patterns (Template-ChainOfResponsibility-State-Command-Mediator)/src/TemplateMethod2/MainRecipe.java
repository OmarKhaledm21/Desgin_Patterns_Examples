package TemplateMethod2;

public abstract class MainRecipe {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pouring in cup");
    }
}
