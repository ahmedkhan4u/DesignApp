package com.khan.designapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class BottomNavigationActivity extends AppCompatActivity {

    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mToolbar = findViewById(R.id.bottom_nav_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);
        mToolbar.setTitle("Bottom Navigation");
    }

    public void BottomAppBar(View view) {
        startActivity(new Intent(getApplicationContext(),BottomAppBarClass.class));
    }

    public void ShiftingNavBar(View view) {
        startActivity(new Intent(getApplicationContext(),ShiftingNavigationActivity.class));

    }

    public void GoToNavFab(View view) {
        startActivity(new Intent(getApplicationContext(),NavigationWithFabActivity.class));
    }
}
