package com.foo.ControlSystem.test;

import com.foo.ControlSystem.sys.ControlSys;
import com.foo.ControlSystem.user.Admin;
import com.foo.ControlSystem.user.Guest;

public class GuestTest {
	public static void main(String[] args) {
		Guest guest=new Guest();
		guest.setName("С��");
		Admin admin=new Admin();
		admin.setName("����");
		ControlSys controlSys=new ControlSys();
		System.out.println("�Ž�ϵͳ---�ÿͲ���");
		System.out.println("*******************************************************");
		while(true)
		{
			guest.pressRing(controlSys);
			admin.work(controlSys, guest);
			controlSys.work();
		}
	}
}
