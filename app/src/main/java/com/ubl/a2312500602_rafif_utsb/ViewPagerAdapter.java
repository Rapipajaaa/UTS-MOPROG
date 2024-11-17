package com.ubl.a2312500602_rafif_utsb;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Akademik1();
            case 1:
                return new Akademik2();
            case 2:
                return new Akademik3();
            case 3:
                return new Akademik4();
            default:
                return new Akademik1();
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
                return "Profil";
            case 1:
                return "Program Sarjana";
            case 2:
                return "Matakuliah";
            case 3:
                return "Lokasi";
            default:
                return null;
        }
    }
}
