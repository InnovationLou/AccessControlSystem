package com.foo.ControlSystem.user;

import java.util.ArrayList;
import java.util.Scanner;

import com.foo.ControlSystem.sys.Computer;
import com.foo.ControlSystem.sys.ControlSys;


public class Admin extends Employee{
	public void work(ControlSys controlSys) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("管理员("+this.getName()+")按开门按钮？[y/n]:");
		//equalsIgnoreCase(anotherString)
		if((scanner.next().equalsIgnoreCase("Y")))
		{
			controlSys.setOpenSign(1);//门禁系统开启门
			System.out.println("管理员("+this.getName()+")按下开门按钮");		
		}else {
			controlSys.setOpenSign(0);
			System.out.println("管理员("+this.getName()+")没有按下开门按钮\n"+"门的状态："+((controlSys.getOpenSign()>0)?"开启":"关闭"));
		}
	}
	public void work(ControlSys controlSys,Guest guest) {
		int isRing=controlSys.getRing();
		if(1==isRing)
		{
			System.out.println("管理员是否开门？[y/n]");
			Scanner scanner=new Scanner(System.in);
			String strResult=scanner.next();
			if(strResult.equalsIgnoreCase("y"))
			{
				controlSys.setRing(0);
				controlSys.setOpenSign(1);//设置开门信号为1，表开门
				System.out.println("门铃状态："+((controlSys.getRing()>0)?"鸣响":"安静"));
				System.out.println("管理员("+this.getName()+")同意开门");
			}
			else if(strResult.equalsIgnoreCase("n"))
			{
				controlSys.setOpenSign(0);
				controlSys.setOpenSign(0);//设置开门信号为0，表不开门
				System.out.println("门铃状态："+((controlSys.getRing()>0)?"鸣响":"安静"));
				System.out.println("管理员禁止此次开门");
			}			
		}
	}
	public void work(ControlSys controlSys,Employee employee) {
		
	}
	public void manageUser(Computer computer)
	{
		ArrayList<Integer> usePwdList=computer.getPassword();//获取密码用户
		ArrayList<String> useCardList=computer.getCard();//获取卡用户
		ArrayList<String> useFingerList=computer.getFingerMark();//获取指纹用户
		System.out.println("=========================密码用户========================\n");
		for (int use : usePwdList) {
			if(use==0)
			{
				System.out.println("暂无用户");
			}else {
				System.out.println(use);
			}
		}
		System.out.println("=========================卡用户========================\n");
		for (String use : useCardList) {
			if(use.isEmpty())
			{
				System.out.println("暂无用户");
			}else {
				System.out.println(use);
			}
			
		}
		System.out.println("=========================指纹用户========================\n");
		for (String use : useFingerList) {
			if(use.isEmpty())
			{
				System.out.println("暂无用户");
			}else {
				System.out.println(use);
			}
		}
	}
}
