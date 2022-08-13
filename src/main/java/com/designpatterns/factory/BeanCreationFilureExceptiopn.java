package com.designpatterns.factory;

public class BeanCreationFilureExceptiopn extends RuntimeException{

    public BeanCreationFilureExceptiopn(String e1, Exception e) {
        super(e);
    }

}
