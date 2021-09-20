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
@Table(name = "TELEFONE")

@Data
public class Telefone {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "ID_TELEFONE", nullable = false )
    private Long idTelefone;

    @NotEmpty
    @Column(name = "TELEFONE_PRINCIPAL", length = 50)
    private String telefone1;

    @Column(name = "TELEFONE_ALTERNATIVO")
    private String telefone2;
}
