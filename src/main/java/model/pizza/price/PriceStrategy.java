package model.pizza.price;

import model.pizza.PizzaSize;

import java.util.HashMap;
import java.util.Map;

public abstract class PriceStrategy {


    public abstract PizzaSize getPizzaSize();
    public abstract double getPrice(double price);

}
