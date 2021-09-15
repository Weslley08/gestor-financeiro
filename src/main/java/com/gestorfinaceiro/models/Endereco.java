package com.gestorfinaceiro.models;

public enum Endereco {
    
    PESSOAL("pessoal"),
    COMERCIAL("comercial");

    private final String endereco;

    Endereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }
}
