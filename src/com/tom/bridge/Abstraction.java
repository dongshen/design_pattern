package com.tom.bridge;

public abstract class Abstraction {
    
    protected Implementor impl;
    
    public Abstraction(Implementor impl){
        this.impl = impl;
    }
    //Ê¾Àý·½·¨
    public void operation(){
        
        impl.operationImpl();
    }
}