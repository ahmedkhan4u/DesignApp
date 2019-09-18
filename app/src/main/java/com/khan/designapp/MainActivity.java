package com.khan.designapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.khan.designapp.Fragments.DesignFragment;
import com.khan.designapp.Fragments.FeedbackFragment;
import com.khan.designapp.Fragments.PurchaseFragment;
import com.khan.designapp.Fragments.SettingsFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;
    TextView toolbarText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setFragment(new DesignFragment());
        setDesignFragmentToolbar();
        toolbar = findViewById(R.id.toolbar);
        toolbarText = toolbar.findViewById(R.id.toolbarText);
        setSupportActionBar(toolbar);
        toolbarText.setText("CodeX");
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        bottomNavigationView = findViewById(R.id.bottom_nav);





        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.icon_design:
                        setFragment(new DesignFragment());
                        return true;
                    case R.id.icon_purchase:
                        setFragment(new PurchaseFragment());
                        return true;
                    case R.id.icon_settings:
                        setFragment(new SettingsFragment());
                        return true;
                    case R.id.icon_feedback:
                        setFragment(new FeedbackFragment());
                        return true;
                }
                return false;
            }
        });
    }

    private void setDesignFragmentToolbar() {



    }

    void setFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragments_layout,fragment);
        transaction.commit();
    }
}
