package model.pizza.price;

import model.pizza.Pizza;
import model.pizza.exception.InvalidPizzaSizeException;
import model.pizza.price.impl.LargePizzaPriceStrategy;
import model.pizza.price.impl.MediumPizzaPriceStrategy;
import model.pizza.PizzaSize;
import model.pizza.price.impl.SmallPizzaPriceStrategy;

import java.util.HashMap;
import java.util.Map;

public class PriceStrategyFactory {

    Map<PizzaSize,PriceStrategy> priceStrategyMap=new HashMap<>();

    public PriceStrategyFactory(){
        priceStrategyMap.put(PizzaSize.SMALL,new SmallPizzaPriceStrategy());
        priceStrategyMap.put(PizzaSize.MEDIUM,new MediumPizzaPriceStrategy());
        priceStrategyMap.put(PizzaSize.LARGE,new LargePizzaPriceStrategy());
    }

    public void addPriceStrategy(PizzaSize pizzaSize, PriceStrategy priceStrategy){
        priceStrategyMap.put(pizzaSize,priceStrategy);
    }

    public void removePriceStrategy(PizzaSize pizzaSize){
        priceStrategyMap.remove(pizzaSize);
    }

    public PriceStrategy getPriceStrategy(PizzaSize pizzaSize) throws InvalidPizzaSizeException {

        if(priceStrategyMap.containsKey(pizzaSize)){
            return priceStrategyMap.get(pizzaSize);
        }else{
            throw new InvalidPizzaSizeException("Invalid pizza size");
        }
    }

}
