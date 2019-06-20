package com.example.app.benchlab.exception;

public class DataAlreadyExistException extends RuntimeException {

    public DataAlreadyExistException(String msg){
        super(msg);
    }
}
