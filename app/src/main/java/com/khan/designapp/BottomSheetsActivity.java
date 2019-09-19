package com.khan.designapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class BottomSheetsActivity extends AppCompatActivity {

    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheets);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        mToolbar = findViewById(R.id.bottom_sheet_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);
        mToolbar.setTitle("Bottom Sheets");
    }

    public void SimpleSheet(View view) {
        startActivity(new Intent(getApplicationContext(),SimpleBottomSheetActivity.class));
    }

    public void GridSheet(View view) {
        startActivity(new Intent(getApplicationContext(),BottomSheetGridActivity.class));
    }


    public void FoodOrderSheet(View view) {
        startActivity(new Intent(getApplicationContext(),FoodOrderBottomSheet.class));
    }
}
