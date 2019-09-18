package com.khan.designapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.khan.designapp.Fragments.CameraFragment;
import com.khan.designapp.Fragments.HomeFragment;
import com.khan.designapp.Fragments.ProfileFragment;
import com.khan.designapp.Fragments.SearchFragment;

public class ShiftingNavigationActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shifting_navigation);
        setFragment(new HomeFragment());
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bottomNavigationView = findViewById(R.id.nav_shifting);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.shifting_home:

                        setFragment(new HomeFragment());
                        return true;

                    case R.id.shifting_camera:
                        setFragment(new CameraFragment());
                        return true;

                    case R.id.shifting_search:
                        setFragment(new SearchFragment());
                        return true;

                    case R.id.shifting_profile:
                        setFragment(new ProfileFragment());
                        return true;

                        default:

                            return false;

                }
            }
        });

    }

    public void setFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.shifting_nav_fragments,fragment).commit();

    }
}