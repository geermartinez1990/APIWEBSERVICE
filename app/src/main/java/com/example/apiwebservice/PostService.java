package com.example.apiwebservice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface PostService {
    //String API_ROUTE = "/posts";

    @GET("alumnos/listartodos")
    Call<List<Post>> getPost();
   // @GET(API_ROUTE)
    //Call<List<Post>> getPost();

    @GET("alumnos/listarporid/{id}")
    Call<Post> getPostById(@Path("id") int postId);

    //@GET("/posts/{id}")
    //Call<Post> getPostById(@Path("id") int postId);

}
