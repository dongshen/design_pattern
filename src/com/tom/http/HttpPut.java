package com.tom.http;

public class HttpPut extends Http {

	@Override
	public void getBuilder() {
		// TODO Auto-generated method stub
		this.reqBuild = new RequestBuildPut();
	}

}
