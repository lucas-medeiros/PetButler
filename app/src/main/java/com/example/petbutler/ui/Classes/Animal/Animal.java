package com.example.petbutler.ui.Classes.Animal;

import com.example.petbutler.ui.Classes.Pessoa.Foto;

import java.util.Calendar;

public class Animal {

    protected String nome;
    protected String resumo;
    protected String tipo;
    protected String peso;
    protected String tamanho;
    protected Calendar dataNascimento;
    protected double nota;
    protected Foto foto;

    public Animal(String nome, String resumo, String tipo, String peso, String tamanho,double nota ,Calendar dataNascimento, Foto foto) {
        this.nome = nome;
        this.resumo = resumo;
        this.tipo = tipo;
        this.peso = peso;
        this.tamanho = tamanho;
        this.nota = nota;
        this.dataNascimento = dataNascimento;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

}
