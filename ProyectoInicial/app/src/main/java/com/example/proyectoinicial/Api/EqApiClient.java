package com.example.proyectoinicial.Api;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.GET;

public class EqApiClient {

    public interface EqService {
        @GET("all_hour.geojson")
        Call<String> getEarthquakes();
    }

    public interface EqService2 {
        @GET("4.5_hour.geojson")
        Call<String> getEarthquakes();
    }

    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();

    private EqService service;
    private EqService2 service2;

    private static final EqApiClient ourInstance = new EqApiClient();

    public static EqApiClient getInstance() { return ourInstance;}

    private EqApiClient(){

    }

    public EqService getService() {
        if(service == null) {
            service = retrofit.create(EqService.class);
        }
        return service;
    }

    public EqService2 getService2() {
        if(service2 == null) {
            service2 = retrofit.create(EqService2.class);
        }
        return service2;
    }

}