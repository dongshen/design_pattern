package com.tom.bridge;

public abstract class Abstraction {
    
    protected Implementor impl;
    
    public Abstraction(Implementor impl){
        this.impl = impl;
    }
    //ʾ������
    public void operation(){
        
        impl.operationImpl();
    }
}