package com.shcoolofnet;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "testApp", eager = true)
public class TestApp {
	public TestApp() {
		System.out.println("Called ManagedBean -> TestApp");
	}
	public String sayHello() {
		return "Hello from JSF by School of Net";
	}
}
