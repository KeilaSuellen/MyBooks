package com.example.mybooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   RecyclerView ListaLivros;

   List<Books> books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListaLivros=findViewById(R.id.idRecyvlearwiewLivros);

        //criando lista
        books = new ArrayList<>();



        //implementando o Layout que será utilizado
        ListaLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));

        //otimizar a lista quando for chamada
        ListaLivros.hasFixedSize();

        //carregar o adaptador ao RecylerView
        //ListaLivros.setAdapter();
    }
}