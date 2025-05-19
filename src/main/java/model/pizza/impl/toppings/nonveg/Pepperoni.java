package model.pizza.impl.toppings.nonveg;

import model.pizza.Pizza;
import model.pizza.price.PriceStrategy;

public class Pepperoni extends Pizza {

    private Pizza pizza;

    private static final double PEPERONI = 4;

    private PriceStrategy priceStrategy;

    public Pepperoni(Pizza pizza, PriceStrategy priceStrategy) {
        this.pizza = pizza;
        this.priceStrategy = pizza.getPriceStrategy();
    }

    @Override
    public PriceStrategy getPriceStrategy() {
        return this.priceStrategy;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + priceStrategy.getPrice(PEPERONI);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Peperoni";
    }


}
