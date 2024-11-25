package com.example.project5;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Terry Nguyen, Olivia Schroeder
 * Build Your Own, BBQ Chicken, Meatzza, & Deluxe are all subclasses of the Pizza type. These are made by the
 * NYPizza and ChicagoPizza classes which each have specific parameters (i.e. the crust)
 */
public class BuildYourOwn extends Pizza {
    private String typeString;
    public BuildYourOwn(Crust crust, Size size, String typeString, ArrayList<Topping> customToppings) {
        if(customToppings.size() > 7){
            throw new IllegalArgumentException("Cannot create a BuildYourOwn pizza with more than 7 toppings");
        }
        setCrust(crust); // sets the crust of the super class pizza
        this.typeString = typeString;
        setSize(size);
        setToppings(customToppings);
    }

    /**
     * for getting the type string of the pizza ("New York Style" or "Chicago Style")
     * @return style type of the pizza
     */
    public String getTypeString() {
        return typeString;
    }

    /**
     * for getting the price of this pizza
     * @return price of Deluxe pizza
     */
    @Override
    public double price() {
        double price = 0.0;
        // Calculate price based on size
        switch (this.getSize()) {
            case Small:
                price = 8.99; // Small pizza additional cost
                break;
            case Medium:
                price = 10.99; // Medium pizza additional cost
                break;
            case Large:
                price = 12.99; // Large pizza additional cost
                break;
            default:
                break;
        }
        // Add the cost of the toppings (1.69 each)
        price += this.getToppings().size() * 1.69;
        return price; // Return the final price
    }
    /**
     * for printing this pizza
     * @return string representation of this pizza
     */
    @Override
    public String toString() {
        return "Build Your Own (" + this.typeString + " - " + this.getCrust() + "), " + Arrays.toString(this.getToppings().toArray()) + ", " + this.getSize() + ", " + String.format("%.2f", this.price());
    }
}
