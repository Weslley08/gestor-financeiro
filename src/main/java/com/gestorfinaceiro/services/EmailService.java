package com.gestorfinaceiro.services;

import com.gestorfinaceiro.mapper.EmailMapper;
import com.gestorfinaceiro.models.dto.EmailDTO;
import com.gestorfinaceiro.models.entity.Email;
import com.gestorfinaceiro.repository.EmailRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//Classe das regras de negócios. O controller direciona as requisições para ela
@AllArgsConstructor
@NoArgsConstructor
@Data

@Service
public class EmailService {

    // Comunicação com o Banco de dados
    @Autowired
    private EmailRepository repository;

    // Transformação dos objetos capturados ou enviados ao Banco de dados
    private EmailMapper mapper;

    @Autowired
    public EmailService(EmailMapper mapper) {
        this.mapper = mapper;
    }

    // Salvar email no Banco de dados
    @Transactional
    public EmailDTO save(EmailDTO emailDto) {
        Optional<Email> optionalEmail = repository.findByEmail(emailDto.EmailPessoal());
        if (optionalEmail.isPresent()) {
            throw new EmailException(MessageUtils.EMAIL_JA_EXISTENTE);
        }

        Email email = mapper.toEntity(emailDto);
        repository.save(email);
        return mapper.toDto(email);
    }

    // Atualizar email por id
    @Transactional
    public EmailDTO update(EmailDTO emailDto) {
        Optional<Email> optionalEmail = repository.findByEmailUpdate(emailDto.getIdEmail());
        if (optionalEmail.isPresent()) {
            throw new EmailException(MessageUtils.EMAIL_JA_EXISTENTE);
        }

        Email email = mapper.toEntity(emailDto);
        repository.save(email);
        return mapper.toDto(email);
    }

    @Transactional
    public EmailDTO delete(EmailDTO emailDTO) {
        Optional<EmailDTO> emailDto = findByIdEmail(emailDTO.getidEmail());
        return repository.deleteById(emailDTO);

    }

    @Transactional
    public Optional<EmailDTO> findByIdEmail(EmailDTO emailDto) {
        return repository.findByIdEmail(emailDto.getIdEmail()).map(mapper::toDto);
        Optional<Email> optionalEmail = repository.findByEmailUpdate(emailDto.getIdEmail());
        
        if (optionalEmail.isPresent()) {
            throw new EmailException(MessageUtils.EMAIL_JA_EXISTENTE);
        }

        Email email = mapper.toEntity(emailDto);
        repository.save(email);
        return mapper.toDto(email);
    }

   private EmailDTO findByIdEmail(Long idEmail) {
       return repository.findByIdEmail(idEmail).map(mapper::toDto).orElseThrow(NotFoundException::new);

    @Transactional(readOnly = true)
    public List<EmailDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }

}
