package com.khan.designapp;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.khan.designapp.Adapters.BottomSheetGridAdapter;
import com.khan.designapp.Models.BottomSheetGridModel;

import java.util.ArrayList;
import java.util.List;

public class BottomSheetGridActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet_grid);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        List<BottomSheetGridModel> list = new ArrayList<>();

        list.add(new BottomSheetGridModel(R.drawable.profile_image,"Sharath","mumbai, india"));
        list.add(new BottomSheetGridModel(R.drawable.profile1,"Smith","mumbai, india"));
        list.add(new BottomSheetGridModel(R.drawable.profile2,"Steven","mumbai, india"));
        list.add(new BottomSheetGridModel(R.drawable.profile3,"John","mumbai, india"));
        list.add(new BottomSheetGridModel(R.drawable.profile_image,"Sharath","mumbai, india"));
        list.add(new BottomSheetGridModel(R.drawable.profile1,"Smith","mumbai, india"));
        list.add(new BottomSheetGridModel(R.drawable.profile2,"Steven","mumbai, india"));
        list.add(new BottomSheetGridModel(R.drawable.profile3,"John","mumbai, india"));


        recyclerView = findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.hasFixedSize();
        gridLayoutManager.isSmoothScrollbarEnabled();
        recyclerView.setLayoutManager(gridLayoutManager);


        BottomSheetGridAdapter adapter = new BottomSheetGridAdapter(this,list);

        recyclerView.setAdapter(adapter);



    }
}
