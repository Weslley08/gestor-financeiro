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

        public Email toEntity(EmailDTO dto) {
            Email email = new Email();
//<<<<<<< HEAD
            email.setEmailPessoal(dto.getEmailPessoal());
            email.setEmailAlternativo(dto.getEmailAlternativo());
//=======
            email.setEmailPessoal(dto.getEmail());
            email.setEmailAlternativo(dto.getEmail2());
//>>>>>>> d8864b5b8b0635f335d5ea352b9f7f8444197955
            return email;
        }

        public EmailDTO toDto(Email email) {
            EmailDTO dto = new EmailDTO();
//<<<<<<< HEAD
            dto.setEmailPessoal(email.getEmailPessoal());
            dto.setEmailAlternativo(email.getEmailAlternativo());
//=======
            dto.setEmail(email.getEmailPessoal());
            dto.setEmail2(email.getEmailAlternativo());
//>>>>>>> d8864b5b8b0635f335d5ea352b9f7f8444197955

            return dto;
        }

        public List<EmailDTO> toDto(List<Email> listEmail){
            return listEmail.stream().map(this::toDto).collect(Collectors.toList());
        }
    }

