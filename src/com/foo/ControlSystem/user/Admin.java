package com.foo.ControlSystem.user;

import java.util.ArrayList;
import java.util.Scanner;

import com.foo.ControlSystem.sys.Computer;
import com.foo.ControlSystem.sys.ControlSys;


public class Admin extends Employee{
	public void work(ControlSys controlSys) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����Ա("+this.getName()+")�����Ű�ť��[y/n]:");
		//equalsIgnoreCase(anotherString)
		if((scanner.next().equalsIgnoreCase("Y")))
		{
			controlSys.setOpenSign(1);//�Ž�ϵͳ������
			System.out.println("����Ա("+this.getName()+")���¿��Ű�ť");		
		}else {
			controlSys.setOpenSign(0);
			System.out.println("����Ա("+this.getName()+")û�а��¿��Ű�ť\n"+"�ŵ�״̬��"+((controlSys.getOpenSign()>0)?"����":"�ر�"));
		}
	}
	public void work(ControlSys controlSys,Guest guest) {
		int isRing=controlSys.getRing();
		if(1==isRing)
		{
			System.out.println("����Ա�Ƿ��ţ�[y/n]");
			Scanner scanner=new Scanner(System.in);
			String strResult=scanner.next();
			if(strResult.equalsIgnoreCase("y"))
			{
				controlSys.setRing(0);
				controlSys.setOpenSign(1);//���ÿ����ź�Ϊ1������
				System.out.println("����״̬��"+((controlSys.getRing()>0)?"����":"����"));
				System.out.println("����Ա("+this.getName()+")ͬ�⿪��");
			}
			else if(strResult.equalsIgnoreCase("n"))
			{
				controlSys.setOpenSign(0);
				controlSys.setOpenSign(0);//���ÿ����ź�Ϊ0��������
				System.out.println("����״̬��"+((controlSys.getRing()>0)?"����":"����"));
				System.out.println("����Ա��ֹ�˴ο���");
			}			
		}
	}
	public void work(ControlSys controlSys,Employee employee) {
		
	}
	public void manageUser(Computer computer)
	{
		ArrayList<Integer> usePwdList=computer.getPassword();//��ȡ�����û�
		ArrayList<String> useCardList=computer.getCard();//��ȡ���û�
		ArrayList<String> useFingerList=computer.getFingerMark();//��ȡָ���û�
		System.out.println("=========================�����û�========================\n");
		for (int use : usePwdList) {
			if(use==0)
			{
				System.out.println("�����û�");
			}else {
				System.out.println(use);
			}
		}
		System.out.println("=========================���û�========================\n");
		for (String use : useCardList) {
			if(use.isEmpty())
			{
				System.out.println("�����û�");
			}else {
				System.out.println(use);
			}
			
		}
		System.out.println("=========================ָ���û�========================\n");
		for (String use : useFingerList) {
			if(use.isEmpty())
			{
				System.out.println("�����û�");
			}else {
				System.out.println(use);
			}
		}
	}
}
