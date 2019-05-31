package com.example.olxfake.modelos;

import java.util.List;

public class Anuncio {
    private String titulo;
    private String cidade;
    private double valor;
    private String data;

    public Anuncio(String titulo, String cidade, double valor) {
        this.titulo = titulo;
        this.cidade = cidade;
        this.valor = valor;
    }

    public static List<Anuncio>

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
}
