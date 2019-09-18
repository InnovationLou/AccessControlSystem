package com.foo.ControlSystem.sys;

import java.util.logging.Logger;


public class ControlSys {
	private Door door; // �Ž�ϵͳ�ĵ�����
	private Computer computer; // �Ž�ϵͳ�ļ����
	private InputEquip inputEquip; // �Ž�ϵͳ�������豸
	private int ring; // ���壬0Ϊ������1Ϊ����
	private int openSign; // �����źţ��ɹ���Ա���°�ťʱ����
	private Logger logger; // ��־
	
	public ControlSys() {
		this.door=new Door();
		this.computer=new Computer();
		this.inputEquip=new InputEquip();
		this.ring=0;
		this.openSign=0;
		System.out.println("�Ž�ϵͳ��ʹ�÷���\n" +
	              " 1.ģ���������룺�ԡ�pa����ͷ���������\n" +
	              " 2.ģ��ˢ�����ԡ�ca����ͷ���������\n" +
	              " 3.ģ��ȡָ�ƣ��ԡ�fi����ͷ�������ʾָ�Ƶ��ַ���\n"+
	              " 4.ģ�����Ա���¿��Ű�ť�����롰y��");
		System.out.println("***********************************************");
		System.out.println("�Ž�ϵͳ����");
	}
	public void work() {
		if(this.getOpenSign()==1)
		{
			door.setState(Door.OPEN);//�����ŵĿ���״̬Ϊ����
			System.out.println(door.getState()+"�����ſ���״̬ά����5s�ڣ�5����Զ��ر�");

			try {
				java.lang.Thread.sleep(5000);//�ó���˯5����
				this.setOpenSign(0);
				door.setState(Door.CLOSE);//�����ŵ�״̬Ϊ�ر�״̬
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
