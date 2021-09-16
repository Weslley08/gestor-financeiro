package com.gestorfinaceiro.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Despesas")

@Getter
@Setter
public class Despesas {
    
    @Id
    @Column(name = "Id_Despesa")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idDespesas;

    @NotEmpty
    @Column(name = "Titulo_da_despesa", length = 50)
    private String tituloDespesa;

    @Column(name = "Tipo_de_despesa", length = 100)
    @NotEmpty
    private String tipoDespesa;

    @Column(name = "Data_da_despesa", length = 20)
    @NotEmpty
    private String dataDespesa;

    @Column(name = "Data_do_pagamento", length = 20)
    @NotEmpty
    private String dataPagamento;

    @Column(name = "Item", length = 25)
    @NotEmpty
    private String item;

    @Column(name = "Local", length = 50)
    @NotEmpty
    private String local;

    @NotEmpty 
    @Column(name = "Valor_da_despesa")
    private double valorDespesa;

}
