package com.example.proyectoinicial;

import java.util.Objects;

public class EartQuake {
    private String id;
    private String place;
    private double magnitud;
    private long time;
    private double latitude;
    private double longitude;

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