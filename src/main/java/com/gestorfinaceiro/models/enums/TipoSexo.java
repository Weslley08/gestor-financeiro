package com.gestorfinaceiro.models.enums;

public enum TipoSexo {
    
    MASCULINO("masculino"),
    FEMININO("feminino"),
    OUTROS_SEXOS("outros_sexos");

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
