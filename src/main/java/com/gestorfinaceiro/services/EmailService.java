package com.gestorfinaceiro.services;

import com.gestorfinaceiro.utils.exceptions.EmailException;
import com.gestorfinaceiro.mapper.EmailMapper;
import com.gestorfinaceiro.models.dto.EmailDTO;
import com.gestorfinaceiro.models.entity.Email;
import com.gestorfinaceiro.repository.EmailRepository;

import com.gestorfinaceiro.utils.MessageUtils;
import javassist.NotFoundException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

//Classe das regras de negócios. O controller direciona as requisições pra ela
@AllArgsConstructor
@NoArgsConstructor
@Data

@Service
public class EmailService {

    // Comunicação com o Banco de dados
    @Autowired
    private EmailRepository repository;

    // Transformação dos objetos capturados ou enviados ao Banco de dados
    @Autowired
    private EmailMapper mapper;

    // Salvar email no Bancode dados
    @Transactional
    public EmailDTO save(EmailDTO dto) {
        Optional<Email> optionalEmail = repository.findByEmail(dto.getEmailPessoal());
        if (optionalEmail.isPresent()) {
            throw new EmailException(MessageUtils.EMAIL_JA_EXISTENTE);
        }

        Email email = mapper.toEntity(dto);
        repository.save(email);
        return mapper.toDto(email);
    }

    // Atualizar email por id
    @Transactional
    public EmailDTO update(EmailDTO dto) {
        Optional<Email> optionalEmail = repository.findByEmailUpdate(dto.getEmailPessoal(), dto.getIdEmail());
        if (optionalEmail.isPresent()) {
            throw new EmailException(MessageUtils.EMAIL_JA_EXISTENTE);
        }

        Email email = mapper.toEntity(dto);
        repository.save(email);
        return mapper.toDto(email);
    }

    @Transactional
<<<<<<< HEAD
    public EmailDTO delete(Long idEmail) {
        EmailDTO dto = this.findByIdEmail(idEmail);
        repository.deleteById(dto.getIdEmail());
        return dto;
    }

    private EmailDTO findByIdEmail(Long idEmail) {
        return repository.findByIdEmail(idEmail).map(mapper::toDto).orElseThrow(NotFoundException::new);
=======
    public EmailDTO delete(Byte id_email) throws NotFoundException {
        EmailDTO dto = this.findByIdEmail(id_email);
        repository.deleteById(dto.getId_Email());
        return dto;
    }

    private EmailDTO findByIdEmail(Byte id_email) throws NotFoundException {
        return repository.findByIdEmail(id_email)
                .map(mapper::toDto)
                .orElseThrow(() -> new NotFoundException("Email não existe"));
>>>>>>> d8864b5b8b0635f335d5ea352b9f7f8444197955
    }

    @Transactional(readOnly = true)
    public List<EmailDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }

}
