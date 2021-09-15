package com.gestorfinaceiro.models;

public enum Email {

    PESSOAL("pessoal"),
    COMERCIAL("comercial");

    private final String email;

    Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
