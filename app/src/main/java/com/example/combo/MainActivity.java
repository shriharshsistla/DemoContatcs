package com.example.combo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.Vpager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentCall(), "Call");
        adapter.AddFragment(new FragmentContact(), "Contact");
        adapter.AddFragment(new FragmentFav(), "Favorite");
        tabLayout.setupWithViewPager(viewPager);




        viewPager.setAdapter(adapter);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

    }
}