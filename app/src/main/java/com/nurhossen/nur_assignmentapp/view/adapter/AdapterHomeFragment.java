package com.nurhossen.nur_assignmentapp.view.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.nurhossen.nur_assignmentapp.R;
import com.nurhossen.nur_assignmentapp.service.model.Datum;

import java.util.List;

public class AdapterHomeFragment extends RecyclerView.Adapter<AdapterHomeFragment.CustomViewholder> {

    Context context;
    List<Datum> funlist;

    public AdapterHomeFragment(Context context, List<Datum>  funlist) {
        this.context = context;
        this.funlist = funlist;
    }

    @NonNull
    @Override
    public CustomViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.home_fragment_itemview,parent,false);

        return new CustomViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewholder holder, int position) {

        holder.tv_name.setText(funlist.get(position).getFirstName());
        holder.tv_country.setText(funlist.get(position).getProfile().getCountry());
        holder.tv_name.setText(funlist.get(position).getProfile().getQualification());

        Glide.with(context).load(funlist.get(position).getProfile().getAvatarUrl()).into(holder.imgview);




    }

    @Override
    public int getItemCount() {
        return funlist!=null? funlist.size():0;
    }

    public class CustomViewholder extends RecyclerView.ViewHolder {
        TextView tv_name, tv_country,tv_expert,tv_language;
        ImageView imgview;

        public CustomViewholder(@NonNull View itemView) {
            super(itemView);

            tv_name=itemView.findViewById(R.id.nameid);
            tv_country=itemView.findViewById(R.id.countryid);
            tv_expert=itemView.findViewById(R.id.designation);
            imgview=itemView.findViewById(R.id.imageprofile);
        }
    }
}
