package com.example.southparktour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {
    // The LocationAdapter will pass data between the ArrayList objects and the ListView objects.

    // This is the default constructor.
    public LocationAdapter(Context context, ArrayList<Location> locations)
    {super(context,0,locations);}

    // Here is where the adapter assigns the data from the Location object we received and then
    // returns the listItemView to the caller.
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null)
        {listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false); }

        Location currentLocation = getItem(position);

        TextView locationNameTextView = listItemView.findViewById(R.id.locationName_text_view);
        TextView addressTextView = listItemView.findViewById(R.id.address_text_view);
        ImageView locationImageView = listItemView.findViewById(R.id.image);

        locationNameTextView.setText(currentLocation.getLocationName());
        addressTextView.setText(currentLocation.getLocationAddress());
        locationImageView.setImageResource(currentLocation.getLocationImage());

        return listItemView;
    }


}
