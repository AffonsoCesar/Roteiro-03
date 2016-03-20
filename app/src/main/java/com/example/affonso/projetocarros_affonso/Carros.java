package com.example.affonso.projetocarros_affonso;


public class Carros {
    private String nomeCarro;
    private int idImageCarro;

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public int getIdImageCarro() {
        return idImageCarro;
    }

    public void setIdImageCarro(int idImageCarro) {
        this.idImageCarro = idImageCarro;
    }

    public Carros (String nomeCarro, int idImageCarro) {
        this.nomeCarro = nomeCarro;
        this.idImageCarro = idImageCarro;
    }
}