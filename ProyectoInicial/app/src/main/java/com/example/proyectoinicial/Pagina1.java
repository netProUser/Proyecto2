package com.example.proyectoinicial;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.proyectoinicial.databinding.ActivityPagina1Binding;

import java.util.concurrent.atomic.AtomicReference;

public class Pagina1 extends AppCompatActivity {

    private MainViewModel viewModel;
    String v_usuario = "";
    String v_clave = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPagina1Binding binding = ActivityPagina1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        binding.btnIngresar2.setOnClickListener(v -> {
            v_usuario = binding.txtUsuario.getText().toString();
            v_clave = binding.txtClave.getText().toString();

            //Toast.makeText(this,getString(R.string.mensajeAdvertencia),Toast.LENGTH_LONG).show();
            viewModel.ValidarValores(v_usuario,v_clave);

//            viewModel.getFlat1().observe(this, flat1 -> {
//                //viewModel.getFlat1().setValue(flat1);
//            });

//            if(viewModel.getFlat1() == 1){
//                Toast.makeText(this,viewModel.getDesc_flat1(),Toast.LENGTH_LONG).show();
//            } else if (viewModel.getFlat2() == 1) {
//                Toast.makeText(this,viewModel.getDesc_flat2(),Toast.LENGTH_LONG).show();
//            }else {
//                openPrimeraPagina(v_usuario,v_clave);
//            }

//            if(flat1 == 1){
//                Toast.makeText(this,viewModel.getDesc_flat1(),Toast.LENGTH_LONG).show();
//            } else if (viewModel.getFlat2() == 1) {
//                Toast.makeText(this,viewModel.getDesc_flat2(),Toast.LENGTH_LONG).show();
//            }else {
//                openPrimeraPagina(v_usuario,v_clave);
//            }

        });

        viewModel.getDesc_flat1().observe(this, Desc_flat1 -> {
            Toast.makeText(this,Desc_flat1,Toast.LENGTH_LONG).show();
        });

        viewModel.getDesc_flat2().observe(this, Desc_flat2 -> {
            Toast.makeText(this,Desc_flat2,Toast.LENGTH_LONG).show();
        });

        viewModel.getFlat3().observe(this, flat3 -> {
            if(flat3 == 1){
                openPrimeraPagina(v_usuario,v_clave);
            }
        });

        Log.d("MainActivity","Activity Created");
    }
    private void openPrimeraPagina(String v_usuario,String v_clave) {
        String v_email = "fg@gmail.com";
        CredencialesEntity credenciales = new CredencialesEntity(v_usuario,v_clave,v_email);
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra(MainActivity.CREDENCIALES_KEY,credenciales);
        startActivity(intent);
        //Intent intent = new Intent(this,MainFotos.class);
        //startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","Activity Started");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","Activity Resumen");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","Activity Stop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","Activity Destroy");
    }
}