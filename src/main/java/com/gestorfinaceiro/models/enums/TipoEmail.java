package com.gestorfinaceiro.models.enums;

public enum TipoEmail {
    PESSOAL("pessoal"),
    COMERCIAL("comercial");

    private final String tipoEmail;

    TipoEmail(String tipoEmail) {
        this.tipoEmail = tipoEmail;
    }

    public String getTipoEmail() {
        return tipoEmail;
    }
}
