package com.gestorfinaceiro.models.enums;

public enum TipoSexo {
    
    MASCULINO("masculino"),
    FEMININO("feminino");

    private final String tipoSexo;

    TipoSexo(String tipoSexo) {
        this.tipoSexo = tipoSexo;
    }

    public String getSexo() {
        return tipoSexo;
    }

    public String setSexo() {
        return tipoSexo;
    }

}
