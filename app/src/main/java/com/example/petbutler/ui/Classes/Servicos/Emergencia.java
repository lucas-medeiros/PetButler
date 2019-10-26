package com.example.petbutler.ui.Classes.Servicos;

import com.example.petbutler.ui.Classes.Animal.Animal;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;

import java.util.Calendar;

public class Emergencia extends Servico { //apenas para Butlers com CRMV

    public Emergencia(int id, Calendar data, double notaCliente, double notaAnimal, double notaButler, Endereco endereco, String status, Cliente cliente,
                      Butler butler, Animal animal) {
        super(id, data, notaCliente, notaAnimal, notaButler, endereco, status, cliente, butler, animal);
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
