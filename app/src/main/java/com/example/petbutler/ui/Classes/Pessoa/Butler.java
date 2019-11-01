package com.example.petbutler.ui.Classes.Pessoa;

public class Butler extends Pessoa{

    protected String CRMV;
    protected String CNH;
    protected Conta conta;

    public Butler(String nome, String login, String senha, String CPF, String email, String resumo, double nota, Foto foto, Telefone telefone) {
        super(nome, login, senha, CPF, email, resumo, nota, foto, telefone);
    }

    public String getCRMV() {
        return CRMV;
    }

    public void setCRMV(String CRMV) {
        this.CRMV = CRMV;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }


    //adicionar conteúdo dos métodos
    public void receberPagamento(){

    }

    public void consultaServico(){

    }

    public void aceitaServico(){

    }

    public void adicionarServico(){

    }

    public void atualizarLista(){

    }

    public void avaliarCliente(){

    }

    public void avaliaAnimal(){

    }
}