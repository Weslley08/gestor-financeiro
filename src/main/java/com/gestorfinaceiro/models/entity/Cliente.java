package com.gestorfinaceiro.models.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.List;

import com.gestorfinaceiro.models.enums.TipoSexo;

@Entity
@Table(name = "Cliente")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {

    @Id
    @NotEmpty
    @Column(name = "CPF", length = 15)
    private String cpf;

    @Column(name = "ID")
    private Long idCliente;

    @NotEmpty
    @Column(name = "NOME", length = 80)
    private String nome;

    @NotEmpty
    @Column(name = "DATA_DE_NASCIMENTO", length = 12)
    private String dataNascimento;

    @NotEmpty
    @Column(name = "SEXO")
    @Enumerated(EnumType.STRING)
    private TipoSexo tipoSexo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Cliente")
    @NotEmpty
    @Column(name = "ENDEREÇO")
    private List<Endereco> endereco;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Cliente")
    @NotEmpty
    @Column(name = "TELEFONE", length = 15)
    private Telefone telefones;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "EMAIL")
    @NotEmpty
    @Column(name = "EMAIL", length = 50)
    private List<Email> email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Cliente")
    @NotEmpty
    @Column(name = "DESPESA")
    private Despesa despesa;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Cliente")
    @NotEmpty
    @Column(name = "RECEITA")
    private Receita receita;

}