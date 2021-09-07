package TemplateMethod2;

public class Tea extends MainRecipe{

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");

    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");

    }


}