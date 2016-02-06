package com.example.mwanza.citymov;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by mwanza on 04/02/16.
 */
public class PageAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public PageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Tab_myevents tab1 = new Tab_myevents();
                return tab1;
            case 1:
                Tab_upcoming tab2 = new Tab_upcoming();
                return tab2;
            case 2:
                TabSetting tab3 = new TabSetting();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
