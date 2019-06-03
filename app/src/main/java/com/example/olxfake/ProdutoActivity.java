package com.example.olxfake;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProdutoActivity extends AppCompatActivity {
    private String tel = "5586988890909";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
    }


    public void ligar(View view){
        Uri uri = Uri.parse("tel:"+tel);
        Intent liga = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(liga);
    }

    public void chat(View view){
        Uri uri = Uri.parse("tel:"+tel);
//        Intent chat = new Intent(Intent.ACTION_SEND,)
    }
}
