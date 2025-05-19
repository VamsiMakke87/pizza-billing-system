package model.pizza.impl.toppings.nonveg;

import model.pizza.Pizza;
import model.pizza.price.PriceStrategy;

public class Bacon extends Pizza {

    private Pizza pizza;

    private static final double BACON = 4;

    private PriceStrategy priceStrategy;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
        this.priceStrategy = pizza.getPriceStrategy();
    }

    @Override
    public PriceStrategy getPriceStrategy() {
        return this.priceStrategy;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + priceStrategy.getPrice(BACON);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Bacon";
    }


}
