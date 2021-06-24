package com.nurhossen.nur_assignmentapp.service.repository;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.nurhossen.nur_assignmentapp.service.model.Datum;
import com.nurhossen.nur_assignmentapp.service.model.ResponseData;
import com.nurhossen.nur_assignmentapp.service.network.ApiService;
import com.nurhossen.nur_assignmentapp.service.network.RetrofitSingleton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepositoryResponseData {



    private   RepositoryResponseData repositoryResponseData;
    private  Context mcontext;
    private MutableLiveData mlivedata;
    private ResponseData responseData;
    private List<Datum> datalist;


    public  RepositoryResponseData getRepositoryResponseData(Context context){

        if(repositoryResponseData==null){
            mcontext = context;
            repositoryResponseData= new RepositoryResponseData();
        }

        return  repositoryResponseData;

    }





    public MutableLiveData<List<Datum>> getdatalist(){

        if(mlivedata==null){
            mlivedata=new MutableLiveData();
        }

        ApiService apiService = RetrofitSingleton.getRetrofitinstance().create(ApiService.class);

        Call<ResponseData> call  = apiService.getAlldata();

        call.enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                responseData = response.body();
                datalist=responseData.getData();

                mlivedata.postValue(datalist);
            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable t) {

            }
        });

        return  mlivedata;
    }
}
