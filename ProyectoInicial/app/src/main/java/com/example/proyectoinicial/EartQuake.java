package com.example.proyectoinicial;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity(tableName = "eartquakes")
public class EartQuake {
    @PrimaryKey
    @NonNull
    private final String id;
    private final String place;
    private final double magnitud;
    private final long time;
    private final double latitude;
    private final double longitude;

    public EartQuake(String id, String place, double magnitud, long time, double latitude, double longitude) {
        this.id = id;
        this.place = place;
        this.magnitud = magnitud;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getId() {
        return id;
    }

    public String getPlace() {
        return place;
    }

    public double getMagnitud() {
        return magnitud;
    }

    public long getTime() {
        return time;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EartQuake eartQuake = (EartQuake) o;
        return Double.compare(magnitud, eartQuake.magnitud) == 0 && time == eartQuake.time && Double.compare(latitude, eartQuake.latitude) == 0 && Double.compare(longitude, eartQuake.longitude) == 0 && Objects.equals(id, eartQuake.id) && Objects.equals(place, eartQuake.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, place, magnitud, time, latitude, longitude);
    }
}