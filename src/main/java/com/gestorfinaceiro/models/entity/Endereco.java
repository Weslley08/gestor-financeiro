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
@Table(name = "Endereço")

@Data
public class Endereco {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "Id_Endereco", nullable = false )
    private Long idEndereco;

    @NotEmpty
    @Column(name = "CEP")
    private String cep;

    @NotEmpty
    @Column(name = "Número_da_casa")
    private String numeroCasa;

}
