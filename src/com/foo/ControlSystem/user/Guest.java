package com.foo.ControlSystem.user;

import java.util.Scanner;

import com.foo.ControlSystem.sys.ControlSys;

public class Guest {
	  private String name;
	  
	  public void pressRing(ControlSys controlSys) {

			Scanner scanner=new Scanner(System.in);
			System.out.println("访客"+getName()+"按门铃?[y/n]");
			String strResult=scanner.next();
			if(strResult.equalsIgnoreCase("y"))
			{
				controlSys.setRing(1);//访客按门铃	
			    System.out.println("访客"+getName()+"按下了门铃");
			    System.out.println("门铃状态："+((controlSys.getRing()>0)?"鸣响":"安静"));
			}else {
				controlSys.setRing(0);//访客按门铃
				System.out.println("门铃状态："+((controlSys.getRing()>0)?"鸣响":"安静"));
			}
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
