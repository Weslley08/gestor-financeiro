package com.gestorfinaceiro.dto;

import com.sun.istack.NotNull;

public class ClientesDTO {

        private Long id;

        @NotNull
        private String name;

        @NotNull
        private String cpf;

        @NotNull
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
