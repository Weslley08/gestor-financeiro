package com.gestorfinaceiro.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Table(name = "EMAIL")

@Data
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "ID_EMAIL", nullable = false)
    private Long idEmail;

    @NotEmpty
    @Column(name = "EMAIL_PESSOAL")
    private String emailPessoal;

    @NotEmpty
    @Column(name = "EMAIL_ALTERNATIVO")
    private String emailAlternativo;

}
