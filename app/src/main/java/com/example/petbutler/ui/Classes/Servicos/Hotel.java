package com.example.petbutler.ui.Classes.Servicos;

import com.example.petbutler.ui.Classes.Animal.Animal;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;

import java.util.Calendar;

public class Hotel extends Servico {

    private int estadia; //em dias

    public Hotel(int id, Calendar data, double notaCliente, double notaAnimal, double notaButler, Endereco endereco, String status, Cliente cliente,
                 Butler butler, Animal animal, int estadia) {
        super(id, data, notaCliente, notaAnimal, notaButler, endereco, status, cliente, butler, animal);
        this.estadia = estadia;
    }

    public int getEstadia() {
        return estadia;
    }

    public void setEstadia(int estadia) {
        this.estadia = estadia;
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