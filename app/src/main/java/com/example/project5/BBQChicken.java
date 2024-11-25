package com.example.project5;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Terry Nguyen, Olivia Schroeder
 * Build Your Own, BBQ Chicken, Meatzza, & Deluxe are all subclasses of the Pizza type. These are made by the
 * NYPizza and ChicagoPizza classes which each have specific parameters (i.e. the crust)
 */
public class BBQChicken extends Pizza {
    private String typeString;
    public BBQChicken(Crust crust, Size size, String typeString) {
        setCrust(crust); // sets the crust of the super class pizza
        setSize(size);
        this.typeString = typeString;
        ArrayList<Topping> toppings = new ArrayList<>(Arrays.asList(Topping.BBQChicken, Topping.GreenPepper, Topping.Provolone, Topping.Cheddar));
        setToppings(toppings);
    }
    /**
     * for getting the price of this pizza
     * @return price of BBQChicken pizza
     */
    @Override
    public double price() {
        switch (this.getSize()) { // returns a size enum so case values dont need Size.VALUE
            case Small:
                return 14.99;
            case Medium:
                return 16.99;
            case Large:
                return 19.99; // says 19.99 not 18.99 idk why
            default: return 0;
        }
    }
    /**
     * for printing this pizza
     * @return string representation of this pizza
     */
    @Override
    public String toString() {
        return "BBQ Chicken (" + this.typeString + " - " + this.getCrust() + "), " + Arrays.toString(this.getToppings().toArray()) + ", " + this.getSize() + ", " + String.format("%.2f", this.price());
    }
}
