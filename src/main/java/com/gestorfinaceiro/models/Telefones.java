package com.gestorfinaceiro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Telefones")

@Getter
@Setter
public class Telefones {

    @Id
    @ManyToOne
    @JoinColumn(name = "Id_Telefone", nullable = false )
    private byte id_Telefone;

    @NotEmpty
    @Column(name = "Telefone_Principal", length = 50)
    private String telefone1;

    @Column(name = "Telefone_Alternativo")
    private String telefone2;
}
