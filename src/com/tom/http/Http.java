package com.tom.http;

public abstract class Http {
	public RequestBuild reqBuild;

	public Http(){
		getBuilder();
	}
	public abstract void getBuilder();

	public void execute(String request) {
		String reqStr = reqBuild.build(request);
		System.out.println(reqStr);
	}
}
