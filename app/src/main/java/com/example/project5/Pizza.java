package com.example.project5;
import java.util.ArrayList;
/**
 * @author Terry Nguyen, Olivia Schroeder
 * This is a abstract class for a pizza object that can be of actual type NYStyle or ChicagoStyle
 */
public abstract class Pizza {
    private ArrayList<Topping> toppings; //Topping is a Enum class
    private Crust crust; //Crust is a Enum class
    private Size size; //Size is a Enum class
    /**
     * Abstract class constructor to initialize with empty arraylist
     */
    public Pizza() {
        toppings = new ArrayList<>();
    }
    /**
     * ABSTRACT: get the price of the pizza
     * @return price of the pizza
     */
    public abstract double price();
    /**
     * get the toppings that are in this pizza
     * @return arraylist of toppings
     */
    public ArrayList<Topping> getToppings() {
        return toppings;
    }
    /**
     * set the toppings for this pizza
     * @param pizzaToppings arraylist of toppings
     */
    public void setToppings(ArrayList<Topping> pizzaToppings) {
        this.toppings = pizzaToppings;
    }
    /**
     * set the crust for this pizza
     * @param crust
     */
    public void setCrust(Crust crust) {
        this.crust = crust;
    }
    /**
     * get the crust for this pizza
     * @return crust to return
     */
    public Crust getCrust() {
        return crust;
    }
    /**
     * set the size for this pizza
     * @param size enum u want to set to
     */
    public void setSize(Size size) {
        this.size = size;
    }
    /**
     * get the size of this pizza
     * @return size enum of the pizza
     */
    public Size getSize() {
        return size;
    }
    /**
     * generic pizza print
     * @return string of the generic pizza
     */
    @Override
    public String toString() {
        return "generic Pizza{" +
                "toppings=" + toppings +
                ", crust=" + crust +
                ", size=" + size +
                '}';
    }
}
