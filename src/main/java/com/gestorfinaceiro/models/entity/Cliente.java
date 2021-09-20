package com.gestorfinaceiro.models.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Entity(name = "Clientes")
@Table(name = "Clientes")

@Data
public class Cliente {

    @Id
    @NotEmpty
    @Column(name = "CPF", length = 15)
    private String cpf;

    @Column(name = "ID")
    private Long idCliente;

    @NotEmpty
    @Column(name = "NOME", length = 80)
    private String nome;

    @NotEmpty
    @Column(name = "SEXO", length = 10)
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Clientes")
    @NotEmpty
    @Column(name = "ENDEREÇO")
    private Endereco endereco;

    @NotEmpty
    @Column(name = "TELEFONE", length = 15)
    @Enumerated(EnumType.STRING)
    private Telefone telefones;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Clientes")
    @NotEmpty
    @Column(name = "EMAIL", length = 50)
    private Email email;

}