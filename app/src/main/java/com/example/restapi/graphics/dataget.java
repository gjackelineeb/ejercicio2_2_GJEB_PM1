package com.example.restapi.graphics;

import com.example.restapi.modeloapp.Usuarios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Path;

public interface dataget {
    String Ruta0  = "/posts";
    String Ruta1 = "/posts/{valor}";

    @GET(Ruta0)
    Call<List<Usuarios>> getUsuarios();

    @GET(Ruta1)
    Call<Usuarios> getUsuario(@Path ("valor") String valor);
}
