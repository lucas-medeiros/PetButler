package com.example.petbutler.ui.Classes.Servicos;

import com.example.petbutler.ui.Classes.Animal.Animal;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;

import java.util.Calendar;

public class Transporte extends Servico {

    public Transporte(Calendar data, float notaCliente, float notaAnimal, float notaButler, Endereco endereco, String status, Cliente cliente, Butler butler, Animal animal) {
        super(data, notaCliente, notaAnimal, notaButler, endereco, status, cliente, butler, animal);
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