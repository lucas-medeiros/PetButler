package com.example.petbutler.ui.Classes.Servicos;

import com.example.petbutler.ui.Classes.Animal.Animal;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;

import java.util.Calendar;

public abstract class Servico {

    private Calendar data;
    private float notaCliente;
    private float notaAnimal;
    private float notaButler;
    private Endereco endereco;
    private String status;
    private Cliente cliente;
    private Butler butler;
    private Animal animal;

    public Servico(Calendar data, float notaCliente, float notaAnimal, float notaButler, Endereco endereco, String status, Cliente cliente, Butler butler, Animal animal) {
        this.data = data;
        this.notaCliente = notaCliente;
        this.notaAnimal = notaAnimal;
        this.notaButler = notaButler;
        this.endereco = endereco;
        this.status = status;
        this.cliente = cliente;
        this.butler = butler;
        this.animal = animal;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public float getNotaCliente() {
        return notaCliente;
    }

    public void setNotaCliente(float notaCliente) {
        this.notaCliente = notaCliente;
    }

    public float getNotaAnimal() {
        return notaAnimal;
    }

    public void setNotaAnimal(float notaAnimal) {
        this.notaAnimal = notaAnimal;
    }

    public float getNotaButler() {
        return notaButler;
    }

    public void setNotaButler(float notaButler) {
        this.notaButler = notaButler;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Butler getButler() {
        return butler;
    }

    public void setButler(Butler butler) {
        this.butler = butler;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    //adicionar conteúdo dos métodos
    public void prestarServico(){

    }

    public void calculaValor(){

    }

    public void avalia(){

    }
}
