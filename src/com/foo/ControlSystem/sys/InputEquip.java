package com.foo.ControlSystem.sys;

import java.util.Scanner;

public class InputEquip {
	private String input=null;//���뻺��
	
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	public void input(ControlSys controlSys) {
		Computer computer=new Computer();		
		Scanner scan = new Scanner(System.in);
		System.out.println("�����֤��");
		String passStr = scan.next();
		this.setInput(passStr);
		if(computer.validate(this.getInput()))
		{
			System.out.println("��֤ͨ����");
			controlSys.setOpenSign(1);
		}
		else {
			System.out.println("û��ͨ����֤��");
			controlSys.setOpenSign(0);
		}

	}

}
