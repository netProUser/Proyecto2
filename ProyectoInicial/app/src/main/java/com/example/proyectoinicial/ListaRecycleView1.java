package com.example.proyectoinicial;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.proyectoinicial.databinding.ActivityListaRecycleView1Binding;
import com.example.proyectoinicial.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class ListaRecycleView1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityListaRecycleView1Binding binding = ActivityListaRecycleView1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String pais1 = "Mexico";
        binding.eqRecycler.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<EartQuake> eqList = new ArrayList<>();
        eqList.add(new EartQuake("1",pais1,5.0,415252511,23,45));
        eqList.add(new EartQuake("2","chile",6.0,415252511,23,45));
        eqList.add(new EartQuake("3","peru",7.0,415252511,23,45));
        eqList.add(new EartQuake("4","tarma",8.0,415252511,23,45));
        eqList.add(new EartQuake("5","alemania",9.0,415252511,23,45));
        eqList.add(new EartQuake("6","españa",5.56,415252511,23,45));

        EqAdapter adapter = new EqAdapter();
        binding.eqRecycler.setAdapter(adapter);
        adapter.submitList(eqList);
    }
}