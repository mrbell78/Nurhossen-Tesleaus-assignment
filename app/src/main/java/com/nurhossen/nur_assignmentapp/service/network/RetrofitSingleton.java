package com.nurhossen.nur_assignmentapp.service.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.nurhossen.nur_assignmentapp.service.network.ApiConstant.BASE_URL;

public class RetrofitSingleton {

    private static volatile Retrofit retrofitinstance = null;
    private RetrofitSingleton(){};
    public static Retrofit getRetrofitinstance(){
        if(retrofitinstance==null){
            synchronized (RetrofitSingleton.class){
                if(retrofitinstance==null){
                    retrofitinstance= new Retrofit.
                            Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create()).build();
                }
            }
        }
        return  retrofitinstance;
    }
}
