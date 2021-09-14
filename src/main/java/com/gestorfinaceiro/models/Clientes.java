package com.gestorfinaceiro.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Clientes")

@Getter
@Setter
public class Clientes {
    
    @Id
    @Column(name = "CPF")
    private String cpf;

    @Column(name = "Id")
    private long id;

    @Column(name = "Nome")
    private String nome;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Clientes")
    @Column(name = "Email")
    private Email id_Email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Clientes")
    private Telefones id_Telefone;
    
}