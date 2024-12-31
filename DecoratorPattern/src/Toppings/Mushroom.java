package Toppings;

import Pizza.BasePizza;

public class Mushroom extends ToppingsDecorator{

    private final BasePizza pizza;
    public Mushroom(BasePizza pizza){
        this.pizza=pizza;
    }
    @Override
    public int cost(){
        return this.pizza.cost()+20;
    }
}
