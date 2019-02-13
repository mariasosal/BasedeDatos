package com.example.estudiantes.aplicacion;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Ubicacion {
    @PrimaryKey
    private int id;
    private int salon;
    public String ubicacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
