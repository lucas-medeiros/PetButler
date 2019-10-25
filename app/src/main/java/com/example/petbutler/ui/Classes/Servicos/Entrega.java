package com.example.petbutler.ui.Classes.Servicos;

import com.example.petbutler.ui.Classes.Animal.Animal;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;

import java.util.Calendar;

public class Entrega extends Servico {

    private String descricao;
    private String produto;

    public Entrega(Calendar data, float notaCliente, float notaAnimal, float notaButler, Endereco endereco, String status,
                   Cliente cliente, Butler butler, Animal animal, String descricao, String produto) {
        super(data, notaCliente, notaAnimal, notaButler, endereco, status, cliente, butler, animal);
        this.descricao = descricao;
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }


    @Override
    public void calculaValor() {
        super.calculaValor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void prestarServico() {
        super.prestarServico(); //To change body of generated methods, choose Tools | Templates.
    }



}