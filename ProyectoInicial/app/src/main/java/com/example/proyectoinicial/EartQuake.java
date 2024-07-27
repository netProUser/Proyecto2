package com.example.proyectoinicial;

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
}
