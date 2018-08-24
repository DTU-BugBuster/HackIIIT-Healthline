package com.example.android;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


import com.cbitss.careforu.R;
import com.example.android.DonateBloodFragments.BloodBanksFragment;
import com.example.android.DonateBloodFragments.DonorsFragment;
import com.example.android.DonateBloodFragments.OpenRequestsFragment;
import com.example.android.DonationViewPagerAdapter ;

public class DonateBloodActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
   DonationViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_blood);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.puzzle_viewpager);
        viewPagerAdapter = new com.example.android.DonationViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new DonorsFragment(), "Donor");
        viewPagerAdapter.addFragments(new BloodBanksFragment(), "Blood Bank");
        viewPagerAdapter.addFragments(new OpenRequestsFragment(), "Open Request");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        getSupportActionBar().setTitle("Donate Blood");
    }
}
