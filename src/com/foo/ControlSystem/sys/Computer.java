package com.foo.ControlSystem.sys;

import java.util.ArrayList;

import com.foo.ControlSystem.validate.CardVld;
import com.foo.ControlSystem.validate.FingerMarkVld;
import com.foo.ControlSystem.validate.PassWordVld;
import com.foo.ControlSystem.validate.Validate;

public class Computer {
	private ArrayList<Integer> password=new ArrayList<Integer>(); // ������洢�Ĺ�Ա����
	private ArrayList<String> card=new ArrayList<String>();// ������洢�Ĺ�Ա�ؿ���
	private ArrayList<String> fingerMark=new ArrayList<String>(); // ������洢�Ĺ�Աָ��
	
	public Computer() {
		
	}
	public boolean validate(String passStr) {
		Validate validate=null;
		int len=passStr.length();
		if(len<6)
		{
			System.out.println("�������ٲ���С��6λ");
			return false;
		}		
		else if(passStr.substring(0, 2).equals("pa"))
		{ 
			System.out.println("��ͨ�û�\n����Ϊ��"+passStr.substring(2));
			passStr=passStr.substring(2);
			/**
			 * ������֤��������֤����
			 */
			validate=new PassWordVld();
				
			return validate.check(passStr);	
		}
		else if(passStr.substring(0, 2).equals("ca"))
		{
			System.out.println("���û�\n����Ϊ��"+passStr.substring(2));
			passStr=passStr.substring(2);
			/**
			 * ������֤��������֤����
			 */
			validate=new CardVld();
			return validate.check(passStr);
		}
		else if(passStr.substring(0, 2).equals("fi"))
		{
			System.out.println("ָ��ʶ���û�\n����Ϊ��"+passStr.substring(2));
			passStr=passStr.substring(2);
			/**
			 * ������֤��������֤����
			 */
			validate=new FingerMarkVld();
			return validate.check(passStr);
		}
		return false;
	}
	public void addPassWord(String passStr) {
		
	}
	public void addCard(String card) {
		
	}
	public void addFingerMark(String fingerMark) {
		
	}
	
	public ArrayList<Integer> getPassword() {
		return password;
	}
	public void setPassword(ArrayList<Integer> password) {
		this.password = password;
	}
	public ArrayList<String> getCard() {
		return card;
	}
	public void setCard(ArrayList<String> card) {
		this.card = card;
	}
	public ArrayList<String> getFingerMark() {
		return fingerMark;
	}
	public void setFingerMark(ArrayList<String> fingerMark) {
		this.fingerMark = fingerMark;
	}

	
}
