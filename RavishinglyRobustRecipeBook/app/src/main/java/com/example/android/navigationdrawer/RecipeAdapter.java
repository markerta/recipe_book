package com.example.android.navigationdrawer;

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
 * Custom RecipeAdapter created to store Recipe Objects
 * and output them to ListViews displaying said Recipes.
 */

public class RecipeAdapter extends ArrayAdapter<Recipe> {

    /* Resource Id for the background color for this list of Recipes */
    private int mColorResourceId;

    /**
     * Custom constructor to take in necessary Recipe variables
     *
     * @param context   The current context. Used to inflate layout file.
     * @param recipes   A list of Recipe Objects to display in ListView
     */
    public RecipeAdapter(Activity context, ArrayList<Recipe> recipes, int colorResourceId) {
        super(context, 0, recipes);
        mColorResourceId=colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.indv_recipe, parent, false);
        }

        // Get the Recipe object located at this position in the list
        Recipe currentRecipe = getItem(position);

        // Find TextView in recipe_list_item.xml layout with the ID text_view
        TextView text_view = (TextView) listItemView.findViewById(R.id.text_view);
        text_view.setText(currentRecipe.getRecipeName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.recipe_icon);

        iconView.setImageResource(currentRecipe.getImageResourceId());
        iconView.setVisibility(View.VISIBLE);

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_view);
        int color= ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
