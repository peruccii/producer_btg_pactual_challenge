package com.example.desafio_btg_pactual.exception;

public class NotFoundException extends Exception {

    private String code;

    public NotFoundException(String message, String code) {
        super(message);
        this.code = code;
    }
}
