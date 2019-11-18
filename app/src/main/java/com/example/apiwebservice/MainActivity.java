package com.example.apiwebservice;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity  {


    private List<Post> listPost;
    private PostAdapter adapter;
    private ListView listViewPost;
    //private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listPost = new ArrayList<Post>();
        // getPosts();
        obtenerPost();
        adapter = new PostAdapter(listPost);

        listViewPost = findViewById(R.id.listViewPost);
        listViewPost.setAdapter(adapter);
        listViewPost.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(view.getContext(), "Seleccionó ID: "+listPost.get(position).getId(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
        intent.putExtra("KEY_ID", listPost.get(position).getId());
        startActivity(intent);
            }
        });


    }

    private void obtenerPost(){
        listPost.add(new Post(1,"mai","gonzalez",25, 1));
        listPost.add(new Post(2,"pili","gonzalez",41, 1));
        listPost.add(new Post(10,"cristian","gonzalez",42, 2));
        //listPost.add(new Post(0,1,"Titulo de  Prueba", "Contenido de Prueba"));
        //listPost.add(new Post(0,1,"Titulo de  Prueba", "Contenido de Prueba"));

        //Retrofit retrofit =new Retrofit.Builder()
         //       .baseUrl()

       /* Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:53149/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PostService postService = retrofit.create(PostService.class);
        Call< List<Post> > call = postService.getPost();

        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                for(Post post :  response.body()) {
                    listPost.add(post);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
            }
        });*/
    }


}
