package com.foo.ControlSystem.sys;

import java.util.ArrayList;

import com.foo.ControlSystem.validate.CardVld;
import com.foo.ControlSystem.validate.FingerMarkVld;
import com.foo.ControlSystem.validate.PassWordVld;
import com.foo.ControlSystem.validate.Validate;

public class Computer {
	private ArrayList<Integer> password=new ArrayList<Integer>(); // 计算机存储的雇员密码
	private ArrayList<String> card=new ArrayList<String>();// 计算机存储的雇员胸卡号
	private ArrayList<String> fingerMark=new ArrayList<String>(); // 计算机存储的雇员指纹
	
	public Computer() {
		
	}
	public boolean validate(String passStr) {
		Validate validate=null;
		int len=passStr.length();
		if(len<6)
		{
			System.out.println("密码最少不能小于6位");
			return false;
		}		
		else if(passStr.substring(0, 2).equals("pa"))
		{ 
			System.out.println("普通用户\n密码为："+passStr.substring(2));
			passStr=passStr.substring(2);
			/**
			 * 调用验证机构的验证功能
			 */
			validate=new PassWordVld();
				
			return validate.check(passStr);	
		}
		else if(passStr.substring(0, 2).equals("ca"))
		{
			System.out.println("卡用户\n密码为："+passStr.substring(2));
			passStr=passStr.substring(2);
			/**
			 * 调用验证机构的验证功能
			 */
			validate=new CardVld();
			return validate.check(passStr);
		}
		else if(passStr.substring(0, 2).equals("fi"))
		{
			System.out.println("指纹识别用户\n密码为："+passStr.substring(2));
			passStr=passStr.substring(2);
			/**
			 * 调用验证机构的验证功能
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
