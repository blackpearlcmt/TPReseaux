package com.example.tpreseaux.api;

import com.example.tpreseaux.model.Classe;
import com.example.tpreseaux.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("getClasse.php")
    Call<Classe> getClasse();

    @GET("getUser.php")
    Call<User> getUser(@Query("Username") String Username,@Query("Password") String Password );
}
