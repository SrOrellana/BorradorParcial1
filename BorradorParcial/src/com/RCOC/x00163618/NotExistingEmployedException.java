package com.RCOC.x00163618;

public class NotExistingEmployedException extends Exception {
    public NotExistingEmployedException(String msn){
        super(msn);
    }
}
