package com.example.petbutler.ui.Classes.Servicos;

public class Endereco {

    private String CEP;
    private int numero;
    private String complemento;
    private String estado;
    private String cidade;
    private String pontoReferencia;

    public Endereco(String CEP, int numero, String complemento, String estado, String cidade, String pontoReferencia) {
        this.CEP = CEP;
        this.numero = numero;
        this.complemento = complemento;
        this.estado = estado;
        this.cidade = cidade;
        this.pontoReferencia = pontoReferencia;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "CEP='" + CEP + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' + '}';
    }
}