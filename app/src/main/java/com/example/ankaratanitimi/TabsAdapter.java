package com.example.ankaratanitimi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabsAdapter extends FragmentPagerAdapter {
    public TabsAdapter(@NonNull FragmentManager fm) {
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                YemekFragment yemekFragment = new YemekFragment();
                return yemekFragment;
            case 1:
                GeziFragment geziFragment = new GeziFragment();
                return geziFragment;
            case 2:
                TarihiYerFragment tarihiYerFragment = new TarihiYerFragment();
                return tarihiYerFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                return "Yöresel Lezzetler";
            case 1:
                return "Gezİlecek Yerler";
            case 2:
                return "Tarİhİ Yerler";
            default:
                return null;
        }
    }
}
