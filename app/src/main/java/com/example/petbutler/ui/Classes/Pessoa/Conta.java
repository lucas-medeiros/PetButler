package com.example.petbutler.ui.Classes.Pessoa;

public class Conta {

    protected int numero;
    protected int agencia;
    protected int digitoNumero;
    protected int digitoAgencia;

    public Conta(int numero, int agencia, int digitoNumero, int digitoAgencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.digitoNumero = digitoNumero;
        this.digitoAgencia = digitoAgencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getDigitoNumero() {
        return digitoNumero;
    }

    public void setDigitoNumero(int digitoNumero) {
        this.digitoNumero = digitoNumero;
    }

    public int getDigitoAgencia() {
        return digitoAgencia;
    }

    public void setDigitoAgencia(int digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
    }

    @Override
    public String toString() {
        return "Conta: " + this.numero + "-" + this.digitoNumero + "\nAgência: " + this.agencia + "-" + this.digitoAgencia;
    }
}