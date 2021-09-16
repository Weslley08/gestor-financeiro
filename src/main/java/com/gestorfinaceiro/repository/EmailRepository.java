package com.gestorfinaceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.gestorfinaceiro.models.entity.Email;

//Interação com o banco de dados

@Repository
public interface EmailRepository extends JpaRepository <Email, Long> {
    Optional<Email> findByEmail(String email);

    Optional<Email> findByEmailUpdate(String email, byte id_email);

    void deleteById(Byte id_email);

    Optional<Object> findByIdEmail(Byte id_email);
}
