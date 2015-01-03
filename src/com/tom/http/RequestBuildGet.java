package com.tom.http;

public class RequestBuildGet implements RequestBuild {

	@Override
	public String build(String input) {
		// TODO Auto-generated method stub
		String result = "Get:"+input;
		return result;
	}

}
