package com.tom.http;

public class RequestBuildPut implements RequestBuild {

	@Override
	public String build(String input) {
		// TODO Auto-generated method stub
		String result = "Put:"+input;
		return result;
	}

}
