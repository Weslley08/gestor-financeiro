package com.gestorfinaceiro.mapper;

import com.gestorfinaceiro.dto.EmailDTO;
import com.gestorfinaceiro.models.Email;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

//Classe para trsansformar o objeto EmailDTO em entidade Email e vice e versa

@Component
public class EmailMapper {

        public Email toEntity(EmailDTO dto) {
            Email email = new Email();
            email.setEmail(dto.getEmail());
            email.setEmail2(dto.getEmail2());
            return email;
        }

        public EmailDTO toDto(Email email) {
            EmailDTO dto = new EmailDTO();
            dto.setEmail(email.getEmail());
            dto.setEmail2(email.getEmail2());

            return dto;
        }

        public List<EmailDTO> toDto(List<Email> listEmail){
            return listEmail.stream().map(this::toDto).collect(Collectors.toList());
        }
    }

