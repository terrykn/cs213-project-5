package com.example.project5;
import java.util.ArrayList;
/**
 * @author Terry Nguyen, Olivia Schroeder
 * ChicagoPizza class helps make each pizza of Chicago type. Sends in the appropriate CRUST, size, and style of pizza.
 * crust is heavly dependent on this being this style pizza, same with NYstyle
 */
public class ChicagoPizza implements PizzaFactory {
    /**
     * create new pizza instance for deluxe when its this style pizza
     * @return new pizza instance with deluxe attributes for this style pizza
     */
    public Pizza createDeluxe(Size size) {
        return new Deluxe(Crust.DeepDish, size, "Chicago Style");
    }
    /**
     * create new pizza instance for meatzza when its this style pizza
     * @return new pizza instance with meatzza attributes for this style pizza
     */
    public Pizza createMeatzza(Size size) {
        return new Meatzza(Crust.Stuffed, size, "Chicago Style");
    }
    /**
     * create new pizza instance for bbqChicken when its this style pizza
     * @return new pizza instance with bbqChicken attributes for this style pizza
     */
    public Pizza createBBQChicken(Size size) {
        return new BBQChicken(Crust.Pan, size, "Chicago Style");
    }
    /**
     * create new pizza instance for buildYourOwn when its this style pizza
     * @return new pizza instance with buildYourOwn attributes for this style pizza
     */
    public Pizza createBuildYourOwn(Size size, ArrayList<Topping> toppings) {
        return new BuildYourOwn(Crust.Pan, size,"Chicago Style", toppings);
    }
}
