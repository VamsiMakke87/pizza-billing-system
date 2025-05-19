package model.pizza.impl;

import model.pizza.Pizza;
import model.pizza.price.PriceStrategy;

public class ThickCrust extends Pizza{



    private static final  double THICK_CRUST_PRICE= 10;

    private PriceStrategy priceStrategy;

    public ThickCrust( PriceStrategy priceStrategy){
        this.priceStrategy=priceStrategy;
    }

    @Override
    public PriceStrategy getPriceStrategy() {
        return this.priceStrategy;
    }

    @Override
    public double getPrice() {
        return priceStrategy.getPrice(THICK_CRUST_PRICE);
    }

    @Override
    public String getDescription() {
        return "Thick Crust";
    }



}
