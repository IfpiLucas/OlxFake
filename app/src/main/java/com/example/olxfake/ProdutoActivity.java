package com.example.olxfake;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProdutoActivity extends AppCompatActivity {
    private String tel = "5586988890909";
    TextView txtTitulo, txtCidade, txtValor, txtDescricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
        Intent intent = getIntent();
        txtTitulo = findViewById(R.id.txt_titulo_produto);
        txtCidade = findViewById(R.id.txt_data_hora_publicacao);
        txtValor = findViewById(R.id.txt_valor_produto);
        txtDescricao = findViewById(R.id.txt_descricao_produto);
        txtDescricao.setText(intent.getStringExtra("Descricao"));
        txtTitulo.setText(intent.getStringExtra("Titulo"));
        txtCidade.setText(intent.getStringExtra("Data")+", "+intent.getStringExtra("Cidade"));
        txtValor.setText(intent.getStringExtra("Valor"));
    }

    public void ligar(View view){
        Uri uri = Uri.parse("tel:"+tel);
        Intent liga = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(liga);
    }

    public void chat(View view){
        Uri uri = Uri.parse("https://"+"gmail.com");
        Intent chat = new Intent(Intent.ACTION_SEND, uri);
        startActivity(chat);
    }
}
