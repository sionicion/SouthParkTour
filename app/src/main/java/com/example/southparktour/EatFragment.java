package com.example.southparktour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EatFragment extends Fragment {
    // All the fragments work the same way, when the onCreateView method is called, the
    // location_list is inflated, the ArrayList is setup with the correct strings, then we create
    // an instance of the LocationAdapter, we find the ListView, and then set the ListView's
    // adapter. Then we return this rootView to the caller.

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.eat_one_name, R.string.eat_one_address, R.drawable.eat1));
        locations.add(new Location(R.string.eat_two_name, R.string.eat_two_address, R.drawable.eat2));
        locations.add(new Location(R.string.eat_three_name, R.string.eat_three_address, R.drawable.eat3));
        locations.add(new Location(R.string.eat_four_name, R.string.eat_four_address, R.drawable.eat4));
        locations.add(new Location(R.string.eat_five_name, R.string.eat_five_address, R.drawable.eat5));
        locations.add(new Location(R.string.eat_six_name, R.string.eat_six_address, R.drawable.eat6));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
