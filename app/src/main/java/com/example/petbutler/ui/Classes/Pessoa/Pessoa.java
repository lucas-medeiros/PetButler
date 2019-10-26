package com.example.petbutler.ui.Classes.Pessoa;

public abstract class Pessoa {

    protected String nome;
    protected String login;
    protected String senha;
    protected String CPF;
    protected String email;
    protected String resumo;
    protected double nota;
    protected Foto foto; //trocar tipo
    protected Telefone telefone;

    public Pessoa(String nome, String login, String senha, String CPF, String email, String resumo, double nota, Foto foto, Telefone telefone) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.CPF = CPF;
        this.email = email;
        this.resumo = resumo;
        this.nota = nota;
        this.foto = foto;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    //adicionar conteúdo dos métodos:
    public void adicionarAnimal(){

    }

    public void adicionarTelefone(){

    }

}
