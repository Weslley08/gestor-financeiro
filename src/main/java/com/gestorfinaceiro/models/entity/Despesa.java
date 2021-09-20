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
@Table(name = "DESPESA")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Despesa {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idDespesa;

    @ManyToOne
    @JoinColumn(name = "ID_DESPESA", nullable = false)
    private Cliente cliente;

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
