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
@Table(name = "ENDEREÇO")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Endereco {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idEndereco;

    @ManyToOne
    @JoinColumn(name = "ID_ENDEREÇO", nullable = false )
    private Cliente cliente;

    @NotEmpty
    @Column(name = "CEP")
    private String cep;

    @NotEmpty
    @Column(name = "NÙMERO_DA_CASA")
    private String numeroCasa;

}
