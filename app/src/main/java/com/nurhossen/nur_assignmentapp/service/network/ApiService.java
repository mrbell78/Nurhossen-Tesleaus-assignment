package com.nurhossen.nur_assignmentapp.service.network;

import com.nurhossen.nur_assignmentapp.service.model.ResponseData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("api/v1/experts")
    Call<ResponseData> getAlldata();
}
