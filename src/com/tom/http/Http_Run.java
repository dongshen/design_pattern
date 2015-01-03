package com.tom.http;

public class Http_Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Request string";
		Http http = new HttpGet();
		http.execute(str);	
		http = new HttpPut();
		http.execute(str);

	}

}
