package com.example.proyectoinicial.DataBase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.proyectoinicial.EartQuake;

import java.util.List;

@Dao
public interface EqDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<EartQuake> eqList);

    @Query("select * from eartquakes")
    List<EartQuake> getEarthquake();
}
