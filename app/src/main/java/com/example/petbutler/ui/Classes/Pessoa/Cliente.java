package com.example.petbutler.ui.Classes.Pessoa;

public class Cliente extends Pessoa{

    protected Cartao cartao;

    public Cliente(String nome, String login, String senha, String CPF, String email, String resumo, double nota, Foto foto, Telefone telefone) {
        super(nome, login, senha, CPF, email, resumo, nota, foto, telefone);
        this.cartao = null;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }


    public void realizaPagamento(){

    }

    public void solicitaServico(){

    }

    public void avaliaButler(){

    }

}
