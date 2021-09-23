package com.gestorfinaceiro.utils.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

//Exceção para correios eletrónicos

@EqualsAndHashCode(callSuper = true)
@Data
public class EmailException extends RuntimeException{
    public EmailException(String message){
        super(message);
    }
}
