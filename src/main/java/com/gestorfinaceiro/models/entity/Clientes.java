package com.gestorfinaceiro.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Clientes")

@Getter
@Setter
public class Clientes {

    @Id
    @NotEmpty
    @Column(name = "CPF", length = 15)
    private String cpf;

    @Column(name = "Id")
    private long idCliente;

    @NotEmpty
    @Column(name = "Nome", length = 80)
    private String nome;

    @NotEmpty
    @Column(name = "Sexo", length = 10)
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @NotEmpty
    @Column(name = "Endereço", length = 100)
    @Enumerated(EnumType.STRING)
    private Endereco endereco;

    @NotEmpty
    @Column(name = "Telefone", length = 15)
    @Enumerated(EnumType.STRING)
    private Telefones telefones;

    @NotEmpty
    @Column(name = "Email", length = 50)
    @Enumerated(EnumType.STRING)
    private Email email;

}