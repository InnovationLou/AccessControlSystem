package com.foo.ControlSystem.user;

import com.foo.ControlSystem.sys.ControlSys;

public class Employee extends Guest{
	private String passWord;
	
	public void input(ControlSys controlSys) {
		controlSys.getInputEquip().input(controlSys);
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
