package com.gestorfinaceiro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Emails")

@Getter
@Setter
public class Email {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "Id_Email", nullable = false)
    private byte id_Email;

    @NotEmpty
    @Column(name = "Email_Principal", length = 100)
    private String email;

    @Column(name = "Email_Alternativo")
    private String email2;
}
