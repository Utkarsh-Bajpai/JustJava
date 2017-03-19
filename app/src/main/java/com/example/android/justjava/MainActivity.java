package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity
{

    int quantity = 0, price = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view)
    {
        price = quantity*20;
        createOrderSummary();
    }

    public void createOrderSummary()
    {
        String priceMessage = "Name: Utkarsh Bajpai" + "\nQuantity: " + quantity + "\nTotal: Rs." + price + "\nThank You!!!";
        displayMessage(priceMessage);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view)
    {
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method is called when the Minus button is clicked.
     */
    public void decrement(View view)
    {
        if(quantity-1>=0)
        {
            quantity = quantity - 1;
            display(quantity);
        }
        else
        {
            String priceMessage = "\t\t\t\t\t\t\t\t\tQuantity Can not be Negative!!!";
            displayMessage(priceMessage);
        }

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message)
    {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}