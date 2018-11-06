package com.example.daniel.orders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.id.list;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_list);

        ArrayList<Table> tables = new ArrayList<>();

        tables.add(new Table("10 Piece", 0));
        tables.add(new Table("5 Piece", 1));
        tables.add(new Table("10 Piece", 2));
        tables.add(new Table("10 Piece", 0));
        tables.add(new Table("5 Piece", 2));
        tables.add(new Table("5 Piece", 1));
        tables.add(new Table("10 Piece", 2));
        tables.add(new Table("5 Piece", 1));
        tables.add(new Table("10 Piece", 0));
        tables.add(new Table("10 Piece", 1));
        tables.add(new Table("10 Piece", 0));
        tables.add(new Table("5 Piece", 1));
        tables.add(new Table("10 Piece", 2));
        tables.add(new Table("10 Piece", 0));
        tables.add(new Table("5 Piece", 2));
        tables.add(new Table("5 Piece", 1));
        tables.add(new Table("10 Piece", 2));
        tables.add(new Table("5 Piece", 1));
        tables.add(new Table("10 Piece", 0));
        tables.add(new Table("10 Piece", 1));
        tables.add(new Table("10 Piece", 0));
        tables.add(new Table("5 Piece", 1));
        tables.add(new Table("10 Piece", 2));
        tables.add(new Table("10 Piece", 0));
        tables.add(new Table("5 Piece", 2));
        tables.add(new Table("5 Piece", 1));
        tables.add(new Table("10 Piece", 2));
        tables.add(new Table("5 Piece", 1));
        tables.add(new Table("10 Piece", 0));
        tables.add(new Table("10 Piece", 1));
        tables.add(new Table("10 Piece", 0));
        tables.add(new Table("5 Piece", 1));
        tables.add(new Table("10 Piece", 2));
        tables.add(new Table("10 Piece", 0));
        tables.add(new Table("5 Piece", 2));
        tables.add(new Table("5 Piece", 1));
        tables.add(new Table("10 Piece", 2));
        tables.add(new Table("5 Piece", 1));
        tables.add(new Table("10 Piece", 0));
        tables.add(new Table("10 Piece", 1));


        TableAdapter tableAdapter = new TableAdapter(this, tables);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(tableAdapter);
    }
}
