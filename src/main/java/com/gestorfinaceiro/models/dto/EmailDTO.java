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
    private Long idEmail;

    @NotEmpty
    private String emailPessoal;

    @Nullable
    private String emailAlternativo;


    
    public Long getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(Long idEmail) {
        this.idEmail = idEmail;
    }

    public String getEmailPessoal() {
        return emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }

    public String getEmailAlternativo() {
        return emailAlternativo;
    }

    public void setEmailAlternativo(String emailAlternativo) {
        this.emailAlternativo = emailAlternativo;
    }

    

}
