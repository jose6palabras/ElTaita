package com.grupodetec.eltaita.View;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by android on 21/01/19.
 */

public class PageAdapter extends FragmentPagerAdapter {
    private int numTabs;

    public PageAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new TablesFragment();
            case 1:
                return new PetitionsFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
