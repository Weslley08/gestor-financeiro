package com.gestorfinaceiro.models.dto;

import javax.validation.constraints.NotEmpty;

public class ClientesDTO {

        private Long idCliente;

        @NotEmpty
        private String nome;

        @NotEmpty
        private String cpf;

        @NotEmpty
        private EmailDTO emailDTO;

//        @NotNull
//        private
//
////        @NotNull
////        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
////        private LocalDate date;
////
////        @NotNull
////        //@Digits(integer = 3, fraction = 2) // formatação dos números
////        private Double variation;

    }
