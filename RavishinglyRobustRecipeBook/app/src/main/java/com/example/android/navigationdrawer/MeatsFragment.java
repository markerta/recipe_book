package com.example.android.navigationdrawer;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.navigationdrawer.Recipe;
import com.example.android.navigationdrawer.RecipeAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeatsFragment extends Fragment {

    public MeatsFragment() {
        // Required empty public constructor
    }

    private ActionBar getActionBar() {
        return ((AppCompatActivity) getActivity()).getSupportActionBar();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recipe_list, container, false);

        ArrayList<Recipe> recipes = new ArrayList<>();

        recipes.add(new Recipe("Beef and Vegetable Stir-Fry", R.drawable.meats_image));

        RecipeAdapter adapter = new RecipeAdapter(getActivity(), recipes, R.color.colorMeats);
        ListView listView = (ListView) rootView.findViewById(R.id.recipe_list);

        listView.setAdapter(adapter);

        getActionBar().setTitle("Ravishingly Robust Meats");

        return rootView;
    }

}
