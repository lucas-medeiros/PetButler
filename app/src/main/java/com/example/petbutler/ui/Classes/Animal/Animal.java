package com.example.petbutler.ui.Classes.Animal;

import com.example.petbutler.ui.Classes.Pessoa.Foto;

import java.util.Calendar;

public class Animal {

    private String nome;
    private String resumo;
    private String tipo;
    private double peso;
    private String tamanho;
    private String caracteristicas;
    private Calendar dataNascimento;
    private double nota;
    private Foto foto;

    public Animal(String nome, String resumo, String tipo, double peso, String tamanho, String caracteristicas, Calendar dataNascimento, Foto foto) {
        this.nome = nome;
        this.resumo = resumo;
        this.tipo = tipo;
        this.peso = peso;
        this.tamanho = tamanho;
        this.caracteristicas = caracteristicas;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
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
