package com.example.vroooom;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.vroooom.ui.account.AccountFragment;
import com.example.vroooom.ui.activities.ActivitiesFragment;
import com.example.vroooom.ui.home.HomeFragment;
import com.example.vroooom.ui.services.ServicesFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new ServicesFragment();
            case 2:
                return new ActivitiesFragment();
            case 3:
                return new AccountFragment();
            default:
                return new HomeFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
