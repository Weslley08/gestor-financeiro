package com.gestorfinaceiro.models;

public enum Telefone {
    
    CELULAR("celular"),
    CELULAR2("celular 2"),
    TELEFONE("telefone");

    private final String telefone;

    Telefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
    
}
