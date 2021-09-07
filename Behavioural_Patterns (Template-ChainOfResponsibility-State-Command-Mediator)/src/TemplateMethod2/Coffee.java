package TemplateMethod2;

public class Coffee extends MainRecipe {
    @Override
    protected void brew() {

        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

}
