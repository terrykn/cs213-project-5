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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Order currentOrder = new Order(1); // this is our current order (contains pizzas arraylist)
    private ArrayList<Order> allOrders = new ArrayList<Order>(); // this is all the orders that have been placed
    private int orderNumber = 1; // this is the order number we can use to pass into the Order constructor

    // test

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
}