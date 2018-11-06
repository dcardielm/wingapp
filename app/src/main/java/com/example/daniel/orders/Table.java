package com.example.daniel.orders;

/**
 * Created by Daniel on 5/19/2018.
 */

public class Table {

    private String sOrderType;

    private String aOrderType[] = {"Ten Piece", "Five Piece"};

    private String sFlavor;

    private String aFlavors[] = {"Lemon Pepper", "Buffalo","Mango Habanero" };


    public Table (int OrderType, int Flavor){

        sOrderType = aOrderType[OrderType];

        sFlavor = aFlavors[Flavor];


    }

    public String getmOrderType() {
        return sOrderType;
    }

    public String getaFlavor() {
        return sFlavor;
    }
}
