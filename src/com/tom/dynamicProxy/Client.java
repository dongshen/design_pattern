package com.tom.dynamicProxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class Client {

	public static void main(String[] args) throws Exception {
		AOPImpl impl = new AOPImpl();
		AOPHandler handler = new AOPHandler(impl);

		Map<String, String> conf = new HashMap<String, String>();
		conf.put("transaction", "true");

		handler.setFlag(conf);
		IAOP aop = (IAOP) Proxy.newProxyInstance(AOPImpl.class.getClassLoader(), new Class<?>[] { IAOP.class },
				handler);
		aop.show("cloud");
		String result = aop.say("say hi");
		System.out.println(result);
	}
}