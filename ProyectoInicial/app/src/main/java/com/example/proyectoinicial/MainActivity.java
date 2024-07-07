package com.example.proyectoinicial;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.proyectoinicial.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public static final  String CREDENCIALES_KEY = "credenciales";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();
        //CredencialesEntity credenciales = extras.getParcelable(CREDENCIALES_KEY);
        CredencialesEntity credenciales = extras.getParcelable(CREDENCIALES_KEY);
        binding.txtUsuario1.setText(credenciales.getUsuario());
        binding.txtClave1.setText(credenciales.getClave());

        //Button button = findViewById(R.id.btn_ingresar);
        binding.btnIngresar.setOnClickListener(v -> {
            Toast.makeText(this,getString(R.string.mensajeAdvertencia),Toast.LENGTH_LONG).show();
            openPrimeraPagina();
        });
    }

    private void openPrimeraPagina() {
        Intent intent = new Intent(this,Pagina1.class);
        startActivity(intent);
    }
}