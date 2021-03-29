package com.epam.kononovich.exception;

public class ArrayException extends Exception {

    public ArrayException(String message, Throwable cause){
        super(message, cause);
    }

     public ArrayException(String message){
         super(message);
     }

     public ArrayException(Throwable cause){
         super(cause);
     }

     public ArrayException(){
         super();
     }
}
