package com.khan.designapp;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomAppBarClass extends AppCompatActivity {
BottomAppBar bottomAppBarClass;
FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_app_bar);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bottomAppBarClass = (BottomAppBar) findViewById(R.id.bottom_app);
        floatingActionButton = findViewById(R.id.fab);


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BottomAppBarClass.this, "Message Friends", Toast.LENGTH_SHORT).show();
            }
        });

        setSupportActionBar(bottomAppBarClass);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.profile:

                return true;

            case R.id.home:

                return true;

                default:
                    return super.onOptionsItemSelected(item);

        }
    }

}
