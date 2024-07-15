package com.example.proyectoinicial;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    //private Integer flat1 = 0;
    //private Integer flat2 = 0;
    //private String desc_flat1 = "";
    //private String desc_flat2 = "";

    private final MutableLiveData<Integer>  flat1 = new  MutableLiveData<>();
    private final MutableLiveData<Integer>  flat2 = new  MutableLiveData<>();
    private final MutableLiveData<String>  desc_flat1 = new  MutableLiveData<>();
    private final MutableLiveData<String>  desc_flat2 = new  MutableLiveData<>();
    private final MutableLiveData<Integer>  flat3 = new  MutableLiveData<>();

    public MainViewModel() {
        //ResetDatos();
    }

    void ResetDatos() {
        flat1.setValue(0);
        flat2.setValue(0);
        flat3.setValue(0);
        desc_flat1.setValue("");
        desc_flat2.setValue("");
    }
    public LiveData<Integer> getFlat1() {
        return flat1;
    }

    public LiveData<Integer> getFlat2() {
        return flat2;
    }

    public LiveData<String> getDesc_flat1() {
        return desc_flat1;
    }

    public LiveData<String> getDesc_flat2() {
        return desc_flat2;
    }

    public LiveData<Integer> getFlat3() {
        return flat3;
    }

    void ValidarValores(String v_usuario, String v_clave) {
        //ResetDatos();
        if(v_usuario.length() < 8){
         flat1.setValue(1);
         desc_flat1.setValue("El usuario tiene que ser mayor o igual de 8 caracteres") ;
        } else if (v_clave.length() < 10){
         flat2.setValue(1);
         desc_flat2.setValue("La clave tiene que ser mayor o igual de 10 caracteres");
        }else{
            flat3.setValue(1);
        }
    }
}