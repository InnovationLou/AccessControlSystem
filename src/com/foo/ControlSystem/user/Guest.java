package com.foo.ControlSystem.user;

import java.util.Scanner;

import com.foo.ControlSystem.sys.ControlSys;

public class Guest {
	  private String name;
	  
	  public void pressRing(ControlSys controlSys) {

			Scanner scanner=new Scanner(System.in);
			System.out.println("�ÿ�"+getName()+"������?[y/n]");
			String strResult=scanner.next();
			if(strResult.equalsIgnoreCase("y"))
			{
				controlSys.setRing(1);//�ÿͰ�����	
			    System.out.println("�ÿ�"+getName()+"����������");
			    System.out.println("����״̬��"+((controlSys.getRing()>0)?"����":"����"));
			}else {
				controlSys.setRing(0);//�ÿͰ�����
				System.out.println("����״̬��"+((controlSys.getRing()>0)?"����":"����"));
			}
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
