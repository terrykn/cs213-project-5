package com.example.project5;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Terry Nguyen, Olivia Schroeder
 * NYPuzza class helps make each pizza of NyPizza type. Sends in the appropriate CRUST, size, and style of pizza.
 * crust is heavly dependent on this being this style pizza, same with ChicagoPizza
 */
public class NYPizza implements PizzaFactory {
    /**
     * create new pizza instance for deluxe when its this style pizza
     * @return new pizza instance with deluxe attributes for this style pizza
     */
    public Pizza createDeluxe(Size size) {
        return new Deluxe(Crust.Brooklyn, size, "New York Style");
    }
    /**
     * create new pizza instance for meatzza when its this style pizza
     * @return new pizza instance with meatzza attributes for this style pizza
     */
    public Pizza createMeatzza(Size size) {
        return new Meatzza(Crust.HandTossed, size, "New York Style");
    }
    /**
     * create new pizza instance for bbqChicken when its this style pizza
     * @return new pizza instance with bbqChicken attributes for this style pizza
     */
    public Pizza createBBQChicken(Size size) {
        return new BBQChicken(Crust.Thin, size, "New York Style");
    }
    /**
     * create new pizza instance for buildYourOwn when its this style pizza
     * @return new pizza instance with buildYourOwn attributes for this style pizza
     */
    public Pizza createBuildYourOwn(Size size, ArrayList<Topping> toppings) {
        return new BuildYourOwn(Crust.HandTossed, size, "New York Style", toppings);
    }
}
