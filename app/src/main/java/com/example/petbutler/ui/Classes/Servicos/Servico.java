package com.example.petbutler.ui.Classes.Servicos;

import com.example.petbutler.ui.Classes.Animal.Animal;
import com.example.petbutler.ui.Classes.Pessoa.Butler;
import com.example.petbutler.ui.Classes.Pessoa.Cliente;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Servico {

    protected int id;
    protected Calendar data;
    protected double notaCliente;
    protected double notaAnimal;
    protected double notaButler;
    protected Endereco endereco;
    protected String status;
    protected Cliente cliente;
    protected Butler butler;
    protected Animal animal;
    protected double preco;

    public Servico(int id, Calendar data, double notaCliente, double notaAnimal, double notaButler, Endereco endereco, String status,
                   Cliente cliente, Butler butler, Animal animal) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public double getNotaCliente() {
        return notaCliente;
    }

    public void setNotaCliente(double notaCliente) {
        this.notaCliente = notaCliente;
    }

    public double getNotaAnimal() {
        return notaAnimal;
    }

    public void setNotaAnimal(double notaAnimal) {
        this.notaAnimal = notaAnimal;
    }

    public double getNotaButler() {
        return notaButler;
    }

    public void setNotaButler(double notaButler) {
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Butler: " + this.butler.getNome() + " \n" + dateFormat.format(this.data.getTime());
    }

    //adicionar conteúdo dos métodos
    public void prestarServico(){

    }

    public void calculaValor(){
        //this.preco = ...
    }

    public void avalia(){

    }
}
