package com.khan.designapp.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;

import com.khan.designapp.BottomNavigationActivity;
import com.khan.designapp.BottomSheetsActivity;
import com.khan.designapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DesignFragment extends Fragment {


    RelativeLayout mBottomNav,mBottomSheet;
    private ImageView mIcon1,mIcon2,mIcon3,mIcon4,mIcon5,mIcon6,mIcon7,mIcon8,mIcon9,mIcon10
            ,mIcon11,mIcon12,mIcon13,mIcon14,mIcon15,mIcon16,mIcon17,mIcon18,mIcon19,mIcon20,mIcon21,mIcon22,mIcon23;

    public DesignFragment() {
        // Required empty public constructor
    }


    View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_design, container, false);

        mBottomNav = mView.findViewById(R.id.click_bottomNavigation);
        mBottomSheet = mView.findViewById(R.id.bottom_sheet);

        mBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), BottomSheetsActivity.class));
            }
        });

        mBottomNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), BottomNavigationActivity.class));
            }
        });





        mIcon1 = mView.findViewById(R.id.icon1);
        mIcon2 = mView.findViewById(R.id.icon2);
        mIcon3 = mView.findViewById(R.id.icon3);
        mIcon4 = mView.findViewById(R.id.icon4);
        mIcon5 = mView.findViewById(R.id.icon5);
        mIcon6 = mView.findViewById(R.id.icon6);
        mIcon7 = mView.findViewById(R.id.icon7);
        mIcon8 = mView.findViewById(R.id.icon8);
        mIcon9 = mView.findViewById(R.id.icon9);
        mIcon10 = mView.findViewById(R.id.icon10);
        mIcon11 = mView.findViewById(R.id.icon11);
        mIcon12 = mView.findViewById(R.id.icon12);
        mIcon13 = mView.findViewById(R.id.icon13);
        mIcon14 = mView.findViewById(R.id.icon14);
        mIcon15 = mView.findViewById(R.id.icon15);
        mIcon16 = mView.findViewById(R.id.icon16);
        mIcon17 = mView.findViewById(R.id.icon17);
        mIcon18 = mView.findViewById(R.id.icon18);
        mIcon19 = mView.findViewById(R.id.icon19);
        mIcon20 = mView.findViewById(R.id.icon20);
        mIcon21 = mView.findViewById(R.id.icon21);
        mIcon22 = mView.findViewById(R.id.icon22);
        mIcon23 = mView.findViewById(R.id.icon23);


        Animation ClockWise1 = AnimationUtils.loadAnimation(getContext(),R.anim.clock_wise_animation);
        mIcon1.startAnimation(ClockWise1);
        Animation AntiClockWise1 = AnimationUtils.loadAnimation(getContext(),R.anim.anti_clock_wise);
        mIcon1.startAnimation(AntiClockWise1);

        Animation ClockWise2 = AnimationUtils.loadAnimation(getContext(),R.anim.clock_wise_animation);
        mIcon2.startAnimation(ClockWise2);
        Animation AntiClockWise2 = AnimationUtils.loadAnimation(getContext(),R.anim.anti_clock_wise);
        mIcon2.startAnimation(AntiClockWise2);

        Animation ClockWise3 = AnimationUtils.loadAnimation(getContext(),R.anim.clock_wise_animation);
        mIcon3.startAnimation(ClockWise3);
        Animation AntiClockWise3 = AnimationUtils.loadAnimation(getContext(),R.anim.anti_clock_wise);
        mIcon3.startAnimation(AntiClockWise3);

        Animation ClockWise4 = AnimationUtils.loadAnimation(getContext(),R.anim.clock_wise_animation);
        mIcon4.startAnimation(ClockWise4);
        Animation AntiClockWise4 = AnimationUtils.loadAnimation(getContext(),R.anim.anti_clock_wise);
        mIcon4.startAnimation(AntiClockWise4);

        Animation ClockWise5 = AnimationUtils.loadAnimation(getContext(),R.anim.clock_wise_animation);
        mIcon5.startAnimation(ClockWise5);
        Animation AntiClockWise5 = AnimationUtils.loadAnimation(getContext(),R.anim.anti_clock_wise);
        mIcon5.startAnimation(AntiClockWise5);



        return mView;
    }

}
