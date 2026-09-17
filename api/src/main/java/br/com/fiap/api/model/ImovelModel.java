package br.com.fiap.api.model;

public class ImovelModel {

    private int id;
    private String descricao;
    private double dimensao;
    private double valor;

    public ImovelModel() {
    }

    public ImovelModel(String descricao, double dimensao, double valor) {
        this.descricao = descricao;
        this.dimensao = dimensao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



}
