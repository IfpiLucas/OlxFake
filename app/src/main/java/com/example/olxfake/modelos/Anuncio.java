package com.example.olxfake.modelos;

import java.util.ArrayList;
import java.util.List;

public class Anuncio {
    private String titulo;
    private String descricao;
    private String cidade;
    private double valor;
    private String data;

    public Anuncio() {
    }

    public Anuncio(String titulo, String descricao, String cidade, double valor, String data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cidade = cidade;
        this.valor = valor;
        this.data = data;
    }

    public static List<Anuncio> getAnuncios(){
        List<Anuncio> anuncios = new ArrayList<>();
        anuncios.add(new Anuncio("Xiaomi","Produto novo na caixa", "Parque Piaui", 988.25, "28 Jun"));
        anuncios.add(new Anuncio("Mesa","Mesa seme nova", "Santa maria", 132.90, "24 Mai"));
        anuncios.add(new Anuncio("Joestick","Joestick", "Picos", 132.90, "24 Out"));
        anuncios.add(new Anuncio("Bike","Bancada seme nova", "Sao Cristovao", 132.90, "24 Set"));
        anuncios.add(new Anuncio("Bike","Bancada seme nova", "Sao Cristovao", 132.90, "24 Set"));
        anuncios.add(new Anuncio("Bike","Bancada seme nova", "Sao Cristovao", 132.90, "24 Set"));
        anuncios.add(new Anuncio("Bike","Bancada seme nova", "Sao Cristovao", 132.90, "24 Set"));
        anuncios.add(new Anuncio("Bike","Bancada seme nova", "Sao Cristovao", 132.90, "24 Set"));
        return anuncios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}