package com.gestorfinaceiro.models;

public enum Sexo {
    
    MASCULINO("masculino"),
    FEMININO("feminino");

    private final String sexo;

    Sexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

}
