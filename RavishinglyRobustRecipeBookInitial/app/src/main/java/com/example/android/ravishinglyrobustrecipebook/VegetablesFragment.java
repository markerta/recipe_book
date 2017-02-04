package com.example.android.ravishinglyrobustrecipebook;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class VegetablesFragment extends Fragment {


    public VegetablesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recipe_list, container, false);

        ArrayList<Recipe> recipes = new ArrayList<>();

        recipes.add(new Recipe("Veggie Salad", R.drawable.vegetables_image));

        RecipeAdapter adapter = new RecipeAdapter(getActivity(), recipes, R.color.colorVegetables);
        ListView listView = (ListView) rootView.findViewById(R.id.recipe_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
