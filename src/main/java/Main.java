import model.pizza.Pizza;
import model.pizza.PizzaSize;
import model.pizza.exception.InvalidPizzaSizeException;
import model.pizza.impl.ThickCrust;
import model.pizza.impl.toppings.nonveg.Bacon;
import model.pizza.impl.toppings.veg.Cheese;
import model.pizza.price.PriceStrategy;
import model.pizza.price.PriceStrategyFactory;

public class Main {

    public static void main(String[] args) {
        try {
            PriceStrategy priceStrategy = new PriceStrategyFactory().getPriceStrategy(PizzaSize.MEDIUM);

            Pizza pizza = new Cheese(new Bacon(new ThickCrust(priceStrategy)));
            System.out.println("Order: " + pizza.getDescription());
            System.out.println("Pizza Size: " + priceStrategy.getPizzaSize());
            System.out.println("Price: $" + pizza.getPrice());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
