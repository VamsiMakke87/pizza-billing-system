package model.pizza.impl;

import model.pizza.Pizza;
import model.pizza.price.PriceStrategy;

public class ThinCrust extends  Pizza{



    private static final  double THIN_CRUST_PRICE= 10;

    private PriceStrategy priceStrategy;

    public ThinCrust(PriceStrategy priceStrategy){
        this.priceStrategy=priceStrategy;
    }


    @Override
    public PriceStrategy getPriceStrategy() {
        return this.priceStrategy;
    }

    @Override
    public double getPrice() {
        return priceStrategy.getPrice(THIN_CRUST_PRICE);
    }

    @Override
    public String getDescription() {
        return "Thin Crust";
    }



}
