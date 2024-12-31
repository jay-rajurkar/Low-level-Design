package Toppings;

import Pizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator{

    private final BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza=pizza;
    }

    @Override
    public int cost(){
        return this.pizza.cost()+50;
    }

}
