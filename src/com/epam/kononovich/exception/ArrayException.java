package com.epam.kononovich.exception;

public class ArrayException extends Exception {
    public ArrayException(String messege) {
        super(messege);
    }

    public ArrayException() {
        super();
    }

    public ArrayException(String messege, Throwable cause) {
        super(messege, cause);
    }

    public ArrayException(Throwable cause) {
        super(cause);
    }
}
