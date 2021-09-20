package com.gestorfinaceiro.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

import org.springframework.lang.Nullable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailDTO {

    @NotEmpty
    private byte idEmail;

    @NotEmpty
    private String emailPessoal;

    @Nullable
    private String emailAlternativo;

}
