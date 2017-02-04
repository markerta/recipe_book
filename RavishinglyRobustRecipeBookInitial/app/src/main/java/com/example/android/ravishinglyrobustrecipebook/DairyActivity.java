package com.example.android.ravishinglyrobustrecipebook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.M;

/**
 * Activity to take in ArrayList of Recipe Objects (Grains-related)
 * and display them through a custom RecipeAdapter
 */

public class DairyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new DairyFragment())
                .commit();
    }


}
