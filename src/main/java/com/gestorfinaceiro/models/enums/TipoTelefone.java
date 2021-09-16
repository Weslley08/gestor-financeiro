package com.gestorfinaceiro.models.enums;

public enum TipoTelefone {
    
    CELULAR("celular"),
    CELULAR2("celular 2"),
    TELEFONE("telefone");

    private final String tipoTelefone;

     TipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getTelefone() {
        return tipoTelefone;
    }
    
}
