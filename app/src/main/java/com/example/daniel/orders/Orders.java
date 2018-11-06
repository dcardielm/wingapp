package com.example.daniel.orders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Orders extends AppCompatActivity {

    double quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);

        Spinner spinner = (Spinner) findViewById(R.id.flavors_spinner);

        Spinner spinner2 = (Spinner) findViewById(R.id.flavors_spinner2);

        Spinner spinner3 = (Spinner) findViewById(R.id.flavors_spinner3);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.flavors_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner2.setAdapter(adapter);

        spinner3.setAdapter(adapter);
    }


    public void increment(View view){
        quantity++;

        if (quantity > 100){
            Context context = getApplicationContext();
            CharSequence text = "You cannot have more then 100 orders";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            quantity = 100;
            toast.show();
        }
        displayQuantity(quantity);

    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view){

        quantity--;

        if(quantity < 1) {
            Context context = getApplicationContext();
            CharSequence text = "You cannot have less then 1 order!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);

            quantity = 1;
            toast.show();
        }

        displayQuantity(quantity);

    }

    private void displayQuantity(double numberOfOrders) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfOrders);
    }

    public void submitOrder(View view){
        //Check which boxes are checked
        CheckBox tenPcCheckBox = (CheckBox) findViewById(R.id.ten_Pc_CheckBox);
        boolean hasTenPc = tenPcCheckBox.isChecked();

        CheckBox fivePcCheckBox = (CheckBox) findViewById(R.id.five_Pc_CheckBox);
        boolean hasFivePc = fivePcCheckBox.isChecked();

        CheckBox friesCheckBox = (CheckBox) findViewById(R.id.fries_CheckBox);
        boolean hasfries = friesCheckBox.isChecked();

        double price = calculatePrice(hasTenPc, hasFivePc, hasfries);

    }


    public double calculatePrice(boolean addTenPc, boolean addFivePc, boolean addFries){
        double basePrice = 0.0;

        //add up all checked boxes
        if (addTenPc){
            basePrice += 10;
        }

        if (addFivePc){
            basePrice += 5;
        }

        if (addFries) {
            basePrice += 3;
        }


        return (quantity * basePrice);

    }

    public void nextPage(View view){

        //Check which boxes are checked
        CheckBox tenPcCheckBox = (CheckBox) findViewById(R.id.ten_Pc_CheckBox);
        boolean hasTenPc = tenPcCheckBox.isChecked();

        CheckBox fivePcCheckBox = (CheckBox) findViewById(R.id.five_Pc_CheckBox);
        boolean hasFivePc = fivePcCheckBox.isChecked();

        CheckBox friesCheckBox = (CheckBox) findViewById(R.id.fries_CheckBox);
        boolean hasFries = friesCheckBox.isChecked();

        Spinner tenSinnerFlavor = (Spinner) findViewById(R.id.flavors_spinner);
        String tenFlavor = tenSinnerFlavor.getSelectedItem().toString();

        Spinner fiveSinnerFlavor = (Spinner) findViewById(R.id.flavors_spinner2);
        String fiveFlavor = fiveSinnerFlavor.getSelectedItem().toString();

        Spinner friesSinnerFlavor = (Spinner) findViewById(R.id.flavors_spinner3);
        String friesFlavor = friesSinnerFlavor.getSelectedItem().toString();

        Intent i = new Intent(this, Orders2.class);

        Bundle bundle = new Bundle();
        bundle.putBoolean("Has10pc", hasTenPc );
        bundle.putBoolean("Has5pc", hasFivePc );
        bundle.putBoolean("HasFries", hasFries );
        bundle.putString("tenFlavor", tenFlavor);
        bundle.putString("fiveFlavor", fiveFlavor);
        bundle.putString("friesFlavor", friesFlavor);

        i.putExtras(bundle);

        startActivity(i);


    }



}
