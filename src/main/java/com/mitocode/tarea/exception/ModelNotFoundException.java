package com.mitocode.tarea.exception;


public class ModelNotFoundException extends RuntimeException {

    public ModelNotFoundException(String msg){
        super(msg);
    }
}
