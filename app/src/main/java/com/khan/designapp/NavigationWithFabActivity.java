package com.khan.designapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;

public class NavigationWithFabActivity extends AppCompatActivity {
    CoordinatorLayout bg;
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_with_fab);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bg = findViewById(R.id.nav_withFab);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id == R.id.home){
                    bg.setBackgroundColor(android.R.color.white);
                    return true;
                }
                if (id == R.id.profile){
                    bg.setBackgroundColor(Color.RED);
                    return true;
                }

                return false;
            }
        });
    }

    public void FabCliked(View view) {
        Snackbar snackbar = Snackbar
                .make(bg, "Camera Clicked", Snackbar.LENGTH_LONG);
        snackbar.show();    }
}
