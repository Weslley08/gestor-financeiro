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
@Table(name = "RECEITA")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Receita {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idReceita;

    @ManyToOne
    @JoinColumn(name = "ID_RECEITA")
    private Cliente cliente;

    @NotEmpty
    @Column(name = "TITULO_DA_RECEITA", length = 50)
    private String tituloReceita;

    @Column(name = "TIPO_DA_RECEITA", length = 100)
    @NotEmpty
    private String tipoReceita;

    @Column(name = "DATA_DA_RECEITA", length = 20)
    @NotEmpty
    private String dataReceita;

    @NotEmpty 
    @Column(name = "VALOR_DA_RECEITA")
    private double valorReceita;
}
