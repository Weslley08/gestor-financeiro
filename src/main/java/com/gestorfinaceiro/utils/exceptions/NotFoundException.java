package com.gestorfinaceiro.exceptions;

import com.gestorfinaceiro.utils.MessageUtils;

public class NotFoundException extends RuntimeException{
    public NotFoundException(){
        super(MessageUtils.DADOS_NAO_ENCONTRADOS);
    }
}
