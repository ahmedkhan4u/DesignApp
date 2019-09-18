package com.khan.designapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.khan.designapp.Models.BottomSheetGridModel;
import com.khan.designapp.R;

import java.util.List;

public class BottomSheetGridAdapter extends RecyclerView.Adapter<BottomSheetGridAdapter.ViewHolder> {
    List<BottomSheetGridModel> list;
    Context context;
    public BottomSheetGridAdapter(Context context, List<BottomSheetGridModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public BottomSheetGridAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context)
                .inflate(R.layout.bottom_sheet_grid_llist,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BottomSheetGridAdapter.ViewHolder holder, int position) {
        final BottomSheetGridModel model = list.get(position);
        holder.profileImage.setImageResource(model.getImage());
        holder.profileName.setText(model.getName());
        holder.profileAddress.setText(model.getAddress());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // using BottomSheetDialog
                //View dialogView = LayoutInflater.from(context).inflate(R.layout.simple_bottom_sheet, null);
                BottomSheetDialog dialog = new BottomSheetDialog(context);
                dialog.setContentView(R.layout.bottom_sheet_grid_layout);
                dialog.show();

                RelativeLayout mName = dialog.findViewById(R.id.name);
                TextView textView = dialog.findViewById(R.id.person_name);
                textView.setText(model.getName());

                mName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, model.getName(), Toast.LENGTH_SHORT).show();
                    }
                });


                RelativeLayout mAddPeople = dialog.findViewById(R.id.add_peoplw);

                mAddPeople.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Add People", Toast.LENGTH_SHORT).show();
                    }
                });

                RelativeLayout mLinkSharing = dialog.findViewById(R.id.link_sharing);

                mLinkSharing.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Share Link", Toast.LENGTH_SHORT).show();
                    }
                });

                RelativeLayout mCopyLink = dialog.findViewById(R.id.copy_link);

                mCopyLink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Copy Link", Toast.LENGTH_SHORT).show();
                    }
                });

                RelativeLayout mRemove = dialog.findViewById(R.id.remove);

                mRemove.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "Remove", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        ImageView profileImage;
        TextView profileName,profileAddress;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;

            profileImage = mView.findViewById(R.id.profileImage);
            profileName = mView.findViewById(R.id.profileName);
            profileAddress = mView.findViewById(R.id.profile_address);
        }
    }

}
