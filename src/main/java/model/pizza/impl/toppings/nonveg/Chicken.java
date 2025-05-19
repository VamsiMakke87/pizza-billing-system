package model.pizza.impl.toppings.nonveg;

import model.pizza.Pizza;
import model.pizza.price.PriceStrategy;

public class Chicken extends Pizza {

    private Pizza pizza;

    private static final double CHICKEN = 4;

    private PriceStrategy priceStrategy;

    public Chicken(Pizza pizza, PriceStrategy priceStrategy) {
        this.pizza = pizza;
        this.priceStrategy = pizza.getPriceStrategy();
    }

    @Override
    public PriceStrategy getPriceStrategy() {
        return this.priceStrategy;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + priceStrategy.getPrice(CHICKEN);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Chicken";
    }


}
