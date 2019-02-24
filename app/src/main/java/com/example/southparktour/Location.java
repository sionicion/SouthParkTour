package com.example.southparktour;

public class Location {
    // The Location class will store information about a given location. Such as name, address, image.

    // Here I defined the private variables, they will hold integers.
    private int locationNameID;
    private int locationAddressID;
    private int locationImageID;

    // One constructor exists and it is designed to take the resource IDs and assign the variables.
    public Location(int locationName, int locationAddress, int locationImage)
    {locationNameID=locationName; locationAddressID=locationAddress; locationImageID=locationImage;}

    // These are the getter methods, they will return the resource IDs.
    public int getLocationName() {
        return locationNameID;
    }

    public int getLocationAddress() {
        return locationAddressID;
    }

    public int getLocationImage() {
        return locationImageID;
    }
}
