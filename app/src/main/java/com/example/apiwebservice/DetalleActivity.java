package com.example.apiwebservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetalleActivity extends AppCompatActivity {

    private TextView textViewNombreDetalle,textViewApellidoDetalle,textViewEdadDetalle, textViewIdCiudadDetalle;
    private ImageView imageViewPicasso;
    //private List<Post> listPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Bundle extras = getIntent().getExtras();
        int postId = extras.getInt("KEY_ID");

        findViewByid();

        cargarPost(postId);
        String urlFoto = "http://lorempixel.com/400/200/sports/"+ postId;
        Picasso.get ().load ("http://i.imgur.com/DvpvklR.png") .into (imageViewPicasso);
    }

    private void findViewByid(){
        textViewNombreDetalle = findViewById(R.id.textViewNombreDetalle);
        textViewApellidoDetalle = findViewById(R.id.textViewNombreDetalle);
        textViewEdadDetalle = findViewById(R.id.textViewEdadDetalle);
        textViewIdCiudadDetalle = findViewById(R.id.textViewIdCiudad);
        imageViewPicasso = findViewById(R.id.imageViewPicasso);
    }
    private void cargarPost(int id){

        //listPost.add(new Post(1,"mai","gonzalez",25, 1));
       /* Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:53149/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PostService postService = retrofit.create(PostService.class);
        Call<Post> call = postService.getPostById(id);

        call.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                Post post = (Post) response.body();
                textViewNombreDetalle.setText(post.getNombre());
                textViewApellidoDetalle.setText(post.getApellido());
                textViewEdadDetalle.setText(post.getEdad());
                textViewIdCiudadDetalle.setText(post.getIdCiudad());

                //textViewContenidoDetalle.setText("juancito");
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
            }
        });*/
    }
}
