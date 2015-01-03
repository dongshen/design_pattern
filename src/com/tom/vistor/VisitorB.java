package com.tom.vistor;

public class VisitorB implements Visitor {
	/**
	 * 对应于NodeA的访问操作
	 */
	@Override
    public void visit(NodeA node) {
        System.out.println("VistorB visit "+node.operationA());
    }

	/**
	 * 对应于NodeB的访问操作
	 */
	@Override
	public void visit(NodeB node) {
		System.out.println("VistorB visit " + node.operationB());
	}

}