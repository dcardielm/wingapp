package com.example.daniel.orders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openOrdersTab(View view)
    {
        Intent i = new Intent(this, Orders.class);

        startActivity(i);

    }

    public void openHistoryTab(View view)
    {
        Intent i = new Intent(this, History.class);

        startActivity(i);
    }

    public void openEstimatesTab(View view)
    {
        Intent i = new Intent(this, Estimates.class);

        startActivity(i);
    }
}
