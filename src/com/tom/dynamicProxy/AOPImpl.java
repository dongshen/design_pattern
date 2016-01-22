package com.tom.dynamicProxy;

public class AOPImpl implements IAOP {

	@Override
	public void show(String str) {
		System.out.println("show: " + str);
	}

	@Override
	public String say(String str) {
		return "say: " + str;
	}

}
