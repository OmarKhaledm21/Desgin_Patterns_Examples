package Example2FactoryMethodPattern;

import java.util.ArrayList;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(){
        factory = new SimplePizzaFactory();
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
