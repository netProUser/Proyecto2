package com.example.proyectoinicial;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;

import com.example.proyectoinicial.databinding.ActivityMainFotosBinding;

public class MainFotos extends AppCompatActivity {
    private ActivityMainFotosBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainFotosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imageViewFotografia.setOnClickListener(v -> {
            openCamera();
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == Activity.RESULT_OK && requestCode == 100){
            Bitmap bitmap = data.getExtras().getParcelable("data");
            binding.imageButton.setImageBitmap(bitmap);
        }
    }

    private void openCamera() {
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent,100);
    }
}