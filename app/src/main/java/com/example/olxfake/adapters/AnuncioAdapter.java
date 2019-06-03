package com.example.olxfake.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.olxfake.R;
import com.example.olxfake.modelos.Anuncio;

import java.util.List;

public class AnuncioAdapter extends RecyclerView.Adapter<AnuncioAdapter.AnuncioViewHolder> {
    List<Anuncio> anuncios;
    Context context;

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

    public class AnuncioViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitulo, txtCidade, txtValor;

        public AnuncioViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.txt_titulo);
            txtCidade = itemView.findViewById(R.id.txt_data_cidade);
            txtValor = itemView.findViewById(R.id.txt_valor);
        }
    }
}
