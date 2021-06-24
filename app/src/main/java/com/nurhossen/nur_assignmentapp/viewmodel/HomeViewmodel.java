package com.nurhossen.nur_assignmentapp.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.nurhossen.nur_assignmentapp.service.model.Datum;
import com.nurhossen.nur_assignmentapp.service.repository.RepositoryResponseData;

import java.util.List;


public class HomeViewmodel extends AndroidViewModel {
    private  RepositoryResponseData drepo;
    public HomeViewmodel(@NonNull Application application) {
        super(application);
        drepo= new RepositoryResponseData();
    }

    public MutableLiveData<List<Datum>> getalldataasLive(){

        return  drepo.getdatalist();
    }
}
