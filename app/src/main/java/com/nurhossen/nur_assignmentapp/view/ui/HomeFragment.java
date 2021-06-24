package com.nurhossen.nur_assignmentapp.view.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nurhossen.nur_assignmentapp.R;
import com.nurhossen.nur_assignmentapp.service.model.Datum;
import com.nurhossen.nur_assignmentapp.view.adapter.AdapterHomeFragment;
import com.nurhossen.nur_assignmentapp.viewmodel.HomeViewmodel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;

    AdapterHomeFragment adapterHomeFragment;
    HomeViewmodel homeViewmodellive;

    List<String> justfunlist = new ArrayList<>(Arrays.asList("monu","honu","tonu","dhonu","pukia","dammnjukia"));

    public HomeFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_home, container, false);
         recyclerView= view.findViewById(R.id.recylerHomefragment);
         recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        homeViewmodellive= new ViewModelProvider(getActivity()).get(HomeViewmodel.class);
        homeViewmodellive.getalldataasLive().observe(getActivity(), new Observer<List<Datum>>() {
            @Override
            public void onChanged(List<Datum> data) {
                adapterHomeFragment= new AdapterHomeFragment(getContext(),data);
                recyclerView.setAdapter(adapterHomeFragment);
            }
        });

         return  view;
    }
}