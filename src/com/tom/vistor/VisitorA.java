package com.tom.vistor;

public class VisitorA implements Visitor {
    /**
     * ��Ӧ��NodeA�ķ��ʲ���
     */
    @Override
    public void visit(NodeA node) {
        System.out.println("VistorA visit "+node.operationA());
    }
    /**
     * ��Ӧ��NodeB�ķ��ʲ���
     */
    @Override
    public void visit(NodeB node) {
        System.out.println("VistorA visit " + node.operationB());
    }

}