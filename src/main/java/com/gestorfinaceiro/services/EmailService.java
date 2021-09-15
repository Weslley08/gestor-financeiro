package com.gestorfinaceiro.services;

import com.gestorfinaceiro.dto.EmailDTO;
import com.gestorfinaceiro.exceptions.EmailException;
import com.gestorfinaceiro.mapper.EmailMapper;
import com.gestorfinaceiro.models.Email;
import com.gestorfinaceiro.repository.EmailRepository;

import com.gestorfinaceiro.utils.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EmailService {

    @Autowired
    private EmailRepository repository;

    @Autowired
    private EmailMapper mapper;

    @Transactional
    public EmailDTO save(EmailDTO dto){
        Optional<Email> optionalEmail = repository.findByEmail(dto.getEmail());
            if(optionalEmail.isPresent()){
                throw new EmailException(MessageUtils.EMAIL_JA_EXISTENTE);
            }

            Email email = mapper.toEntity(dto);
            repository.save(email);
            return mapper.toDto(email);
    }
}
