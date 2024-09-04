package com.example.proyectoinicial;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.proyectoinicial.Api.EqApiClient;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TerremotoViewModel extends ViewModel {
 private MutableLiveData<List<EartQuake>> eqList = new MutableLiveData<>();
 private MutableLiveData<List<EartQuake>> eqList2 = new MutableLiveData<>();

    public LiveData<List<EartQuake>> getEqList() {
        return eqList;
    }

    public LiveData<List<EartQuake>> getEqList2() {
        return eqList2;
    }

    private MainRepository repository = new MainRepository();

    public void getEarthquake() {
    repository.getEarthquakes(earthquakeList -> {
        eqList.setValue(earthquakeList);
    });
    }

//    public void getEarthquakes(){
////        ArrayList<EartQuake> eqList = new ArrayList<>();
////        eqList.add(new EartQuake("1","japon",5.0,415252511,23,45));
////        eqList.add(new EartQuake("2","chile",6.0,415252511,23,45));
////        eqList.add(new EartQuake("3","peru",7.0,415252511,23,45));
////        eqList.add(new EartQuake("4","tarma",8.0,415252511,23,45));
////        eqList.add(new EartQuake("5","alemania",9.0,415252511,23,45));
////        eqList.add(new EartQuake("6","españa",5.56,415252511,23,45));
//        EqApiClient.EqService service = EqApiClient.getInstance().getService();
//        EqApiClient.EqService2 service2 = EqApiClient.getInstance().getService2();
//
//        service.getEarthquakes().enqueue(new Callback<String>() {
//            @Override
//            public void onResponse(Call<String> call, Response<String> response) {
//                Log.d("TerremotoViewModel",response.body());
//                List<EartQuake> earthquakeList = parseEarthqueake(response.body());
//                eqList.setValue(earthquakeList);
//            }
//
//            @Override
//            public void onFailure(Call<String> call, Throwable t) {
//
//            }
//        });
//        //this.eqList.setValue(eqList);
//        service2.getEarthquakes().enqueue(new Callback<String>() {
//            @Override
//            public void onResponse(Call<String> call, Response<String> response) {
//                Log.d("TerremotoViewModel",response.body());
//                List<EartQuake> earthquakeList = parseEarthqueake(response.body());
//                eqList2.setValue(earthquakeList);
//            }
//
//            @Override
//            public void onFailure(Call<String> call, Throwable t) {
//
//            }
//        });
//    }
//
//    private List<EartQuake> parseEarthqueake(String responseString){
//        ArrayList<EartQuake> eqList2 = new ArrayList<>();
//        try {
//            JSONObject jsonResponse = new JSONObject(responseString);
//            JSONArray featuresJSONArray = jsonResponse.getJSONArray("features");
//
//            for(int i=0; i< featuresJSONArray.length();i++){
//                JSONObject jsonFeatures = featuresJSONArray.getJSONObject(i);
//                String id = jsonFeatures.getString("id");
//                JSONObject jsonProperties = jsonFeatures.getJSONObject("properties");
//                double magnitude = jsonProperties.getDouble("mag");
//                String place = jsonProperties.getString("place");
//                long time = jsonProperties.getLong("time");
//
//                JSONObject jsonGeometry = jsonFeatures.getJSONObject("geometry");
//                JSONArray coordinatesJSONArray = jsonGeometry.getJSONArray("coordinates");
//                double longitude = coordinatesJSONArray.getDouble(0);
//                double latitude = coordinatesJSONArray.getDouble(1);
//
//                EartQuake eartQuake = new EartQuake(id,place,magnitude,time,longitude,latitude);
//                eqList2.add(eartQuake);
//            }
//
//        } catch (JSONException e) {
//            //throw new RuntimeException(e);
//            e.printStackTrace();
//        }
//        return eqList2;
//    }
}