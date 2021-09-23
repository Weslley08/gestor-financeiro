package com.gestorfinaceiro.repository;

import com.gestorfinaceiro.models.dto.EmailDTO;
import com.gestorfinaceiro.models.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Interação com o banco de dados

@Repository
public interface EmailRepository extends JpaRepository <Email, Long> {
    Optional<Email> findByEmail(String email);

    EmailDTO deleteById(EmailDTO emailDTO);

    Optional<Email> findByIdEmail(Long idEmail);

    Optional<Email> findByEmailUpdate(Long idEmail);
}

