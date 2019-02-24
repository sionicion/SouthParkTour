package com.example.southparktour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    // The CategoryAdapter communicates to the ViewPager the different fragments the app has.

    private Context appContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        appContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new EatFragment();
        else if (position == 1)
            return new RecreationFragment();
        else if (position == 2)
            return new ShoppingFragment();
        else
            return new ServicesFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return appContext.getString(R.string.tab_one_name);
        else if (position == 1)
            return appContext.getString(R.string.tab_two_name);
        else if (position == 2)
            return appContext.getString(R.string.tab_three_name);
        else
            return appContext.getString(R.string.tab_four_name);
    }
}
