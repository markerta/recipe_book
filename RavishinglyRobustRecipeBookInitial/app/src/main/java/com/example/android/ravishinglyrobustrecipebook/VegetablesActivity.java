package com.example.android.ravishinglyrobustrecipebook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Activity to take in ArrayList of Recipe Objects (Vegetables-related)
 * and display them through a custom RecipeAdapter
 */

public class VegetablesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new VegetablesFragment())
                .commit();
    }


}
