package com.example.proyectoinicial;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private Integer flat1 = 0;
    private Integer flat2 = 0;
    private String desc_flat1 = "";
    private String desc_flat2 = "";

    public Integer getFlat1() {
        return flat1;
    }

    public Integer getFlat2() {
        return flat2;
    }

    public String getDesc_flat1() {
        return desc_flat1;
    }

    public String getDesc_flat2() {
        return desc_flat2;
    }

    void ValidarValores(String v_usuario, String v_clave) {
         flat1 = 0;
         flat2 = 0;
        if(v_usuario.length() < 8){
         flat1 = 1;
         desc_flat1 = "El usuario tiene que ser mayor o igual de 8 caracteres";
     }
     if(v_clave.length() < 10){
         flat2 = 1;
         desc_flat2 = "La clave tiene que ser mayor o igual de 10 caracteres";
     }

    }

}
