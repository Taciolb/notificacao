package com.tlbtech.notificacao.infrastructure.exceptions;

import com.tlbtech.notificacao.business.EmailService;

public class EmailException extends RuntimeException{

    public EmailException(String mensagem) {

        super(mensagem);
    }

    public EmailException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
