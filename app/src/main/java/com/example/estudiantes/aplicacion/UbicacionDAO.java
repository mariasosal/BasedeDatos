package com.example.estudiantes.aplicacion;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface UbicacionDAO {
    @Insert
    public void isertarUbicaion(Ubicacion miUbicacion);


}
