package com.example.project5;
import java.util.ArrayList;
/**
 * @author Terry Nguyen, Olivia Schroeder
 * This interface gives guidelines to what the NYPizza and ChicagoPizza must follow
 */
public interface PizzaFactory {
    Pizza createDeluxe(Size size);
    Pizza createMeatzza(Size size);
    Pizza createBBQChicken(Size size);
    Pizza createBuildYourOwn(Size size, ArrayList<Topping> toppings);
}
