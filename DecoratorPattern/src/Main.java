import Pizza.BasePizza;
import Pizza.Farmhouse;
import Pizza.MargheritaPizza;
import Toppings.ExtraCheese;
import Toppings.Mushroom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        BasePizza pizza = new Mushroom(new ExtraCheese(new Farmhouse()));

        int cost = pizza.cost();
        System.out.println("cost of pizza="+cost);
    }
}