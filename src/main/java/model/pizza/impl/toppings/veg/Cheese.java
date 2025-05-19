package model.pizza.impl.toppings.veg;

import model.pizza.Pizza;
import model.pizza.price.PriceStrategy;

public class Cheese extends Pizza {

    private Pizza pizza;

    private static final double CHESSE = 4;

    private PriceStrategy priceStrategy;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
        this.priceStrategy=pizza.getPriceStrategy();
    }

    @Override
    public PriceStrategy getPriceStrategy() {
        return this.priceStrategy;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + priceStrategy.getPrice(CHESSE);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Cheese";
    }


}
