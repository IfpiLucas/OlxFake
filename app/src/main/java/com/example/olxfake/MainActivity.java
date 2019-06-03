package com.example.olxfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.olxfake.adapters.AnuncioAdapter;
import com.example.olxfake.modelos.Anuncio;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvAnuncio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvAnuncio = findViewById(R.id.rv_anuncio);
    }

    protected void onResume(){
        super.onResume();
        obterAnuncios();
    }

    private void obterAnuncios(){
        List<Anuncio> anuncios = Anuncio.getAnuncios();
        AnuncioAdapter adapter = new AnuncioAdapter(anuncios, this);
        rvAnuncio.setAdapter(adapter);
        rvAnuncio.setLayoutManager(new LinearLayoutManager(this));
    }
}
