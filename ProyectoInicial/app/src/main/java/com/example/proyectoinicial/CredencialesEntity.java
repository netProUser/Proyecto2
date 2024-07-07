package com.example.proyectoinicial;

import android.os.Parcel;
import android.os.Parcelable;

public class CredencialesEntity implements Parcelable {
    private String usuario;
    private String clave;
    private String email;

    public CredencialesEntity(String usuario, String clave, String email) {
        this.usuario = usuario;
        this.clave = clave;
        this.email = email;
    }

    protected CredencialesEntity(Parcel in) {
        usuario = in.readString();
        clave = in.readString();
        email = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(usuario);
        dest.writeString(clave);
        dest.writeString(email);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CredencialesEntity> CREATOR = new Creator<CredencialesEntity>() {
        @Override
        public CredencialesEntity createFromParcel(Parcel in) {
            return new CredencialesEntity(in);
        }

        @Override
        public CredencialesEntity[] newArray(int size) {
            return new CredencialesEntity[size];
        }
    };

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}