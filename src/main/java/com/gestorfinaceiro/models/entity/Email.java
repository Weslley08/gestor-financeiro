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
@Table(name = "Email")

@Data
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "Id_Email", nullable = false)
    private Long idEmail;

    @NotEmpty
    @Column(name = "Email_Pessoal")
    private String emailPessoal;

    @NotEmpty
    @Column(name = "Email_Alternativo")
    private String emailAlternativo;

}
