package com.foo.ControlSystem.test;

import com.foo.ControlSystem.sys.ControlSys;
import com.foo.ControlSystem.user.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setName("������");
		ControlSys controlSys=new ControlSys();
		System.out.println("�Ž�ϵͳ---��Ա����");
		System.out.println("**************************************************");
		while(true)
		{
			employee.input(controlSys);
			controlSys.work();
		}
	}
}
