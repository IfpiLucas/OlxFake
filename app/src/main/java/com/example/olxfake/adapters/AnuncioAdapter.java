package com.example.olxfake.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.olxfake.ProdutoActivity;
import com.example.olxfake.R;
import com.example.olxfake.modelos.Anuncio;

import java.util.List;

public class AnuncioAdapter extends RecyclerView.Adapter<AnuncioAdapter.AnuncioViewHolder> {
    List<Anuncio> anuncios;
    Context context;

    public AnuncioAdapter(List<Anuncio> anuncios, Context context) {
        this.anuncios = anuncios;
        this.context = context;
    }

    @NonNull
    @Override
    public AnuncioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(this.context);
        View view = inflater.inflate(R.layout.item_anuncio, viewGroup, false);
        AnuncioViewHolder viewHolder = new AnuncioViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnuncioViewHolder anuncioViewHolder, int i) {
        Anuncio anuncio = anuncios.get(i);

        anuncioViewHolder.txtTitulo.setText(anuncio.getTitulo());
        anuncioViewHolder.txtCidade.setText(anuncio.getCidade());
        anuncioViewHolder.txtValor.setText("R$" + anuncio.getValor());

    }

    @Override
    public int getItemCount() {
        return anuncios.size();
    }

    class AnuncioViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtTitulo, txtCidade, txtValor;

        public AnuncioViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtTitulo = itemView.findViewById(R.id.txt_titulo);
            this.txtCidade = itemView.findViewById(R.id.txt_data);
            this.txtValor = itemView.findViewById(R.id.txt_valor);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Anuncio anun = anuncios.get(getAdapterPosition());
            Intent intent = new Intent(context, ProdutoActivity.class);
            intent.putExtra("Titulo", anun.getTitulo());
            intent.putExtra("Cidade", anun.getCidade());
            intent.putExtra("Valor", anun.getValor());
            intent.putExtra("Descricao", anun.getDescricao());
            context.startActivity(intent);
        }
    }
}
