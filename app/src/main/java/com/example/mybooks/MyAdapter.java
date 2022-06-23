package com.example.mybooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private List<Books> books;


    //Construtor do adaptador
    public MyAdapter(Context context, List<Books> books) {
        this.context = context;
        this.books = books;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Carregando o modelo de layout
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_card_books, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.txtModeloLivros.setText(books.get(position).getTitulo());
        holder.imgModeloLivros.setImageResource(books.get(position).getMiniatura());

        //criar o evento de click nos cards
        holder.idModeloCardLivros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Cliquei no card",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CardView idModeloCardLivros;
        TextView txtModeloLivros;
        ImageView imgModeloLivros;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            idModeloCardLivros = itemView.findViewById(R.id.idCardLivros);
            txtModeloLivros = itemView.findViewById(R.id.txtModeloLivro);
            imgModeloLivros = itemView.findViewById(R.id.imgModeloLivro);
        }
    }


}
