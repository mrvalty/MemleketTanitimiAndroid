package com.example.ankaratanitimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class AnaSayfaActivity extends AppCompatActivity {

    Button _btngeri;


    private ViewPager viewPager;
    private TabLayout tabsMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);

        viewPager=(ViewPager) findViewById(R.id.viewPagerMenu);
        tabsMain=(TabLayout) findViewById(R.id.tabsMain);

         TabsAdapter tabsAdapter = new TabsAdapter(getSupportFragmentManager());

        viewPager.setAdapter(tabsAdapter);

        tabsMain.setupWithViewPager(viewPager);
    }

}