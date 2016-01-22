package com.tom.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

public class AOPHandler implements InvocationHandler {
	private Object obj;
	private boolean flag;

	public AOPHandler(Object obj) {
		this.obj = obj;
	}

	public void setFlag(Map<String, String> config) {
		if (null == config) {
			flag = false;
		} else {
			if (config.containsKey("transaction") && "true".equalsIgnoreCase(config.get("transaction"))) {
				flag = true;
			} else {
				flag = false;
			}
		}
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (flag) {
			doBefore(method.toString());
		}
		Object result = method.invoke(obj, args);
		if (flag) {
			doAfter(method.toString());
		}
		return result;
	}

	private void doBefore(String method) {
		System.out.println("Transaction start..." + method);
	}

	private void doAfter(String method) {
		System.out.println("Transaction commit..."+method);
	}
}
