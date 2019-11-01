package com.example.petbutler.ui.Classes.Pessoa;

public class Cartao {

    protected int numero;
    protected int codSeguranca;
    protected int mesValidade; //para evitar usar a Classe Calendar
    protected int anoValidade;
    protected String nomeTitular;
    protected char tipo;

    public Cartao(int numero, int codSeguranca, int mesValidade, int anoValidade, String nomeTitular, char tipo) {
        this.numero = numero;
        this.codSeguranca = codSeguranca;
        this.mesValidade = mesValidade;
        this.anoValidade = anoValidade;
        this.nomeTitular = nomeTitular;
        this.tipo = tipo; //tipo == 'D' -> débito e tipo == 'C' -> crédito
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(int codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getMesValidade() {
        return mesValidade;
    }

    public void setMesValidade(int mesValidade) {
        this.mesValidade = mesValidade;
    }

    public int getAnoValidade() {
        return anoValidade;
    }

    public void setAnoValidade(int anoValidade) {
        this.anoValidade = anoValidade;
    }

    public String toStringValidade() {
        return mesValidade + "/" + anoValidade;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

}