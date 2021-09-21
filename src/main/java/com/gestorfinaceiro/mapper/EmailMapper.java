package com.gestorfinaceiro.mapper;

import com.gestorfinaceiro.models.dto.EmailDTO;
import com.gestorfinaceiro.models.entity.Email;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

//Classe para trsansformar o objeto EmailDTO em entidade Email e vice e versa
@Data
@AllArgsConstructor
@NoArgsConstructor

@Component
public class EmailMapper {

        public Email toEntity(EmailDTO emailDto) {
            Email email = new Email();
            email.setEmailPessoal(emailDto.getEmailPessoal());
            email.setEmailAlternativo(emailDto.getEmailAlternativo());
            return email;
        }

        public EmailDTO toDto(Email email) {
            EmailDTO emailDto = new EmailDTO();
            emailDto.setEmailPessoal(email.getEmailPessoal());
            emailDto.setEmailAlternativo(email.getEmailAlternativo());
            return emailDto;
        }

        public List<EmailDTO> toDto(List<Email> listEmail){
            return listEmail.stream().map(this::toDto).collect(Collectors.toList());
        }
    }

