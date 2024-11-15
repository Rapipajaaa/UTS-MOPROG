package com.ubl.a2312500602_rafif_utsb;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            case 3:
                return new FourthFragment();
            default:
                return new FirstFragment();
        }
    }

    @Override
    public int getCount() {
        return 4; // Jumlah tab
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Tab 1";
            case 1:
                return "Tab 2";
            case 2:
                return "Tab 3";
            case 3:
                return "Tab 4";
            default:
                return null;
        }
    }
}
