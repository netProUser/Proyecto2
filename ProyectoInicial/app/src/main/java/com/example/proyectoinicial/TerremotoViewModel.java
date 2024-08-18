package com.example.proyectoinicial;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class TerremotoViewModel extends ViewModel {
 private MutableLiveData<List<EartQuake>> eqList = new MutableLiveData<>();

    public LiveData<List<EartQuake>> getEqList() {
        return eqList;
    }
    public void getEarthquakes(){
        ArrayList<EartQuake> eqList = new ArrayList<>();
        eqList.add(new EartQuake("1","japon",5.0,415252511,23,45));
        eqList.add(new EartQuake("2","chile",6.0,415252511,23,45));
        eqList.add(new EartQuake("3","peru",7.0,415252511,23,45));
        eqList.add(new EartQuake("4","tarma",8.0,415252511,23,45));
        eqList.add(new EartQuake("5","alemania",9.0,415252511,23,45));
        eqList.add(new EartQuake("6","españa",5.56,415252511,23,45));
        this.eqList.setValue(eqList);
    }
}
