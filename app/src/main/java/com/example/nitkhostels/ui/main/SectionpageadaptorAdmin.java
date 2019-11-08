package com.example.nitkhostels.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.nitkhostels.Employee;
import com.example.nitkhostels.Payment_Admin;
import com.example.nitkhostels.R;
import com.example.nitkhostels.Room;

public class SectionpageadaptorAdmin extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.Payment, R.string.Employee};
    private final Context mContext;

    public SectionpageadaptorAdmin(Context context, FragmentManager fm2) {
        super(fm2);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment2 = null;
        switch (position){

            case 0:
                fragment2 = new Payment_Admin();
                break;
            case 1:
                fragment2 = new Employee();
                break;
            default:
                fragment2 = null;

        }
        return fragment2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 2;
    }
}

