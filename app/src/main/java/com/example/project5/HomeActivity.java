package com.example.project5;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private Order currentOrder = new Order(1); // this is our current order (contains pizzas arraylist)
    private ArrayList<Order> allOrders = new ArrayList<Order>(); // this is all the orders that have been placed
    private int orderNumber = 1; // this is the order number we can use to pass into the Order constructor

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        LinearLayout nyStyleButton = findViewById(R.id.nyStyleButton);
        LinearLayout chicagoStyleButton = findViewById(R.id.chicagoStyleButton);
        Button currentOrderButton = findViewById(R.id.currentOrderButton);
        Button allOrdersButton = findViewById(R.id.allOrdersButton);

        nyStyleButton.setOnClickListener(v -> startActivity(new Intent(this, NYStyleActivity.class)));
        chicagoStyleButton.setOnClickListener(v -> startActivity(new Intent(this, ChicagoStyleActivity.class)));
        currentOrderButton.setOnClickListener(v -> startActivity(new Intent(this, CurrentOrderActivity.class)));
        allOrdersButton.setOnClickListener(v -> startActivity(new Intent(this, AllOrdersActivity.class)));

    }

    /**
     * for when changing back to the home controller scene after user added to order. This adds the pizza to our currentOrder
     * @param pizza we want to add to order
     */
    public void addPizzaToOrder(Pizza pizza) {
        if (currentOrder == null) { // then we need to create a new order
            currentOrder = new Order(orderNumber);
            orderNumber++; // INCREMENT CURRENTORDER NUMBER SO THEY ARE ALWAYS UNIQUE
        }
        currentOrder.addPizza(pizza);
    }
    /**
     * for when changing back to the home controller scene after user added to order. This adds the pizza to our currentOrder
     * @param pizza we want to remove from order
     */
    public void removePizzaFromOrder(Pizza pizza) {
        try {
            currentOrder.removePizza(pizza);
        } catch (Exception e) {
            Toast.makeText(this, "Need to add pizzas to order.", Toast.LENGTH_LONG).show();
        }
    }
    /**
     * for when changing back to the home controller scene after user added to order. This adds the pizza to our currentOrder
     * when you want to set the current order instance
     * @param order we want to set as the current order
     */
    public void setCurrentOrder(Order order) {currentOrder = order;}
    /**
     * for when changing back to the home controller scene after user added to order.
     * this makes sure data is kept between controllers, and for this one we want to make sure allOrders is saved
     */
    public void setAllOrders(ArrayList<Order> orders) {allOrders = orders;}
    /**
     * getter for currentOrder array
     * @return order that is currently being processed
     */
    public Order getCurrentOrder() {return this.currentOrder;}
    /**
     * getter for all orders arraylist
     * @return arraylist of all the orders
     */
    public ArrayList<Order> getAllOrders() {return this.allOrders;}
    /**
     * getter for order number
     * @return order number of this instance
     */
    public int getOrderNumber() {return orderNumber;}
    /**
     * set orderNumber we are on (increment when pizza is ordered, never decrement)
     * @param newOrderNumber order number or number to set
     */
    public void setOrderNumber(int newOrderNumber) {this.orderNumber = newOrderNumber;}
}