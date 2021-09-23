package com.gestorfinaceiro.models.dto;

import com.gestorfinaceiro.models.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailDTO {
// @SuppressWarnings("unused") usado para retirar esses de variavel não usada

    @SuppressWarnings("unused")
    private Long idEmail;

    @SuppressWarnings("unused")
    private Cliente cliente;

    @SuppressWarnings("unused")
    private String emailPessoal;

    @SuppressWarnings("unused")
    private String emailAlternativo;

}