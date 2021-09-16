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
@Table(name = "Telefones")

@Data
public class Telefones {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "Id_Telefone", nullable = false )
    private Long idTelefone;

    @NotEmpty
    @Column(name = "Telefone_Principal", length = 50)
    private String telefone1;

    @Column(name = "Telefone_Alternativo")
    private String telefone2;
}
