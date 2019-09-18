package com.foo.ControlSystem.sys;

public class Door {

	public final static String OPEN="门已开启";
	public final static String CLOSE="门已关闭";
	private String state=CLOSE;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
