package com.example.petbutler.ui.Classes.Pessoa;

public abstract class Pessoa {

    protected String nome;
    protected String sobrenome;
    protected String senha;
    protected String CPF;
    protected String email;
    protected String resumo;
    protected double nota;
    protected Foto foto; //trocar tipo
    protected boolean cliente;
    protected Telefone telefone;

    public Pessoa(String nome,String sobrenome, String senha, String CPF, String email, String resumo, double nota, Foto foto ) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.CPF = CPF;
        this.email = email;
        this.resumo = resumo;
        this.nota = nota;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String nome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    //adicionar conteúdo dos métodos:
    public void adicionarAnimal(){

    }

    public void adicionarTelefone(){

    }

}
