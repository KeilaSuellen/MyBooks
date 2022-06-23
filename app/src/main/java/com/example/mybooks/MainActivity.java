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

        books.add(new Books("A realidade de Madhu", "Ficção Científica", " Madhu é abduzida por uma nave intergaláctica", R.drawable.a_realidade));
        books.add(new Books("O sol é para todos", "Ficção", "Um dos maiores clássicos da literatura mundial", R.drawable.sol_para_todos));
        books.add(new Books("Eu e Esse Meu Coração", "Auto ajuda", "Eu e Esse Meu Coração", R.drawable.coracao));
        books.add(new Books("Dieta", "Alimentação", "Este não é mais um livro de dieta: O novo e libertador estilo de vida alimentar para saúde e boa", R.drawable.dieta));
        books.add(new Books("O dilema", "Auto ajuda", "O dilema do porco espinho", R.drawable.dilema));
        books.add(new Books("Como fazer Amigos", "Auto ajuda", "Como fazer amigos", R.drawable.amigos));
        books.add(new Books("The Vegitarian ", "Romance", "The Vegitarian Life", R.drawable.thevigitarian));
        books.add(new Books("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
        books.add(new Books("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
        books.add(new Books("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
        books.add(new Books("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
        books.add(new Books("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
        books.add(new Books("O dilema", "Auto ajuda", "O dilema do porco espinho", R.drawable.dilema));
        books.add(new Books("Iracema", "Clássico", "Uma das histórias de amor mais aclamadas da literatura brasileira", R.drawable.iracema));
        books.add(new Books("O Homem Que Sabia Javanês", "Clássico", "Uma chamada que muitos deixariam passar, Castelo enxergou uma oportunidade única.", R.drawable.ohomequesabia));
        books.add(new Books("Como fazer Amigos", "Auto ajuda", "Como fazer amigos", R.drawable.amigos));
        books.add(new Books("The Vegitarian ", "Romance", "The Vegitarian Life", R.drawable.thevigitarian));
        books.add(new Books("The Wild Robot", "Categoria do livro", "Descrição do livro", R.drawable.thewildrobot));
        books.add(new Books("The Martian", "Categoria do livro", "Descrição do livro", R.drawable.themartian));
        books.add(new Books("Privacy", "Categoria do livro", "Descrição do livro", R.drawable.privacy));
        books.add(new Books("Maria Semples", "Categoria do livro", "Descrição do livro", R.drawable.mariasemples));
        books.add(new Books("Hedied With", "Categoria do livro", "Descrição do livro", R.drawable.hediedwith));
        books.add(new Books("O poder do agora", "Auto Ajuda", "Um guia para a iluminação espiritual ", R.drawable.poder_agora));
        books.add(new Books("Pai rico, pai pobre para jovens", "Administração e Negócios", "o que a escola não ensina sobre dinheiro", R.drawable.pai));

        //Intanciando a classe adaptadora
        MyAdapter adapter = new MyAdapter(getApplicationContext(), books);

        //implementando o Layout que será utilizado
        ListaLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(),3));

        //otimizar a lista quando for chamada
        ListaLivros.hasFixedSize();

        //carregar o adaptador ao RecylerView
        ListaLivros.setAdapter(adapter);
    }
}