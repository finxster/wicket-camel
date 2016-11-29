package com.avenuecode.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {

	public String getHello() {
		return "Hello, Spring!";
	}

}
