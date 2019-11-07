package com.example.petbutler.ui.Classes.Pessoa;

public class Cliente extends Pessoa{

    protected Cartao cartao;

    public Cliente(String nome,String sobrenome, String senha, String CPF, String email, String resumo, double nota, Foto foto) {
        super(nome,sobrenome, senha, CPF, email, resumo, nota, foto);
        this.cartao = null;
        this.cliente = true;
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
