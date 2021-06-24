package com.nurhossen.nur_assignmentapp.view.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.nurhossen.nur_assignmentapp.R;
import com.nurhossen.nur_assignmentapp.viewmodel.HomeViewmodel;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navlistener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new HomeFragment()).commit();
    }

    private  BottomNavigationView.OnNavigationItemSelectedListener navlistener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment  fragmentSelect = null;

            switch (item.getItemId()){
                case R.id.homeid:
                    fragmentSelect = new HomeFragment();
                    break;
                case R.id.browserid:
                    fragmentSelect = new BrowserFragment();
                    break;
                case R.id.settingsid:
                    fragmentSelect = new SettingsFragment();
                    break;
                case R.id.dashbordid:
                    fragmentSelect = new DashBordFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragmentSelect).commit();

            return true;
        }
    };
}