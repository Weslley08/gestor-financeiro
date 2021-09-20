package com.gestorfinaceiro.utils.exceptions;

import lombok.Data;

//Exceçãopara emails

@Data
public class EmailException extends RuntimeException{
    public EmailException(String message){
        super(message);
    }
}
