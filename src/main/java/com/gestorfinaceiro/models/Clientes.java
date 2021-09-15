package com.gestorfinaceiro.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Clientes")

@Getter
@Setter
public class Clientes implements Serializable {
    
    @Id
    @NotEmpty
    @Column(name = "CPF", length = 50)
    private String cpf;

    @Column(name = "Id")
    private long id;

    @NotEmpty
    @Column(name = "Nome", length = 100)
    private String nome;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Clientes")
    @Column(name = "Email")
    private Email email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Clientes")
    private Telefones telefone;
    
}