package com.tom.vistor;

public class VisitorB implements Visitor {
	/**
	 * ��Ӧ��NodeA�ķ��ʲ���
	 */
	@Override
    public void visit(NodeA node) {
        System.out.println("VistorB visit "+node.operationA());
    }

	/**
	 * ��Ӧ��NodeB�ķ��ʲ���
	 */
	@Override
	public void visit(NodeB node) {
		System.out.println("VistorB visit " + node.operationB());
	}

}