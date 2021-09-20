package com.gestorfinaceiro.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Entity
@Table(name = "DESPESA")

@Data
public class Despesa {
    
    @Id
    @Column(name = "ID_DESPESA")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idDespesas;

    @NotEmpty
    @Column(name = "TITULO_DA_DESPESA", length = 50)
    private String tituloDespesa;

    @Column(name = "TIPO_DE_DESPESA", length = 100)
    @NotEmpty
    private String tipoDespesa;

    @Column(name = "DATA_DA_DESPESA", length = 20)
    @NotEmpty
    private String dataDespesa;

    @Column(name = "DATA_DO_PAGAMENTO", length = 20)
    @NotEmpty
    private String dataPagamento;

    @Column(name = "ITEM", length = 25)
    @NotEmpty
    private String item;

    @Column(name = "LOCAL", length = 50)
    @NotEmpty
    private String local;

    @NotEmpty 
    @Column(name = "VALOR_DO_PAGAMENTO")
    private double valorDespesa;

}
