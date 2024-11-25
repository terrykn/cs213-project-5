package com.example.project5;
import java.util.ArrayList;
/**
 * @author Terry Nguyen, Olivia Schroeder
 * This contains a list of the pizza in this order
 * and a number the order can be identified by.
 */
public class Order {
    private int number; //order number
    private ArrayList<Pizza> pizzas; //can use List<E> instead of ArrayList<E>

    /** default constructor, gives this order a unique ID */
    public Order(int orderNumber) {
        this.number = orderNumber;
        pizzas = new ArrayList<Pizza>();
    }
    /**
     * get this orders current SUBtotal
     * @return subtotal $ amount
     */
    public double price_subTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.price();
        }
        return total;
    }
    /**
     * get this orders current SALES tax
     * @return sales tax $ on this order
     */
    public double price_salesTax() {
        return price_subTotal() * 0.06625;
    }
    /**
     * get this orders current TOTAL
     * @return total $ amount
     */
    public double price_total() {
        return price_subTotal() + price_salesTax();
    }
    /**
     * add a pizza to this order
     */
    public void addPizza(Pizza pizza) {pizzas.add(pizza);}
    /**
     * remove a pizza from this order
     */
    public void removePizza(Pizza pizza) {pizzas.remove(pizza);}
    /**
     * get the order number
     * @return order number
     */
    public int getNumber() {return number;}
    /**
     * get the pizzas in this order
     * @return pizzas arraylist in this order
     */
    public ArrayList<Pizza> getPizzas() {return pizzas;}
    /**
     * print current order
     * @return string of order
     */
    @Override
    public String toString() {
        return "Order{" +
                "number = " + number +
                ", # of Pizzas = " + pizzas.size() +
                '}';
    }

}
