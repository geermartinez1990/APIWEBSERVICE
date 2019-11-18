package com.example.apiwebservice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends BaseAdapter {

    private List<Post> listaPost;

    public PostAdapter(List<Post> listaPost) {
        this.listaPost = listaPost;
    }

    @Override
    public int getCount() {
        return listaPost.size();
    }

    @Override
    public Post getItem(int position) {
        return listaPost.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaPost.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;

        if(convertView==null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_post_api,null);
        }else{
            view = convertView;
        }

        Post post = this.getItem(position);

        TextView textViewnombre = view.findViewById(R.id.textViewnombre);
        TextView textViewapellido = view.findViewById(R.id.textViewapellido);
        TextView textViewedad = view.findViewById(R.id.textViewedad);
        TextView textViewIdCiudad = view.findViewById(R.id.textViewIdCiudad);

        textViewnombre.setText(post.getNombre());
        textViewapellido.setText(post.getApellido());
        textViewedad.setText(post.getEdad());
        textViewIdCiudad.setText(post.getIdCiudad());

        return view;
    }
}
