package com.tom.vistor;

public class NodeB extends Node{
    /**
     * ���ܷ���
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    /**
     * NodeB���еķ���
     */
    public String operationB(){
        return "NodeB";
    }
}