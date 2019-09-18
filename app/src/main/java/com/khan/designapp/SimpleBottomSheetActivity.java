package com.khan.designapp;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class SimpleBottomSheetActivity extends AppCompatActivity {

 LinearLayout btnShow,btnShow1,btnShow2,btnShow3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_bottom_sheet);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);



        btnShow = findViewById(R.id.btnShow);
        btnShow1 = findViewById(R.id.btnShow1);
        btnShow2 = findViewById(R.id.btnShow2);
        btnShow3 = findViewById(R.id.btnShow3);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display();
            }
        });

        btnShow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display();
            }
        });

        btnShow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display();
            }
        });

        btnShow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display();
            }
        });
    }




    public void Display(){
        View dialogView = getLayoutInflater().inflate(R.layout.simple_bottom_sheet, null);
        BottomSheetDialog dialog = new BottomSheetDialog(SimpleBottomSheetActivity.this);
        dialog.setContentView(dialogView);
        dialog.show();
        LinearLayout preview = dialog.findViewById(R.id.preview);
        LinearLayout save = dialog.findViewById(R.id.save_collections);
        LinearLayout share = dialog.findViewById(R.id.share);
        LinearLayout notif = dialog.findViewById(R.id.mute_notify);

        preview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SimpleBottomSheetActivity.this, "Preview Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SimpleBottomSheetActivity.this, "Save Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SimpleBottomSheetActivity.this, "Share Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SimpleBottomSheetActivity.this, "Notification Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
