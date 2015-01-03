package com.tom.http;

public class HttpGet extends Http {

	@Override
	public void getBuilder() {
		// TODO Auto-generated method stub
		this.reqBuild = new RequestBuildGet();
	}

}
