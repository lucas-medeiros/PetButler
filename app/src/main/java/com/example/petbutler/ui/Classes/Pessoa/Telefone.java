package com.example.petbutler.ui.Classes.Pessoa;

public class Telefone {

    protected String DDD;
    protected String numero;

    public Telefone(String DDD, String numero) {
        this.DDD = DDD;
        this.numero = numero;
    }

    public Telefone(String numero) {
        this.numero = numero;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + this.DDD + ")" + this.numero;
    }
}