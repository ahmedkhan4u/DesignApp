package com.khan.designapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class FoodOrderBottomSheet extends AppCompatActivity {

    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order_bottom_sheet);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        mToolbar = findViewById(R.id.food_ordering_toolbar);
        setSupportActionBar(mToolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.food_order_menu,menu);
        return true;
    }

    public void FoodClick(View view) {
        Display();

    }

    public void FoodClick1(View view) {
        Display();
    }

    public void Display(){
        BottomSheetDialog dialog = new BottomSheetDialog(FoodOrderBottomSheet.this);
        dialog.setContentView(R.layout.food_order_bottom_sheet);

        Button btnProceed = dialog.findViewById(R.id.btnOrder);
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FoodOrderBottomSheet.this, "Bill Payed", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();

    }
}
