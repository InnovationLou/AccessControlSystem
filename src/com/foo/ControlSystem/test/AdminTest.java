package com.foo.ControlSystem.test;

import java.util.Scanner;

import com.foo.ControlSystem.sys.Computer;
import com.foo.ControlSystem.sys.ControlSys;
import com.foo.ControlSystem.user.Admin;


public class AdminTest {
	public static void main(String[] args) {
		Admin admin=new Admin();
		Computer computer=new Computer();
		admin.setName("����");
		ControlSys controlSys=new ControlSys();
		String way=null;
		Scanner scanner=new Scanner(System.in);

		System.out.println("�Ž�ϵͳ---����Ա����");
		System.out.println("����Ա�����밴 -->A\t�û������밴--->B");
		way=scanner.next();	
		System.out.println("*************************************************");
		if(way.equals("a"))
		{
			while(true)
			{
				System.out.println("�Ž�ϵͳ---����Ա����"+"===����Ա��"+admin.getName());
				admin.work(controlSys);
				controlSys.work();			
			}
		}else if(way.equals("b")){
			admin.manageUser(computer);
		}
	}
}
