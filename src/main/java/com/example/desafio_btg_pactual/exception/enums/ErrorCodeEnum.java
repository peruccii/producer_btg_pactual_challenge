package com.example.desafio_btg_pactual.exception.enums;

public enum ErrorCodeEnum {

    ON0001("USER NOT FOUND", "ON-0001"),
    ON0002("PRODUCTS NOT FOUND", "ON-0002"),
    ON0003("SOME ID DOEST NOT EXIST", "ON-0003"),
    ;

    private final String message;

    private final String code;

    ErrorCodeEnum(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() { return message; }

    public String getCode() { return code; }
}
