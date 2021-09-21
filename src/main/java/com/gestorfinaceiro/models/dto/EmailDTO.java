package com.gestorfinaceiro.models.dto;

import com.gestorfinaceiro.models.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.springframework.lang.Nullable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmailDTO {

    private Long idEmail;
    private Cliente cliente;
    private String emailPessoal;
    private String emailAlternativo;

}