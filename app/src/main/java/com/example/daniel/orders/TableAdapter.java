package com.example.daniel.orders;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Daniel on 5/24/2018.
 */

public class TableAdapter extends ArrayAdapter<Table> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;




    public TableAdapter(Activity context, ArrayList<Table> tables){


        super(context, 0, tables);
    }





    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Table currentTable = getItem(position);



        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView orderTextView = (TextView) listItemView.findViewById(R.id.order_text_view);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        orderTextView.setText(currentTable.getmOrderType());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView flavorTextView = (TextView) listItemView.findViewById(R.id.flavor_text_view);
        // Get the version number from the current Word object and
        // set this text on the number TextView
        flavorTextView.setText(currentTable.getaFlavor());

//        // Set the theme color for the list item
//        View textContainer = listItemView.findViewById(R.id.text_container);
//        // Find the color that the resource ID maps to
//        int color = ContextCompat.getColor(getContext(), mColorResourceId);
//        // Set the background color of the text container View
//        textContainer.setBackgroundColor(color);




//        // Find the ImageView in the list_item.xml layout with the ID image.
//        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
//        // Check if an image is provided for this word or not
//        if (currentTable.hasImage()) {
//            // If an image is available, display the provided image based on the resource ID
//            imageView.setImageResource(currentTable.getmImageReasourceId());
//            // Make sure the view is visible
//            imageView.setVisibility(View.VISIBLE);
//        } else {
//            // Otherwise hide the ImageView (set visibility to GONE)
//            imageView.setVisibility(View.GONE);
//        }





        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
