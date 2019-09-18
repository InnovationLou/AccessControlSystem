package com.foo.ControlSystem.sys;

import java.util.logging.Logger;


public class ControlSys {
	private Door door; // 门禁系统的电子门
	private Computer computer; // 门禁系统的计算机
	private InputEquip inputEquip; // 门禁系统的输入设备
	private int ring; // 门铃，0为安静，1为鸣响
	private int openSign; // 开门信号，由管理员按下按钮时产生
	private Logger logger; // 日志
	
	public ControlSys() {
		this.door=new Door();
		this.computer=new Computer();
		this.inputEquip=new InputEquip();
		this.ring=0;
		this.openSign=0;
		System.out.println("门禁系统的使用方法\n" +
	              " 1.模拟输入密码：以“pa”开头，后跟密码\n" +
	              " 2.模拟刷卡：以“ca”开头，后跟卡号\n" +
	              " 3.模拟取指纹：以“fi”开头，后跟表示指纹的字符串\n"+
	              " 4.模拟管理员按下开门按钮：输入“y”");
		System.out.println("***********************************************");
		System.out.println("门禁系统启动");
	}
	public void work() {
		if(this.getOpenSign()==1)
		{
			door.setState(Door.OPEN);//设置门的开启状态为“开
			System.out.println(door.getState()+"电子门开启状态维持在5s内，5秒后自动关闭");

			try {
				java.lang.Thread.sleep(5000);//让程序睡5秒钟
				this.setOpenSign(0);
				door.setState(Door.CLOSE);//设置门的状态为关闭状态
				System.out.println(door.getState());
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
	
	

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public InputEquip getInputEquip() {
		return inputEquip;
	}

	public void setInputEquip(InputEquip inputEquip) {
		this.inputEquip = inputEquip;
	}

	public int getRing() {
		return ring;
	}

	public void setRing(int ring) {
		this.ring = ring;
	}

	public int getOpenSign() {
		return openSign;
	}

	public void setOpenSign(int openSign) {
		this.openSign = openSign;
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	
	
}
