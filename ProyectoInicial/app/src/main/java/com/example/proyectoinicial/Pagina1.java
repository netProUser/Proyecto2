package com.example.proyectoinicial;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.proyectoinicial.databinding.ActivityPagina1Binding;

public class Pagina1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPagina1Binding binding = ActivityPagina1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnIngresar2.setOnClickListener(v -> {
            String v_usuario = binding.txtUsuario.getText().toString();
            String v_clave = binding.txtClave.getText().toString();
            Toast.makeText(this,getString(R.string.mensajeAdvertencia),Toast.LENGTH_LONG).show();
            openPrimeraPagina(v_usuario,v_clave);
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