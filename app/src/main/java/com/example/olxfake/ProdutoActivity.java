package com.example.olxfake;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProdutoActivity extends AppCompatActivity {
    private String tel = "5586988890909";
    TextView titulo, cidade, valor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
        Intent intent = new Intent();
        intent.getExtras();
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
