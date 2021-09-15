package com.gestorfinaceiro.exceptions;

//Exceçãopara emails

public class EmailException extends RuntimeException{
    public EmailException(String message){
        super(message);
    }
}
