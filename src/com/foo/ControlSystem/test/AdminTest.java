package com.foo.ControlSystem.test;

import java.util.Scanner;

import com.foo.ControlSystem.sys.Computer;
import com.foo.ControlSystem.sys.ControlSys;
import com.foo.ControlSystem.user.Admin;


public class AdminTest {
	public static void main(String[] args) {
		Admin admin=new Admin();
		Computer computer=new Computer();
		admin.setName("胡浩");
		ControlSys controlSys=new ControlSys();
		String way=null;
		Scanner scanner=new Scanner(System.in);

		System.out.println("门禁系统---管理员测试");
		System.out.println("管理员测试请按 -->A\t用户管理请按--->B");
		way=scanner.next();	
		System.out.println("*************************************************");
		if(way.equals("a"))
		{
			while(true)
			{
				System.out.println("门禁系统---管理员测试"+"===管理员："+admin.getName());
				admin.work(controlSys);
				controlSys.work();			
			}
		}else if(way.equals("b")){
			admin.manageUser(computer);
		}
	}
}
