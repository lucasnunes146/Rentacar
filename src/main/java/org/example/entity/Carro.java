package org.example.entity;

import org.example.entity.enums.Combustivel;
import org.example.entity.enums.Transmissao;

public class Carro {

    private int id;
    private String categoria;
    private Transmissao transmissao;
    private Combustivel combustivel;
    private String marca;
    private String modelo;
    private boolean alugado = false;

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                " - Categoria: " + categoria +
                " - Transmissao: " + transmissao +
                " - Combustivel: " + combustivel +
                " - Marca: " + marca +
                " - Modelo: " + modelo;
    }
}