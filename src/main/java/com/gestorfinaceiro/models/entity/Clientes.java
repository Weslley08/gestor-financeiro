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
public class Clientes {

    @Id
    @NotEmpty
    @Column(name = "CPF", length = 15)
    private String cpf;

    @Column(name = "Id")
    private Long idCliente;

    @NotEmpty
    @Column(name = "Nome", length = 80)
    private String nome;

    @NotEmpty
    @Column(name = "Sexo", length = 10)
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Clientes")
    @NotEmpty
    @Column(name = "Endereço")
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