package com.example.healthyeating.healthyeating.interfaces;



//This interface will allow communication between FavouritesUI Fragments and MainActivity

import com.example.healthyeating.healthyeating.entity.HealthyLocation;

import java.util.ArrayList;

public interface IFavouriteListener {

    // return list of favourites based on chosen category
    ArrayList<HealthyLocation> getFavsByCategory(String categoryChosen);

    // delete a location from favourites
    void removeFavourite(HealthyLocation favourite);
}