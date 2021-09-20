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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TELEFONE")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Telefone {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idTelefone;

    @ManyToOne
    @JoinColumn(name = "ID_TELEFONE", nullable = false )
    private Cliente cliente;

    @NotEmpty
    @Column(name = "TELEFONE_PRINCIPAL", length = 50)
    private String telefone1;

    @Column(name = "TELEFONE_ALTERNATIVO")
    private String telefone2;
}
