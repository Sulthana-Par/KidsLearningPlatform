package com.example.kidslearningapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyAdapter extends FragmentStateAdapter {

    public MyAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override
    public Fragment createFragment(int position) {
        switch(position) {
            case 0: return new AlphabetFragment();
            case 1: return new FruitFragment();
            case 2: return new AnimalFragment();
        }        return new AlphabetFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
