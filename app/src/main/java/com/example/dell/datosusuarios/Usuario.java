package com.example.dell.datosusuarios;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable {

    String nombres;
    String apellidos;
    int edad;

    public Usuario(String nombres, String apellidos, int edad)
    {
        this.nombres = nombres;
        this.apellidos=apellidos;
        this.edad = edad;
    }

      public String getNombres()
    {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }


    public int  getEdad() {
        return edad;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    protected Usuario(Parcel in) {
        nombres = in.readString();
        apellidos = in.readString();
        edad = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombres);
        dest.writeString(apellidos);
        dest.writeInt(edad);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Usuario> CREATOR = new Parcelable.Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel in) {
            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };
}