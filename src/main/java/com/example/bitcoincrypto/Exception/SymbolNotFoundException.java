package com.example.bitcoincrypto.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class SymbolNotFoundException extends RuntimeException{
    public SymbolNotFoundException(String message) {
        super(message);
    }


}
