package com.example.project5;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Terry Nguyen, Olivia Schroeder
 * Build Your Own, BBQ Chicken, Meatzza, & Deluxe are all subclasses of the Pizza type. These are made by the
 * NYPizza and ChicagoPizza classes which each have specific parameters (i.e. the crust)
 */
public class Deluxe extends Pizza {
    private String typeString;
    public Deluxe(Crust crust, Size size, String typeString) {
        setCrust(crust); // sets the crust of the super class pizza
        setSize(size);
        this.typeString = typeString;
        ArrayList<Topping> toppings = new ArrayList<>(Arrays.asList(Topping.Sausage, Topping.Pepperoni, Topping.GreenPepper, Topping.Onion, Topping.Mushroom));
        setToppings(toppings);
    }
    /**
     * for getting the price of this pizza
     * @return price of Deluxe pizza
     */
    @Override
    public double price() {
        switch (this.getSize()) { // returns a size enum so case values dont need Size.VALUE
            case Small:
                return 16.99;
            case Medium:
                return 18.99;
            case Large:
                return 20.99;
            default: return 0;
        }
    }
    /**
     * for printing this pizza
     * @return string representation of this pizza
     */
    @Override
    public String toString() {
        return "Deluxe (" + this.typeString + " - " + this.getCrust() + "), " + Arrays.toString(this.getToppings().toArray()) + ", " + this.getSize() + ", " + String.format("%.2f", this.price());
    }
}
