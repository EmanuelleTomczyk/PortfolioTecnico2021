package com.example.happyworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class Fragment extends AppCompatActivity {
    ViewPager2 pager;
    Adaptador adaptador;
    TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        getSupportActionBar().hide();
        pager = findViewById(R.id.pager);
        tab = findViewById(R.id.tab);
        FragmentManager fm = getSupportFragmentManager();
        adaptador = new Adaptador(fm, getLifecycle());
        pager.setAdapter(adaptador);
        tab.addTab(tab.newTab().setText("Pegadas"));
        tab.addTab(tab.newTab().setText("Biblioteca"));
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tab.selectTab(tab.getTabAt(position));
            }
        });
    }
}