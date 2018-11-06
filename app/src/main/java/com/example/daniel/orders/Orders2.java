package com.example.daniel.orders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Orders2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders2);

        Intent iExtras = getIntent();


        boolean hasTen = iExtras.getBooleanExtra("Has10Pc", false );
        boolean hasFive = iExtras.getBooleanExtra("Has5Pc", false );
        boolean hasFries = iExtras.getBooleanExtra("HasFries", false );

        String Flavor1 = iExtras.getStringExtra("tenFlavor");
        String Flavor2 = iExtras.getStringExtra("fiveFlavor");
        String Flavor3 = iExtras.getStringExtra("friesFlavor");

        String OrderSum = "Ten Wings: " + hasTen + " Flavor: " + Flavor1 + "\n"
                + "Five Wings: " + hasFive + " Flavor: " + Flavor2 + "\n"
                + "Fries: " + hasFries + " Flavor: " + Flavor3;

        TextView displayTextView = (TextView) findViewById(R.id.display);
        displayTextView.setText(OrderSum);
    }


}
