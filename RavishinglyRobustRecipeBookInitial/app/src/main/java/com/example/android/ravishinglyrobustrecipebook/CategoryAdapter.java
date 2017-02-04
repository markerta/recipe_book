package com.example.android.ravishinglyrobustrecipebook;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {
            case 0: return new MeatsFragment();
            case 1: return new DairyFragment();
            case 2: return new VegetablesFragment();
            case 3: return new FruitsFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return mContext.getString(R.string.meats);
            case 1:
                return mContext.getString(R.string.dairy);
            case 2:
                return mContext.getString(R.string.vegetables);
            case 3:
                return mContext.getString(R.string.fruits);
            default:
                return null;
        }
    }
}
