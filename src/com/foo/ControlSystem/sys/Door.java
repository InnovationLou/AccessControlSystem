package com.foo.ControlSystem.sys;

public class Door {

	public final static String OPEN="���ѿ���";
	public final static String CLOSE="���ѹر�";
	private String state=CLOSE;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
